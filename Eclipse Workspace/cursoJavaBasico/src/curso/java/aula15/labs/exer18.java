package curso.java.aula15.labs;

import java.util.Scanner;

public class exer18 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite uma data no formato dd/mm/aaaa: ");
		int dia = scan.nextInt();
		int mes = scan.nextInt();
		int ano = scan.nextInt();
		
		if (dia > 0 && dia < 31) {
			if (mes > 0 && mes < 13) {
				if (ano > 1000 && ano < 10000) {
					System.out.println("Data válida");
				}else {
					System.out.println("Data Invalida");
				}
			}else {
				System.out.println("Data Invalida");
			}
		}else {
			System.out.println("Data Inválida");
		}
		scan.close();	
	}

}
