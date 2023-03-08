package Programa;

import java.util.Scanner;
import java.util.Locale;
import Entidade.Conta;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Conta c;
		
		System.out.println("Digite o número da sua conta: ");
		int num = sc.nextInt();

		System.out.println("Digite o nome do titular: ");
		String nome = sc.next();

		System.out.println("Deseja fazer um depósito inicial? ");
		String resp = sc.next();

		if (resp.equals("s")) {
			System.out.println("Quanto deseja depositar? ");
			double depositoInicial = sc.nextDouble();

			c = new Conta(num, nome, depositoInicial);

		} else {
			c = new Conta(num, nome);
		}
		System.out.println(c);

		System.out.println("Digite o valor para depósito: ");
		double valor = sc.nextDouble();
		c.depositar(valor);

		System.out.println(c);

		System.out.println("Digite o valor a sacar: ");
		valor = sc.nextDouble();
		c.sacar(valor);
		System.out.println(c);
		sc.close();
	}
}
