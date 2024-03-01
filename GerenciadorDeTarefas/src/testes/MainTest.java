package testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import gerenciadorDeTarefas.Main;
import gerenciadorDeTarefas.Tarefa;

class MainTest {

	Main sistema;
	@BeforeEach
	void criarSistema() {
		this.sistema = new Main();
	}
	
	//Teste de criar tarefa
	@Test
	void testCriarTarefaComArgumentosValidos() {
		
		try {
			Tarefa tarefa = sistema.criarTarefa("Fazer atividade de VeV","Exercício 2 sobre TDD","04/03/2024");
		}catch(IllegalArgumentException e){
			assertEquals("Entrada inválida", e.getMessage());
		}
	}
	
	@Test
	void testCriarTarefaComArgumentosInvalidos() {
		
		try {
			Tarefa tarefa = sistema.criarTarefa("Fazer atividade de VeV","Exercício 2 sobre TDD","");
		}catch(IllegalArgumentException e){
			assertEquals("Entrada inválida", e.getMessage());
		}
	}
	
	//Testes de atualizar tarefa
	
	@Test
	void testAtualizarTituloComArgumentosValidos() {
		
		try {
			Tarefa tarefa = sistema.criarTarefa("Fazer atividade de VeV","Exercício 2 sobre TDD","04/03/2024");
			sistema.atualizarTitulo(tarefa.getId(), "Enviar atividade de VeV");
		}catch(IllegalArgumentException e){
			assertEquals("Entrada inválida", e.getMessage());
		}
	}
	
	@Test
	void testAtualizarDescricaoComArgumentosValidos() {
		
		try {
			Tarefa tarefa = sistema.criarTarefa("Fazer atividade de VeV","Exercício 2 sobre TDD","04/03/2024");
			sistema.atualizarDescricao(tarefa.getId(), "Exercício 2");
		}catch(IllegalArgumentException e){
			assertEquals("Entrada inválida", e.getMessage());
		}
	}
	
	@Test
	void testAtualizarDataComArgumentosValidos() {
		
		try {
			Tarefa tarefa = sistema.criarTarefa("Fazer atividade de VeV","Exercício 2 sobre TDD","04/03/2024");
			sistema.atualizarData(tarefa.getId(), "10/03/2024");
		}catch(IllegalArgumentException e){
			assertEquals("Entrada inválida", e.getMessage());
		}
	}
	
	@Test
	void testAtualizarPrioridadeComArgumentosValidos() {
		
		try {
			Tarefa tarefa = sistema.criarTarefa("Fazer atividade de VeV","Exercício 2 sobre TDD","04/03/2024");
			sistema.marcarPrioridade(tarefa.getId(), "alta");
		}catch(IllegalArgumentException e){
			assertEquals("Entrada inválida", e.getMessage());
		}
	}
	
	@Test
	void testAtualizarTituloComArgumentosInvalidos() {
		
		try {
			Tarefa tarefa = sistema.criarTarefa("Fazer atividade de VeV","Exercício 2 sobre TDD","04/03/2024","alta");
			sistema.atualizarTitulo(tarefa.getId(), "");
		}catch(IllegalArgumentException e){
			assertEquals("Entrada inválida", e.getMessage());
		}
	}
	
	@Test
	void testAtualizarDescricaoComArgumentosInvalidos() {
		
		try {
			Tarefa tarefa = sistema.criarTarefa("Fazer atividade de VeV","Exercício 2 sobre TDD","04/03/2024","alta");
			sistema.atualizarDescricao(tarefa.getId(), "");
		}catch(IllegalArgumentException e){
			assertEquals("Entrada inválida", e.getMessage());
		}
	}
	
	@Test
	void testAtualizarDataComArgumentosInvalidos() {
		
		try {
			Tarefa tarefa = sistema.criarTarefa("Fazer atividade de VeV","Exercício 2 sobre TDD","04/03/2024","alta");
			sistema.atualizarData(tarefa.getId(), "");
		}catch(IllegalArgumentException e){
			assertEquals("Entrada inválida", e.getMessage());
		}
	}
	
	@Test
	void testAtualizarPrioridadeComArgumentosInvalidos() {
		
		try {
			Tarefa tarefa = sistema.criarTarefa("Fazer atividade de VeV","Exercício 2 sobre TDD","04/03/2024","alta");
			sistema.marcarPrioridade(tarefa.getId(), "");
		}catch(IllegalArgumentException e){
			assertEquals("Entrada inválida", e.getMessage());
		}
	}
	
	//Testes de excluir tarefa
	
	@Test
	void testExcluirTarefaComArgumentosValidos() {
		
		try {
			Tarefa tarefa = sistema.criarTarefa("Fazer atividade de VeV","Exercício 2 sobre TDD","04/03/2024","alta");
			Integer id = tarefa.getId();
			sistema.excluirTarefa(id);
			sistema.getTarefa(id);
			
		}catch(IllegalArgumentException e) {
			assertEquals("ID inválido", e.getMessage());
		}catch(IndexOutOfBoundsException i) {
			assertEquals("ID inexistente", i.getMessage());
		}
	}
	
	@Test
	void testExcluirTarefaComIDInvalido() {
		
		try {
			Tarefa tarefa = sistema.criarTarefa("Fazer atividade de VeV","Exercício 2 sobre TDD","04/03/2024","alta");
			Integer id = tarefa.getId();
			sistema.excluirTarefa(2);
		}catch(IllegalArgumentException e) {
			assertEquals("ID inválido", e.getMessage());
		}
		
	}
	
	
}
