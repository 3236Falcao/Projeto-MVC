package model;

public class CalculadoraModel {

	private int resultado;
	
	public void somar(int numero1, int numero2) {
		resultado = numero1 + numero2;
	}
	
	public int retornaResultado() {
		return resultado;
	}
	
}
