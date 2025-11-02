package br.edu.atitus.tino_markus.zoo_digital.animais;

import br.edu.atitus.tino_markus.zoo_digital.comportamentos.Corredor;
import br.edu.atitus.tino_markus.zoo_digital.comportamentos.Nadador;
import br.edu.atitus.tino_markus.zoo_digital.comportamentos.Predador;
import br.edu.atitus.tino_markus.zoo_digital.comportamentos.Rastejante;

public class Crocodilo extends Reptil implements Corredor, Nadador, Predador, Rastejante {

	public Crocodilo(String nome, String especie, int idade) {
		super(nome, especie, idade);
	}
	
	public void correr() { 
		System.out.println(getNome() + " está correndo");
	}
	
	public void rasteja() {
        System.out.println(getNome() + " está rastejando pelo mato");
    }
	
    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está bramindo");
    }

    @Override
    public void comer() {
       System.out.println(getNome() + " está comendo sua caça");
    }

    @Override
    public void nadar() {
        System.out.println(getNome() + " está nadando no rio");
    }
    
    
    @Override
    public void cacar() {
        System.out.println(getNome() + " está caçando animais");
    }
}
