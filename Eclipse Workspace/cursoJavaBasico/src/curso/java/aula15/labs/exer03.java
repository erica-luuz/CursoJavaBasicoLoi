package curso.java.aula15.labs;

import java.util.Scanner;

public class exer03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite uma letra, F para feminino, M para maculino");
		String letra = scan.nextLine();
		
		switch (letra) {
		case "F": System.out.println("Sexo Feminino"); break;
		case "M": System.out.println("Sexo Masculino"); break;

		default: System.out.println("Sexo inváilido");
		}
		scan.close();

	}

}
