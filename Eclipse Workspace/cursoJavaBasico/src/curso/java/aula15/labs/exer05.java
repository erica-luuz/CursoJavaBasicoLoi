package curso.java.aula15.labs;

import java.util.Scanner;

public class exer05 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite as notas: ");//Notas de 1 a 10
		Double nota1 = scan.nextDouble();
		Double nota2 = scan.nextDouble();
		
		Double media = (nota1 + nota2) / 2;
		if (media == 10) {
			System.out.println("Aprovado com distinção");
		}
		if (media >= 7 && media < 10){
			
			System.out.println("Aprovado");
			
		}else if (media < 7){
			System.out.println("Reprovado");
		}
		scan.close();
	}

}
