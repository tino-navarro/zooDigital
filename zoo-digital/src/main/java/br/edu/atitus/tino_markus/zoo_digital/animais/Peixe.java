package br.edu.atitus.tino_markus.zoo_digital.animais;
public abstract class Peixe extends Animal {
    private String tipoAgua; //agua doce ou salgada
    
    public Peixe(String nome, String especie, int idade, String tipoAgua) {
        super(nome, especie, idade);
        this.tipoAgua = tipoAgua;
    }

    public String getTipoAgua() {
        return tipoAgua;
    }

    public void setTipoAgua(String tipoAgua) {
        this.tipoAgua = tipoAgua;
    }

    
}
