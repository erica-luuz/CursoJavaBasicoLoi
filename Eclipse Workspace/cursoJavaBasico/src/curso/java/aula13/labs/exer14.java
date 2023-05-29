package curso.java.aula13.labs;

import java.util.Scanner;

public class exer14 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o tamanho do arquivo para downloads:");
		Double tamanhoDoArquivo = scan.nextDouble();
		System.out.println("Qual a velocidade de um link de internet:");
		Double velocidadeInternet = scan.nextDouble();
		
		Double tempo = tamanhoDoArquivo / velocidadeInternet;
				
		System.out.println("O tempo aproximada do downloads é: " + tempo);
		
		scan.close();

	}

}
