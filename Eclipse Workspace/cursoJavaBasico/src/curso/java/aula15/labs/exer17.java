package curso.java.aula15.labs;

import java.util.Scanner;

public class exer17 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um ano:");
		int ano = scan.nextInt();
		
		if (ano % 4 == 0) {
			System.out.println("Este ano é Bissexto");
		}else if (ano % 100 == 0) {
				if (ano % 400 == 0) {
					System.out.println("Este ano é Bissexto");
				}
		}else {
			System.out.println("Não é Bissexto");
		}
		scan.close();
	}

}
