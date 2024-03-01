package gerenciadorDeTarefas;

public enum Prioridade {
    ALTA("ALTA"), MEDIA("MEDIA"), BAIXA("BAIXA"), NAO_INFORMADO("NÃO INFORMADO");

	private final String valor;
	Prioridade(String string) {
		this.valor = string;
	}
	
	public String getValor() {
		return this.valor;
	}

}
