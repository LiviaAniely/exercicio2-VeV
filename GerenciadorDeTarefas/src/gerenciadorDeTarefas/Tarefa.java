package gerenciadorDeTarefas;

public class Tarefa {
	
    private String titulo;
    private String descricao;
    private String dataVencimento;
    private Prioridade prioridade;

    public Tarefa(String titulo, String descricao, String dataVencimento) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.dataVencimento = dataVencimento;
    }
    
    public Tarefa(String titulo, String descricao, String dataVencimento, String prioridade) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.dataVencimento = dataVencimento;
        this.prioridade = Prioridade.valueOf(prioridade);
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
}
