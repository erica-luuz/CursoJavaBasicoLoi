package curso.java.aula13.labs;

import java.util.Scanner;

public class exer03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero:");
		int numero1 = scan.nextInt();
		System.out.println("Digite o segundo numero:");
		int numero2 = scan.nextInt();
		int resultado = numero1 + numero2;
		System.out.println("A soma dos dois números é: " + resultado);

		scan.close();
	}

}
