package curso.java.aula13;

public class CurtoCircuito {

	public static void main(String[] args) {
		Boolean verdadeiro = true;
		Boolean falso = false;
		Boolean resultado1 = falso & verdadeiro;
		Boolean resultado2 = falso && verdadeiro;
		
		System.out.println(resultado1);
		System.out.println(resultado2);
		
		int resultado = 1 + 1 - 1 + 1 * 1 / 1;
		System.out.println(resultado);
	}

}
