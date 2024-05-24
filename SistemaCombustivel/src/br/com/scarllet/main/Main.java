package br.com.scarllet.main;

import br.com.scarllet.combustivel.impl.Etanol;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Etanol objEtanol = new Etanol();
		objEtanol.calculaPreco(3.89,9.80,true);
		objEtanol.agradecer(true);
	}

}
