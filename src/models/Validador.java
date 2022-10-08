package models;

public class Validador {
	public boolean verifica(String operacao) {
		return operacao.matches("[=-]?\\d*(\\.\\d+)?");
	}
	public double transformaEmDouble(String operacao) {
		return Double.parseDouble(operacao);
	}
}
