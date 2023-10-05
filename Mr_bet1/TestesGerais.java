import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class TestesGerais {
	
	private Mr_Bet sistema;
	
	@BeforeEach
	void setUp() {
		sistema = new Mr_Bet();
		sistema.incluirTime("250_PB", "Nacional de Patos", "Canário");
		sistema.incluirTime("251_PE", "Nacional de Recife", "Paz");
		sistema.adicionaCampeonato("Campeonato Paraibano 2023", 1);
		sistema.addTimeCampeonato("250_PB", "Campeonato Paraibano 2023");
		sistema.adicionaCampeonato("Brasileirão Série A 2023", 20);

	}
	
	
	@Test
	public void incluiTimeTest(){
		assertEquals(sistema.incluirTime("250_PB", "Sport Lagoa Seca", "Carneiro"),"TIME JÁ EXISTE!");
	}
	
	
	@Test
	public void recuperarTimeTest() {
		assertEquals(sistema.recuperaTime("250_PB"), "\n[250_PB] Nacional de Patos / Canário");
		assertEquals(sistema.recuperaTime("251_PE"), "\n[251_PE] Nacional de Recife / Paz");
		assertEquals(sistema.recuperaTime("151_SC"), "TIME NÃO EXISTE!");
	}
	
	@Test
	public void adicionaCampeonatoTest() {
		assertEquals(sistema.adicionaCampeonato("Brasileirão Série A 2023", 30), "CAMPEONATO JÁ EXISTE!");
	}

	
	
	@Test
	public void incluirTimeCampeonatoTest() {
				
		//Precisa ir para o catch
		try {
			sistema.addTimeCampeonato("152_SC", "Brasileirão série A 2023");
			fail("Era para falhar");
		}catch(Exception e) {
			assertEquals("TIME NÃO EXISTE!", e.getMessage());
		}
		
		try {
			sistema.addTimeCampeonato("250_PB", "Copa Nordeste de Futebol de 2023");
			fail("Era para falhar");
		}catch(Exception e) {
			assertEquals("CAMPEONATO NÃO EXISTE!", e.getMessage());
		}
		
		assertEquals(sistema.addTimeCampeonato("251_PE", "Campeonato Paraibano 2023"), "TODOS OS TIMES DESSE CAMPEONATO JÁ FORAM INCLUÍDOS!");
				
	}
	
	@Test
	public void verificarTimeCampeonato() {
		assertEquals(sistema.verificaTimeCampeonato("250_PB", "Campeonato Paraibano 2023"), "O TIME ESTÁ NO CAMPEONATO!");
		assertEquals(sistema.verificaTimeCampeonato("250_PB", "Brasileirão Série A 2023"), "O TIME NÃO ESTÁ NO CAMPEONATO!");

		try {
			sistema.addTimeCampeonato("152_SC", "Campeonato Paraibano 2023");
			fail("Era para falhar");
		}catch(Exception e) {
			assertEquals("TIME NÃO EXISTE!", e.getMessage());
		}
		
		try {
			sistema.addTimeCampeonato("250_PB", "Campeonato Catarinense 2023");
			fail("Era para falhar");
		}catch(Exception e) {
			assertEquals("CAMPEONATO NÃO EXISTE!", e.getMessage());
		}
	}

}
