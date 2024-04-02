package junit5Tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import processador.Boleto;
import processador.Fatura;
import processador.Processador;

@DisplayName("Testes de Criar Fatura")
class ProcessadorTest {

	@DisplayName("Processa boletos")
	@ProcessarBoletoTest
	public void testProcessarBoletosCasoIdeal(){
		Fatura f = new Fatura("07/06/2024", 14500, "Arthur Vitor Araújo Lima");
		Processador p = new Processador(f);
		Boleto b1 = new Boleto("111", "07/06/2024", 6000);
		Boleto b2 = new Boleto("121", "08/06/2024", 8500);
		ArrayList<Boleto> boletos = new ArrayList<Boleto>();
		boletos.add(b1);
		boletos.add(b2);
		p.processarBoletos(boletos);
		Fatura fatura = p.getFatura();
		
		assertEquals("PAGA", fatura.getEstado());
		
		}
	@DisplayName("Processa boletos com caso atrasado")
	@ProcessarBoletoTest
	public void testProcessarBoletosCasoAtrasado(){
		Fatura f = new Fatura("07/06/2024", 20000, "Arthur Vitor Araújo Lima");
		Processador p = new Processador(f);
		Boleto b1 = new Boleto("111", "07/06/2024", 6000);
		Boleto b2 = new Boleto("121", "08/06/2024", 8500);
		ArrayList<Boleto> boletos = new ArrayList<Boleto>();
		boletos.add(b1);
		boletos.add(b2);
		p.processarBoletos(boletos);
		Fatura fatura = p.getFatura();
		
		assertEquals("NAO PAGO", fatura.getEstado());
		
		}

}
