package ListaDeExercicio1;

import java.util.Scanner;

public class ex8 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		
		String[] numeros = {"Um", "Dois", "Três", "Quatro", "Cinco", "Seis", "Sete", "Oito", "Nove", "Dez"};
		System.out.println("Digite um numero entre 1 e 10:");
		int numero = s.nextInt();
		if(numero > 0 && numero < 11) {
			System.out.println(numeros[numero-1]);
		}else {
			System.out.println("Numero invalido");
		}
		s.close();
	}

}
