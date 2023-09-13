//Test Criado para rodar no eclipse

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CronicasDoEstudanteSistemaTest {

    private CronicasDoEstudanteSistema sistema;

    @BeforeEach
    void setUp(){
        sistema = new CronicasDoEstudanteSistema();
        sistema.cadastrarCronica("Minha semana do fera 2022.2", "Cheguei bem fera na UFCG, não sabia onde achar nada… A semana do fera foi essencial para eu tomar um rumo…", "13/03/2023");
        sistema.cadastrarCronica("JUnit lá vou eu!", "JUnit é o framework de Java para testes de unidade, disponível na versão 5…", "19/04/2023", "Nathanzinho");
        sistema.cadastrarCronica("Mulheres na computacao!", "Ada Lovelace eh uma importante figura na historia da computacao...", "24/08/2023");
        sistema.criarLivreto(new int[] {0,1,2});
    }

    
    @Test
    public void testContemCronicaNoLivreto() {
    	assertTrue(sistema.contemCronicaNoLivreto("Minha semana do fera 2022.2", 0));
    	assertFalse(sistema.contemCronicaNoLivreto("Deve ser falsao", 0));

    }

    @Test
    public void testCriarLivreto() {
    	int[] livreto1 = new int[2];
    	int[] livreto2 = new int[6];
    	try {
    		sistema.criarLivreto(livreto1);
    		fail("Deveria ter lançado exceção");
    	} catch(IllegalArgumentException e) {
    		assertEquals("Quantidade Minima de Cronicas = 3", e.getMessage());
    	}
    	
    	try {
    		sistema.criarLivreto(livreto2);
    		fail("Deveria ter lançado exceção");
    	}catch(IllegalArgumentException e) {
    		assertEquals("Quantidade Maxima de Cronicas = 5", e.getMessage());
    	}

    }
	
    
    @Test
    public void testExibirCronicaMaisLida() {
    	lerCronica(0);
    	String formatacao = "\nMinha semana do fera 2022.2 - lida 3 vezes";
    	assertEquals(formatacao, sistema.exibirCronicaMaisLida());

    }

    @Test
    public void testLerCronica() {
    	String formatacao = "\nMinha semana do fera 2022.2\n"
    			+ "Data: 13/03/2023\n"
    			+ "Autor: Anonimo\n"
    			+ "Cheguei bem fera na UFCG, não sabia onde achar nada… A semana do fera foi essencial para eu tomar um rumo…";

    	assertEquals(formatacao, sistema.lerCronica(0));
    }
    
    private void lerCronica(int indice) {
    	for(int i=0; i<3; i++) {
    		sistema.lerCronica(indice);
    	}
    }
    
    
    @Test
    public void testLerLivreto() {
    	String formatacao = "\nMinha semana do fera 2022.2\n"
    			+ "Data: 13/03/2023\n"
    			+ "Autor: Anonimo\n"
    			+ "Cheguei bem fera na UFCG, não sabia onde achar nada… A semana do fera foi essencial para eu tomar um rumo…\n"
    			+ "\n"
    			+ "JUnit lá vou eu!\n"
    			+ "Data: 19/04/2023\n"
    			+ "Autor: Nathanzinho\n"
    			+ "JUnit é o framework de Java para testes de unidade, disponível na versão 5…\n"
    			+ "\n"
    			+ "Mulheres na computacao!\n"
    			+ "Data: 24/08/2023\n"
    			+ "Autor: Anonimo\n"
    			+ "Ada Lovelace eh uma importante figura na historia da computacao...\n";
    	assertEquals(formatacao, sistema.lerLivreto(0));
    }

    @Test
    public void testListarCronicas() {
        String formatacao = "\n\nCronica #1\n" + //
                "Minha semana do fera 2022.2\n" + //
                "Data: 13/03/2023\n" + //
                "Autor: Anonimo\n" + //
                "Cheguei bem fera na UFCG, não sabia onde achar nada… A semana do fera foi essencial para eu tomar um rumo…\n" + //
                "\n" + //
                "Cronica #2\n" + //
                "JUnit lá vou eu!\n" + //
                "Data: 19/04/2023\n" + //
                "Autor: Nathanzinho\n" + //
                "JUnit é o framework de Java para testes de unidade, disponível na versão 5…\n" + //
                "\n" + //
                "Cronica #3\n" + //
                "Mulheres na computacao!\n" + //
                "Data: 24/08/2023\n" + //
                "Autor: Anonimo\n" + //
                "Ada Lovelace eh uma importante figura na historia da computacao...\n";

        assertEquals(formatacao, sistema.listarCronicas());
        
    }

}
