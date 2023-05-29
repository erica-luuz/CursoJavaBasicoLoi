package curso.java.aula15.labs;

import java.util.Scanner;

public class exer20 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite as 3 notas de um aluno:");
		Double nota1 = scan.nextDouble();
		Double nota2 = scan.nextDouble();
		Double nota3 = scan.nextDouble();
		
		Double media = (nota1 + nota2 + nota3) / 3;
		
		if (media >= 7 && media < 9) {
			System.out.println("Aprovado");
		}else if (media < 7 ) {
			System.out.println("Reprovado");
		}else if (media == 10) {
			System.out.println("Aprovado com Distinção");
		}
		scan.close();	 
	}

}
