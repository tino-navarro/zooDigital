package br.edu.atitus.tino_markus.zoo_digital.animais;

import br.edu.atitus.tino_markus.zoo_digital.comportamentos.Nadador;
import br.edu.atitus.tino_markus.zoo_digital.comportamentos.Predador;
import br.edu.atitus.tino_markus.zoo_digital.comportamentos.Rastejante;

public class Cobra extends Reptil implements Nadador, Rastejante, Predador{

	public Cobra(String nome, String especie, int idade, String venenoso) {
		super(nome, especie, idade, venenoso);
	}

	public void rasteja() {
        System.out.println(getNome() + " está rastejando pelo mato");
    }
	
    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está sibilando");
    }

    @Override
    public void comer() {
       System.out.println(getNome() + " está comendo pequenos animais");
    }

    @Override
    public void nadar() {
        System.out.println(getNome() + " está nadando no rio");
    }
    
    
    public void cacar() {
        System.out.println(getNome() + " está caçando pequenos roedores");
    }
}
	

