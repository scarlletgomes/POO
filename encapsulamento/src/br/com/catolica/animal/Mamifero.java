package br.com.catolica.animal;

public class Mamifero extends animal {
	
	private String pelo;

	public Mamifero(String pelo, int peso, String nome) {
		super(pelo, peso);
		this.pelo = pelo;
	}

	public void amamentar() {
		System.out.println("O animal está amamentando");
	}

	public String getPelo() {
		return pelo;
	}

	public void setPelo(String pelo) {
		this.pelo = pelo;
	}

	@Override
	public void exibirInfos() {
		// TODO Auto-generated method stub
		super.exibirInfos();
		System.out.println(pelo);
	}
	
	
}
