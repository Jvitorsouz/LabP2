import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.edu.ufcg.computacao.mrbet.MrBetSistema;

public class ApostaTests {
	private MrBetSistema sistema;
	
	@BeforeEach
	void setUp() {
		sistema = new MrBetSistema();
		sistema.incluirTime("250_PB", "Nacional de Patos", "Canário");
		sistema.adicionaCampeonato("Campeonato Paraibano 2023", 15);
		sistema.incluirTime("251_PE", "Nacional de Recife", "Paz");
		sistema.adicionaCampeonato("Brasileirão Série A", 10);
	}
	
	@Test
	public void apostarTest() {
		String resultado = sistema.apostar("250_PB", "Campeonato Paraibano 2023", 5, 10);
		assertEquals(resultado, "APOSTA REGISTRADA!");
		
		String resultado1 = sistema.apostar("250_PB", "Campeonato Paraibano 2023", 16, 10);
		assertEquals(resultado1, "APOSTA NÃO REGISTRADA!");
		
		String resultado2 = sistema.apostar("251_PE", "Brasileirão Série A", 8, 20);
		assertEquals(resultado2, "APOSTA REGISTRADA!");
		
		try {
			sistema.apostar("251_PB", "Campeonato Paraibano 2023", 6, 10);
			fail("DEVERIA LANÇAR EXCEÇÃO");
		} catch (Exception e) {
			assertEquals("TIME NÃO EXISTE!", e.getMessage());
		}
		
		try {
			sistema.apostar("250_PB", "Campeonato Paraibano 2021", 6, 10);
			fail("DEVERIA LANÇAR EXCEÇÃO");
		} catch (Exception e) {
			assertEquals("CAMPEONATO NÃO EXISTE!", e.getMessage());
		}
	}
	
	@Test
	public void exibirApostas() {
		apostarTest();
		String resultado = "\nApostas:\n"+
							"1. [250_PB] Nacional de Patos / Canário\n"+
							"Campeonato Paraibano 2023\n"+
							"5/15\n"+
							"R$ 10,00\n"+
							"2. [251_PE] Nacional de Recife / Paz\n"+
							"Brasileirão Série A\n"+
							"8/10\n"+
							"R$ 20,00\n";
		assertEquals(resultado, sistema.statusAposta());	
	}
}