package junit5Tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

import gerenciadorDeTarefas.Main;
import gerenciadorDeTarefas.Tarefa;

@DisplayName("Testes usando o método de partições de equivalência")
public class ParticaoDeEquivalenciaTests {

	Main sistema;
	
	@BeforeEach
	void criarSistema() {
		this.sistema = new Main();
		sistema.criarTarefa("Fazer atividade 1","Exercício 1","20/03/2024","alta");
	}
	
	@AtualizarTarefaTest
	@DisplayName("Atualizar a prioridade da tarefa - prioridade ALTA")
	void t26() {
		try {
			sistema.marcarPrioridade(0, "alta");;
		}catch(IllegalArgumentException e){
			assertEquals("Entrada inválida", e.getMessage());
		}
	}
	
	@AtualizarTarefaTest
	@DisplayName("Atualizar a prioridade da tarefa - prioridade MÉDIA")
	void t27() {
		try {
			sistema.marcarPrioridade(0, "média");
		}catch(IllegalArgumentException e){
			assertEquals("Entrada inválida", e.getMessage());
		}
	}
	
	@AtualizarTarefaTest
	@DisplayName("Atualizar a prioridade da tarefa - prioridade BAIXA")
	void t28() {
		try {
			sistema.marcarPrioridade(0, "baixa");
		}catch(IllegalArgumentException e){
			assertEquals("Entrada inválida", e.getMessage());
		}
	}
	
	@AtualizarTarefaTest
	@DisplayName("Atualizar a prioridade da tarefa - prioridade NAO_INFORMADO")
	void t29() {
		try {
			sistema.marcarPrioridade(0, "não informado");
		}catch(IllegalArgumentException e){
			assertEquals("Entrada inválida", e.getMessage());
		}
	}

	@AtualizarTarefaTest
	@DisplayName("Atualizar a prioridade da tarefa - prioridade inválida")
	void t30() {
		
		assertThrows(IllegalArgumentException.class, () -> {
			sistema.marcarPrioridade(0, "mais ou menos");
        }, "Deveria lançar uma IllegalArgumentException");
		
	}
	
	@CriarTarefaTest
	@DisplayName("Criar tarefa com data válida - data no futuro 'considerando data do sistema = 17/03/2024'")
	void t31() {
		try {
			Tarefa tarefa = sistema.criarTarefa("Fazer atividade 1","Exercício 1","18/03/2024","alta");
			assertEquals(tarefa, sistema.getTarefa(0));
		}catch(IllegalArgumentException e){
			assertEquals("Entrada inválida", e.getMessage());
		}
	}
	
	@CriarTarefaTest
	@DisplayName("Criar tarefa com data inválida - data no passado 'considerando data do sistema = 17/03/2024'")
	void t32() {

		assertThrows(IllegalArgumentException.class, () -> {
			sistema.criarTarefa("Fazer atividade 1","Exercício 1","16/03/2024","alta");
        }, "Deveria lançar uma IllegalArgumentException");
	}
	
	@AtualizarTarefaTest
	@DisplayName("Atualizar data de tarefa com data válida - data no futuro 'considerando data do sistema = 17/03/2024'")
	void t33() {
		try {
			sistema.criarTarefa("Fazer atividade 1","Exercício 1","20/03/2024","alta");
			sistema.atualizarData(0, "18/03/2024");
			assertEquals("18/03/2024", sistema.getTarefa(0).getDataVencimento());
		}catch(IllegalArgumentException e){
			assertEquals("Entrada inválida", e.getMessage());
		}
	}
	
	@AtualizarTarefaTest
	@DisplayName("Atualizar data de tarefa com data válida - data no passado 'considerando data do sistema = 17/03/2024'")
	void t34() {
		
		assertThrows(IllegalArgumentException.class, () -> {
			sistema.criarTarefa("Fazer atividade 1","Exercício 1","20/03/2024","alta");
			sistema.atualizarData(0, "16/03/2024");
        }, "Deveria lançar uma IllegalArgumentException");
	}
	
}

