package curso.java.aula15.labs;

import java.util.Scanner;

public class exer04 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite uma letra:");
		String letra = scan.nextLine();
		
		switch (letra) {
		case "a": 
		case "e": 
		case "i": 
		case "o": 
		case "u": System.out.println("Vogal");break;
		default:
			System.out.println("Consoante");
			
		}
		scan.close();
	}
}
