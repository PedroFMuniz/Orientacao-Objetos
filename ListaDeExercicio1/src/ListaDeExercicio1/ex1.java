package ListaDeExercicio1;
import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite a velocidade maxima da via(Em Km/h):");
		int vMax = s.nextInt();
		System.out.println("Digite a velocidade do motorista(Em Km/h):");
		int vMot = s.nextInt();
		int r = vMot - vMax;
		if(r <= 0) {
			System.out.println("Motorista dentro do limite");
		}else if(r <= 10) {
			System.out.println("O motorista ultrapassou o limite em " + r + " Km/h e tera que pagar R$50,00 de multa");
		}else if(r <= 30) {
			System.out.println("O motorista ultrapassou o limite em " + r + " Km/h e tera que pagar R$100,00 de multa");
		}else {
			System.out.println("O motorista ultrapassou o limite em " + r + " Km/h e tera que pagar R$200,00 de multa");
		}
		s.close();
	}

}
