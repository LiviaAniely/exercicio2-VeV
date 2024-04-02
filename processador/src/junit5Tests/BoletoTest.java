package junit5Tests;


import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import processador.Boleto;

@DisplayName("Testes de Criar Boleto")
class BoletoTest {

	@DisplayName("Cria boleto válido")
	@CriarBoletoTest
	public void testCriarBoletosValidos(){
		
		try{
			Boleto b1 = new Boleto("111", "07/06/2024", 6000);
	    	
		 	}catch(IllegalArgumentException e){
		 		assertEquals("Entrada Inválida.",e.getMessage());
	     }
	}
		
	@DisplayName("Cria boleto inválido com código inválido - vazio")
	@CriarBoletoTest
	public void testCriarBoletosInvalidosComCodigoInvalido(){
		
		try{
			Boleto b1 = new Boleto("", "07/06/2024", 6000);
		    	
			}catch(IllegalArgumentException e){
				 assertEquals("Entrada Inválida.",e.getMessage());
		   }
	}
	@DisplayName("Cria boleto inválido com data inválida - vazia")
	@CriarBoletoTest
	public void testCriarBoletosInvalidosComDataInvalida(){
			
		try{
			Boleto b1 = new Boleto("112", "", 6000);
			    	
			}catch(IllegalArgumentException e){
				assertEquals("Entrada Inválida.",e.getMessage());
		}
		
		
		}
	}


