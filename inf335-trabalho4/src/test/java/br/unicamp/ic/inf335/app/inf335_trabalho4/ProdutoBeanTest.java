package br.unicamp.ic.inf335.app.inf335_trabalho4;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class ProdutoBeanTest {

    static ProdutoBean produto1;
    static ProdutoBean produto2;
    static ProdutoBean produto3;
    
    @Before
     public void setUpBefore()
    {
    	produto1 = new ProdutoBean("1", "Produto 1", "teste", 50.0, "a");
        produto2 = new ProdutoBean("2", "Produto 2", "teste", 100.0, "b");
        produto3 = new ProdutoBean("3", "Produto 3", "teste", 50.0, "c");
    }

    @Test
    public void testCompareToMaior() {
    	
    	assertEquals(1, produto2.compareTo(produto3));
    }
    
    @Test
    public void testCompareToMenor() {
    	
    	assertEquals(-1, produto1.compareTo(produto2));
    }
    
    @Test
    public void testCompareToIguais() {
    	assertEquals(0, produto3.compareTo(produto1));
    }
}
