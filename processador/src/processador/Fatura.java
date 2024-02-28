package processador;

import java.util.ArrayList;
import java.util.List;

public class Fatura {
    
    private double valorTotal;
    private String nomeCliente;
	private String data;
	private List<Pagamento> pagamentos;
	private String estado;

    // Construtor
    public Fatura(String data, double valorTotal, String nomeCliente) {
    	if(data.isBlank() && nomeCliente.isBlank()){
    		throw new IllegalArgumentException("Entrada Inválida.");
    	}
        this.data = data;
        this.valorTotal = valorTotal;
        this.nomeCliente = nomeCliente;
        this.estado = "NAO PAGO";
        this.pagamentos = new ArrayList<Pagamento>();
    }

    // Getters e Setters
    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }
    
    public void adicionarPagamento(Pagamento pagamento) {
        pagamentos.add(pagamento);
    }

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
    
    

}
