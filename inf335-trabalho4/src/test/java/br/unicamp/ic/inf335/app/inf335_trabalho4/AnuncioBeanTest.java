package br.unicamp.ic.inf335.app.inf335_trabalho4;

import static org.junit.Assert.assertEquals;

import java.net.URL;
import java.util.ArrayList;

import org.junit.Test;


public class AnuncioBeanTest {
	
	@Test
	public void testGetValor() {
		
		ArrayList<URL> fotosUrl = new ArrayList<URL>();
		
		ProdutoBean produto = new ProdutoBean();
		produto.setValor(70.0);

		AnuncioBean anuncio = new AnuncioBean(produto, fotosUrl, 0.2);
		
	    Double resultado = anuncio.getValor();
	    
	    Double esperado = 56.00;
	    //Verificar se um desconto de 20% está sendo calculado corretamente
	    assertEquals(esperado, resultado);
	}

}
