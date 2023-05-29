package curso.java.aula13.labs;

import java.util.Scanner;

public class exer04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite as quatros notas bimestrais: ");
		Double nota1 = scan.nextDouble();
		Double nota2 = scan.nextDouble();
		Double nota3 = scan.nextDouble();
		Double nota4 = scan.nextDouble();
		
		Double media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		System.out.println("A média bimestral é: " + media);
		
		scan.close();

	}

}
