package functionalTests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import gerenciadorDeTarefas.Main;
import gerenciadorDeTarefas.Tarefa;

public class ParticaoDeEquivalenciaTests {

Main sistema;
	
	@BeforeEach
	void criarSistema() {
		this.sistema = new Main();

	}
	
	@Test
	void t26() {
		try {
			sistema.criarTarefa("Fazer atividade 1","Exercício 1","20/03/2024","alta");
			sistema.marcarPrioridade(0, "alta");;
		}catch(IllegalArgumentException e){
			assertEquals("Entrada inválida", e.getMessage());
		}
	}
	
	@Test
	void t27() {
		try {
			sistema.criarTarefa("Fazer atividade 1","Exercício 1","20/03/2024","alta");
			sistema.marcarPrioridade(0, "média");
		}catch(IllegalArgumentException e){
			assertEquals("Entrada inválida", e.getMessage());
		}
	}
	
	@Test
	void t28() {
		try {
			sistema.criarTarefa("Fazer atividade 1","Exercício 1","20/03/2024","alta");
			sistema.marcarPrioridade(0, "baixa");
		}catch(IllegalArgumentException e){
			assertEquals("Entrada inválida", e.getMessage());
		}
	}
	
	@Test
	void t29() {
		try {
			sistema.criarTarefa("Fazer atividade 1","Exercício 1","20/03/2024","alta");
			sistema.marcarPrioridade(0, "não informado");
		}catch(IllegalArgumentException e){
			assertEquals("Entrada inválida", e.getMessage());
		}
	}
	
	@Test
	void t30() {
		try {
			sistema.criarTarefa("Fazer atividade 1","Exercício 1","20/03/2024","alta");
			sistema.marcarPrioridade(0, "mais ou menos");
		}catch(IllegalArgumentException e){
			assertEquals("Entrada inválida", e.getMessage());
		}
	}
	
	@Test
	void t31() {
		try {
			Tarefa tarefa = sistema.criarTarefa("Fazer atividade 1","Exercício 1","18/03/2024","alta");
			assertEquals(tarefa, sistema.getTarefa(0));
		}catch(IllegalArgumentException e){
			assertEquals("Entrada inválida", e.getMessage());
		}
	}
	
	@Test
	void t32() {
		try {
			Tarefa tarefa = sistema.criarTarefa("Fazer atividade 1","Exercício 1","16/03/2024","alta");
			assertEquals(tarefa, sistema.getTarefa(0));
		}catch(IllegalArgumentException e){
			assertEquals("Entrada inválida", e.getMessage());
		}
	}
	
	@Test
	void t33() {
		try {
			sistema.criarTarefa("Fazer atividade 1","Exercício 1","20/03/2024","alta");
			sistema.atualizarData(0, "18/03/2024");
			assertEquals("18/03/2024", sistema.getTarefa(0).getDataVencimento());
		}catch(IllegalArgumentException e){
			assertEquals("Entrada inválida", e.getMessage());
		}
	}
	
	@Test
	void t34() {
		try {
			sistema.criarTarefa("Fazer atividade 1","Exercício 1","20/03/2024","alta");
			sistema.atualizarData(0, "16/03/2024");
			assertEquals("16/03/2024", sistema.getTarefa(0).getDataVencimento());
		}catch(IllegalArgumentException e){
			assertEquals("Entrada inválida", e.getMessage());
		}
	}
	
}
