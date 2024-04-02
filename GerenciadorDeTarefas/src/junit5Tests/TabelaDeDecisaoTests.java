package junit5Tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import gerenciadorDeTarefas.Main;
import gerenciadorDeTarefas.Tarefa;

@DisplayName("Testes usando o método de tabela de decisão")
public class TabelaDeDecisaoTests {

	Main sistema;
	
	@BeforeEach
	void criarSistema() {
		this.sistema = new Main();

	}
	
	@CriarTarefaTest
	@DisplayName("Criar tarefa com argumentos válidos")
	void t35() {
		try {
			Tarefa tarefa = sistema.criarTarefa("Exercicio VEV","EX5","30/04/2024","alta");
			assertEquals(tarefa, sistema.getTarefa(0));
		}catch(IllegalArgumentException e){
			assertEquals("Entrada inválida", e.getMessage());
		}
	}
	
	@CriarTarefaTest
	@DisplayName("Criar tarefa com argumentos inválidos - título nulo")
	void t36() {
		
		assertThrows(IllegalArgumentException.class, () -> {
			sistema.criarTarefa(null,"EX5", "30/04/2024","alta");
        }, "Deveria lançar uma IllegalArgumentException");
	}
	
	@CriarTarefaTest
	@DisplayName("Criar tarefa com argumentos inválidos - descrição nula")
	void t37() {

		assertThrows(IllegalArgumentException.class, () -> {
			sistema.criarTarefa("Exercicio VEV",null, "30/04/2024","alta");
        }, "Deveria lançar uma IllegalArgumentException");
	}
	
	@CriarTarefaTest
	@DisplayName("Criar tarefa com argumentos inválidos - data nula")
	void t38() {

		assertThrows(IllegalArgumentException.class, () -> {
			sistema.criarTarefa("Exercicio VEV","EX5", null, "alta");
        }, "Deveria lançar uma IllegalArgumentException");
	}
	
	@CriarTarefaTest
	@DisplayName("Criar tarefa com argumentos válidos - prioridade nula")
	void t39() {

		try {
			Tarefa tarefa = sistema.criarTarefa("Exercicio VEV","EX5", "30/04/2024", null);
			assertEquals(tarefa, sistema.getTarefa(0));
		}catch(IllegalArgumentException e){
			assertEquals("Entrada inválida", e.getMessage());
		}
	}
	
	@CriarTarefaTest
	@DisplayName("Criar tarefa com argumentos inválidos - título vazio")
	void t40() {
		
		assertThrows(IllegalArgumentException.class, () -> {
			sistema.criarTarefa("", "EX5", "30/04/2024", "alta");
        }, "Deveria lançar uma IllegalArgumentException");
	}
	
	
	@CriarTarefaTest
	@DisplayName("Criar tarefa com argumentos inválidos - descrição vazia")
	void t41() {

		assertThrows(IllegalArgumentException.class, () -> {
			sistema.criarTarefa("Exercicio VEV", "", "30/04/2024", "alta");
        }, "Deveria lançar uma IllegalArgumentException");
	}
	
	@CriarTarefaTest
	@DisplayName("Criar tarefa com argumentos inválidos - data vazia")
	void t42() {
	
		assertThrows(IllegalArgumentException.class, () -> {
			sistema.criarTarefa("Exercicio VEV", "EX5", "", "alta");
        }, "Deveria lançar uma IllegalArgumentException");
	}
	
	@CriarTarefaTest
	@DisplayName("Criar tarefa com argumentos válidos - prioridade vazia")
	void t43() {
		
		try {
			Tarefa tarefa = sistema.criarTarefa("Exercicio VEV", "EX5", "30/04/2024", "");
			assertEquals(tarefa, sistema.getTarefa(0));
		}catch(IllegalArgumentException e){
			assertEquals("Entrada inválida", e.getMessage());
		}
	
	}
	
	@AtualizarTarefaTest
	@DisplayName("Atualizar título com argumento válido - título válido")
	void t44() {
		
		try {
			sistema.criarTarefa("Exercicio VEV"
					+ "", "EX5", "30/04/2024", "alta");
			assertEquals("Exercicio VEV", sistema.getTarefa(0).getTitulo());
			sistema.atualizarTitulo(0, "Atividade VEV");
			assertEquals("Atividade VEV", sistema.getTarefa(0).getTitulo());
		}catch(IllegalArgumentException e){
			assertEquals("Entrada inválida", e.getMessage());
		}
	}	
	
	@AtualizarTarefaTest
	@DisplayName("Atualizar título com argumento inválido - título nulo")
	void t45() {
		
		assertThrows(IllegalArgumentException.class, () -> {
			 sistema.criarTarefa("Exercicio VEV", "EX5", "30/04/2024", "alta");
			sistema.atualizarTitulo(0, null);
        }, "Deveria lançar uma IllegalArgumentException");
	}
	
	@AtualizarTarefaTest
	@DisplayName("Atualizar título com argumento inválido - título vazio")
	void t46() {
	
		assertThrows(IllegalArgumentException.class, () -> {
			sistema.criarTarefa("Exercicio VEV", "EX5", "30/04/2024", "alta");
			sistema.atualizarTitulo(0, "");
        }, "Deveria lançar uma IllegalArgumentException");
	}	
	
	@AtualizarTarefaTest
	@DisplayName("Atualizar descrição com argumento válido - descrição válida")
	void t47() {
		
		try {
			sistema.criarTarefa("Exercicio VEV", "EX5", "30/04/2024", "alta");
			assertEquals("EX5", sistema.getTarefa(0).getDescricao());
			sistema.atualizarDescricao(0, "EX6");
			assertEquals("EX6", sistema.getTarefa(0).getDescricao());
		}catch(IllegalArgumentException e){
			assertEquals("Entrada inválida", e.getMessage());
		}
	
	}
	
	@AtualizarTarefaTest
	@DisplayName("Atualizar descrição com argumento inválido - descrição nula")
	void t48() {
	
		assertThrows(IllegalArgumentException.class, () -> {
			sistema.criarTarefa("Exercicio VEV", "EX5", "30/04/2024", "alta");
			sistema.atualizarDescricao(0, null);
        }, "Deveria lançar uma IllegalArgumentException");
	}
	
	@AtualizarTarefaTest
	@DisplayName("Atualizar descrição com argumento inválido - descrição vazia")
	void t49() {
		
		assertThrows(IllegalArgumentException.class, () -> {
			sistema.criarTarefa("Exercicio VEV", "EX5", "30/04/2024", "alta");
			sistema.atualizarDescricao(0, "");
        }, "Deveria lançar uma IllegalArgumentException");
	}
	
	@AtualizarTarefaTest
	@DisplayName("Atualizar data com argumento válido - data válida")
	void t50() {
		
		try {
			sistema.criarTarefa("Exercicio VEV", "EX5", "30/04/2024", "alta");
			assertEquals("30/04/2024", sistema.getTarefa(0).getDataVencimento());
			sistema.atualizarData(0, "31/04/2024");
			assertEquals("31/04/2024", sistema.getTarefa(0).getDataVencimento());
		}catch(IllegalArgumentException e){
			assertEquals("Entrada inválida", e.getMessage());
		}
	}
	
	@AtualizarTarefaTest
	@DisplayName("Atualizar data com argumento inválido - data nula")
	void t51() {
	
		assertThrows(IllegalArgumentException.class, () -> {
			sistema.criarTarefa("Exercicio VEV", "EX5", "30/04/2024", "alta");
			sistema.atualizarData(0, null);
        }, "Deveria lançar uma IllegalArgumentException");
	}
	
	@AtualizarTarefaTest
	@DisplayName("Atualizar data com argumento inválido - data vazia")
	void t52() {
	
		assertThrows(IllegalArgumentException.class, () -> {
			sistema.criarTarefa("Exercicio VEV", "EX5", "30/04/2024", "alta");
			sistema.atualizarData(0, "");
        }, "Deveria lançar uma IllegalArgumentException");
	}
	
	@AtualizarTarefaTest
	@DisplayName("Atualizar prioridade com argumento válido - prioridade válida")
	void t53() {
		
		try {
			sistema.criarTarefa("Exercicio VEV", "EX5", "30/04/2024", "alta");
			assertEquals("ALTA", sistema.getTarefa(0).getPrioridade());
			sistema.marcarPrioridade(0, "media");
			assertEquals("MEDIA", sistema.getTarefa(0).getPrioridade());
		}catch(IllegalArgumentException e){
			assertEquals("Entrada inválida", e.getMessage());
		}
	}
	
	@AtualizarTarefaTest
	@DisplayName("Atualizar prioridade com argumento inválido - prioridade nula")
	void t54() {
	
		assertThrows(IllegalArgumentException.class, () -> {
			sistema.criarTarefa("Exercicio VEV", "EX5", "30/04/2024", "alta");
			sistema.marcarPrioridade(0, null);
        }, "Deveria lançar uma IllegalArgumentException");
	}
	
	@AtualizarTarefaTest
	@DisplayName("Atualizar prioridade com argumento inválido - prioridade vazia")
	void t55() {
		
		assertThrows(IllegalArgumentException.class, () -> {
			sistema.criarTarefa("Exercicio VEV", "EX5", "30/04/2024", "alta");
			sistema.marcarPrioridade(0, "");
        }, "Deveria lançar uma IllegalArgumentException");
	}

	
	@ExcluirTarefaTest
	@DisplayName("Excluir tarefa com argumento válido - id válido")
	void t56() {
		
		try {
			Tarefa tarefa = sistema.criarTarefa("Exercicio VEV", "EX5", "30/04/2024", "alta");
			assertEquals(tarefa, sistema.getTarefa(0));
			sistema.excluirTarefa(0);
			sistema.getTarefa(0);
		}catch(IllegalArgumentException e){
			assertEquals("ID inválido", e.getMessage());
		}catch(IndexOutOfBoundsException i) {
			assertEquals("ID inexistente", i.getMessage());
		}
	}
	
	@ExcluirTarefaTest
	@DisplayName("Excluir tarefa com argumento válido - id inválido")
	void t57() {
		
		assertThrows(IllegalArgumentException.class, () -> {
			sistema.criarTarefa("Exercicio VEV", "EX5", "30/04/2024", "alta");
			sistema.criarTarefa("Exercicio VEV", "EX5", "30/04/2024", "media");
			sistema.excluirTarefa(0);
			sistema.excluirTarefa(0);
        }, "Deveria lançar uma IllegalArgumentException");
	}
	
	@Tag("ListarTarefas")
	@Test
	@DisplayName("Teste de listar tarefas")
	void t58() {
		
			sistema.criarTarefa("Exercicio 1", "TDD", "20/03/2024", "alta");
			sistema.criarTarefa("Exercicio 2", "AVL", "22/03/2024", "media");
			
			String respListarTarefas = "Titulo: Exercicio 1\nDescricao: TDD\nData: 20/03/2024\nPrioridade: alta"
					+ "\nTitulo: Exercicio 2\nDescricao: AVL\nData: 22/03/2024\nPrioridade: media\n";
		
			assertEquals(respListarTarefas, sistema.listarTarefas());
		
	}

}

