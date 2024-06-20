package br.com.scarllet.notas;

public interface CalculoNotas {
	
	public void calculoNotas(double n1, double n2, double n3);
	//sobrecarga metodo calculoNota, polimorfismo
	public void calculoNotas(double n1, double n2);
	public void aprovacao(int frequencia);

}
