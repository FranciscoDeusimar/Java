package Programa;
import java.util.Scanner;
import util.Produto;
public class Principal {
	
	public static void main (String [] args) {
	Scanner sc = new Scanner(System.in);
	
	
	
	System.out.println("Informe os dados do produto: ");
	System.out.println("Nome: ");
	String nome = sc.next();
	System.out.println("Preço: ");
	Double preco = sc.nextDouble();
	System.out.println("Quantidade: ");
	int quantidade = sc.nextInt();
	
	Produto p1 = new Produto(nome); 
	Produto p2 = new Produto(nome, preco, quantidade);
	
	System.out.println();
	System.out.println("Dados do produto: ");
	System.out.println(p1);
	
	System.out.println();
	System.out.println("Quantos produtos deseja adicionar? ");
	quantidade = sc.nextInt();
	p1.addProduto(quantidade);
	
	System.out.println("Dados atualizados: ");
	System.out.println(p1);
	
	System.out.println();
	System.out.println("Quantos produtos deseja remover? ");
	quantidade = sc.nextInt();
	
	System.out.println("Dados atualizados: ");
	System.out.println(p1);
	
	sc.close();
	
	}
}
