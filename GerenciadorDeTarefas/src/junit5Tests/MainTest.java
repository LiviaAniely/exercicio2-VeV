package junit5Tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.DisplayName;

import gerenciadorDeTarefas.Main;
import gerenciadorDeTarefas.Tarefa;


@DisplayName("Testes dos métodos do CRUD de Tarefa")
public class MainTest {
	
	Main sistema;
	private Tarefa tarefaValida;
	
	@BeforeEach
	void criarSistema() {
		this.sistema = new Main();
		this.tarefaValida = sistema.criarTarefa("Fazer atividade de VeV","Exercício 2 sobre TDD","04/03/2024");
	}
	
	@CriarTarefaTest
	@DisplayName("Criar tarefa com argumentos válidos")
	void testCriarTarefaComArgumentosValidos() {
		
		try {
			sistema.criarTarefa("Fazer atividade de VeV","Exercício 2 sobre TDD","04/03/2024");
		}catch(IllegalArgumentException e){
			assertEquals("Entrada inválida", e.getMessage());
		}
	}
	
	@CriarTarefaTest
	@DisplayName("Criar tarefa com argumentos inválidos")
	void testCriarTarefaComArgumentosInvalidos() {
		
		assertThrows(IllegalArgumentException.class, () -> {
            sistema.criarTarefa("Fazer atividade de VeV", "Exercício 2 sobre TDD", "");
        }, "Deveria lançar uma IllegalArgumentException");
	}
	
	@AtualizarTarefaTest
	@DisplayName("Atualizar título com argumentos válidos")
	void testAtualizarTituloComArgumentosValidos() {
		
		try {
			sistema.atualizarTitulo(tarefaValida.getId(), "Enviar atividade de VeV");
		}catch(IllegalArgumentException e){
			assertEquals("Entrada inválida", e.getMessage());
		}
	}
	
	@AtualizarTarefaTest
	@DisplayName("Atualizar descrição com argumentos válidos")
	void testAtualizarDescricaoComArgumentosValidos() {
		
		try {
			sistema.atualizarDescricao(tarefaValida.getId(), "Exercício 2");
		}catch(IllegalArgumentException e){
			assertEquals("Entrada inválida", e.getMessage());
		}
	}
	
	@AtualizarTarefaTest
	@DisplayName("Atualizar data com argumentos válidos")
	void testAtualizarDataComArgumentosValidos() {
		
		try {
			sistema.atualizarData(tarefaValida.getId(), "10/03/2024");
		}catch(IllegalArgumentException e){
			assertEquals("Entrada inválida", e.getMessage());
		}
	}
	
	@AtualizarTarefaTest
	@DisplayName("Atualizar prioridade com argumentos válidos")
	void testAtualizarPrioridadeComArgumentosValidos() {
		
		try {
			sistema.marcarPrioridade(tarefaValida.getId(), "alta");
		}catch(IllegalArgumentException e){
			assertEquals("Entrada inválida", e.getMessage());
		}
	}
	
	@AtualizarTarefaTest
	@DisplayName("Atualizar título com argumentos inválidos: título vazio")
	void testAtualizarTituloComArgumentosInvalidos() {
		
		assertThrows(IllegalArgumentException.class, () -> {
			sistema.atualizarTitulo(tarefaValida.getId(), "");
        }, "Deveria lançar uma IllegalArgumentException");
	}
	
	@AtualizarTarefaTest
	@DisplayName("Atualizar descrição com argumentos inválidos: descrição vazia")
	void testAtualizarDescricaoComArgumentosInvalidos() {
		
		assertThrows(IllegalArgumentException.class, () -> {
			sistema.atualizarDescricao(tarefaValida.getId(), "");
        }, "Deveria lançar uma IllegalArgumentException");
	}
	
	@AtualizarTarefaTest
	@DisplayName("Atualizar data com argumentos inválidos: data vazia")
	void testAtualizarDataComArgumentosInvalidos() {
	
		assertThrows(IllegalArgumentException.class, () -> {
			sistema.atualizarData(tarefaValida.getId(), "");
        }, "Deveria lançar uma IllegalArgumentException");
	}
	
	@AtualizarTarefaTest
	@DisplayName("Atualizar prioridade com argumentos inválidos: prioridade vazia")
	void testAtualizarPrioridadeComArgumentosInvalidos() {
		
		assertThrows(IllegalArgumentException.class, () -> {
			sistema.marcarPrioridade(tarefaValida.getId(), "");
        }, "Deveria lançar uma IllegalArgumentException");
	}
	
	@ExcluirTarefaTest
	@DisplayName("Excluir tarefa com argumento de id válido")
	void testExcluirTarefaComArgumentosValidos() {
		
		assertThrows(IndexOutOfBoundsException.class, () -> {
			Integer id = tarefaValida.getId();
			sistema.excluirTarefa(id);
			sistema.getTarefa(id);
        }, "Deveria lançar uma IndexOutOfBoundsException");
	}
	
	@ExcluirTarefaTest
	@DisplayName("Excluir tarefa com argumento de id inválido")
	void testExcluirTarefaComIDInvalido() {
		
		assertThrows(IllegalArgumentException.class, () -> {
			sistema.excluirTarefa(2);
        }, "Deveria lançar uma IllegalArgumentException");
	}
	
	@Tag("ListarTarefas")
	@Test
	@DisplayName("Listar tarefas cadastradas")
	void testListarTarefas() {
		
		String saida1 = "Titulo: Fazer atividade de VeV\nDescricao: Exercício 2 sobre TDD\nData: 04/03/2024\nPrioridade: nao_informado\n";
		String saida2 = "Titulo: Fazer atividade de IA\nDescricao: Quiz 4\nData: 05/03/2024\nPrioridade: media\n";
		
		String saidaEsperada = saida1 + saida2;
		
		sistema.criarTarefa("Fazer atividade de IA","Quiz 4","05/03/2024","media");
		
		assertEquals(saidaEsperada, sistema.listarTarefas());
	}
	

}
