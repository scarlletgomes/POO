/*Projeto de sistema bancário com operações de saque, deposito e visualização de saldo*/

package br.com.catolica.main;

import br.com.catolica.conta.Conta;

public class Main {

	public static void main(String[] args) {
		Conta contaBancaria = new Conta(001,"Scarllet",100);
		contaBancaria.verificarSaldo();
		contaBancaria.depositar(500);
		contaBancaria.verificarSaldo();
		
	}

}
