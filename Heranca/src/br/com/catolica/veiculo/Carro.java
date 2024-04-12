package br.com.catolica.veiculo;

public class Carro extends Veiculo {	

	private int qntPortas;
	private boolean cinto;
	private int qntTapete;
	private String marca;
	
	public Carro(String cor, String marca, String modelo, int qntPortas, boolean cinto, int qntTapete) {
		super(cor, marca, modelo);	
		
		this.qntPortas = qntPortas;
		this.cinto = cinto;
		this.qntTapete = qntTapete;
		this.marca = marca;
	}
	
	public void ligarParabrisa() {
		System.out.println("Ligando parabrisa..."+marca);
	}
}
