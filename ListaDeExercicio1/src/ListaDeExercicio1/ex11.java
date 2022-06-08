package ListaDeExercicio1;

import java.util.Arrays;
import java.util.Scanner;

public class ex11 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de alunos");
		int numero = s.nextInt();
		System.out.println("Digite a altura dos alunos separado por espaço");
		String[] alunos = s.nextLine().split(" ");
		String[] alunosOrd = alunos;
		Arrays.sort(alunosOrd);
		for(int i = 0; i < numero; i++) {
			if(alunos[i] == alunos)
		}
	}

}
