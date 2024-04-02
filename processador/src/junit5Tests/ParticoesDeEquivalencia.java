package junit5Tests;

import static org.junit.jupiter.api.Assertions.*;


import java.util.ArrayList;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import processador.Boleto;
import processador.Fatura;
import processador.Processador;
@DisplayName("Testes usando o método de Partições de Equivalência: boleto deve ser maior ou igual que fatura e os valores válidos estão entre 0 e 25000 ")
class ParticoesDeEquivalencia {

	@DisplayName("Processar boleto: fatura = -25 e boleto = -25")
	@ProcessarBoletoTest
	public void testT1(){

		assertThrows(IllegalArgumentException.class, () -> {
			Fatura f = new Fatura("07/06/2024", -25, "Arthur Vitor Araújo Lima");
        }, "Deveria lançar uma IllegalArgumentException porque valor de fatura < 0");
		
		assertThrows(IllegalArgumentException.class, () -> {
			Boleto b = new Boleto("111", "07/06/2024", -25);
        }, "Deveria lançar uma IllegalArgumentException porque valor de boleto < 0");
		}
	
	@DisplayName("Processar boleto: fatura = 0 e boleto = -25")
	@ProcessarBoletoTest
	public void testT2(){
		Fatura f = new Fatura("07/06/2024", 0, "Arthur Vitor Araújo Lima");
		Processador p = new Processador(f);
		assertEquals(p.getFatura(), f);
		
		assertThrows(IllegalArgumentException.class, () -> {
			Boleto b = new Boleto("111", "07/06/2024", -25);
        }, "Deveria lançar uma IllegalArgumentException porque valor de boleto < 0");
		
		}
	
	@DisplayName("Processar boleto: fatura = 25 e boleto = -25")
	@ProcessarBoletoTest
	public void testT3(){
		Fatura f = new Fatura("07/06/2024", 25, "Arthur Vitor Araújo Lima");
		Processador p = new Processador(f);
		assertEquals(p.getFatura(), f);
		
		assertThrows(IllegalArgumentException.class, () -> {
			Boleto b = new Boleto("111", "07/06/2024", -25);
        }, "Deveria lançar uma IllegalArgumentException porque valor de boleto < 0");
		
		}
	
	@DisplayName("Processar boleto: fatura = -25 e boleto = 0")
	@ProcessarBoletoTest
	public void testT4(){

		Boleto b = new Boleto("111", "07/06/2024", 0);

		assertThrows(IllegalArgumentException.class, () -> {
			Fatura f = new Fatura("07/06/2024", -25, "Arthur Vitor Araújo Lima");
        }, "Deveria lançar uma IllegalArgumentException porque valor de fatura < 0");
		
		}
	
	@DisplayName("Processar boleto: fatura = 0 e boleto = 0")
	@ProcessarBoletoTest
	public void testT5(){
		Fatura f = new Fatura("07/06/2024", 0, "Arthur Vitor Araújo Lima");
		Processador p = new Processador(f);
		Boleto b = new Boleto("111", "07/06/2024", 0);
		ArrayList<Boleto> boletos = new ArrayList<Boleto>();
		boletos.add(b);
		p.processarBoletos(boletos);
		Fatura fatura = p.getFatura();
	
		assertEquals("PAGA", fatura.getEstado());
		
		}
	
	@DisplayName("Processar boleto: fatura = 25 e boleto = 0")
	@ProcessarBoletoTest
	public void testT6(){
		Fatura f = new Fatura("07/06/2024", 25, "Arthur Vitor Araújo Lima");
		Processador p = new Processador(f);
		Boleto b = new Boleto("111", "07/06/2024", 0);
		ArrayList<Boleto> boletos = new ArrayList<Boleto>();
		boletos.add(b);
		p.processarBoletos(boletos);
		Fatura fatura = p.getFatura();
	
		assertEquals("NAO PAGO", fatura.getEstado());
		
		}
	
	@DisplayName("Processar boleto: fatura = -25 e boleto = 25")
	@ProcessarBoletoTest
	public void testT7(){
		
		Boleto b = new Boleto("111", "07/06/2024", 25);

		assertThrows(IllegalArgumentException.class, () -> {
			Fatura f = new Fatura("07/06/2024", -25, "Arthur Vitor Araújo Lima");
        }, "Deveria lançar uma IllegalArgumentException porque valor de fatura < 0");
		
		
		}
	
	@DisplayName("Processar boleto: fatura = 0 e boleto = 25")
	@ProcessarBoletoTest
	public void testT8(){
		Fatura f = new Fatura("07/06/2024", 0, "Arthur Vitor Araújo Lima");
		Processador p = new Processador(f);
		Boleto b = new Boleto("111", "07/06/2024", 25);
		ArrayList<Boleto> boletos = new ArrayList<Boleto>();
		boletos.add(b);
		p.processarBoletos(boletos);
		Fatura fatura = p.getFatura();
	
		assertEquals("PAGA", fatura.getEstado());
		
		}
	
	@DisplayName("Processar boleto: fatura = 25 e boleto = 25")
	@ProcessarBoletoTest
	public void testT9(){
		Fatura f = new Fatura("07/06/2024", 25, "Arthur Vitor Araújo Lima");
		Processador p = new Processador(f);
		Boleto b = new Boleto("111", "07/06/2024", 25);
		ArrayList<Boleto> boletos = new ArrayList<Boleto>();
		boletos.add(b);
		p.processarBoletos(boletos);
		Fatura fatura = p.getFatura();
	
		assertEquals("PAGA", fatura.getEstado());
		
		}

}
