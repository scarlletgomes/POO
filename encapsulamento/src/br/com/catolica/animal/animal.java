package br.com.catolica.animal;

public class animal {
	
	private String nome;
	private int peso;
	
	public animal(String nome, int peso) {
		super();
		this.nome = nome;
		this.peso = peso;
	}
	
	public void comer() {
		System.out.println("O animal está comendo");
	}
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public void exibirInfos() {
		System.out.println(nome);
		System.out.println(peso);

	}
}
