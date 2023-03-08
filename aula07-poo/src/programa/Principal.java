package programa;
import java.util.Scanner;
import util.Conversor;
import java.util.Locale;
public class Principal {
	
	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("Digite a cota��o do d�lar: ");
		double cotacaoDolar = sc.nextDouble();
		
		System.out.println("Digite a quantidade de d�lares que deseja: ");
		double dolar = sc.nextDouble();
		
		double acrescento = 0.06;
		double valorFinal = Conversor.converte(cotacaoDolar, dolar);
		double valorIOF = Conversor.iof(acrescento, valorFinal);
		
		System.out.printf("Cota��o: %.2fn%n", cotacaoDolar);
		System.out.printf("Valor em d�lares: %.2fn%n", dolar);
		System.out.printf("Valor a pagar em reais: %.2fn%n", valorFinal);
		System.out.printf("Valor com acrescento IOF: %.2fn%n", valorIOF);
		
		sc.close();
	}

}
