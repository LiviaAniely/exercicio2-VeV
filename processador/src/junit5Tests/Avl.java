package junit5Tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import processador.Boleto;
import processador.Fatura;
import processador.Processador;

@DisplayName("Testes usando o método de Análise de Valores de Limite: boleto deve ser maior ou igual que fatura e os valores válidos estão entre 0 e 25000 ")
class Avl {

	@DisplayName("Processar boleto: fatura = 0 e boleto = 0")
	@ProcessarBoletoTest
	public void testT1(){
		Fatura f = new Fatura("07/06/2024", 0, "Arthur Vitor Araújo Lima");
		Processador p = new Processador(f);
		Boleto b = new Boleto("111", "07/06/2024", 0);
		ArrayList<Boleto> boletos = new ArrayList<Boleto>();
		boletos.add(b);
		p.processarBoletos(boletos);
		Fatura fatura = p.getFatura();
	
		assertEquals("PAGA", fatura.getEstado());
		
		}
	
	@DisplayName("Processar boleto: fatura = 0.01 e boleto = 0")
	@ProcessarBoletoTest
	public void testT2(){
		Fatura f = new Fatura("07/06/2024", 0.01, "Arthur Vitor Araújo Lima");
		Processador p = new Processador(f);
		Boleto b = new Boleto("111", "07/06/2024", 0);
		ArrayList<Boleto> boletos = new ArrayList<Boleto>();
		boletos.add(b);
		p.processarBoletos(boletos);
		Fatura fatura = p.getFatura();
		
		assertEquals("NAO PAGO", fatura.getEstado());
		
		}
	
	@DisplayName("Processar boleto: fatura = 0.01 e boleto = 0.01")
	@ProcessarBoletoTest
	public void testT3(){
		Fatura f = new Fatura("07/06/2024", 0.01, "Arthur Vitor Araújo Lima");
		Processador p = new Processador(f);
		Boleto b = new Boleto("111", "07/06/2024", 0.01);
		ArrayList<Boleto> boletos = new ArrayList<Boleto>();
		boletos.add(b);
		p.processarBoletos(boletos);
		Fatura fatura = p.getFatura();
		
		assertEquals("PAGA", fatura.getEstado());
		
		}
	
	@DisplayName("Processar boleto: fatura = 0 e boleto = 0.01")
	@ProcessarBoletoTest
	public void testT4(){
		Fatura f = new Fatura("07/06/2024", 0, "Arthur Vitor Araújo Lima");
		Processador p = new Processador(f);
		Boleto b = new Boleto("111", "07/06/2024", 0.01);
		ArrayList<Boleto> boletos = new ArrayList<Boleto>();
		boletos.add(b);
		p.processarBoletos(boletos);
		Fatura fatura = p.getFatura();
		
		assertEquals("PAGA", fatura.getEstado());
		
		}
	
	@DisplayName("Processar boleto: fatura = 0 e boleto = 25000")
	@ProcessarBoletoTest
	public void testT5(){
		Fatura f = new Fatura("07/06/2024", 0, "Arthur Vitor Araújo Lima");
		Processador p = new Processador(f);
		Boleto b = new Boleto("111", "07/06/2024", 25000);
		ArrayList<Boleto> boletos = new ArrayList<Boleto>();
		boletos.add(b);
		p.processarBoletos(boletos);
		Fatura fatura = p.getFatura();
		
		assertEquals("PAGA", fatura.getEstado());
		
		}
	
	@DisplayName("Processar boleto: fatura = 0 e boleto = 24999.99")
	@ProcessarBoletoTest
	public void testT6(){
		Fatura f = new Fatura("07/06/2024", 0, "Arthur Vitor Araújo Lima");
		Processador p = new Processador(f);
		Boleto b = new Boleto("111", "07/06/2024", 24999.99);
		ArrayList<Boleto> boletos = new ArrayList<Boleto>();
		boletos.add(b);
		p.processarBoletos(boletos);
		Fatura fatura = p.getFatura();
		
		assertEquals("PAGA", fatura.getEstado());
		
		}
	
	@DisplayName("Processar boleto: fatura = 0.01 e boleto = 25000")
	@ProcessarBoletoTest
	public void testT7(){
		Fatura f = new Fatura("07/06/2024", 0.01, "Arthur Vitor Araújo Lima");
		Processador p = new Processador(f);
		Boleto b = new Boleto("111", "07/06/2024", 25000);
		ArrayList<Boleto> boletos = new ArrayList<Boleto>();
		boletos.add(b);
		p.processarBoletos(boletos);
		Fatura fatura = p.getFatura();
		
		assertEquals("PAGA", fatura.getEstado());
		
		}
	
	@DisplayName("Processar boleto: fatura = 0 e boleto = 24999.99")
	@ProcessarBoletoTest
	public void testT8(){
		Fatura f = new Fatura("07/06/2024", 0, "Arthur Vitor Araújo Lima");
		Processador p = new Processador(f);
		Boleto b = new Boleto("111", "07/06/2024", 24999.99);
		ArrayList<Boleto> boletos = new ArrayList<Boleto>();
		boletos.add(b);
		p.processarBoletos(boletos);
		Fatura fatura = p.getFatura();
		
		assertEquals("PAGA", fatura.getEstado());
		
		}
	
	@DisplayName("Processar boleto: fatura = 25000 e boleto = 0")
	@ProcessarBoletoTest
	public void testT9(){
		Fatura f = new Fatura("07/06/2024", 25000, "Arthur Vitor Araújo Lima");
		Processador p = new Processador(f);
		Boleto b = new Boleto("111", "07/06/2024", 0);
		ArrayList<Boleto> boletos = new ArrayList<Boleto>();
		boletos.add(b);
		p.processarBoletos(boletos);
		Fatura fatura = p.getFatura();
		
		assertEquals("NAO PAGO", fatura.getEstado());
		
		}
	
	@DisplayName("Processar boleto: fatura = 25000 e boleto = 0.01")
	@ProcessarBoletoTest
	public void testT10(){
		Fatura f = new Fatura("07/06/2024", 25000, "Arthur Vitor Araújo Lima");
		Processador p = new Processador(f);
		Boleto b = new Boleto("111", "07/06/2024", 0.01);
		ArrayList<Boleto> boletos = new ArrayList<Boleto>();
		boletos.add(b);
		p.processarBoletos(boletos);
		Fatura fatura = p.getFatura();
		
		assertEquals("NAO PAGO", fatura.getEstado());
		
		}
	
	@DisplayName("Processar boleto: fatura = 24999.99 e boleto = 0")
	@ProcessarBoletoTest
	public void testT11(){
		Fatura f = new Fatura("07/06/2024", 24999.99, "Arthur Vitor Araújo Lima");
		Processador p = new Processador(f);
		Boleto b = new Boleto("111", "07/06/2024", 0);
		ArrayList<Boleto> boletos = new ArrayList<Boleto>();
		boletos.add(b);
		p.processarBoletos(boletos);
		Fatura fatura = p.getFatura();
		
		assertEquals("NAO PAGO", fatura.getEstado());
		
		}
	
	@DisplayName("Processar boleto: fatura = 24999.99 e boleto = 0.01")
	@ProcessarBoletoTest
	public void testT12(){
		Fatura f = new Fatura("07/06/2024", 24999.99, "Arthur Vitor Araújo Lima");
		Processador p = new Processador(f);
		Boleto b = new Boleto("111", "07/06/2024", 0.01);
		ArrayList<Boleto> boletos = new ArrayList<Boleto>();
		boletos.add(b);
		p.processarBoletos(boletos);
		Fatura fatura = p.getFatura();
		
		assertEquals("NAO PAGO", fatura.getEstado());
		
		}
	
	@DisplayName("Processar boleto: fatura = 25000 e boleto = 25000")
	@ProcessarBoletoTest
	public void testT13(){
		Fatura f = new Fatura("07/06/2024", 25000, "Arthur Vitor Araújo Lima");
		Processador p = new Processador(f);
		Boleto b = new Boleto("111", "07/06/2024", 25000);
		ArrayList<Boleto> boletos = new ArrayList<Boleto>();
		boletos.add(b);
		p.processarBoletos(boletos);
		Fatura fatura = p.getFatura();
		
		assertEquals("PAGA", fatura.getEstado());
		
		}
	
	@DisplayName("Processar boleto: fatura = 25000 e boleto = 24999.99")
	@ProcessarBoletoTest
	public void testT14(){
		Fatura f = new Fatura("07/06/2024", 25000, "Arthur Vitor Araújo Lima");
		Processador p = new Processador(f);
		Boleto b = new Boleto("111", "07/06/2024", 24999.99);
		ArrayList<Boleto> boletos = new ArrayList<Boleto>();
		boletos.add(b);
		p.processarBoletos(boletos);
		Fatura fatura = p.getFatura();
		
		assertEquals("NAO PAGO", fatura.getEstado());
		
		}
	
	@DisplayName("Processar boleto: fatura = 24999.99 e boleto = 25000")
	@ProcessarBoletoTest
	public void testT15(){
		Fatura f = new Fatura("07/06/2024", 24999.99, "Arthur Vitor Araújo Lima");
		Processador p = new Processador(f);
		Boleto b = new Boleto("111", "07/06/2024", 25000);
		ArrayList<Boleto> boletos = new ArrayList<Boleto>();
		boletos.add(b);
		p.processarBoletos(boletos);
		Fatura fatura = p.getFatura();
		
		assertEquals("PAGA", fatura.getEstado());
		
		}
	
	@DisplayName("Processar boleto: fatura = 24999.99 e boleto = 24999.99")
	@ProcessarBoletoTest
	public void testT16(){
		Fatura f = new Fatura("07/06/2024", 24999.99, "Arthur Vitor Araújo Lima");
		Processador p = new Processador(f);
		Boleto b = new Boleto("111", "07/06/2024", 24999.99);
		ArrayList<Boleto> boletos = new ArrayList<Boleto>();
		boletos.add(b);
		p.processarBoletos(boletos);
		Fatura fatura = p.getFatura();
		
		assertEquals("PAGA", fatura.getEstado());
		
		}
}
