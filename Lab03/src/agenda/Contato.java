package agenda;

import java.util.Objects;

/**
 * Classe que representa um contato na agenda.
 * @author João Vitor da Silva Souza.
 */
public class Contato {

	/** O nome do contato. */
	private String nome;
	
	/** O sobrenome do contato. */
	private String sobrenome;
	
	/** O número de telefone do contato. */
	private String telefone;
	
	/** O status do contato (favorito). */
	private String status;
	
	/**
	 * Construtor da classe Contato.
	 *
	 * @param nome O nome do contato.
	 * @param sobrenome O sobrenome do contato.
	 * @param telefone O número de telefone do contato.
	 */
	public Contato(String nome, String sobrenome, String telefone) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.telefone = telefone;
		this.status = null;
	}

	/**
	 * Calcula o hash code do contato com base no nome e sobrenome.
	 *
	 * @return O hash code calculado.
	 */
	@Override
	public int hashCode() {
		return Objects.hash(nome, sobrenome);
	}

	/**
	 * Verifica se dois contatos são iguais com base no nome e sobrenome.
	 *
	 * @param obj O objeto a ser comparado com o contato atual.
	 * @return true se os contatos forem iguais, false caso contrário.
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contato other = (Contato) obj;
		return Objects.equals(nome, other.nome) && Objects.equals(sobrenome, other.sobrenome);
	}
	
	/**
	 * Retorna uma representação em forma de String do contato.
	 * Inclui o status (se favorito) e informações de nome e telefone.
	 *
	 * @return String representando o contato.
	 */
	public String exibiContato() {
		if(this.status != null) {
			return "\n" + this.status + " " + this.nome + " " + this.sobrenome + "\n" + this.telefone;
		}
		return "\n" + this.nome + " " + this.sobrenome + "\n" + this.telefone;

	}
	
	/**
	 * Retorna uma representação em forma de String do contato.
	 * Inclui apenas o nome e sobrenome.
	 *
	 * @return String com o nome e sobrenome do contato.
	 */
	
	public String toString() {
		return " - " + this.nome + " " + this.sobrenome + "\n";
	}
	
	/**
	 * Define o status do contato (favorito).
	 *
	 * @param heart O status do contato.
	 */
	public void setStatus(String heart) {
		this.status = heart;
	}
	
		
}
