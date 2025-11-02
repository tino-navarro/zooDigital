package br.edu.atitus.tino_markus.zoo_digital.animais;
import br.edu.atitus.tino_markus.zoo_digital.comportamentos.Nadador;
import br.edu.atitus.tino_markus.zoo_digital.comportamentos.Predador;

public class Pinguim extends Ave implements Nadador, Predador {

    public Pinguim(String nome, String especie, int idade, String corPenas) {
        super(nome, especie, idade, corPenas);
    
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está grasnando");
    }

    @Override
    public void comer() {
       System.out.println(getNome() + " está comendo peixes");
    }

    @Override
    public void nadar() {
        System.out.println(getNome() + " está nadando nos mares gelados");
    }
    
    
    public void cacar() {
        System.out.println(getNome() + " está caçando Krills nas geleiras");
    }
}
