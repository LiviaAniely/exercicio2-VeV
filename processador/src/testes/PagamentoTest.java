package testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PagamentoTest {

	@Test
	public void testCriarPagamentoEmDia(){
		
		try{
			Pagamento pag = new Pagamento(856, "25/02/2024", "BOLETO");
	    	
		 }catch(IllegalArgumentException e){
			 assertEquals("Entrada Inválida.",e.getMessage());
	     }
		
	
	@Test
	public void testCriarPagamentoInvalidaComDataInvalida(){
		
		try{
			Pagamento pag = new Pagamento(856, "", "BOLETO");
			}catch(IllegalArgumentException e){
				 assertEquals("Entrada Inválida.",e.getMessage());
		   }
		
	}
}
