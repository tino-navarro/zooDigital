package br.edu.atitus.tino_markus.zoo_digital.animais;

import br.edu.atitus.tino_markus.zoo_digital.comportamentos.Corredor;
import br.edu.atitus.tino_markus.zoo_digital.comportamentos.Nadador;
import br.edu.atitus.tino_markus.zoo_digital.comportamentos.Predador;

public class Cachorro extends Mamifero implements Nadador, Corredor, Predador{

    public Cachorro(String nome, String especie, int idade) {
        super(nome, especie, idade, true);
      
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está latindo");
    }

    @Override
    public void comer() {
       System.out.println(getNome() + " está comendo sua ração");
    }

    @Override
    public void correr() {
        System.out.println(getNome() + " está correndo atrás do graveto");
    }

    @Override
    public void nadar() {
        System.out.println(getNome() + " está nadando");
    }
    
    public void cacar() {
    	System.out.println(getNome() + " está caçando a meia que roubou");
    }
}
