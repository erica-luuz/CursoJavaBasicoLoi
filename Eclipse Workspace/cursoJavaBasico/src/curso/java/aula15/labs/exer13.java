package curso.java.aula15.labs;

import java.util.Scanner;

public class exer13 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um numero de 1 a 7:");
		int numero = scan.nextInt();
		
		switch (numero) {
		case 1: System.out.println("Domingo");break;
		case 2: System.out.println("Segunda");break;
		case 3: System.out.println("Terça");break;
		case 4: System.out.println("Quarta");break;
		case 5: System.out.println("Quinta");break;
		case 6: System.out.println("Sexta");break;
		case 7: System.out.println("Sabado");break;

		default:
			System.out.println("Valor Invalido");
			break;
		}
		scan.close();
	}
}
