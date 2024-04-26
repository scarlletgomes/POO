package br.com.catolica.animal;

public class Gato extends Animal{
	
	//atributo
	private String cor;
	
	//
	public Gato(String nome, int idade, String tipoAnimal, String cor) {
		super(nome, idade, tipoAnimal);
		this.cor = cor;
	}
	
	//get/set
	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
	
	//metodo
	public void arranhar() {
			System.out.println("Gato está arranhando");
	}
	
	@Override
	public void fazerSom() {
		super.fazerSom();
		System.out.println("miau");
	}
	
}
