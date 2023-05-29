package curso.java.aula15.labs;

import java.util.Scanner;

public class exer01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um numero:");
		int numero01 = scan.nextInt();
		System.out.println("Digite outro numero:");
		int numero02 = scan.nextInt();
		
		if(numero01 > numero02) {
			System.out.println("O numero maior é: " + numero01);
		}else {
			System.out.println("O numero maior é: " + numero02);
		}
		scan.close();
	}

}

