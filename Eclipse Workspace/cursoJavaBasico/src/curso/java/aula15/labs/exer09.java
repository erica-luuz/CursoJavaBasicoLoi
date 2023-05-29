package curso.java.aula15.labs;

import java.util.Scanner;

public class exer09 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite  o 1º numero:");
		int numero1 = scan.nextInt();
		System.out.println("Digite  o 2º numero:");
		int numero2 = scan.nextInt();
		System.out.println("Digite  o 3º numero:");
		int numero3 = scan.nextInt();
				
		if(numero1 < numero2 && numero2 < numero3) {
			System.out.println(numero3);
			System.out.println(numero2);
			System.out.println(numero1);
		}
		if(numero1 < numero3 && numero3 < numero2) {
			System.out.println(numero2);
			System.out.println(numero3);
			System.out.println(numero1);
		}
		if(numero2 < numero1 && numero1 < numero3) {
			System.out.println(numero3);
			System.out.println(numero1);
			System.out.println(numero2);
		}
		if(numero2 < numero3 && numero3 < numero1) {
			System.out.println(numero1);
			System.out.println(numero3);
			System.out.println(numero2);
		}
		if(numero3 < numero1 && numero1 < numero2) {
			System.out.println(numero2);
			System.out.println(numero1);
			System.out.println(numero3);
		}
		if(numero3 < numero2 && numero2 < numero1) {
			System.out.println(numero1);
			System.out.println(numero2);
			System.out.println(numero3);
		}
		scan.close();
	}

}
