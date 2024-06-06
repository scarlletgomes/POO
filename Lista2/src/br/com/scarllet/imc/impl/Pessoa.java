package br.com.scarllet.imc.impl;

import br.com.scarllet.imc.Calculavel;

public class Pessoa implements Calculavel {
	//atributos da classe, encapsulamento dos atributos
	private String nome;
	private int idade;
	private double peso;
	private double altura;
	//construtor da classe  
	public Pessoa(String nome, int idade, double peso, double altura) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.peso = peso;
		this.altura = altura;
	}

	//get e set (modifica e acessa atributos da classe)
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

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	//metodo da interface que calcula imc
	@Override
	public void calcularIMC() {
		double resultado = peso/(altura*altura);
		System.out.println("O resultado do IMC é "+ resultado);
		classificarIMC(resultado);
	}
	
	//metodo que classifica imc
	public void classificarIMC(double resultado) {
		if(resultado<18.5) {
			System.out.println("Abaixo do peso");
		}else if(resultado<24.90) {
			System.out.println("Peso normal");
		}else if(resultado<29.9) {
			System.out.println("Sobrepeso");	
		}else if(resultado<34.9) {
			System.out.println("Obesidade grau 1");
		}else if(resultado<39.9) {
			System.out.println("Obesidade grau 2");
		}else if(resultado>40) {
			System.out.println("Obesidade grau 3");
		}
	}
}
