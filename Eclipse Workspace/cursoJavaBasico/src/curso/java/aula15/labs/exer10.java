package curso.java.aula15.labs;

import java.util.Scanner;

public class exer10 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Em qual turno você estuda? Digite M- Matutino ou V-Vespertino ou N-Noturno:");
		String turno = scan.nextLine();
		
		switch (turno) {
		case "m":
		case "M": System.out.println("Bom Dia!"); break;
		case "v":
		case "V": System.out.println("Boa Tarde!");break;
		case "n":
		case "N": System.out.println("Boa Noite!");break;
		default:System.out.println("Valor Inválido");
		}
		  // OU ASSIM:
		 if (turno.equalsIgnoreCase("m")) {
			System.out.println("Bom dia!");
		} else if (turno.equalsIgnoreCase("v")) {
			System.out.println("Boa tarde!");
		}else if (turno.equalsIgnoreCase("n")) {
			System.out.println("Boa noite!");
		}else {
			System.out.println("Valor inválido");
		}
		scan.close();
	}
}
