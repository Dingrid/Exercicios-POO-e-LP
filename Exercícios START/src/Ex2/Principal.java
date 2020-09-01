package Ex2;

public class Principal {

	public Principal() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		//instanciando
		Pessoa pes = new Pessoa("Ingrid","Rua das flores","2222-2222");
		System.out.println("APRESENTANDO PESSOA");
		System.out.println("Nome: " + pes.getNome());
		System.out.println("Endereço: " + pes.getEndereco());
		System.out.println("Telefone: " + pes.getTelefone());
	}

}
