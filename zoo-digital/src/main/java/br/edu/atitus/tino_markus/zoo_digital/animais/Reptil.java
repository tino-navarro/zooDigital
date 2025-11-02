package br.edu.atitus.tino_markus.zoo_digital.animais;

public abstract class Reptil extends Animal{
	private boolean venenoso;

	public Reptil(String nome, String especie, int idade, String venenoso) {
		super(nome, especie, idade);
	
	}

	public boolean isVenenoso() {
		return venenoso;
	}

	public void setVenenoso(boolean venenoso) {
		this.venenoso = venenoso;
	}

	

}
