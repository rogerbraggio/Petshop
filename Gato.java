package PetStore;

import java.io.Serial;

public class Gato extends Mamifero {

	@Serial
	private static final long serialVersionUID = 1L;

	public String soar() {
		return "Faz Miados";
	}
	public Gato(String nome, int idade, String dono) {
		super(nome, idade, dono);
		this.especie = "Gato";
	}
}
