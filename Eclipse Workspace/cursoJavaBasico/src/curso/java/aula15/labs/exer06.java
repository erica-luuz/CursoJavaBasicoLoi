package curso.java.aula15.labs;

import java.util.Scanner;

public class exer06 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero:");
		int numero1 = scan.nextInt();
		System.out.println("Digite o segundo numero:");
		int numero2 = scan.nextInt();
		System.out.println("Digite o terceiro numero:");
		int numero3 = scan.nextInt();
		
		if (numero1 >= numero2 && numero1 >= numero3) {
			System.out.println("O maior numero é: " + numero1);
		}else if (numero2 >= numero1 && numero2 >= numero3) {
			System.out.println("O maior numero é: " + numero2);
		}else if (numero3 >= numero1 && numero3 >= numero2) {
			System.out.println("O maior numero é: " + numero3);
		}
		scan.close();

	}

}
