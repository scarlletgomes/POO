package br.com.catolica.animal;

public class Passaro extends Animal{
	
	//atributo
	private String bico;
	
	//construtor
	public Passaro(String nome, int idade, String tipoAnimal, String bico) {
		super(nome, idade, tipoAnimal);
		this.bico = bico;
	}

	//get/set
	public String getBico() {
		return bico;
	}

	public void setBico(String bico) {
		this.bico = bico;
	}
	
	//metodo
	public void voar() {
		System.out.println("O passaro está voando");
	}

	@Override
	public void fazerSom() {
		super.fazerSom();
		System.out.println("piu");
	}
	
	
}
