package curso.java.aula13.labs;

import java.util.Scanner;

public class exer07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a medida de uns dos lados do quadrado:");
		Double lado = scan.nextDouble();
		
		Double area = Math.pow(lado, 2);
		Double dobroArea = area * 2;
		
		System.out.println("A área do quadrado é: " + area);
		System.out.println("O dobro da área é: " + dobroArea);
		
		scan.close();

	}
	

}
