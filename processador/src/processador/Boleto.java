package processador;

public class Boleto {
    private String codigo;
    private String data;
    private double valorPago;

    // Construtor
    public Boleto(String codigo, String  data, double valorPago) {
    	if(data.isBlank() && codigo.isBlank()){
    		throw new IllegalArgumentException("Entrada Inválida.");
    	}
        this.codigo = codigo;
        this.data = data;
        this.valorPago = valorPago;
    }

    // Getters e Setters
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String  getData() {
        return data;
    }

    public void setData(String  data) {
        this.data = data;
    }

    public double getValorPago() {
        return valorPago;
    }

    public void setValorPago(double valorPago) {
        this.valorPago = valorPago;
    }

}