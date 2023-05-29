package curso.java.aula13.labs;

import java.util.Scanner;

public class exer09 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em graus Farenheit:");
		Double farenheit = scan.nextDouble();
		
		Double celsius = 5 * (farenheit - 32) / 9;
		
		System.out.println("A temperatura em Graus Celsius é: " + celsius + "ºC");
		
		scan.close();
		
	}

}
