package curso.java.aula15.labs;

import java.util.Scanner;

public class exer11 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o salário de um colaborador");
		Double salarioAtual = scan.nextDouble();
		
		//Eu resolvi assim:
		if (salarioAtual <= 280) {
			Double aumento20 = salarioAtual * 20 / 100;
			Double novoSalario = salarioAtual + aumento20;
			System.out.println("O salario atual é R$ " + salarioAtual + 
					" ,o pecentual aplicado é de 20%, o valor do aumento é R$ " +
					aumento20 + " O novo salario ja com aumento é R$ " + novoSalario);
		
		} else if (salarioAtual > 280 && salarioAtual <= 700) {
			Double aumento15 = salarioAtual * 15 / 100;
			Double novoSalario = salarioAtual + aumento15;
			System.out.println("O salario atual é R$ " + salarioAtual + 
					" ,o pecentual aplicado é de 15%, o valor do aumento é R$ " +
					aumento15 + " O novo salario ja com aumento é R$ " + novoSalario);
		
		} else if (salarioAtual > 700 && salarioAtual <= 1500) {
			Double aumento10 = salarioAtual * 10 / 100;
			Double novoSalario = salarioAtual + aumento10;
			System.out.println("O salario atual é R$ " + salarioAtual + 
					" ,o pecentual aplicado é de 10%, o valor do aumento é R$ " +
					aumento10 + " O novo salario ja com aumento é R$ " + novoSalario);
		
		}else if (salarioAtual > 1500) {
			Double aumento5 = salarioAtual * 5 / 100;
			Double novoSalario = salarioAtual + aumento5;
			System.out.println("O salario atual é R$ " + salarioAtual + 
					" ,o pecentual aplicado é de 5%, o valor do aumento é R$ " +
					aumento5 + " O novo salario ja com aumento é R$ " + novoSalario);
		}
		scan.close();
	}

}
