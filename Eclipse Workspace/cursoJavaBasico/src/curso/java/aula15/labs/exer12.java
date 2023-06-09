package curso.java.aula15.labs;

import java.util.Scanner;

public class exer12 {

	public static void main(String[] args) {
		
		Scanner scan =  new Scanner(System.in);
		
		System.out.println("Digite o salário que o colaborador recebe por hora:");
		Double salarioHora = scan.nextDouble();
		System.out.println("Digite a quantidade de horas trabalhadas neste mês:");
		Double horasTrabalhadas = scan.nextDouble();
		
		Double salarioBruto = salarioHora * horasTrabalhadas;
		Double inss = salarioBruto * 10 / 100;
		Double fgts = salarioBruto * 11 / 100;
		// Calculo de Imposto de Renda
		if (salarioBruto <= 900) {
			System.out.println("Salário Bruto: " + salarioHora + " * " + horasTrabalhadas +"   : R$ " + salarioBruto);
			System.out.println(" - IR (5%) isento");
			System.out.println(" - INSS (10%)                : R$ " + inss);
			System.out.println("FGTS (11%)                   : R$ " + fgts);
			System.out.println("Total de descontos           : R$ " + inss);
			System.out.println("Salário Liquido              : R$ " + (salarioBruto - inss));
			
		}else if (salarioBruto > 900 && salarioBruto <= 1500){
			Double descontoIR5 = salarioBruto * 5 / 100;
			System.out.println("Salário Bruto: " + salarioHora + " * " + horasTrabalhadas +"   : R$ " + salarioBruto);
			System.out.println(" - IR (5%)                   : R$ " + descontoIR5);
			System.out.println(" - INSS (10%)                : R$ " + inss);
			System.out.println("FGTS (11%)                   : R$ " + fgts);
			System.out.println("Total de descontos           : R$ " + (inss + descontoIR5));
			System.out.println("Salário Liquido              : R$ " + (salarioBruto - inss - descontoIR5));
			
		}else if (salarioBruto > 1500 && salarioBruto <= 2500){
			Double descontoIR10 = salarioBruto * 10 / 100;
			System.out.println("Salário Bruto: " + salarioHora + " * " + horasTrabalhadas +"   : R$ " + salarioBruto);
			System.out.println(" - IR (10%)                  : R$ " + descontoIR10);
			System.out.println(" - INSS (10%)                : R$ " + inss);
			System.out.println("FGTS (11%)                   : R$ " + fgts);
			System.out.println("Total de descontos           : R$ " + (inss + descontoIR10));
			System.out.println("Salário Liquido              : R$ " + (salarioBruto - inss - descontoIR10));
		}
		else if (salarioBruto > 2500){
			Double descontoIR20 = salarioBruto * 20 / 100;
			System.out.println("Salário Bruto: " + salarioHora + " * " + horasTrabalhadas +"   : R$ " + salarioBruto);
			System.out.println(" - IR (20%)                  : R$ " + descontoIR20);
			System.out.println(" - INSS (10%)                : R$ " + inss);
			System.out.println("FGTS (11%)                   : R$ " + fgts);
			System.out.println("Total de descontos           : R$ " + (inss + descontoIR20));
			System.out.println("Salário Liquido              : R$ " + (salarioBruto - inss - descontoIR20));
		}
		scan.close();
	}

}
