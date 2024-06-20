package br.com.scarllet.notas.impl;

import br.com.scarllet.notas.CalculoNotas;

public class Disciplina implements CalculoNotas{
	
	//atributos da classe Disciplina
	private String nomeMateria;
	private int numeroAulas;
	private double notaFinal;
	
	//construtor
	public Disciplina(String nomeMateria, int numeroAulas) {
		super();
		this.nomeMateria = nomeMateria;
		this.numeroAulas = numeroAulas;
		this.notaFinal = 0;
	}
	
	//get e set
	public String getNomeMateria() {
		return nomeMateria;
	}

	public void setNomeMateria(String nomeMateria) {
		this.nomeMateria = nomeMateria;
	}

	public int getNumeroAulas() {
		return numeroAulas;
	}

	public void setNumeroAulas(int numeroAulas) {
		this.numeroAulas = numeroAulas;
	}

	public double getNotaFinal() {
		return notaFinal;
	}

	public void setNotaFinal(double notaFinal) {
		this.notaFinal = notaFinal;
	}

	@Override
	public void calculoNotas(double n1, double n2, double n3) {
		notaFinal = (n1+n2+n3)/3;
	}
	
	@Override
	public void calculoNotas(double n1, double n2) {
		notaFinal = (n1+n2)/2;
	}

	@Override
	public void aprovacao(int frequencia) {
		double porcentagem = frequencia/ numeroAulas;
		if(this.notaFinal>=7 && porcentagem>=0.75) {
			System.out.println("Aprovado");
		}else {
			System.out.println("Reprovado");
		}
	}

	

}
