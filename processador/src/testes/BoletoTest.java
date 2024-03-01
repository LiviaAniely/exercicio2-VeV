package testes;


import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import processador.Boleto;

class BoletoTest {

	@Test
	public void testCriarBoletosValidos(){
		
		try{
			Boleto b1 = new Boleto("111", "07/06/2024", 6000);
	    	
		 }catch(IllegalArgumentException e){
			 assertEquals("Entrada Inválida.",e.getMessage());
	     }
	}
		
	
	@Test
	public void testCriarBoletosInvalidosComCodigoInvalido(){
		
		try{
			Boleto b1 = new Boleto("", "07/06/2024", 6000);
		    	
			}catch(IllegalArgumentException e){
				 assertEquals("Entrada Inválida.",e.getMessage());
		   }
	}
		
		@Test
		public void testCriarBoletosInvalidosComDataInvalida(){
			
			try{
				Boleto b1 = new Boleto("112", "", 6000);
			    	
				}catch(IllegalArgumentException e){
					 assertEquals("Entrada Inválida.",e.getMessage());
			    }
		
		
		}
	}


