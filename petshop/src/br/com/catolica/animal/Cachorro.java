package br.com.catolica.animal;

public class Cachorro extends Animal{
	
	//atributos
	private String fucinho;
	
	//construtor
	public Cachorro(String nome, int idade, String tipoAnimal, String fucinho) {
	super(nome, idade, tipoAnimal);
	this.fucinho = fucinho;	
	}

	//get/set
	public String getFucinho() {
		return fucinho;
	}

	public void setFucinho(String fucinho) {
		this.fucinho = fucinho;
	}
	
	//metodo
	public void farejar() {
		System.out.println("O cachorro está farejando");
	}

	@Override
	public void fazerSom() {
		super.fazerSom();
		System.out.println("auau");
	}
	
}
