package ListaDeExercicio1;

import java.util.Arrays;
import java.util.Scanner;

public class ex11 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite os numeros dos alunos:");
		String[] numeros = s.nextLine().split(" ");
		System.out.println("Digite as alturas dos alunos:");
		String[] alturas = s.nextLine().split(" ");
		
		Float[] alturasFloat = new Float[alturas.length];
		String[][] resultadoOrdenado = new String[numeros.length][alturas.length];
		
		for(int i = 0; i < alturas.length; i++) {
			alturasFloat[i] = Float.parseFloat(alturas[i]);
		}
		
		Arrays.sort(alturasFloat);
		
		for(int i = 0; i < alturasFloat.length; i++) {
			resultadoOrdenado[1][i] = alturasFloat[i]+"";
			for(int j = 0; j < numeros.length; j++) {
				if(resultadoOrdenado[1][i] == alturas[j]) {
					resultadoOrdenado[0][i] = numeros[j];
					numeros[j] = null;
					alturas[j] = null;
					break;
				}
			}
		}
		
		System.out.println(String.format("O aluno mais baixo e o %s com %sm", resultadoOrdenado[0][0], resultadoOrdenado[1][0]));
		System.out.println(String.format("O aluno mais alto e o %s com %sm", resultadoOrdenado[0][resultadoOrdenado.length-1], resultadoOrdenado[1][resultadoOrdenado.length-1]));
	}

}