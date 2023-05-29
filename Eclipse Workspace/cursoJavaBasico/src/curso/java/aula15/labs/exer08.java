package curso.java.aula15.labs;

import java.util.Scanner;

public class exer08 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o valor do 1º produto:");
		Double valorProduto1 = scan.nextDouble();
		System.out.println("Digite o valor do 2º produto:");
		Double valorProduto2 = scan.nextDouble();
		System.out.println("Digite o valor do 2º produto:");
		Double valorProduto3 = scan.nextDouble();
		
		if (valorProduto1 < valorProduto2 && valorProduto1 < valorProduto3) {
			System.out.println("Levar este produto, pois ele é o mais em conta, seu valor é: R$  " + valorProduto1 );
		}
		if (valorProduto2 < valorProduto1 && valorProduto2 < valorProduto3) {
			System.out.println("Levar este produto, pois ele é o mais em conta, seu valor é: R$  " + valorProduto2 );
		}
		if (valorProduto3 < valorProduto2 && valorProduto3 < valorProduto1) {
			System.out.println("Levar este produto, pois ele é o mais em conta, seu valor é: R$  " + valorProduto3 );
		}
		scan.close();
	}

}
