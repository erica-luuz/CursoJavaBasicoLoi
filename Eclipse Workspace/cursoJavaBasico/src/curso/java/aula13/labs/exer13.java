package curso.java.aula13.labs;

import java.util.Scanner;

public class exer13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Quanto você ganha por hora? ");
		Double salarioPorHora = scan.nextDouble();
		System.out.println("Quantas horas você trabalhou neste mês: ");
		Double horasTrabalhadas = scan.nextDouble();
		
		Double salarioBruto = salarioPorHora * horasTrabalhadas;
		Double impostoDeRenda = (salarioBruto / 100) * 11;
		Double inss = (salarioBruto / 100) * 8;
		Double sindicato = (salarioBruto / 100) * 5;
		Double salarioliquido = salarioBruto - impostoDeRenda - inss - sindicato;
		
		System.out.println("O salário bruto é: R$" + salarioBruto);
		System.out.println("O valor pago do imposto de renda é: R$" + impostoDeRenda);
		System.out.println("O valor pago do inss é: R$" + inss);
		System.out.println("O valor pago do sindicato é: R$" + sindicato);
		System.out.println("O salário liquido é: R$" + salarioliquido);
		
		scan.close();

	}

}
