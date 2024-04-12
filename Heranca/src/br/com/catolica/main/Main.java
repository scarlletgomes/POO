/*Exrecício para treinar herança em POO*/

package br.com.catolica.main;

import br.com.catolica.veiculo.Carro;
import br.com.catolica.veiculo.Moto;
import br.com.catolica.veiculo.Veiculo;

public class Main {

	public static void main(String[] args) {
		
		Carro uno = new Carro("azul", "Uno", "Fiat", 4, true, 4); 
		uno.acelerar();
		uno.ligarParabrisa();
		
		Moto biz = new Moto("Vermelha", "Honda", "Biz", true);
		biz.freiar();
		biz.abrirPeDeDescanso();
	}

}
