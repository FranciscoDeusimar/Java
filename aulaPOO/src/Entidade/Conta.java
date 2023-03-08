package Entidade;

public class Conta {
	
	private int numero;
	private String titular;
	private double saldo;
	
	public Conta(int numero, String titular, double saldo) {
	
		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo;
	}

	public Conta(int numero, String titular) {
		super();
		this.numero = numero;
		this.titular = titular;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}
	
 public void depositar(double valor) {
	this.saldo += valor;
}
 public void sacar(double valor) {
	this.saldo -= valor+5;
}
	public String toString() {
		return "Conta [numero=" + numero + ", titular=" + titular + ", saldo=" + saldo + "]";
	}
	
	

}
