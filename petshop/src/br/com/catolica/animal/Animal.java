package br.com.catolica.animal;

public class Animal {
	//atributos
	private String nome;
	private int idade;
	private String tipoAnimal;
	
	//construtor
	public Animal(String nome, int idade, String tipoAnimal) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.tipoAnimal = tipoAnimal;
	}
	
	//metodos
	public void cadastro() {
			System.out.println("Animal cadastrado com sucesso!");
	}
	public void consulta() {
		System.out.println("Consulta agendada!");
	}
	
	public void fazerSom(){
		System.out.print("O animal está fazendo o som ...");
	}
	public void imprimirInfos() {
		System.out.println(nome);
		System.out.println(idade);
		System.out.println(tipoAnimal);
	}
	
	//get/set
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getTipoAnimal() {
		return tipoAnimal;
	}
	
	public void setTipoAnimal(String tipoAnimal) {
		this.tipoAnimal = tipoAnimal;
	}
	
}


