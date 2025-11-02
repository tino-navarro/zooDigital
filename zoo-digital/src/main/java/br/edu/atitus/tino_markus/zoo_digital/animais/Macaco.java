package br.edu.atitus.tino_markus.zoo_digital.animais;

import br.edu.atitus.tino_markus.zoo_digital.comportamentos.Corredor;
import br.edu.atitus.tino_markus.zoo_digital.comportamentos.Nadador;
import br.edu.atitus.tino_markus.zoo_digital.comportamentos.Predador;

public class Macaco extends Mamifero implements Nadador, Corredor, Predador{
	

	public Macaco(String nome, int idade) {
		super(nome, "Mico-Leão-Dourado", idade, true);
	      
	}

	@Override
	public void emitirSom() {
		System.out.println(getNome() + " está guinchando");
	}

	@Override
	public void comer() {
		System.out.println(getNome() + " está comendo formigas");
	}

	@Override
	public void correr() {
		System.out.println(getNome() + " está correndo atrás de seu grupo");
	}

	@Override
	public void nadar() {
		System.out.println(getNome() + " está nadando no rio");
	}
	    
	public void cacar() {
		System.out.println(getNome() + " está caçando pequenos invertebrados");
	}
}
