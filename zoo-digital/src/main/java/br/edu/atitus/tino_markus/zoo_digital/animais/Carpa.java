package br.edu.atitus.tino_markus.zoo_digital.animais;

import br.edu.atitus.tino_markus.zoo_digital.comportamentos.Nadador;
import br.edu.atitus.tino_markus.zoo_digital.comportamentos.Predador;

public class Carpa extends Peixe implements Nadador, Predador{
	public Carpa(String nome, String especie, int idade, String tipoAgua) {
        super(nome, especie, idade, tipoAgua);
        
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está borbulhando");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está comendo algas");
    }
    
    @Override
    public void nadar() {
        System.out.println(getNome() + " está nadando em seu lago");
    }
    
    
    public void cacar() {
        System.out.println(getNome() + " está predando alevinos em seu lago");
    }
}
