import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestesGerais1 {
	
	private Mr_Bet sistema;
	
	@BeforeEach
	void setUp() {
		sistema = new Mr_Bet();
		sistema.incluirTime("250_PB", "Nacional de Patos", "Canário");
		sistema.incluirTime("251_PE", "Nacional de Recife", "Paz");
		sistema.adicionaCampeonato("Campeonato Paraibano 2023", 1);
		sistema.addTimeCampeonato("250_PB", "Campeonato Paraibano 2023");
		sistema.adicionaCampeonato("Brasileirão Série A 2023", 20);	
		sistema.addTimeCampeonato("250_PB", "Brasileirão Série A 2023");
	}
	
	@Test
	public void exibirCampeonatosTime() {
		String resultado = "\nCampeonatos do Nacional de Patos:\n"+
							"* Campeonato Paraibano 2023 - 1/1\n"+
							"* Brasileirão Série A 2023 - 1/20";
		
		assertEquals(sistema.exibirTimeCampeonatos("250_PB"), resultado);
	}

}
