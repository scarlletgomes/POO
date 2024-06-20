package br.com.scarllet.notas.impl;

public class Poo extends Disciplina{
	
	public Poo(String nomeMateria, int numeroAulas) {
		super(nomeMateria, numeroAulas);
	}

	
	@Override
	public void calculoNotas(double n1, double n2, double n3) {
		double resultado = n1*0.4+ n2*0.5 +n3*0.1;
		this.setNotaFinal(resultado);
	}
	
	
	
}
