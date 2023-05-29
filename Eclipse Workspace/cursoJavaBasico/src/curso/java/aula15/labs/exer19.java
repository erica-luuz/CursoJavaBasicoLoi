package curso.java.aula15.labs; // Faltou fazer esse, não consegui fazer

import java.util.Scanner;

public class exer19 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um numero inteiro ate 1000:");
		int numero = scan.nextInt();
		
		int unidades = (numero < 0 && numero < 10);
		
		if (numero >= 0 && numero < 10) {
			System.out.println(numero + " unidades");
			if (numero > 10 && numero < 100) {
				System.out.println( numero + " dezenas");
			}
		}

	}

}
