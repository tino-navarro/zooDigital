package br.edu.atitus.tino_markus.zoo_digital.animais;

import br.edu.atitus.tino_markus.zoo_digital.comportamentos.Nadador;
import br.edu.atitus.tino_markus.zoo_digital.comportamentos.Predador;

public class Lambari extends Peixe implements Nadador, Predador{

    public Lambari(String nome, String especie, int idade, String tipoAgua) {
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
        System.out.println(getNome() + " está nadando em águas doces");
    }
    
    @Override
    public void cacar() {
        System.out.println(getNome() + " está caçando pequenas larvar de insetos");
    }
    
}
