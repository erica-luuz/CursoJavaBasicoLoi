package curso.java.aula13.labs;

import java.util.Scanner;

public class exer10 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em graus Celsius:");
		Double celsius = scan.nextDouble();
		
		Double farenheit = (celsius * 9 / 5) + 32;
		
		System.out.println("A temperatura em Graus Farenheit é: " + farenheit + "ºC");
		
		scan.close();

	}

}
