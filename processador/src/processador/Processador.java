package processador;

import java.util.List;

public class Processador {
	
	Fatura fatura;
	
	
    public Processador(Fatura fatura) {
		this.fatura = fatura;
	}

	public void processarBoletos( List<Boleto> boletos) {
        double totalPago = 0;

       
        for (Boleto boleto : boletos) {
            totalPago += boleto.getValorPago();
            Pagamento pagamento = new Pagamento(boleto.getValorPago(), boleto.getData() );
            this.fatura.adicionarPagamento(pagamento);
        }


        if (totalPago >= fatura.getValorTotal()) {
            this.fatura.setEstado("PAGA");
        }
    }
	
	public Fatura getFatura() {
		return fatura;
		
	}

}
