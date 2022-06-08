package ListaDeExercicio1;
import java.util.Scanner;
import java.lang.Math;

public class ex3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite o valor de a:");
		int a = s.nextInt();
		System.out.println("Digite o valor de b:");
		int b = s.nextInt();
		System.out.println("Digite o valor de c:");
		int c = s.nextInt();
		double delta = Math.pow(b, 2) - (4*a*c);
		if(delta == 0 && a != 0) {
			double raizes = (Math.sqrt(delta)+(b*-1))/(2*a);
			System.out.println("As raizes sao iguais a: " + raizes);
		}else if(delta > 0 && a != 0) {
			double raiz1 = ((b*-1)+Math.sqrt(delta))/(2*a);
			double raiz2 = ((b*-1)-Math.sqrt(delta))/(2*a);
			System.out.println("As raizes sao " + raiz1 + " e " + raiz2);
		}else {
			System.out.println("Nao e possivel calcular a raiz");
		}
		s.close();
	
	}

}
