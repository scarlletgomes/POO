package br.com.catolica.conta;

public class Conta {
	private int numero;
	private String titular;
	private double saldo;
	
	public Conta(int numero, String titular, double saldo) {
		super();
		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo;
	}
	
	public void verificarSaldo() {
		
		System.out.println("O saldo é de " + saldo);
		
	}
	
	public void depositar(double valor) {
		saldo+=valor;
	}
	
	public void sacar(double valor) {
		if(saldo>=valor)
		{
			saldo-=valor;
		}else {
			System.out.println("Saldo insuficiente");
		}
		
	}
}
