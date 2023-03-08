package util;

public class Produto {
	private String nome;
	private double preco;
	private int quantidade;
	
	public Produto(String nome, double preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public Produto(String nome) {
		this.nome = nome;
	}
	
	public int getQuantidade() {
		return quantidade;
	}
	
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public double totalEstoque() {
		return preco*quantidade;
	}
	
	public int addProduto(int quant) {
		return this.quantidade += quant;
	}
	
	public int removeProduto(int quant) {
		return this.quantidade -= quant;
	}
	
	public String toString() {
		return "Produto " + nome + " - $ " + preco + " - " + quantidade + " unidades ";
	}
}
