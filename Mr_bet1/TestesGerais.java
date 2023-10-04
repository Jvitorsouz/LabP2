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
	}
	
	
	@Test
	public void incluiTimeTest(){
		assertEquals(sistema.incluirTime("250_PB", "Sport Lagoa Seca", "Carneiro"),"TIME JÁ EXISTE!");
	}
	
	
	@Test
	public void recuperarTimeTest() {
		assertEquals(sistema.recuperaTime("250_PB"), "[250_PB] Nacional de Patos / Canário\n");
		assertEquals(sistema.recuperaTime("251_PE"), "[251_PE] Nacional de Recife / Paz\n");
		assertEquals(sistema.recuperaTime("151_SC"), "TIME NÃO EXISTE!");
	}
	
	@Test
	public void adicionaCampeonatoTest() {
		assertEquals(sistema.adicionaCampeonato("Brasileirão Série A 2023", 20), "CAMPEONATO ADICIONADO!");
		assertEquals(sistema.adicionaCampeonato("Brasileirão Série A 2023", 30), "CAMPEONATO JÁ EXISTE!");
	}

	
	@Test
	public void incluirTimeCampeonatoTest() {
		assertEquals(sistema.addTimeCampeonato("250_PB", "Campeonato Paraibano 2023"), "TIME INCLUÍDO NO CAMPEONATO!");
		
		
	}

}
