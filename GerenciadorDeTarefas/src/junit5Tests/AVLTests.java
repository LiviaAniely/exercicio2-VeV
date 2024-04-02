package junit5Tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

import gerenciadorDeTarefas.Main;

@DisplayName("Testes usando o método de análise de valores limite")
public class AVLTests {

	Main sistema;
	
	@BeforeEach
	void criarSistema() {
		this.sistema = new Main();
		sistema.criarTarefa("Fazer atividade 1","Exercício 1","20/03/2024","alta");
		sistema.criarTarefa("Fazer atividade 2","Exercício 2","21/03/2024","alta");
		sistema.criarTarefa("Fazer atividade 3","Exercício 3","22/03/2024","alta");
		sistema.criarTarefa("Fazer atividade 4","Exercício 4","23/03/2024","alta");
		sistema.criarTarefa("Fazer atividade 5","Exercício 5","24/03/2024","alta");
		sistema.criarTarefa("Fazer atividade 6","Exercício 6","25/03/2024","alta");
	}
	
	@AtualizarTarefaTest
	@DisplayName("Atualizar título de tarefa: id de tarefa inválido - menor que o id mínimo")
	void t1() {
		
		assertThrows(IllegalArgumentException.class, () -> {
			sistema.atualizarTitulo(-1, "Realizar atv");
        }, "Deveria lançar uma IllegalArgumentException");
	}
	
	@AtualizarTarefaTest
	@DisplayName("Atualizar título de tarefa: id de tarefa válido - id mínimo possível")
	void t2() {
		
		try {
			sistema.atualizarTitulo(0, "Realizar atv");
			assertEquals("Realizar atv", sistema.getTarefa(0).getTitulo());
		}catch(IllegalArgumentException e){
			assertEquals("Entrada inválida", e.getMessage());
		}
	}
	
	@AtualizarTarefaTest
	@DisplayName("Atualizar título de tarefa: id de tarefa válido - qualquer id válido entre o mínimo e máximo")
	void t3() {
		
		try {
			sistema.atualizarTitulo(3, "Realizar atv");
			assertEquals("Realizar atv", sistema.getTarefa(3).getTitulo());
		}catch(IllegalArgumentException e){
			assertEquals("Entrada inválida", e.getMessage());
		}
	}
	
	@AtualizarTarefaTest
	@DisplayName("Atualizar título de tarefa: id de tarefa válido - id máximo possível")
	void t4() {
		
		try {
			sistema.atualizarTitulo(5, "Realizar atv");
			assertEquals("Realizar atv", sistema.getTarefa(5).getTitulo());
		}catch(IllegalArgumentException e){
			assertEquals("Entrada inválida", e.getMessage());
		}
	}
	
	@AtualizarTarefaTest
	@DisplayName("Atualizar título de tarefa: id de tarefa inválido - maior que o id mínimo")
	void t5() {
		
		assertThrows(IllegalArgumentException.class, () -> {
			sistema.atualizarTitulo(6, "Realizar atv");
        }, "Deveria lançar uma IllegalArgumentException");
	}
	
	@AtualizarTarefaTest
	@DisplayName("Atualizar descrição de tarefa: id de tarefa inválido - menor que o id mínimo")
	void t6() {
	
		assertThrows(IllegalArgumentException.class, () -> {
			sistema.atualizarDescricao(-1, "Exercicio");
        }, "Deveria lançar uma IllegalArgumentException");
	}
	
	@AtualizarTarefaTest
	@DisplayName("Atualizar descrição de tarefa: id de tarefa válido - id mínimo possível")
	void t7() {
		
		try {
			sistema.atualizarDescricao(0, "Exercicio");
			assertEquals("Exercicio", sistema.getTarefa(0).getDescricao());
		}catch(IllegalArgumentException e){
			assertEquals("Entrada inválida", e.getMessage());
		}
	}
	
	@AtualizarTarefaTest
	@DisplayName("Atualizar descrição de tarefa: id de tarefa válido - qualquer id válido entre o mínimo e o máximo")
	void t8() {
		
		try {
			sistema.atualizarDescricao(3, "Exercicio");
			assertEquals("Exercicio", sistema.getTarefa(3).getDescricao());
		}catch(IllegalArgumentException e){
			assertEquals("Entrada inválida", e.getMessage());
		}
	}
	
	@AtualizarTarefaTest
	@DisplayName("Atualizar descrição de tarefa: id de tarefa válido - id máximo possível")
	void t9() {
		
		try {
			sistema.atualizarDescricao(5, "Exercicio");
			assertEquals("Exercicio", sistema.getTarefa(5).getDescricao());
		}catch(IllegalArgumentException e){
			assertEquals("Entrada inválida", e.getMessage());
		}
	}
	
	@AtualizarTarefaTest
	@DisplayName("Atualizar descrição de tarefa: id de tarefa inválido - maior que o id máxiimo")
	void t10() {

		assertThrows(IllegalArgumentException.class, () -> {
			sistema.atualizarDescricao(6, "Exercicio");
        }, "Deveria lançar uma IllegalArgumentException");
	}
	
	@AtualizarTarefaTest
	@DisplayName("Atualizar data de tarefa: id de tarefa inválido - menor que o id mínimo")
	void t11() {
		
		assertThrows(IllegalArgumentException.class, () -> {
			sistema.atualizarData(-1, "27/03/2024");
        }, "Deveria lançar uma IllegalArgumentException");
	}
	
	@AtualizarTarefaTest
	@DisplayName("Atualizar data de tarefa: id de tarefa válido - id mínimo possível")
	void t12() {
		
		try {
			sistema.atualizarData(0, "27/03/2024");
			assertEquals("27/03/2024", sistema.getTarefa(0).getDataVencimento());
		}catch(IllegalArgumentException e){
			assertEquals("Entrada inválida", e.getMessage());
		}
	}
	
	@AtualizarTarefaTest
	@DisplayName("Atualizar data de tarefa: id de tarefa válido - qualquer id válido entre o mínimo e o máximo")
	void t13() {
		
		try {
			sistema.atualizarData(3, "27/03/2024");
			assertEquals("27/03/2024", sistema.getTarefa(3).getDataVencimento());
		}catch(IllegalArgumentException e){
			assertEquals("Entrada inválida", e.getMessage());
		}
	}
	
	@AtualizarTarefaTest
	@DisplayName("Atualizar data de tarefa: id de tarefa válido - id máximo possível")
	void t14() {
		
		try {
			sistema.atualizarData(5, "27/03/2024");
			assertEquals("27/03/2024", sistema.getTarefa(5).getDataVencimento());
		}catch(IllegalArgumentException e){
			assertEquals("Entrada inválida", e.getMessage());
		}
	}
	
	@AtualizarTarefaTest
	@DisplayName("Atualizar data de tarefa: id de tarefa inválido - maior que o id máximo")
	void t15() {
		
		assertThrows(IllegalArgumentException.class, () -> {
			sistema.atualizarData(6, "27/03/2024");
        }, "Deveria lançar uma IllegalArgumentException");
	}
	
	@AtualizarTarefaTest
	@DisplayName("Atualizar prioridade de tarefa: id de tarefa inválido - menor que o id mínimo")
	void t16() {

		assertThrows(IllegalArgumentException.class, () -> {
			sistema.marcarPrioridade(-1, "baixa");
        }, "Deveria lançar uma IllegalArgumentException");
	}
	
	@AtualizarTarefaTest
	@DisplayName("Atualizar prioridade de tarefa: id de tarefa válido - id mínimo possível")
	void t17() {
		
		try {
			sistema.marcarPrioridade(0, "baixa");
			assertEquals("baixa", sistema.getTarefa(0).getDescricao());
		}catch(IllegalArgumentException e){
			assertEquals("Entrada inválida", e.getMessage());
		}
	}
	
	@AtualizarTarefaTest
	@DisplayName("Atualizar prioridade de tarefa: id de tarefa válido - qualquer id válido entre o mínimo e o máximo")
	void t18() {
		
		try {
			sistema.marcarPrioridade(3, "baixa");
			assertEquals("baixa", sistema.getTarefa(3).getDescricao());
		}catch(IllegalArgumentException e){
			assertEquals("Entrada inválida", e.getMessage());
		}
	}
	
	@AtualizarTarefaTest
	@DisplayName("Atualizar prioridade de tarefa: id de tarefa válido - id máximo possível")
	void t19() {
		
		try {
			sistema.marcarPrioridade(5, "baixa");
			assertEquals("baixa", sistema.getTarefa(5).getDescricao());
		}catch(IllegalArgumentException e){
			assertEquals("Entrada inválida", e.getMessage());
		}
	}
	
	@AtualizarTarefaTest
	@DisplayName("Atualizar prioridade de tarefa: id de tarefa inválido - maior que o id máximo")
	void t20() {

		assertThrows(IllegalArgumentException.class, () -> {
			sistema.marcarPrioridade(6, "baixa");
        }, "Deveria lançar uma IllegalArgumentException");
	}
	
	@ExcluirTarefaTest
	@DisplayName("Excluir tarefa: id de tarefa inválido - menor que o id mínimo")
	//o método excluirTarefa deveria lançar o illegalArgument
	void t21() {
		
		assertThrows(IllegalArgumentException.class, () -> {
			sistema.excluirTarefa(-1);
			sistema.getTarefa(-1);
        }, "Deveria lançar uma IllegalArgumentException");
	}
	
	@ExcluirTarefaTest
	@DisplayName("Excluir tarefa: id de tarefa válido - id mínimo possível")
	void t22() {
		
		assertThrows(IndexOutOfBoundsException.class, () -> {
			sistema.excluirTarefa(0);
			sistema.getTarefa(0);
        }, "Deveria lançar um IndexOutOfBoundsException");
	}
	
	@ExcluirTarefaTest
	@DisplayName("Excluir tarefa: id de tarefa válido - qualquer id válido entre o mínimo e o máximo")
	void t23() {
		
		assertThrows(IndexOutOfBoundsException.class, () -> {
			sistema.excluirTarefa(3);
			sistema.getTarefa(3);
        }, "Deveria lançar um IndexOutOfBoundsException");
	}
	
	@ExcluirTarefaTest
	@DisplayName("Excluir tarefa: id de tarefa válido - id máximo possível")
	void t24() {
	
		assertThrows(IndexOutOfBoundsException.class, () -> {
			sistema.excluirTarefa(5);
			sistema.getTarefa(5);
        }, "Deveria lançar um IndexOutOfBoundsException");
	}
	
	@ExcluirTarefaTest
	@DisplayName("Excluir tarefa: id de tarefa inválido - maior que o id máximo")
	//o IllegalArgument deveria ser disparado pelo excluirTarefa
	void t25() {
		
		assertThrows(IllegalArgumentException.class, () -> {
			sistema.excluirTarefa(6);
			sistema.getTarefa(6);
        }, "Deveria lançar uma IllegalArgumentException");
	}
	
	
}


