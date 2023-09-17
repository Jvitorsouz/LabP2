
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import agenda.Agenda;

public class tests {
	
	private Agenda agenda;
	
	@BeforeEach
	void setUp() {
		agenda = new Agenda();
	}
	
	
	@Test
	public void cadastraContatoTest(){
		String resultado = agenda.cadastraContato(1, "Matheus", "Gaudencio", "(83) 99999-0000");
		assertEquals(resultado,"\nCADASTRO REALIZADO");
		
		resultado = agenda.cadastraContato(1, "Pedro", "Silva", "(84) 98888-1111");
		assertEquals(resultado, "\nCADASTRO REALIZADO");
		
		agenda.cadastraContato(1, "Matheus", "Gaudencio", "(83) 99999-0000");
		resultado = agenda.cadastraContato(3, "Matheus", "Gaudencio", "(83) 99999-0000");
		assertEquals(resultado,"\nCONTATO JA CADASTRADO");
	}
	
	@Test
	public void cadastraContatoTest2(){
		String resultado = agenda.cadastraContato(100, "Matheus", "Gaudencio", "(83) 99999-0000");
		assertEquals(resultado,"\nCADASTRO REALIZADO");
		
		resultado = agenda.cadastraContato(101, "Matheus", "Gaudencio", "(83) 99999-0000");
		assertEquals(resultado,"\nPOSICAO INVALIDA");
		
		resultado = agenda.cadastraContato(0, "Matheus", "Gaudencio", "(83) 99999-0000");
		assertEquals(resultado,"\nPOSICAO INVALIDA");
	}
	
	public void cadastraContatoTest3(){
		String resultado = agenda.cadastraContato(1, "Matheus", "Gaudencio", "");
		assertEquals(resultado,"\nCONTATO INVALIDO");
		
		resultado = agenda.cadastraContato(1, "", "Gaudencio", "(83) 99999-0000");
		assertEquals(resultado,"\nCONTATO INVALIDO");
	}
	
	@Test
	public void exibiContato() {
		agenda.cadastraContato(1, "Matheus", "Gaudencio", "(83) 99999-0000");
		String resultado = "\nMatheus Gaudencio\n"
							+ "(83) 99999-0000";
		
		assertEquals(resultado, agenda.exibirContato(1));
		
		resultado = "\n1 - Matheus Gaudencio\n";
		assertEquals(resultado, agenda.listarContatos());
		
		assertEquals("POSICAO INVALIDA", agenda.exibirContato(10));
		assertEquals("POSICAO INVALIDA", agenda.exibirContato(0));
		assertEquals("POSICAO INVALIDA", agenda.exibirContato(101));
	}
	
	@Test
	public void exibiContato1() {
		agenda.cadastraContato(1, "Matheus", "Gaudencio", "(83) 99999-0000");
		agenda.adicionaFavorito(1, 1);
		String resultado = "\n❤️ Matheus Gaudencio\n"
							+ "(83) 99999-0000";
		
		assertEquals(resultado, agenda.exibirContato(1));
	}

}
