package br.com.catolica.animal;

public class Ave extends animal{
	
	private String bico;

	public Ave(String nome, int peso, String bico) {
		super(nome, peso);
		this.bico = bico;
	}
	
	public String getBico() {
		return bico;
	}

	public void setBico(String bico) {
		this.bico = bico;
	}
	public void voar() {
			System.out.println("A ave está voando");
		}
	@Override
	public void exibirInfos() {
		// TODO Auto-generated method stub
		super.exibirInfos();
		System.out.println(bico);
	}

	

}
