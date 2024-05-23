import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.edu.ufcg.computacao.mrbet.MrBetSistema;

public class TimeTests {
	
	private MrBetSistema sistema;
	
	@BeforeEach
	void setUp() {
		sistema = new MrBetSistema();
	}
	
	@Test
	public void incluirTimeTest() {
		assertEquals(sistema.incluirTime("250_PB", "Nacional de Patos", "Canário"), "INCLUSÃO REALIZADA!");
		assertEquals(sistema.incluirTime("251_PE", "Nacional de Recife", "Paz"), "INCLUSÃO REALIZADA!");
		assertEquals(sistema.incluirTime("250_PB", "Nacional de CG", "Bird"), "TIME JÁ EXISTE!");
	}
	
	@Test
	public void recuperaTimeTest() {
		incluirTimeTest();
		assertEquals(sistema.recuperaTime("250_PB"), "\n[250_PB] Nacional de Patos / Canário");
		assertEquals(sistema.recuperaTime("251_PE"), "\n[251_PE] Nacional de Recife / Paz");
		
		assertEquals(sistema.recuperaTime("151_SC"), "TIME NÃO EXISTE!");
		assertEquals(sistema.recuperaTime("251_PB"), "TIME NÃO EXISTE!");
	}
	
}
