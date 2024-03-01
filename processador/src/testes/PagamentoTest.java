package testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import processador.Pagamento;

class PagamentoTest {

	@Test
	public void testCriarPagamentoEmDia(){
		
		try{
			Pagamento pag = new Pagamento(856, "25/02/2024");
	    	
		 }catch(IllegalArgumentException e){
			 assertEquals("Entrada Inválida.",e.getMessage());
	     }
	}
	
	@Test
	public void testCriarPagamentoInvalidaComDataInvalida(){
		
		try{
			Pagamento pag = new Pagamento(856, "");
			}catch(IllegalArgumentException e){
				 assertEquals("Entrada Inválida.",e.getMessage());
		   }
		
	}
}
