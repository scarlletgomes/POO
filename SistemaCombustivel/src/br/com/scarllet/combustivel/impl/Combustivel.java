package br.com.scarllet.combustivel.impl;

import br.com.scarllet.combustivel.CalculoCombustivel;

public class Combustivel implements CalculoCombustivel{

	@Override
	public void calculaPreco(double etanol, double gasolina, boolean agradecer) {
		// TODO Auto-generated method stub
		double resultado = etanol/gasolina;
		if(resultado<0.70) {
		System.out.println("Abasteça com etanol");
		}else {
			System.out.println("Abasteça com gasolina");
		}
	}

	@Override
	public void agradecer(boolean agradecer) {
		// TODO Auto-generated method stub
		if(agradecer==true) {
			System.out.println("Obrigada por abastecer conosco");
		}else {
			System.out.println("Aeducação mandou lembranças");
		}

	}
	
	

	

}

