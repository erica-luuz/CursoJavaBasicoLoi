package curso.java.aula15.labs;  // terminar, muito dificil

import java.util.Scanner;

public class exer25 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Telefonou para a vitima? (true ou false)");
		Boolean telefonou = scan.nextBoolean();
		System.out.println("Esteve no local do crime? ( true ou false)");
		Boolean esteveNoLocal = scan.nextBoolean();
		System.out.println("Mora perto da vitima? ( true ou false)");
		Boolean moraPerto = scan.nextBoolean();
		System.out.println("Devia para a vitima? (true ou false)");
		Boolean devia = scan.nextBoolean();
		System.out.println("Ja trabalhou com a vitima? (true ou false)");
		Boolean trabalhouComAhVitima = scan.nextBoolean();
		
		if (telefonou == true && esteveNoLocal == true) {
			System.out.println("Suspeita");
		}else if (telefonou == true && moraPerto == true) {
			System.out.println("Suspeita");
		}else if (telefonou == true && devia == true) {
			System.out.println("Suspeita");
		}else if ( telefonou == true && trabalhouComAhVitima == true) {
			System.out.println("Suspeita");
		}
		if (esteveNoLocal == true && moraPerto == true) {
			System.out.println("Suspeita");
		}else if (esteveNoLocal == true && moraPerto == true) {
			System.out.println("Suspeita");
		}else if (esteveNoLocal == true && devia == true) {
			System.out.println("Suspeita");
		}else if (esteveNoLocal == true && trabalhouComAhVitima == true)
			System.out.println("Suspeita");
		if (moraPerto == true && devia == true) {
			System.out.println("Suspeita");
		}else if (moraPerto == true && trabalhouComAhVitima == true) {
			System.out.println("Suspeita");
		}
		if (devia == true && trabalhouComAhVitima == true) {
			System.out.println("Suspeita");
		}
		
		

	}

}
