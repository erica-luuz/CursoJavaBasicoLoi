package curso.java.aula13.labs;

import java.util.Scanner;

public class exer06 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o raio do circulo: ");
		Double raio = scan.nextDouble();
		Double area = Math.PI * Math.pow(raio, 2);
		
		System.out.println("a área do círculo é: " + area);

		scan.close();
	}

}
