package br.edu.atitus.tino_markus.zoo_digital.animais;

import br.edu.atitus.tino_markus.zoo_digital.comportamentos.Corredor;
import br.edu.atitus.tino_markus.zoo_digital.comportamentos.Voador;

public class Canario extends Ave implements Voador, Corredor {
	public Canario(String nome, String especie, int idade, String corPenas) {
        super(nome, especie, idade, corPenas);
        
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está cantando");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está comendo frutas e sementes");
    }

    @Override
    public void correr() {
        System.out.println(getNome() + " está correndo!");
    }

    @Override
    public void voar() {
        System.out.println(getNome() + " está voando pelos ares");
    }
    
}
