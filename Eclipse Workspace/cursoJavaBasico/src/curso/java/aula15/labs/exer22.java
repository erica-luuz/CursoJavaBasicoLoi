package curso.java.aula15.labs;

import java.util.Scanner;

public class exer22 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um numero inteiro:");
		int numero = scan.nextInt();
		
		if (numero % 2 == 0) {
			System.out.println("Este numero é par");
		}else {
			System.out.println("Este numero é ímpar");
		}
		scan.close();
	}

}
