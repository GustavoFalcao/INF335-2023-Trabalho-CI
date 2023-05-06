package br.unicamp.ic.inf335.app.inf335_trabalho4;

import java.util.ArrayList;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.net.URL;

public class AnuncianteBeanTest {

	@Test
	public void testValorMedioAnuncios() {
        ArrayList<AnuncioBean> anuncios = new ArrayList<AnuncioBean>();
        
        anuncios.add(new AnuncioBean(new ProdutoBean("1", "P1", "teste", 70.0, ""), new ArrayList<URL>(), 0.3));
        anuncios.add(new AnuncioBean(new ProdutoBean("2", "P2", "teste", 50.0, ""), new ArrayList<URL>(), 0.25));
        anuncios.add(new AnuncioBean(new ProdutoBean("3", "P3", "teste", 30.0, ""), new ArrayList<URL>(), 0.5));

        AnuncianteBean anunciante = new AnuncianteBean("Teste", "11111111111", anuncios);

        String result = String.format("%.2f", anunciante.valorMedioAnuncios());
       
        assertEquals("33,83", result);
    }
	
	@Test
	public void testValorMedioAnunciosSeNaoTiverAnuncio() {
		
		 AnuncianteBean anunciante = new AnuncianteBean();
		 
		 String result = String.format("%.2f", anunciante.valorMedioAnuncios());
	       
		 assertEquals("0,00", result);
	}
}
