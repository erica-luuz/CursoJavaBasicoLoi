package curso.java.aula15.labs;// não consegui fazer

import java.util.Scanner;

public class exer24 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite dois numeros: ");
		int numero1 = scan.nextInt();
		int numero2 = scan.nextInt();
		
		System.out.println("Qual operação matemática você deseja realizar (soma, subtracao, multiplicacao, divisao):");
		String operacaoMatematica = scan.nextLine();
		
		switch (operacaoMatematica) {
		case "soma": System.out.println("O resultado da soma é: "+ (numero1 + numero2));break;
		case "subtracao": System.out.println("O resultado da subtração é: "+ (numero1 - numero2));break;
		case "multiplicacao": System.out.println("O resultado da multiplicação é: "+ (numero1 * numero2));break;
		case "divisao": System.out.println("O resultado da divisão é: "+ (numero1 / numero2));break;

		}

	}

}
