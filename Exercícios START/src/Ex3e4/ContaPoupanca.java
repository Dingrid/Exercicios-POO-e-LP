package Ex3e4;

public class ContaPoupanca extends Conta implements Imposto{
	
	public double rendimento() {
		return this.getSaldo() * 0.05;
	}

	@Override
	public double calcularImposto() {
		return this.rendimento() * 0.1;
	}
}
