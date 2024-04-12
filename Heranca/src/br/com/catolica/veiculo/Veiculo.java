package br.com.catolica.veiculo;

public class Veiculo {

	private String cor;
	private String marca;
	private String modelo;
	
	public Veiculo(String cor, String marca, String modelo) {
		this.cor = cor;
		this.marca = marca;
		this.modelo = modelo;
		
	}
	public void acelerar() {
		System.out.println("Acelerando..."+marca);
	}
	public void freiar() {
		System.out.println("Freiando..."+marca);
	}
}
