package Ex1;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		//utilizando scanner
		Scanner input = new Scanner(System.in);
		int i = input.nextInt();
		int f = input.nextInt();
		
		//iniciando o for
		for(int s=i; s<= f; s++)
		{
			if(s%2 == 1) { //se o resto da divisao do numero por 2 for 1 entao e impar, se nao par
				System.out.print(s+" ");
			}
				
		}

	}

}
