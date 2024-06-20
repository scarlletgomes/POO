package br.com.scarllet.main;

import br.com.scarllet.notas.impl.Disciplina;
import br.com.scarllet.notas.impl.Matematica;
import br.com.scarllet.notas.impl.Poo;

public class Main {

	public static void main(String[] args) {
		Disciplina oDisciplina = new Disciplina("Português", 18);
		oDisciplina.calculoNotas(6, 7, 9);
		oDisciplina.aprovacao(18);
		
		Poo oPoo = new Poo("Poo", 20);
		oPoo.calculoNotas(6, 7, 9);
		oPoo.aprovacao(20);	
		
		Matematica oMatematica = new Matematica("Matematica", 18);
		oMatematica.calculoNotas(6, 6, 6);
		oMatematica.aprovacao(18);

	}

}
