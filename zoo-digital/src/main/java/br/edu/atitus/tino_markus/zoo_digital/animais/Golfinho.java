
package br.edu.atitus.tino_markus.zoo_digital.animais;
import br.edu.atitus.tino_markus.zoo_digital.comportamentos.Nadador;
import br.edu.atitus.tino_markus.zoo_digital.comportamentos.Predador;

public class Golfinho extends Mamifero implements Nadador, Predador {

    public Golfinho(String nome, String especie, int idade) {
        super(nome, especie, idade, false);
        
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está assoviando");
        
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está comendo peixes");
    }

    @Override
    public void nadar() {
        System.out.println(getNome() + " está nadando em mar aberto");
    }
    
    @Override
    public void cacar() {
    	System.out.println(getNome() + " está predando pequenos peixes");
    }
    
}
