package PetStore;

import java.io.Serial;
import java.io.Serializable;

public abstract class Mamifero implements Serializable {

	@Serial
	private static final long serialVersionUID = 1L;
	private final String nome;
	private final int idade;
	private final String dono;
	protected String especie;
	
	public Mamifero(String nome, int idade, String dono) {
		this.nome = nome;
		this.idade = idade;
		this.dono = dono;
	}
	public String toString() {
		String retorno = "";
		retorno += "Nome: "     + this.nome     + "\n";
		retorno += "Idade: "    + this.idade    + " anos\n";
		retorno += "Dono: "     + this.dono     + "\n";
		retorno += "Especie: "  + this.especie  + "\n";
		retorno += "Barulho: "  + soar()        + "\n";
		return retorno;
	}
	public abstract String soar();
}
