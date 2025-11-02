package br.edu.atitus.tino_markus.zoo_digital.animais;

import br.edu.atitus.tino_markus.zoo_digital.comportamentos.Corredor;
import br.edu.atitus.tino_markus.zoo_digital.comportamentos.Nadador;
import br.edu.atitus.tino_markus.zoo_digital.comportamentos.Predador;

public class Ema extends Ave implements Corredor, Nadador, Predador{
	public Ema(String nome, String especie, int idade, String corPenas) {
        super(nome, especie, idade, corPenas);
        
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está grasnando");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está comendo vegetais");
    }

    @Override
    public void correr() {
        System.out.println(getNome() + " está correndo!");
    }

    @Override
    public void nadar() {
        System.out.println(getNome() + " está nadando no rio");
    }

   
    public void cacar() {
        System.out.println(getNome() + " está prendando pequenos animais");
    }
}
