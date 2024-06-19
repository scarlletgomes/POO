//Scarllet Gomes Rodrigues UC11029899

package br.com.scarllet.nota.impl;

import br.com.scarllet.nota.CalculoNota;

public class Disciplina implements CalculoNota{

	private double media;
	private int frequencia;
	private String nomeMateria;
	
	public Disciplina(double media, int frequencia, String nomeMateria) {
		super();
		this.media = media;
		this.frequencia = frequencia;
		this.nomeMateria = nomeMateria;
	}

	public String getNomeMateria() {
		return nomeMateria;
	}

	public void setNomeMateria(String nomeMateria) {
		this.nomeMateria = nomeMateria;
	}
	
	public double getMedia() {
		return media;
	}

	public void setMedia(double media) {
		this.media = media;
	}

	public int getFrequencia() {
		return frequencia;
	}

	public void setFrequencia(int frequencia) {
		this.frequencia = frequencia;
	}

	@Override
	public void calculoNota(double n1, double n2) {
		// TODO Auto-generated method stub
		media = n1+n2/2;
		System.out.println("A sua média é "+media);
	}
	
	public void aprovacao() {
		if(media>7 && frequencia>20) {
			System.out.println("Aluno aprovado na matéria "+nomeMateria);
		}else {
			System.out.println("Aluno reprovado na matéria "+nomeMateria);
		}
}
	}
