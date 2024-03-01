package gerenciadorDeTarefas;

import java.util.Map;
import java.util.HashMap;

public class Main {

	Map<Integer,Tarefa> tarefas;
	Integer id;
	public Main() {
		this.tarefas = new HashMap<>();
		this.id = 0;
	}

	public Tarefa criarTarefa(String titulo,String descricao, String data) {
		
		if(titulo.isBlank() || descricao.isBlank() || data.isBlank()) {
			throw new IllegalArgumentException("Entrada inválida");
		}
		
		Tarefa tarefa = new Tarefa(titulo, descricao, data);
		tarefa.setId(this.id);
		this.id++; 
		this.tarefas.put(tarefa.getId(), tarefa);
		return tarefa;
	}
	
	public Tarefa criarTarefa(String titulo,String descricao, String data, String prioridade) {
		
		if(titulo.isBlank() || descricao.isBlank() || data.isBlank()) {
			throw new IllegalArgumentException("Entrada inválida");
		}
		
		Tarefa tarefa = new Tarefa(titulo, descricao, data, prioridade);
		tarefa.setId(this.id);
		this.id++; 
		return tarefa;
	}
	
	public void atualizarTitulo(Integer id, String titulo) {
		if(titulo.isBlank()) {
			throw new IllegalArgumentException("Entrada inválida");
		}
		
		this.tarefas.get(id).setTitulo(titulo);
	}

	public void atualizarDescricao(Integer id, String descricao) {
		if(descricao.isBlank()) {
			throw new IllegalArgumentException("Entrada inválida");
		}
		
		this.tarefas.get(id).setTitulo(descricao);
	}
	
	public void atualizarData(Integer id, String data) {
		if(data.isBlank()) {
			throw new IllegalArgumentException("Entrada inválida");
		}
		
		this.tarefas.get(id).setTitulo(data);
	}
	
	public void marcarPrioridade(Integer id, String prioridade) {
		if(prioridade.isBlank()) {
			throw new IllegalArgumentException("Entrada inválida");
		}
		
		this.tarefas.get(id).setTitulo(prioridade);
	}
	
	public void excluirTarefa(Integer id) {
		if(this.tarefas.size() < id) {
			throw new IllegalArgumentException("ID inválido");
		}
		this.tarefas.remove(id);
		
	}

	public Tarefa getTarefa(Integer id) {
	
		if(!this.tarefas.containsKey(id)) {
			throw new IndexOutOfBoundsException("ID inexistente");
		}
		
		return this.tarefas.get(id);
	}
	public String listarTarefas() {
		
		String saida = "";
		for (Tarefa tarefa: this.tarefas.values()) {
			saida += tarefa.toString();
		}
		
		return saida;
		
	}
	


}
	
