package br.com.scarllet.main;
//importando classe pessoa
import br.com.scarllet.imc.impl.Pessoa;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//instancia da classe 
		Pessoa objPessoa = new Pessoa("Filipe", 30, 94, 1.73);
		
		objPessoa.calcularIMC();
		
		Pessoa scarllet = new Pessoa("Scarllet", 31, 69, 1.63);
		
		scarllet.calcularIMC();
		
	}

}
