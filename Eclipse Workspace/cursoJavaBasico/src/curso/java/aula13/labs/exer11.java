package curso.java.aula13.labs;

import java.util.Scanner;

public class exer11 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um numero inteiro:");
		int numero1 = scan.nextInt();
		System.out.println("Digite outro numero inteiro:");
		int numero2 = scan.nextInt();
		System.out.println("Digite um numero real:");
		Double numero3 = scan.nextDouble();
		
		int resultado1 = numero1 * 2 + (numero2 / 2);
		Double resultado2 = numero1 * 3 + numero3;
		Double resultado3 = Math.pow(numero3, 3); //numero3 * numero3 * numero3;
		System.out.println("O produto do dobro do primeiro com metade do segundo: " + resultado1);
		System.out.println("A soma do triplo do primeiro com o terceiro: " + resultado2);
		System.out.println("O terceiro elevado ao cubo: " + resultado3);
		
		scan.close();
	}

}
