package br.edu.atitus.tino_markus.zoo_digital.animais;

import br.edu.atitus.tino_markus.zoo_digital.comportamentos.Nadador;
import br.edu.atitus.tino_markus.zoo_digital.comportamentos.Predador;

public class Baiacu extends Peixe implements Nadador, Predador{
	public Baiacu(String nome, String especie, int idade, String tipoAgua) {
        super(nome, especie, idade, "Salgada");
        
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está borbulhando");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está pequenos peixes");
    }
    
    @Override
    public void nadar() {
        System.out.println(getNome() + " está nadando em mar aberto");
    }
    
    
    public void cacar() {
        System.out.println(getNome() + " está predando camarões");
    }
}
