package br.edu.atitus.tino_markus.zoo_digital.animais;

import br.edu.atitus.tino_markus.zoo_digital.comportamentos.Corredor;
import br.edu.atitus.tino_markus.zoo_digital.comportamentos.Nadador;
import br.edu.atitus.tino_markus.zoo_digital.comportamentos.Predador;

public class Lagarto extends Reptil implements Corredor, Nadador, Predador {

	public Lagarto(String nome, String especie, int idade, String venenoso) {
		super(nome, especie, idade, venenoso);
	}
	
	public void correr() { 
		System.out.println(getNome() + " está correndo");
	}
	
    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está sibilando");
    }

    @Override
    public void comer() {
       System.out.println(getNome() + " está comendo ovos de outros animais");
    }

    @Override
    public void nadar() {
        System.out.println(getNome() + " está nadando no rio");
    }
    
    @Override
    public void cacar() {
        System.out.println(getNome() + " está caçando pequenos roedores");
    }
}
