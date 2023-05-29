package curso.java.aula13.labs;

import java.util.Scanner;

public class exerc02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		int numero = scan.nextInt();
		System.out.println("O número informado foi " + numero);
				
		scan.close();
	}

}
