package br.com.catolica.main;

import br.com.catolica.animal.Cachorro;
import br.com.catolica.animal.Gato;
import br.com.catolica.animal.Passaro;

public class Main {

	public static void main(String[] args) {
		
		Cachorro objCachorro = new Cachorro("Doguin", 5, "Pitbull", "Curto");
		objCachorro.farejar();
		objCachorro.fazerSom();
				
		Passaro objPassaro = new Passaro("Loro", 2, "Papagaio", "Curto"); 	
		objPassaro.voar();
		objPassaro.fazerSom();
		
		Gato objGato = new Gato("Gatineo", 3, "Persa", "Amarelo");
		objGato.arranhar();
		objGato.fazerSom();
	}

}
