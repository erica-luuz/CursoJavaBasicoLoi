package curso.java.aula15.labs;

import java.util.Scanner;

public class exer02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com um numero:");
		int valor = scan.nextInt();
		
		if (valor >= 0) {
			System.out.println("Este valor é positivo");
		} else {
			System.out.println("Este valor é negativo");
		}
		scan.close();
	}
}


