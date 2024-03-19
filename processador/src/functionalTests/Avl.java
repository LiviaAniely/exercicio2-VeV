package functionalTests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import processador.Boleto;
import processador.Fatura;
import processador.Processador;

class Avl {

	@Test
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
	
	@Test
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
	
	@Test
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
	
	@Test
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
	
	@Test
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
	
	@Test
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
	
	@Test
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
	
	@Test
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
	
	@Test
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
	
	@Test
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
	
	@Test
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
	
	@Test
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
	
	@Test
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
	
	@Test
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
	
	@Test
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
	
	@Test
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
