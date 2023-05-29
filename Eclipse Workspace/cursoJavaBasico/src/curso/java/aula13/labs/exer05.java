package curso.java.aula13.labs;

import java.util.Scanner;

public class exer05 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um valor em metros:");
		Double metros = scan.nextDouble();
		// 1m = 100cm
		Double centimentros = 100.0;
		Double resultado = metros * centimentros;
		
		System.out.println("O numero digitado em metros, equivale a " + resultado + "cm");
		 
		scan.close();
	}

}
