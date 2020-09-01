package Ex3e4;

public class Principal {

	public Principal() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		//instanciando
		ContaCorrente cc = new ContaCorrente();
		ContaPoupanca cp = new ContaPoupanca();
		
		//adicionando valores
		cc.setNumero(1);
		cc.setSaldo(12.60);
		cc.setTitular("Ingrid de Assis");
		
		cp.setNumero(2);
		cp.setSaldo(2500);
		cp.setTitular("Arnaldo Novais");
		
		
		//apresentando
		System.out.println("APRESENTANDO CONTA CORRENTE");
		System.out.println("Número: " + cc.getNumero());
		System.out.println("Titular: " + cc.getTitular());
		System.out.println("Saldo R$" + cc.getSaldo());
		System.out.println("Rendimento "+ cc.rendimento()+"%");
		System.out.println("Imposto "+ cc.calcularImposto()+"%");
		
		
		System.out.println("--------------------------");
		
		System.out.println("APRESENTANDO CONTA POUPANÇA");
		System.out.println("Número: " + cp.getNumero());
		System.out.println("Titular: " + cp.getTitular());
		System.out.println("Saldo R$" + cp.getSaldo());
		System.out.println("Rendimento "+ cp.rendimento()+"%");
		System.out.println("Imposto "+ cp.calcularImposto()+"%");

	}

}
