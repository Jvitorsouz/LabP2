import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TratarExcecoesTests {
	
	private Mr_Bet sistema;
	
	@BeforeEach
	void setUp() {
		sistema = new Mr_Bet();
	}
	
	@Test
	public void incluirTimeNullTest() {
		try {
			sistema.incluirTime(null, "teste", "teste");
			fail("DEVERIA LANÇAR EXCEÇÃO");
		}catch(Exception e) {
			assertEquals("CODIGO NULO OU VAZIO", e.getMessage());
		}
		
		try {
			sistema.incluirTime("teste", null, "teste");
			fail("DEVERIA LANÇAR EXCEÇÃO");
		}catch(Exception e) {
			assertEquals("NOME NULO OU VAZIO", e.getMessage());
		}
		
		try {
			sistema.incluirTime("teste", "teste", null);
			fail("DEVERIA LANÇAR EXCEÇÃO");
		}catch(Exception e) {
			assertEquals("MASCOTE NULO OU VAZIO", e.getMessage());
		}
	}
	
	@Test
	public void incluirTimeVaziaTest() {
		try {
			sistema.incluirTime("", "teste", "teste");
			fail("DEVERIA LANÇAR EXCEÇÃO");
		}catch(Exception e) {
			assertEquals("CODIGO NULO OU VAZIO", e.getMessage());
		}
		
		try {
			sistema.incluirTime("teste", " ", "teste");
			fail("DEVERIA LANÇAR EXCEÇÃO");
		}catch(Exception e) {
			assertEquals("NOME NULO OU VAZIO", e.getMessage());
		}
		
		try {
			sistema.incluirTime("teste", "teste", "  ");
			fail("DEVERIA LANÇAR EXCEÇÃO");
		}catch(Exception e) {
			assertEquals("MASCOTE NULO OU VAZIO", e.getMessage());
		}
	}
	
	@Test
	public void recuperaTimeTest() {
		try {
			sistema.recuperaTime(null);
			fail("DEVERIA LANÇAR EXCEÇÃO");
		} catch(Exception e ) {
			assertEquals("CODIGO NULO OU VAZIO", e.getMessage());
		}
		
		try {
			sistema.recuperaTime("");
			fail("DEVERIA LANÇAR EXCEÇÃO");
		} catch(Exception e ) {
			assertEquals("CODIGO NULO OU VAZIO", e.getMessage());
		}
		
		try {
			sistema.recuperaTime("        ");
			fail("DEVERIA LANÇAR EXCEÇÃO");
		} catch(Exception e ) {
			assertEquals("CODIGO NULO OU VAZIO", e.getMessage());
		}
	}
	
	@Test
	public void adicionaCampTest() {
		try {
			sistema.adicionaCampeonato(" ", 1);
			fail("DEVERIA LANÇAR EXCEÇÃO");
		} catch(Exception e) {
			assertEquals("CAMPEONATO NULO OU VAZIO", e.getMessage());
		}
		
		try {
			sistema.adicionaCampeonato(null, 1);
			fail("DEVERIA LANÇAR EXCEÇÃO");
		} catch(Exception e) {
			assertEquals("CAMPEONATO NULO OU VAZIO", e.getMessage());
		}
		
	}
	
	@Test
	public void adicionaTimeCampNullTest() {
		try {
			sistema.addTimeCampeonato("Teste", null);
			fail("DEVERIA LANÇAR EXCEÇÃO");
		} catch(Exception e) {
			assertEquals("CAMPEONATO NULO OU VAZIO", e.getMessage());
		}
		
		try {
			sistema.addTimeCampeonato(null, "Teste");
			fail("DEVERIA LANÇAR EXCEÇÃO");
		} catch(Exception e) {
			assertEquals("CODIGO NULO OU VAZIO", e.getMessage());
		}
	}
	
	@Test
	public void adicionaTimeCampVaziaTest() {
		try {
			sistema.addTimeCampeonato("Teste", " ");
			fail("DEVERIA LANÇAR EXCEÇÃO");
		} catch(Exception e) {
			assertEquals("CAMPEONATO NULO OU VAZIO", e.getMessage());
		}
		
		try {
			sistema.addTimeCampeonato("     ", "Teste");
			fail("DEVERIA LANÇAR EXCEÇÃO");
		} catch(Exception e) {
			assertEquals("CODIGO NULO OU VAZIO", e.getMessage());
		}
	}
	
	@Test
	public void verificarTimeCampNullTest() {
		try {
			sistema.verificaTimeCampeonato("Teste", null);
			fail("DEVERIA LANÇAR EXCEÇÃO");
		} catch(Exception e) {
			assertEquals("CAMPEONATO NULO OU VAZIO", e.getMessage());
		}
		
		try {
			sistema.verificaTimeCampeonato(null, "Teste");
			fail("DEVERIA LANÇAR EXCEÇÃO");
		} catch(Exception e) {
			assertEquals("CODIGO NULO OU VAZIO", e.getMessage());
		}
	}
	
	@Test
	public void verificarTimeCampVaziaTest() {
		try {
			sistema.verificaTimeCampeonato("Teste", " ");
			fail("DEVERIA LANÇAR EXCEÇÃO");
		} catch(Exception e) {
			assertEquals("CAMPEONATO NULO OU VAZIO", e.getMessage());
		}
		
		try {
			sistema.verificaTimeCampeonato("     ", "Teste");
			fail("DEVERIA LANÇAR EXCEÇÃO");
		} catch(Exception e) {
			assertEquals("CODIGO NULO OU VAZIO", e.getMessage());
		}
	}
	
	@Test
	public void exibirTimeCampTest() {
		try {
			sistema.exibirTimeCampeonatos(null);
			fail("DEVERIA LANÇAR EXCEÇÃO");
		}catch(Exception e) {
			assertEquals("CODIGO NULO OU VAZIO", e.getMessage());
		}
		
		try {
			sistema.exibirTimeCampeonatos("");
			fail("DEVERIA LANÇAR EXCEÇÃO");
		}catch(Exception e) {
			assertEquals("CODIGO NULO OU VAZIO", e.getMessage());
		}
		
		try {
			sistema.exibirTimeCampeonatos("    ");
			fail("DEVERIA LANÇAR EXCEÇÃO");
		}catch(Exception e) {
			assertEquals("CODIGO NULO OU VAZIO", e.getMessage());
		}
	}
	
	@Test
	public void apostarNullTest() {
		try {
			sistema.apostar(null, "teste", 1, 1);
			fail("DEVERIA LANÇAR EXCEÇÃO");
		}catch(Exception e) {
			assertEquals("CODIGO NULO OU VAZIO", e.getMessage());
		}
		
		try {
			sistema.apostar("teste", null, 1, 1);
			fail("DEVERIA LANÇAR EXCEÇÃO");
		}catch(Exception e) {
			assertEquals("CAMPEONATO NULO OU VAZIO", e.getMessage());
		}
	}
	
	@Test
	public void apostarVazioTest() {
		try {
			sistema.apostar("", "teste", 1, 1);
			fail("DEVERIA LANÇAR EXCEÇÃO");
		}catch(Exception e) {
			assertEquals("CODIGO NULO OU VAZIO", e.getMessage());
		}
		
		try {
			sistema.apostar("teste", " ", 1, 1);
			fail("DEVERIA LANÇAR EXCEÇÃO");
		}catch(Exception e) {
			assertEquals("CAMPEONATO NULO OU VAZIO", e.getMessage());
		}
	}

}