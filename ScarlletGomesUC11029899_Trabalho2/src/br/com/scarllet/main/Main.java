//Scarllet Gomes Rodrigues UC11029899

package br.com.scarllet.main;

import br.com.scarllet.nota.impl.MatematicaDiscreta;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MatematicaDiscreta oMatematicaDiscreta = new MatematicaDiscreta(0, 25, "Matematica", 8, 0);
		
		oMatematicaDiscreta.aprovacao();
		oMatematicaDiscreta.calculoNota(0, 0);
	}

}
