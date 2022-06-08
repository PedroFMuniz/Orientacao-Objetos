package ListaDeExercicio1;

import java.util.Scanner;

public class ex6 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite um numero");
		int n = s.nextInt();
		boolean p = true;
		
		for(int i = 2; i< n; i++) {
			if(n%i == 0) {
				p = false;
				break;
			}
		}
		
		if(p) {
			System.out.println("O numero e primo");
		}else {
			System.out.println("O numero nao e primo");
		}
		s.close();
	}
}
