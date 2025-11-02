package br.edu.atitus.tino_markus.zoo_digital.animais;
public abstract class Animal {
	private static int contador = 0;
	private int id;
    private String nome;
    private String especie;
    private int idade;
    
    
    public Animal() {
    	contador++;
    }
   
    public Animal(String nome, String especie, int idade) {
    	this.id = ++contador;
        this.nome = nome;
        this.especie = especie;
        this.idade = idade;
    }
    
    public abstract void emitirSom();
    public abstract void comer();

    
   
    
    
    public int getId() {
		return id;
	}

	public static int getContador() {
		return contador;
	}

	public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEspecie() {
        return especie;
    }
    public void setEspecie(String especie) {
        this.especie = especie;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    


}