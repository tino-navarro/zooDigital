package br.edu.atitus.tino_markus.zoo_digital.animais;
import br.edu.atitus.tino_markus.zoo_digital.comportamentos.Corredor;
import br.edu.atitus.tino_markus.zoo_digital.comportamentos.Nadador;
import br.edu.atitus.tino_markus.zoo_digital.comportamentos.Predador;
import br.edu.atitus.tino_markus.zoo_digital.comportamentos.Voador;

public class Pato extends Ave implements Voador, Nadador, Corredor, Predador{

    public Pato(String nome, String especie, int idade, String corPenas) {
        super(nome, especie, idade, corPenas);
        
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está grasnando");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está comendo");
    }

    @Override
    public void correr() {
        System.out.println(getNome() + " está correndo!");
    }

    @Override
    public void nadar() {
        System.out.println(getNome() + " está nadando na lagoa");
    }

    @Override
    public void voar() {
        System.out.println(getNome() + " está voando pelos ares");
    }
    
    @Override
    public void cacar() {
        System.out.println(getNome() + " está prendando pequenos peixes");
    }
}
