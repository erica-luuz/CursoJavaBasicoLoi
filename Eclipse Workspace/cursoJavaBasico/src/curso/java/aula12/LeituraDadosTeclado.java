package curso.java.aula12;

import java.util.Scanner;

public class LeituraDadosTeclado {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		/*System.out.println("Digite seu nome completo: ");
		String nomeCompleto = scan.nextLine();
		System.out.println("Seu nome completo é: " + nomeCompleto);
		
		System.out.println("Digite seu primeiro nome: ");
		String primeiroNome = scan.next();
		System.out.println("Seu primeiro nome é: " + primeiroNome);
		
		System.out.println("Digite sua idade: ");
		int idade = scan.nextInt();
		System.out.println("Sua idade é: " + idade);
		
		System.out.println("Digite sua altura: ");
		Double altura = scan.nextDouble();
		System.out.println("Sua altura é: " + altura);*/
		
		System.out.println("Digite seu primeiro nome, idade, quantidade de fillhos, altura e se tem bichinho de estimação");
		String nome = scan.nextLine();
		int idade = scan.nextInt();
		byte quantidadeDeFilhos = scan.nextByte();
		float altura = scan.nextFloat();
		Boolean temPet = scan.nextBoolean();
		
		System.out.println("Você digitou os seguintes valores:");
		System.out.println("Seu nome é: " + nome);
		System.out.println("Sua idade é: " + idade);
		System.out.println("Sua quantidade de filhos: " + quantidadeDeFilhos);
		System.out.println("Sua altuta é: " + altura);
		System.out.println("Tem bichinho de estimação: " + temPet);
		
		scan.close();
	}

}
