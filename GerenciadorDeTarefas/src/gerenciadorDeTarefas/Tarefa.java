package gerenciadorDeTarefas;

public class Tarefa {
	
    private String titulo;
    private String descricao;
    private String dataVencimento;
    private Prioridade prioridade = Prioridade.NAO_INFORMADO;
    private Integer id;

    public Tarefa(String titulo, String descricao, String dataVencimento) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.dataVencimento = dataVencimento;
    }
    
    public Tarefa(String titulo, String descricao, String dataVencimento, String prioridade) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.dataVencimento = dataVencimento;
        this.prioridade = Prioridade.valueOf(prioridade.toUpperCase());
    }

    // Getters
    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getDataVencimento() {
        return dataVencimento;
    }

    public String getPrioridade() {
        return prioridade.toString();
    }

    // Setters
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setDataVencimento(String dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public void setPrioridade(String prioridade) {
        this.prioridade = Prioridade.valueOf(prioridade);
    }
    
    public Integer getId() {
    	return this.id;
    }
    
    public void setId(Integer id) {
    	this.id = id;
    }
    
    public String toString() {
    	return "Titulo: " + this.titulo + "\nDescricao: " + this.descricao +
    			"\nData: " + this.dataVencimento + "\nPrioridade: " + this.prioridade.toString();
    }
}
