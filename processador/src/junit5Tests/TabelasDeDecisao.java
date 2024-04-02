package junit5Tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import processador.Boleto;
import processador.Fatura;
import processador.Processador;

@DisplayName("Testes usando o método de Tabelas de Decisão: boleto deve ser maior ou igual que fatura e os valores válidos estão entre 0 e 25000 ")
class TabelasDeDecisao {

	@DisplayName("Processar boleto: fatura = 25 e boleto = 200")
	@ProcessarBoletoTest
	public void testT1(){
		Fatura f = new Fatura("07/06/2024", 25, "Arthur Vitor Araújo Lima");
		Processador p = new Processador(f);
		Boleto b = new Boleto("111", "07/06/2024", 200);
		ArrayList<Boleto> boletos = new ArrayList<Boleto>();
		boletos.add(b);
		p.processarBoletos(boletos);
		Fatura fatura = p.getFatura();
	
		assertEquals("PAGA", fatura.getEstado());
		
		}
	
	@DisplayName("Processar boleto: fatura = 200 e boleto = 200")
	@ProcessarBoletoTest
	public void testT2(){
		Fatura f = new Fatura("07/06/2024", 200, "Arthur Vitor Araújo Lima");
		Processador p = new Processador(f);
		Boleto b = new Boleto("111", "07/06/2024", 200);
		ArrayList<Boleto> boletos = new ArrayList<Boleto>();
		boletos.add(b);
		p.processarBoletos(boletos);
		Fatura fatura = p.getFatura();
	
		assertEquals("PAGA", fatura.getEstado());
		
		}
	
	@DisplayName("Processar boleto: fatura = 200 e boleto = 2")
	@ProcessarBoletoTest
	public void testT3(){
		Fatura f = new Fatura("07/06/2024", 200, "Arthur Vitor Araújo Lima");
		Processador p = new Processador(f);
		Boleto b = new Boleto("111", "07/06/2024", 25);
		ArrayList<Boleto> boletos = new ArrayList<Boleto>();
		boletos.add(b);
		p.processarBoletos(boletos);
		Fatura fatura = p.getFatura();
	
		assertEquals("NAO PAGO", fatura.getEstado());
		
		}
}
