package br.com.catolica.main;

import br.com.catolica.animal.Ave;
import br.com.catolica.animal.Mamifero;

public class Main {

	public static void main(String[] args) {
		Ave objAve = new Ave("Galo",2,"Bico longo");
		objAve.voar();
		objAve.exibirInfos();
		
		objAve.setNome("Papagaio");
		objAve.setBico("Bico curto");
		
		
		System.out.println("===========");
		
		Mamifero objMamifero = new Mamifero("Cachorro", 10, "Cachorro caramelo");
		objMamifero.comer();
		objMamifero.exibirInfos();

	}

}
