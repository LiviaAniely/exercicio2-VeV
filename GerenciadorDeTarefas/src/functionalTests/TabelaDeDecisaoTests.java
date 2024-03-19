package functionalTests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import gerenciadorDeTarefas.Main;
import gerenciadorDeTarefas.Tarefa;

public class TabelaDeDecisaoTests {

	Main sistema;
	
	@BeforeEach
	void criarSistema() {
		this.sistema = new Main();

	}
	
	
	@Test
	void t35() {
		try {
			Tarefa tarefa = sistema.criarTarefa("Exercicio VEV","EX5","30/04/2024","alta");
			assertEquals(tarefa, sistema.getTarefa(0));
		}catch(IllegalArgumentException e){
			assertEquals("Entrada inválida", e.getMessage());
		}
	}
	
	@Test
	void t36() {
		try {
			Tarefa tarefa = sistema.criarTarefa(null,"EX5", "30/04/2024","alta");
			assertEquals(tarefa, sistema.getTarefa(0));
		}catch(IllegalArgumentException e){
			assertEquals("Entrada inválida", e.getMessage());
		}
	}
	
	@Test
	void t37() {
		try {
			Tarefa tarefa = sistema.criarTarefa("Exercicio VEV",null, "30/04/2024","alta");
			assertEquals(tarefa, sistema.getTarefa(0));
		}catch(IllegalArgumentException e){
			assertEquals("Entrada inválida", e.getMessage());
		}
	}
	
	@Test
	void t38() {
		try {
			Tarefa tarefa = sistema.criarTarefa("Exercicio VEV","EX5", null, "alta");
			assertEquals(tarefa, sistema.getTarefa(0));
		}catch(IllegalArgumentException e){
			assertEquals("Entrada inválida", e.getMessage());
		}
	}
	
	@Test
	void t39() {
		try {
			Tarefa tarefa = sistema.criarTarefa("Exercicio VEV","EX5", "30/04/2024", null);
			assertEquals(tarefa, sistema.getTarefa(0));
		}catch(IllegalArgumentException e){
			assertEquals("Entrada inválida", e.getMessage());
		}
	}
	
	@Test
	void t40() {
		
		try {
			Tarefa tarefa = sistema.criarTarefa("", "EX5", "30/04/2024", "alta");
		}catch(IllegalArgumentException e){
			assertEquals("Entrada inválida", e.getMessage());
		}
	}
	
	@Test	
	void t41() {
		
		try {
			Tarefa tarefa = sistema.criarTarefa("Exercicio VEV", "", "30/04/2024", "alta");
		}catch(IllegalArgumentException e){
			assertEquals("Entrada inválida", e.getMessage());
		}
	}
	
	@Test
	void t42() {
		
		try {
			Tarefa tarefa = sistema.criarTarefa("Exercicio VEV", "EX5", "", "alta");
		}catch(IllegalArgumentException e){
			assertEquals("Entrada inválida", e.getMessage());
		}
	}
	
	@Test
	void t43() {
		
		try {
			Tarefa tarefa = sistema.criarTarefa("Exercicio VEV", "EX5", "30/04/2024", "");
			assertEquals(tarefa, sistema.getTarefa(0));
		}catch(IllegalArgumentException e){
			assertEquals("Entrada inválida", e.getMessage());
		}
	}
	
	@Test
	void t44() {
		
		try {
			Tarefa tarefa = sistema.criarTarefa("Exercicio VEV", "EX5", "30/04/2024", "alta");
			assertEquals("Exercicio VEV", sistema.getTarefa(0).getTitulo());
			sistema.atualizarTitulo(0, "Atividade VEV");
			assertEquals("Atividade VEV", sistema.getTarefa(0).getTitulo());
		}catch(IllegalArgumentException e){
			assertEquals("Entrada inválida", e.getMessage());
		}
	}	
	
	@Test
	void t45() {
		
		try {
			Tarefa tarefa = sistema.criarTarefa("Exercicio VEV", "EX5", "30/04/2024", "alta");
			assertEquals("Exercicio VEV", sistema.getTarefa(0).getTitulo());
			sistema.atualizarTitulo(0, null);
		}catch(IllegalArgumentException e){
			assertEquals("Entrada inválida", e.getMessage());
		}
	}
	
	@Test
	void t46() {
		
		try {
			Tarefa tarefa = sistema.criarTarefa("Exercicio VEV", "EX5", "30/04/2024", "alta");
			assertEquals("Exercicio VEV", sistema.getTarefa(0).getTitulo());
			sistema.atualizarTitulo(0, "");
		}catch(IllegalArgumentException e){
			assertEquals("Entrada inválida", e.getMessage());
		}
	}	
	
	@Test
	void t47() {
		
		try {
			Tarefa tarefa = sistema.criarTarefa("Exercicio VEV", "EX5", "30/04/2024", "alta");
			assertEquals("EX5", sistema.getTarefa(0).getDescricao());
			sistema.atualizarDescricao(0, "EX6");
			assertEquals("EX6", sistema.getTarefa(0).getDescricao());
		}catch(IllegalArgumentException e){
			assertEquals("Entrada inválida", e.getMessage());
		}
	}
	
	@Test
	void t48() {
		
		try {
			Tarefa tarefa = sistema.criarTarefa("Exercicio VEV", "EX5", "30/04/2024", "alta");
			assertEquals("EX5", sistema.getTarefa(0).getDescricao());
			sistema.atualizarDescricao(0, null);
		}catch(IllegalArgumentException e){
			assertEquals("Entrada inválida", e.getMessage());
		}
	}
	
	@Test
	void t49() {
		
		try {
			Tarefa tarefa = sistema.criarTarefa("Exercicio VEV", "EX5", "30/04/2024", "alta");
			assertEquals("EX5", sistema.getTarefa(0).getDescricao());
			sistema.atualizarDescricao(0, "");
		}catch(IllegalArgumentException e){
			assertEquals("Entrada inválida", e.getMessage());
		}
	}
	
	@Test
	void t50() {
		
		try {
			Tarefa tarefa = sistema.criarTarefa("Exercicio VEV", "EX5", "30/04/2024", "alta");
			assertEquals("30/04/2024", sistema.getTarefa(0).getDataVencimento());
			sistema.atualizarData(0, "31/04/2024");
			assertEquals("31/04/2024", sistema.getTarefa(0).getDataVencimento());
		}catch(IllegalArgumentException e){
			assertEquals("Entrada inválida", e.getMessage());
		}
	}
	
	@Test
	void t51() {
		
		try {
			Tarefa tarefa = sistema.criarTarefa("Exercicio VEV", "EX5", "30/04/2024", "alta");
			assertEquals("30/04/2024", sistema.getTarefa(0).getDataVencimento());
			sistema.atualizarData(0, null);
		}catch(IllegalArgumentException e){
			assertEquals("Entrada inválida", e.getMessage());
		}
	}
	
	@Test
	void t52() {
		
		try {
			Tarefa tarefa = sistema.criarTarefa("Exercicio VEV", "EX5", "30/04/2024", "alta");
			assertEquals("30/04/2024", sistema.getTarefa(0).getDataVencimento());
			sistema.atualizarData(0, "");
		}catch(IllegalArgumentException e){
			assertEquals("Entrada inválida", e.getMessage());
		}
	}
	
	@Test
	void t53() {
		
		try {
			Tarefa tarefa = sistema.criarTarefa("Exercicio VEV", "EX5", "30/04/2024", "alta");
			assertEquals("ALTA", sistema.getTarefa(0).getPrioridade());
			sistema.marcarPrioridade(0, "media");
			assertEquals("MEDIA", sistema.getTarefa(0).getPrioridade());
		}catch(IllegalArgumentException e){
			assertEquals("Entrada inválida", e.getMessage());
		}
	}
	
	@Test
	void t54() {
		
		try {
			Tarefa tarefa = sistema.criarTarefa("Exercicio VEV", "EX5", "30/04/2024", "alta");
			assertEquals("ALTA", sistema.getTarefa(0).getPrioridade());
			sistema.marcarPrioridade(0, null);
		}catch(NullPointerException n){

		}
	}
	
	@Test
	void t55() {
		
		try {
			Tarefa tarefa = sistema.criarTarefa("Exercicio VEV", "EX5", "30/04/2024", "alta");
			assertEquals("ALTA", sistema.getTarefa(0).getPrioridade());
			sistema.marcarPrioridade(0, "");
		}catch(IllegalArgumentException e){
			assertEquals("Entrada inválida", e.getMessage());
		}
	}

	
	@Test
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
	
	@Test
	void t57() {
		
		try {
			Tarefa tarefa = sistema.criarTarefa("Exercicio VEV", "EX5", "30/04/2024", "alta");
			Tarefa tarefa2 = sistema.criarTarefa("Exercicio VEV", "EX5", "30/04/2024", "media");
			assertEquals(tarefa, sistema.getTarefa(0));
			sistema.excluirTarefa(0);
			sistema.excluirTarefa(0);
		}catch(IllegalArgumentException e){
			assertEquals("ID inválido", e.getMessage());
		}
	}
	
	@Test
	void t58() {
		
			sistema.criarTarefa("Exercicio 1", "TDD", "20/03/2024", "alta");
			sistema.criarTarefa("Exercicio 2", "AVL", "22/03/2024", "media");
			
			String respListarTarefas = "Titulo: Exercicio 1\nDescricao: TDD\nData: 20/03/2024\nPrioridade: alta"
					+ "\nTitulo: Exercicio 2\nDescricao: AVL\nData: 22/03/2024\nPrioridade: media\n";
		
			assertEquals(respListarTarefas, sistema.listarTarefas());
		
	}

}
