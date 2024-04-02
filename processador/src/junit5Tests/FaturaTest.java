package junit5Tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;

import processador.Fatura;

@DisplayName("Testes de Criar Fatura")
class FaturaTest {
	
	@DisplayName("Cria fatura")
	@CriarFaturaTest
	public void testCriarFaturaEmDia(){
		
		try{
			Fatura f = new Fatura("07/06/2024", 14500, "Arthur Vitor Araújo Lima");
	    	
		 }catch(IllegalArgumentException e){
			 assertEquals("Entrada Inválida.",e.getMessage());
	     }
	}
	
	
	@DisplayName("Cria fatura inválida com nome inválido")
	@CriarFaturaTest
	public void testCriarFaturaInvalidaComNomeInvalido(){
		
		try{
			Fatura f = new Fatura("07/06/2024", 14500, "");
		    	
			}catch(IllegalArgumentException e){
				 assertEquals("Entrada Inválida.",e.getMessage());
		   }
	}
	
		
	@DisplayName("Cria fatura inválida com data inválida")
	@CriarFaturaTest
	public void testCriarFaturaInvalidaComDataInvalida(){
			
		try{
			Fatura f = new Fatura("", 14500, "Arthur Vitor Araújo Lima");
			    	
			}catch(IllegalArgumentException e){
					assertEquals("Entrada Inválida.",e.getMessage());
			}
		
		
		
	}

	}


