package PetStore;

import java.io.Serial;

public class Cao extends Mamifero {

	@Serial
	private static final long serialVersionUID = 1L;

	public String soar() {
		return "Faz latidos";
	}
	public Cao(String nome, int idade, String dono) {
		super(nome, idade, dono);
		this.especie = "Cachorro";
	}
}
