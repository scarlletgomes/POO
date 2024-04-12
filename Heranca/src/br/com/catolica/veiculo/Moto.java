package br.com.catolica.veiculo;

public class Moto extends Veiculo {
	
	private boolean descanso;
	private String marca;
	
	public Moto(String cor, String marca, String modelo, boolean descanso) {
		super(cor, marca, modelo);
		
		this.descanso = descanso;
		this.marca = marca;
	}
	public void abrirPeDeDescanso() {
		System.out.println("Abrindo pé de descanso da "+descanso);
	
	}
}
