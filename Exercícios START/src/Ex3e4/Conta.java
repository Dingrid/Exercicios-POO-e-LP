package Ex3e4;

public abstract class Conta {
	//atributos
	private int numero;
	private String titular;
	private double saldo;
	
	//getters and setters
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	//metodo
	public double rendimento() {
		return this.getSaldo();
	}
	
}
