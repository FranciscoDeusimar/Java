package Programa;
import java.util.Scanner;
import util.Aluno;
public class Principal {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		String nome = sc.next();
		System.out.println("Digite sua série: ");
		String serie = sc.next();
		System.out.println("Digite a primeira nota: ");
		double n1 = sc.nextDouble();
		System.out.println("Digite a segunda nota: ");
		double n2 = sc.nextDouble();
		
		Aluno a1 = new Aluno(nome, serie, n1, n2);
		
	}
}
