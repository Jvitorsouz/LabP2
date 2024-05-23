import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import agenda.Agenda;

public class FavoritosTests{
	
	private Agenda agenda;
	
	@BeforeEach
	void setUp() {
		agenda = new Agenda();
	}
	
	@Test
	public void adicionarFavoritoTest() {
		agenda.cadastraContato(1, "Matheus", "Gaudencio", "(83) 99999-0000");
		agenda.cadastraContato(2, "Joao", "Vitor", "(83) 99999-1111");
		agenda.cadastraContato(3, "Alan", "Santos", "(83) 99999-2222");
		
		assertEquals(agenda.adicionaFavorito(1, 1), "CONTATO FAVORITADO NA POSIÇÃO 1!");
		assertEquals(agenda.adicionaFavorito(1, 2), "CONTATO JA ADICIONADO");
		assertEquals(agenda.adicionaFavorito(2, 5), "CONTATO FAVORITADO NA POSIÇÃO 5!");
		assertEquals(agenda.adicionaFavorito(3, 10), "CONTATO FAVORITADO NA POSIÇÃO 10!");
	}
	
	@Test
	public void adicionarFavoritoTest1(){
		agenda.cadastraContato(1, "Matheus", "Gaudencio", "(83) 99999-0000");
		assertEquals(agenda.adicionaFavorito(0, 1), "\nPOSICAO INVALIDA!");
		assertEquals(agenda.adicionaFavorito(1, 0), "\nPOSICAO INVALIDA!");
		assertEquals(agenda.adicionaFavorito(1, 11), "\nPOSICAO INVALIDA!");
	}
	
	@Test
	public void listarFavorito(){
		adicionarFavoritoTest();
		String resultado = "\n1 - Matheus Gaudencio\n5 - Joao Vitor\n10 - Alan Santos\n";
		assertEquals(resultado, agenda.listarFavoritos());
	}
	
	

}
