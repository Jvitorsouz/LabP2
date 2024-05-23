import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.edu.ufcg.computacao.mrbet.MrBetSistema;

public class CampeonatoTest {

	private MrBetSistema sistema;
	
	@BeforeEach
	void setUp() {
		sistema = new MrBetSistema();
		sistema.incluirTime("250_PB", "Nacional de Patos", "Canário");
		sistema.incluirTime("251_PE", "Nacional de Recife", "Paz");
		sistema.adicionaCampeonato("Brasileirão Série A", 1);
		sistema.adicionaCampeonato("Campeonato Paraibano 2023", 15);
	}
	
	@Test
	public void addCampeonatoTest() {
		assertEquals(sistema.adicionaCampeonato("Brasileirão Série B", 20), "CAMPEONATO ADICIONADO!");
		assertEquals(sistema.adicionaCampeonato("Brasileirão Série B", 30), "CAMPEONATO JÁ EXISTE!");
	}
	
	@Test
	public void addTimeCampeonatoTest() {
		try {
			sistema.addTimeCampeonato("152_SC", "Brasileirão Série A");
			fail("DEVERIA LANÇAR EXCEÇÃO");
		} catch (Exception e) {
			assertEquals("TIME NÃO EXISTE!", e.getMessage());
		}
		
		try {
			sistema.addTimeCampeonato("250_PB", "Campeonato Catarinense 2023");
			fail("DEVERIA LANÇAR EXCEÇÃO");
		} catch (Exception e) {
			assertEquals("CAMPEONATO NÃO EXISTE!", e.getMessage());
		}
		
		
		assertEquals(sistema.addTimeCampeonato("250_PB", "Brasileirão Série A"), "TIME INCLUÍDO NO CAMPEONATO!");
		assertEquals(sistema.addTimeCampeonato("250_PB", "Campeonato Paraibano 2023"), "TIME INCLUÍDO NO CAMPEONATO!");
		assertEquals(sistema.addTimeCampeonato("251_PE", "Brasileirão Série A"), "TODOS OS TIMES DESSE CAMPEONATO JÁ FORAM INCLUÍDOS!");
	}
	
	@Test
	public void verificaTimeCampeonatoTest() {
		addTimeCampeonatoTest();
		assertEquals(sistema.verificaTimeCampeonato("250_PB", "Brasileirão Série A"), "O TIME ESTÁ NO CAMPEONATO!");
		assertEquals(sistema.verificaTimeCampeonato("251_PE", "Brasileirão Série A"), "O TIME NÃO ESTÁ NO CAMPEONATO!");
		
		try {
			sistema.verificaTimeCampeonato("151_PE", "Brasileirão Série A");
			fail("DEVERIA LANÇAR EXCEÇÃO!");
		} catch(Exception e) {
			assertEquals("TIME NÃO EXISTE!", e.getMessage());
		}
		
		try {
			sistema.verificaTimeCampeonato("251_PE", "Taemin 2023");
			fail("DEVERIA LANÇAR EXCEÇÃO!");
		} catch(Exception e) {
			assertEquals("CAMPEONATO NÃO EXISTE!", e.getMessage());
		}
	}
	
	@Test
	public void exibirCampeonatosTime() {
		addTimeCampeonatoTest();
		
		try {
			sistema.exibirTimeCampeonatos("151_MA");
			fail("DEVERIA LANÇAR EXCEÇÃO");
		} catch(Exception e) {
			assertEquals("TIME NÃO EXISTE!", e.getMessage());
		}
		
		String resultado = "\nCampeonatos do Nacional de Patos:\n"+
							"* Campeonato Paraibano 2023 - 1/15\n"+
							"* Brasileirão Série A - 1/1";
		
		assertEquals(sistema.exibirTimeCampeonatos("250_PB"), resultado);
	}
}
