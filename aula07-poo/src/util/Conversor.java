package util;

public class Conversor {
	
	public static double converte(double cot, double dolar) {
		return dolar*cot;
		
	}
	
	public static double iof(double acrescento, double valorFinal) {
		double valorIOF = (valorFinal*acrescento)+valorFinal;
		return valorIOF;
	}
}
