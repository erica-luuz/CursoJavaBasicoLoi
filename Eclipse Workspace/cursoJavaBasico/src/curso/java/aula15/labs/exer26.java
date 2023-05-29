package curso.java.aula15.labs; // Concluir

import java.util.Scanner;

public class exer26 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Quantos litros foram vendido?");
		Double litros = scan.nextDouble();
		System.out.println("Qual o tipo de combustivel? (A-Alcool, G-Gasolina)");
		String A = scan.nextLine();
		Double precoAlcool = 1.90;
		Double precoGasolina = 2.50;
		if (A == "A") {
			if (litros <= 20) {
				Double desconto3 = precoAlcool * 3 / 100;
				Double valorComDesconto3 = 0.0;
				valorComDesconto3 = (valorComDesconto3 - desconto3);
				Double valorTotalAlcool = valorComDesconto3 * litros;
				System.out.println("O Valor a ser pago será: R$ " + valorTotalAlcool );
			}else if (litros > 20) {
				Double desconto5 = precoAlcool * 5 / 100;
				Double valorComDesconto5 = 0.0;
				valorComDesconto5 = valorComDesconto5 - desconto5;
				Double valorTotalAlcool = valorComDesconto5 * litros;
				System.out.println("O Valor a ser pago será: R$ " + valorTotalAlcool );
			}
		}
		String B = scan.nextLine();
		if (B == "B") {
			if (litros <= 20) {
				Double desconto4 = precoGasolina * 4 / 100;
				Double valorComDesconto4 = 0.0;
				valorComDesconto4 =	valorComDesconto4 - desconto4;
				Double valorTotalGasolina = valorComDesconto4 * litros;
				System.out.println("O Valor a ser pago será: R$ " + valorTotalGasolina );
			}else if (litros > 20) {
				Double desconto6 = precoGasolina * 6 / 100;
				Double valorComDesconto6 = 0.0;
				valorComDesconto6 = valorComDesconto6 - desconto6;
				Double valorTotalGasolina = valorComDesconto6 * litros;
				System.out.println("O Valor a ser pago será: R$ " + valorTotalGasolina );
			}
		scan.close();
		}
	}
}
