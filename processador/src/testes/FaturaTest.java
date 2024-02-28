package testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import processador.Boleto;
import processador.Fatura;

class FaturaTest {
	@Test
	public void testCriarFaturaEmDia(){
		
		try{
			Fatura f = new Fatura("07/06/2024", 14500, "Arthur Vitor Araújo Lima");
	    	
		 }catch(IllegalArgumentException e){
			 assertEquals("Entrada Inválida.",e.getMessage());
	     }
	}
	
	@Test
	public void testCriarFaturaInvalidaComNomeInvalido(){
		
		try{
			Fatura f = new Fatura("07/06/2024", 14500, "");
		    	
			}catch(IllegalArgumentException e){
				 assertEquals("Entrada Inválida.",e.getMessage());
		   }
	}
	
		@Test
		public void testCriarFaturaInvalidaComDataInvalida(){
			
			try{
				Fatura f = new Fatura("", 14500, "Arthur Vitor Araújo Lima");
			    	
				}catch(IllegalArgumentException e){
					 assertEquals("Entrada Inválida.",e.getMessage());
			    }
		
		
		
	}

	}


