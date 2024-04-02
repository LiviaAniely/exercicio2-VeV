package junit5Tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;


import processador.Pagamento;

@DisplayName("Testes de Criar Pagamento")
class PagamentoTest {

	@DisplayName("Cria pagamento")
	@CriarPagamentoTest
	public void testCriarPagamentoEmDia(){
		
		try{
			Pagamento pag = new Pagamento(856, "25/02/2024");
	    	
		 }catch(IllegalArgumentException e){
			 assertEquals("Entrada Inválida.",e.getMessage());
	     }
	}
	
	
	@DisplayName("Cria pagamento inválido com data inválida")
	@CriarPagamentoTest
	public void testCriarPagamentoInvalidaComDataInvalida(){
		
		try{
			Pagamento pag = new Pagamento(856, "");
			}catch(IllegalArgumentException e){
				 assertEquals("Entrada Inválida.",e.getMessage());
		   }
		
	}
}
