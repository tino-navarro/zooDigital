package br.edu.atitus.tino_markus.zoo_digital.animais;

import br.edu.atitus.tino_markus.zoo_digital.comportamentos.Corredor;
import br.edu.atitus.tino_markus.zoo_digital.comportamentos.Nadador;
import br.edu.atitus.tino_markus.zoo_digital.comportamentos.Predador;

public class OncaPintada extends Mamifero implements Nadador, Corredor, Predador{

    public OncaPintada(String nome, String especie, int idade) {
        super(nome, especie, idade, true);
      
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está esturrando");
    }

    @Override
    public void comer() {
       System.out.println(getNome() + " está comendo sua presa");
    }

    @Override
    public void correr() {
        System.out.println(getNome() + " está correndo atrás da sua presa");
    }

    @Override
    public void nadar() {
        System.out.println(getNome() + " está nadando no rio");
    }
    
    public void cacar() {
    	System.out.println(getNome() + " está caçando a presa");
    }
}

