package curso.java.aula13.labs;

import java.util.Scanner;

public class exer08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Quanto você ganha por hora? ");
		Double salarioPorHora = scan.nextDouble();
		System.out.println("Quantas horas você trabalhou neste mês: ");
		Double horasTrabalhadas = scan.nextDouble();
		
		Double salarioAhReceber = salarioPorHora * horasTrabalhadas;
		
		System.out.println("Neste mês você receberá: R$" + salarioAhReceber);
		
		scan.close();

	}

}
