package programa;
import java.util.Scanner;
import util.Conversor;
import java.util.Locale;
public class Principal {
	
	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("Digite a cotação do dólar: ");
		double cotacaoDolar = sc.nextDouble();
		
		System.out.println("Digite a quantidade de dólares que deseja: ");
		double dolar = sc.nextDouble();
		
		double acrescento = 0.06;
		double valorFinal = Conversor.converte(cotacaoDolar, dolar);
		double valorIOF = Conversor.iof(acrescento, valorFinal);
		
		System.out.printf("Cotação: %.2fn%n", cotacaoDolar);
		System.out.printf("Valor em dólares: %.2fn%n", dolar);
		System.out.printf("Valor a pagar em reais: %.2fn%n", valorFinal);
		System.out.printf("Valor com acrescento IOF: %.2fn%n", valorIOF);
		
		sc.close();
	}

}
