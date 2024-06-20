package br.com.scarllet.notas.impl;

public class Matematica extends Disciplina{

	public Matematica(String nomeMateria, int numeroAulas) {
		super(nomeMateria, numeroAulas);
		
	}

	@Override
	public void aprovacao(int frequencia) {
		double porcentagem = frequencia/ getNumeroAulas();
		if(this.getNotaFinal()>=6 && porcentagem>=0.60) {
			System.out.println("Aprovado");
		}else {
			System.out.println("Reprovado");
		}
	}
	
	
}
