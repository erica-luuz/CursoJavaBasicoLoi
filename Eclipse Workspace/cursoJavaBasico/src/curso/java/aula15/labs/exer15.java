package curso.java.aula15.labs;

import java.util.Scanner;

public class exer15 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite os três lados de um triangulo:");
		int lado1 = scan.nextInt();
		int lado2 = scan.nextInt();
		int lado3 = scan.nextInt();
		
		if (lado1 < (lado2 + lado3) || lado2 < (lado1 + lado3) || lado3 < (lado1 + lado2)) {
			if (lado1 == lado2 && lado2 == lado3) {
				System.out.println("Triângulo Equilátero");
			}
			if (lado1 != lado2 && lado2 != lado3) {
				System.out.println("Triângulo Escaleno");
			}
			if ((lado1 == lado2) || lado2 == lado3) {
				System.out.println("Triângulo Isósceles");
			}
		}else {
			System.out.println("Não é um triângulo");
		}
		scan.close();
	}

}
