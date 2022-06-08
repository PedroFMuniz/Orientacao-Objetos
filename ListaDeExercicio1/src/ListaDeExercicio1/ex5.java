package ListaDeExercicio1;

import java.util.Scanner;

public class ex5 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite o usuario:");
		int usuario = s.nextInt();
		
		if(usuario == 1234) {
			System.out.println("Digite a senha:");
			int senha = s.nextInt();
			
			if(senha == 9999) {
				System.out.println("Acesso permitido");
			}else {
				System.out.println("Senha incorreta");
			}
		}else {
			System.out.println("Usuario incorreto");
		}
		s.close();
	}

}
