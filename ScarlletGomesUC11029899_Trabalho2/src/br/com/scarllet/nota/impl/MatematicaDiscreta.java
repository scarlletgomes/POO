//Scarllet Gomes Rodrigues UC11029899

package br.com.scarllet.nota.impl;

public class MatematicaDiscreta extends Disciplina{

	private double lista;
	private double notaMatematica;

	public double getNotaMatematica() {
		return notaMatematica;
	}

	public void setNotaMatematica(double notaMatematica) {
		this.notaMatematica = notaMatematica;
	}

	public double getLista() {
		return lista;
	}

	public void setLista(double lista) {
		this.lista = lista;
	}

	public MatematicaDiscreta(double media, int frequencia, String nomeMateria, double lista, double notaMatematica) {
		super(media, frequencia, nomeMateria);
		this.lista = lista;
		this.notaMatematica = notaMatematica;
	}

	@Override
	public void calculoNota(double n1, double n2) {
		// TODO Auto-generated method stub
		super.calculoNota(n1, n2);
	}
	
	public void calculoMatematica() {
		notaMatematica = getMedia() + lista/2;
		if(notaMatematica>7 && getFrequencia()>20) {
			System.out.println("Aluno aprovado na matéria "+getNomeMateria());
		}else {
			System.out.println("Aluno reprovado na matéria "+getNomeMateria());
		}
	}


	
	

}
