package functionalTests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import gerenciadorDeTarefas.Main;
import gerenciadorDeTarefas.Tarefa;

public class AVLTests {

	Main sistema;
	
	@BeforeEach
	void criarSistema() {
		this.sistema = new Main();
	}
	
	@Test
	void t1() {
		
		try {
			Tarefa tarefa1 = sistema.criarTarefa("Fazer atividade 1","Exercício 1","20/03/2024","alta");
			Tarefa tarefa2 = sistema.criarTarefa("Fazer atividade 2","Exercício 2","21/03/2024","alta");
			Tarefa tarefa3 = sistema.criarTarefa("Fazer atividade 3","Exercício 3","22/03/2024","alta");
			Tarefa tarefa4 = sistema.criarTarefa("Fazer atividade 4","Exercício 4","23/03/2024","alta");
			Tarefa tarefa5 = sistema.criarTarefa("Fazer atividade 5","Exercício 5","24/03/2024","alta");
			Tarefa tarefa6 = sistema.criarTarefa("Fazer atividade 6","Exercício 6","25/03/2024","alta");
			
			sistema.atualizarTitulo(-1, "Realizar atv");
			assertEquals("Realizar atv", sistema.getTarefa(-1).getTitulo());
		}catch(IllegalArgumentException e){
			assertEquals("Entrada inválida", e.getMessage());
		}
	}
	
	@Test
	void t2() {
		
		try {
			Tarefa tarefa1 = sistema.criarTarefa("Fazer atividade 1","Exercício 1","20/03/2024","alta");
			Tarefa tarefa2 = sistema.criarTarefa("Fazer atividade 2","Exercício 2","21/03/2024","alta");
			Tarefa tarefa3 = sistema.criarTarefa("Fazer atividade 3","Exercício 3","22/03/2024","alta");
			Tarefa tarefa4 = sistema.criarTarefa("Fazer atividade 4","Exercício 4","23/03/2024","alta");
			Tarefa tarefa5 = sistema.criarTarefa("Fazer atividade 5","Exercício 5","24/03/2024","alta");
			Tarefa tarefa6 = sistema.criarTarefa("Fazer atividade 6","Exercício 6","25/03/2024","alta");
			
			sistema.atualizarTitulo(0, "Realizar atv");
			assertEquals("Realizar atv", sistema.getTarefa(0).getTitulo());
		}catch(IllegalArgumentException e){
			assertEquals("Entrada inválida", e.getMessage());
		}
	}
	
	@Test
	void t3() {
		
		try {
			Tarefa tarefa1 = sistema.criarTarefa("Fazer atividade 1","Exercício 1","20/03/2024","alta");
			Tarefa tarefa2 = sistema.criarTarefa("Fazer atividade 2","Exercício 2","21/03/2024","alta");
			Tarefa tarefa3 = sistema.criarTarefa("Fazer atividade 3","Exercício 3","22/03/2024","alta");
			Tarefa tarefa4 = sistema.criarTarefa("Fazer atividade 4","Exercício 4","23/03/2024","alta");
			Tarefa tarefa5 = sistema.criarTarefa("Fazer atividade 5","Exercício 5","24/03/2024","alta");
			Tarefa tarefa6 = sistema.criarTarefa("Fazer atividade 6","Exercício 6","25/03/2024","alta");
			
			sistema.atualizarTitulo(3, "Realizar atv");
			assertEquals("Realizar atv", sistema.getTarefa(3).getTitulo());
		}catch(IllegalArgumentException e){
			assertEquals("Entrada inválida", e.getMessage());
		}
	}
	
	@Test
	void t4() {
		
		try {
			Tarefa tarefa1 = sistema.criarTarefa("Fazer atividade 1","Exercício 1","20/03/2024","alta");
			Tarefa tarefa2 = sistema.criarTarefa("Fazer atividade 2","Exercício 2","21/03/2024","alta");
			Tarefa tarefa3 = sistema.criarTarefa("Fazer atividade 3","Exercício 3","22/03/2024","alta");
			Tarefa tarefa4 = sistema.criarTarefa("Fazer atividade 4","Exercício 4","23/03/2024","alta");
			Tarefa tarefa5 = sistema.criarTarefa("Fazer atividade 5","Exercício 5","24/03/2024","alta");
			Tarefa tarefa6 = sistema.criarTarefa("Fazer atividade 6","Exercício 6","25/03/2024","alta");
			
			sistema.atualizarTitulo(5, "Realizar atv");
			assertEquals("Realizar atv", sistema.getTarefa(5).getTitulo());
		}catch(IllegalArgumentException e){
			assertEquals("Entrada inválida", e.getMessage());
		}
	}
	
	@Test
	void t5() {
		
		try {
			Tarefa tarefa1 = sistema.criarTarefa("Fazer atividade 1","Exercício 1","20/03/2024","alta");
			Tarefa tarefa2 = sistema.criarTarefa("Fazer atividade 2","Exercício 2","21/03/2024","alta");
			Tarefa tarefa3 = sistema.criarTarefa("Fazer atividade 3","Exercício 3","22/03/2024","alta");
			Tarefa tarefa4 = sistema.criarTarefa("Fazer atividade 4","Exercício 4","23/03/2024","alta");
			Tarefa tarefa5 = sistema.criarTarefa("Fazer atividade 5","Exercício 5","24/03/2024","alta");
			Tarefa tarefa6 = sistema.criarTarefa("Fazer atividade 6","Exercício 6","25/03/2024","alta");
			
			sistema.atualizarTitulo(6, "Realizar atv");
			assertEquals("Realizar atv", sistema.getTarefa(6).getTitulo());
		}catch(IllegalArgumentException e){
			assertEquals("Entrada inválida", e.getMessage());
		}
	}
	
	@Test
	void t6() {
		
		try {
			Tarefa tarefa1 = sistema.criarTarefa("Fazer atividade 1","Exercício 1","20/03/2024","alta");
			Tarefa tarefa2 = sistema.criarTarefa("Fazer atividade 2","Exercício 2","21/03/2024","alta");
			Tarefa tarefa3 = sistema.criarTarefa("Fazer atividade 3","Exercício 3","22/03/2024","alta");
			Tarefa tarefa4 = sistema.criarTarefa("Fazer atividade 4","Exercício 4","23/03/2024","alta");
			Tarefa tarefa5 = sistema.criarTarefa("Fazer atividade 5","Exercício 5","24/03/2024","alta");
			Tarefa tarefa6 = sistema.criarTarefa("Fazer atividade 6","Exercício 6","25/03/2024","alta");
			
			sistema.atualizarDescricao(-1, "Exercicio");
			assertEquals("Exercicio", sistema.getTarefa(-1).getDescricao());
		}catch(IllegalArgumentException e){
			assertEquals("Entrada inválida", e.getMessage());
		}
	}
	
	@Test
	void t7() {
		
		try {
			Tarefa tarefa1 = sistema.criarTarefa("Fazer atividade 1","Exercício 1","20/03/2024","alta");
			Tarefa tarefa2 = sistema.criarTarefa("Fazer atividade 2","Exercício 2","21/03/2024","alta");
			Tarefa tarefa3 = sistema.criarTarefa("Fazer atividade 3","Exercício 3","22/03/2024","alta");
			Tarefa tarefa4 = sistema.criarTarefa("Fazer atividade 4","Exercício 4","23/03/2024","alta");
			Tarefa tarefa5 = sistema.criarTarefa("Fazer atividade 5","Exercício 5","24/03/2024","alta");
			Tarefa tarefa6 = sistema.criarTarefa("Fazer atividade 6","Exercício 6","25/03/2024","alta");
			
			sistema.atualizarDescricao(0, "Exercicio");
			assertEquals("Exercicio", sistema.getTarefa(0).getDescricao());
		}catch(IllegalArgumentException e){
			assertEquals("Entrada inválida", e.getMessage());
		}
	}
	
	@Test
	void t8() {
		
		try {
			Tarefa tarefa1 = sistema.criarTarefa("Fazer atividade 1","Exercício 1","20/03/2024","alta");
			Tarefa tarefa2 = sistema.criarTarefa("Fazer atividade 2","Exercício 2","21/03/2024","alta");
			Tarefa tarefa3 = sistema.criarTarefa("Fazer atividade 3","Exercício 3","22/03/2024","alta");
			Tarefa tarefa4 = sistema.criarTarefa("Fazer atividade 4","Exercício 4","23/03/2024","alta");
			Tarefa tarefa5 = sistema.criarTarefa("Fazer atividade 5","Exercício 5","24/03/2024","alta");
			Tarefa tarefa6 = sistema.criarTarefa("Fazer atividade 6","Exercício 6","25/03/2024","alta");
			
			sistema.atualizarDescricao(3, "Exercicio");
			assertEquals("Exercicio", sistema.getTarefa(3).getDescricao());
		}catch(IllegalArgumentException e){
			assertEquals("Entrada inválida", e.getMessage());
		}
	}
	
	@Test
	void t9() {
		
		try {
			Tarefa tarefa1 = sistema.criarTarefa("Fazer atividade 1","Exercício 1","20/03/2024","alta");
			Tarefa tarefa2 = sistema.criarTarefa("Fazer atividade 2","Exercício 2","21/03/2024","alta");
			Tarefa tarefa3 = sistema.criarTarefa("Fazer atividade 3","Exercício 3","22/03/2024","alta");
			Tarefa tarefa4 = sistema.criarTarefa("Fazer atividade 4","Exercício 4","23/03/2024","alta");
			Tarefa tarefa5 = sistema.criarTarefa("Fazer atividade 5","Exercício 5","24/03/2024","alta");
			Tarefa tarefa6 = sistema.criarTarefa("Fazer atividade 6","Exercício 6","25/03/2024","alta");
			
			sistema.atualizarDescricao(5, "Exercicio");
			assertEquals("Exercicio", sistema.getTarefa(5).getDescricao());
		}catch(IllegalArgumentException e){
			assertEquals("Entrada inválida", e.getMessage());
		}
	}
	
	@Test
	void t10() {
		
		try {
			Tarefa tarefa1 = sistema.criarTarefa("Fazer atividade 1","Exercício 1","20/03/2024","alta");
			Tarefa tarefa2 = sistema.criarTarefa("Fazer atividade 2","Exercício 2","21/03/2024","alta");
			Tarefa tarefa3 = sistema.criarTarefa("Fazer atividade 3","Exercício 3","22/03/2024","alta");
			Tarefa tarefa4 = sistema.criarTarefa("Fazer atividade 4","Exercício 4","23/03/2024","alta");
			Tarefa tarefa5 = sistema.criarTarefa("Fazer atividade 5","Exercício 5","24/03/2024","alta");
			Tarefa tarefa6 = sistema.criarTarefa("Fazer atividade 6","Exercício 6","25/03/2024","alta");
			
			sistema.atualizarDescricao(6, "Exercicio");
			assertEquals("Exercicio", sistema.getTarefa(6).getDescricao());
		}catch(IllegalArgumentException e){
			assertEquals("Entrada inválida", e.getMessage());
		}
	}
	
	@Test
	void t11() {
		
		try {
			Tarefa tarefa1 = sistema.criarTarefa("Fazer atividade 1","Exercício 1","20/03/2024","alta");
			Tarefa tarefa2 = sistema.criarTarefa("Fazer atividade 2","Exercício 2","21/03/2024","alta");
			Tarefa tarefa3 = sistema.criarTarefa("Fazer atividade 3","Exercício 3","22/03/2024","alta");
			Tarefa tarefa4 = sistema.criarTarefa("Fazer atividade 4","Exercício 4","23/03/2024","alta");
			Tarefa tarefa5 = sistema.criarTarefa("Fazer atividade 5","Exercício 5","24/03/2024","alta");
			Tarefa tarefa6 = sistema.criarTarefa("Fazer atividade 6","Exercício 6","25/03/2024","alta");
			
			sistema.atualizarData(-1, "27/03/2024");
			assertEquals("27/03/2024", sistema.getTarefa(-1).getDataVencimento());
		}catch(IllegalArgumentException e){
			assertEquals("Entrada inválida", e.getMessage());
		}
	}
	
	@Test
	void t12() {
		
		try {
			Tarefa tarefa1 = sistema.criarTarefa("Fazer atividade 1","Exercício 1","20/03/2024","alta");
			Tarefa tarefa2 = sistema.criarTarefa("Fazer atividade 2","Exercício 2","21/03/2024","alta");
			Tarefa tarefa3 = sistema.criarTarefa("Fazer atividade 3","Exercício 3","22/03/2024","alta");
			Tarefa tarefa4 = sistema.criarTarefa("Fazer atividade 4","Exercício 4","23/03/2024","alta");
			Tarefa tarefa5 = sistema.criarTarefa("Fazer atividade 5","Exercício 5","24/03/2024","alta");
			Tarefa tarefa6 = sistema.criarTarefa("Fazer atividade 6","Exercício 6","25/03/2024","alta");
			
			sistema.atualizarData(0, "27/03/2024");
			assertEquals("27/03/2024", sistema.getTarefa(0).getDataVencimento());
		}catch(IllegalArgumentException e){
			assertEquals("Entrada inválida", e.getMessage());
		}
	}
	
	@Test
	void t13() {
		
		try {
			Tarefa tarefa1 = sistema.criarTarefa("Fazer atividade 1","Exercício 1","20/03/2024","alta");
			Tarefa tarefa2 = sistema.criarTarefa("Fazer atividade 2","Exercício 2","21/03/2024","alta");
			Tarefa tarefa3 = sistema.criarTarefa("Fazer atividade 3","Exercício 3","22/03/2024","alta");
			Tarefa tarefa4 = sistema.criarTarefa("Fazer atividade 4","Exercício 4","23/03/2024","alta");
			Tarefa tarefa5 = sistema.criarTarefa("Fazer atividade 5","Exercício 5","24/03/2024","alta");
			Tarefa tarefa6 = sistema.criarTarefa("Fazer atividade 6","Exercício 6","25/03/2024","alta");
			
			sistema.atualizarData(3, "27/03/2024");
			assertEquals("27/03/2024", sistema.getTarefa(3).getDataVencimento());
		}catch(IllegalArgumentException e){
			assertEquals("Entrada inválida", e.getMessage());
		}
	}
	
	@Test
	void t14() {
		
		try {
			Tarefa tarefa1 = sistema.criarTarefa("Fazer atividade 1","Exercício 1","20/03/2024","alta");
			Tarefa tarefa2 = sistema.criarTarefa("Fazer atividade 2","Exercício 2","21/03/2024","alta");
			Tarefa tarefa3 = sistema.criarTarefa("Fazer atividade 3","Exercício 3","22/03/2024","alta");
			Tarefa tarefa4 = sistema.criarTarefa("Fazer atividade 4","Exercício 4","23/03/2024","alta");
			Tarefa tarefa5 = sistema.criarTarefa("Fazer atividade 5","Exercício 5","24/03/2024","alta");
			Tarefa tarefa6 = sistema.criarTarefa("Fazer atividade 6","Exercício 6","25/03/2024","alta");
			
			sistema.atualizarData(5, "27/03/2024");
			assertEquals("27/03/2024", sistema.getTarefa(5).getDataVencimento());
		}catch(IllegalArgumentException e){
			assertEquals("Entrada inválida", e.getMessage());
		}
	}
	
	@Test
	void t15() {
		
		try {
			Tarefa tarefa1 = sistema.criarTarefa("Fazer atividade 1","Exercício 1","20/03/2024","alta");
			Tarefa tarefa2 = sistema.criarTarefa("Fazer atividade 2","Exercício 2","21/03/2024","alta");
			Tarefa tarefa3 = sistema.criarTarefa("Fazer atividade 3","Exercício 3","22/03/2024","alta");
			Tarefa tarefa4 = sistema.criarTarefa("Fazer atividade 4","Exercício 4","23/03/2024","alta");
			Tarefa tarefa5 = sistema.criarTarefa("Fazer atividade 5","Exercício 5","24/03/2024","alta");
			Tarefa tarefa6 = sistema.criarTarefa("Fazer atividade 6","Exercício 6","25/03/2024","alta");
			
			sistema.atualizarData(6, "27/03/2024");
			assertEquals("27/03/2024", sistema.getTarefa(6).getDataVencimento());
		}catch(IllegalArgumentException e){
			assertEquals("Entrada inválida", e.getMessage());
		}
	}
	@Test
	void t16() {
		
		try {
			Tarefa tarefa1 = sistema.criarTarefa("Fazer atividade 1","Exercício 1","20/03/2024","alta");
			Tarefa tarefa2 = sistema.criarTarefa("Fazer atividade 2","Exercício 2","21/03/2024","alta");
			Tarefa tarefa3 = sistema.criarTarefa("Fazer atividade 3","Exercício 3","22/03/2024","alta");
			Tarefa tarefa4 = sistema.criarTarefa("Fazer atividade 4","Exercício 4","23/03/2024","alta");
			Tarefa tarefa5 = sistema.criarTarefa("Fazer atividade 5","Exercício 5","24/03/2024","alta");
			Tarefa tarefa6 = sistema.criarTarefa("Fazer atividade 6","Exercício 6","25/03/2024","alta");
			
			sistema.marcarPrioridade(-1, "baixa");
			assertEquals("baixa", sistema.getTarefa(-1).getDescricao());
		}catch(IllegalArgumentException e){
			assertEquals("Entrada inválida", e.getMessage());
		}
	}
	
	@Test
	void t17() {
		
		try {
			Tarefa tarefa1 = sistema.criarTarefa("Fazer atividade 1","Exercício 1","20/03/2024","alta");
			Tarefa tarefa2 = sistema.criarTarefa("Fazer atividade 2","Exercício 2","21/03/2024","alta");
			Tarefa tarefa3 = sistema.criarTarefa("Fazer atividade 3","Exercício 3","22/03/2024","alta");
			Tarefa tarefa4 = sistema.criarTarefa("Fazer atividade 4","Exercício 4","23/03/2024","alta");
			Tarefa tarefa5 = sistema.criarTarefa("Fazer atividade 5","Exercício 5","24/03/2024","alta");
			Tarefa tarefa6 = sistema.criarTarefa("Fazer atividade 6","Exercício 6","25/03/2024","alta");
			
			sistema.marcarPrioridade(0, "baixa");
			assertEquals("baixa", sistema.getTarefa(0).getDescricao());
		}catch(IllegalArgumentException e){
			assertEquals("Entrada inválida", e.getMessage());
		}
	}
	
	@Test
	void t18() {
		
		try {
			Tarefa tarefa1 = sistema.criarTarefa("Fazer atividade 1","Exercício 1","20/03/2024","alta");
			Tarefa tarefa2 = sistema.criarTarefa("Fazer atividade 2","Exercício 2","21/03/2024","alta");
			Tarefa tarefa3 = sistema.criarTarefa("Fazer atividade 3","Exercício 3","22/03/2024","alta");
			Tarefa tarefa4 = sistema.criarTarefa("Fazer atividade 4","Exercício 4","23/03/2024","alta");
			Tarefa tarefa5 = sistema.criarTarefa("Fazer atividade 5","Exercício 5","24/03/2024","alta");
			Tarefa tarefa6 = sistema.criarTarefa("Fazer atividade 6","Exercício 6","25/03/2024","alta");
			
			sistema.marcarPrioridade(3, "baixa");
			assertEquals("baixa", sistema.getTarefa(3).getDescricao());
		}catch(IllegalArgumentException e){
			assertEquals("Entrada inválida", e.getMessage());
		}
	}
	
	@Test
	void t19() {
		
		try {
			Tarefa tarefa1 = sistema.criarTarefa("Fazer atividade 1","Exercício 1","20/03/2024","alta");
			Tarefa tarefa2 = sistema.criarTarefa("Fazer atividade 2","Exercício 2","21/03/2024","alta");
			Tarefa tarefa3 = sistema.criarTarefa("Fazer atividade 3","Exercício 3","22/03/2024","alta");
			Tarefa tarefa4 = sistema.criarTarefa("Fazer atividade 4","Exercício 4","23/03/2024","alta");
			Tarefa tarefa5 = sistema.criarTarefa("Fazer atividade 5","Exercício 5","24/03/2024","alta");
			Tarefa tarefa6 = sistema.criarTarefa("Fazer atividade 6","Exercício 6","25/03/2024","alta");
			
			sistema.marcarPrioridade(5, "baixa");
			assertEquals("baixa", sistema.getTarefa(5).getDescricao());
		}catch(IllegalArgumentException e){
			assertEquals("Entrada inválida", e.getMessage());
		}
	}
	
	@Test
	void t20() {
		
		try {
			Tarefa tarefa1 = sistema.criarTarefa("Fazer atividade 1","Exercício 1","20/03/2024","alta");
			Tarefa tarefa2 = sistema.criarTarefa("Fazer atividade 2","Exercício 2","21/03/2024","alta");
			Tarefa tarefa3 = sistema.criarTarefa("Fazer atividade 3","Exercício 3","22/03/2024","alta");
			Tarefa tarefa4 = sistema.criarTarefa("Fazer atividade 4","Exercício 4","23/03/2024","alta");
			Tarefa tarefa5 = sistema.criarTarefa("Fazer atividade 5","Exercício 5","24/03/2024","alta");
			Tarefa tarefa6 = sistema.criarTarefa("Fazer atividade 6","Exercício 6","25/03/2024","alta");
			
			sistema.marcarPrioridade(6, "baixa");
			assertEquals("baixa", sistema.getTarefa(6).getDescricao());
		}catch(IllegalArgumentException e){
			assertEquals("Entrada inválida", e.getMessage());
		}
	}
	
	@Test
	void t21() {
		
		try {
			Tarefa tarefa1 = sistema.criarTarefa("Fazer atividade 1","Exercício 1","20/03/2024","alta");
			Tarefa tarefa2 = sistema.criarTarefa("Fazer atividade 2","Exercício 2","21/03/2024","alta");
			Tarefa tarefa3 = sistema.criarTarefa("Fazer atividade 3","Exercício 3","22/03/2024","alta");
			Tarefa tarefa4 = sistema.criarTarefa("Fazer atividade 4","Exercício 4","23/03/2024","alta");
			Tarefa tarefa5 = sistema.criarTarefa("Fazer atividade 5","Exercício 5","24/03/2024","alta");
			Tarefa tarefa6 = sistema.criarTarefa("Fazer atividade 6","Exercício 6","25/03/2024","alta");
			
			sistema.excluirTarefa(-1);
			sistema.getTarefa(-1);
		}catch(IllegalArgumentException e){
			assertEquals("Entrada inválida", e.getMessage());
		}catch(IndexOutOfBoundsException i) {
			assertEquals("ID inexistente", i.getMessage());
		}
	}
	
	@Test
	void t22() {
		
		try {
			Tarefa tarefa1 = sistema.criarTarefa("Fazer atividade 1","Exercício 1","20/03/2024","alta");
			Tarefa tarefa2 = sistema.criarTarefa("Fazer atividade 2","Exercício 2","21/03/2024","alta");
			Tarefa tarefa3 = sistema.criarTarefa("Fazer atividade 3","Exercício 3","22/03/2024","alta");
			Tarefa tarefa4 = sistema.criarTarefa("Fazer atividade 4","Exercício 4","23/03/2024","alta");
			Tarefa tarefa5 = sistema.criarTarefa("Fazer atividade 5","Exercício 5","24/03/2024","alta");
			Tarefa tarefa6 = sistema.criarTarefa("Fazer atividade 6","Exercício 6","25/03/2024","alta");
			
			sistema.excluirTarefa(0);
			sistema.getTarefa(0);
		}catch(IllegalArgumentException e){
			assertEquals("Entrada inválida", e.getMessage());
		}catch(IndexOutOfBoundsException i) {
			assertEquals("ID inexistente", i.getMessage());
		}
	}
	
	@Test
	void t23() {
		
		try {
			Tarefa tarefa1 = sistema.criarTarefa("Fazer atividade 1","Exercício 1","20/03/2024","alta");
			Tarefa tarefa2 = sistema.criarTarefa("Fazer atividade 2","Exercício 2","21/03/2024","alta");
			Tarefa tarefa3 = sistema.criarTarefa("Fazer atividade 3","Exercício 3","22/03/2024","alta");
			Tarefa tarefa4 = sistema.criarTarefa("Fazer atividade 4","Exercício 4","23/03/2024","alta");
			Tarefa tarefa5 = sistema.criarTarefa("Fazer atividade 5","Exercício 5","24/03/2024","alta");
			Tarefa tarefa6 = sistema.criarTarefa("Fazer atividade 6","Exercício 6","25/03/2024","alta");
			
			sistema.excluirTarefa(3);
			sistema.getTarefa(3);
		}catch(IllegalArgumentException e){
			assertEquals("Entrada inválida", e.getMessage());
		}catch(IndexOutOfBoundsException i) {
			assertEquals("ID inexistente", i.getMessage());
		}
	}
	
	@Test
	void t24() {
		
		try {
			Tarefa tarefa1 = sistema.criarTarefa("Fazer atividade 1","Exercício 1","20/03/2024","alta");
			Tarefa tarefa2 = sistema.criarTarefa("Fazer atividade 2","Exercício 2","21/03/2024","alta");
			Tarefa tarefa3 = sistema.criarTarefa("Fazer atividade 3","Exercício 3","22/03/2024","alta");
			Tarefa tarefa4 = sistema.criarTarefa("Fazer atividade 4","Exercício 4","23/03/2024","alta");
			Tarefa tarefa5 = sistema.criarTarefa("Fazer atividade 5","Exercício 5","24/03/2024","alta");
			Tarefa tarefa6 = sistema.criarTarefa("Fazer atividade 6","Exercício 6","25/03/2024","alta");
			
			sistema.excluirTarefa(5);
			sistema.getTarefa(5);
		}catch(IllegalArgumentException e){
			assertEquals("Entrada inválida", e.getMessage());
		}catch(IndexOutOfBoundsException i) {
			assertEquals("ID inexistente", i.getMessage());
		}
	}
	
	@Test
	void t25() {
		
		try {
			Tarefa tarefa1 = sistema.criarTarefa("Fazer atividade 1","Exercício 1","20/03/2024","alta");
			Tarefa tarefa2 = sistema.criarTarefa("Fazer atividade 2","Exercício 2","21/03/2024","alta");
			Tarefa tarefa3 = sistema.criarTarefa("Fazer atividade 3","Exercício 3","22/03/2024","alta");
			Tarefa tarefa4 = sistema.criarTarefa("Fazer atividade 4","Exercício 4","23/03/2024","alta");
			Tarefa tarefa5 = sistema.criarTarefa("Fazer atividade 5","Exercício 5","24/03/2024","alta");
			Tarefa tarefa6 = sistema.criarTarefa("Fazer atividade 6","Exercício 6","25/03/2024","alta");
			
			sistema.excluirTarefa(6);
			sistema.getTarefa(6);
		}catch(IllegalArgumentException e){
			assertEquals("Entrada inválida", e.getMessage());
		}catch(IndexOutOfBoundsException i) {
			assertEquals("ID inexistente", i.getMessage());
		}
	}
	
	
}

