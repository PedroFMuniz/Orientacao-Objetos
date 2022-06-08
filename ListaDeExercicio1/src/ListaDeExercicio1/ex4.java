package ListaDeExercicio1;
import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite o dia da primeira data");
		int d1 = s.nextInt();
		System.out.println("Digite o mes da primeira data");
		int m1 = s.nextInt();
		System.out.println("Digite o ano da primeira data");
		int a1 = s.nextInt();
		System.out.println("Digite o dia da segunda data");
		int d2 = s.nextInt();
		System.out.println("Digite o mes da segunda data");
		int m2 = s.nextInt();
		System.out.println("Digite o ano da segunda data");
		int a2 = s.nextInt();
		boolean data1 = false;
		boolean iguais = false;
		String mx1 = "";
		String mx2 = "";
		
		if(a2-a1 < 0) {
			data1 = true;
		}else if(a2-a1 > 0) {
			data1 = false;
		}else {
			if(m2-m1 < 0) {
				data1 = true;
			}else if(m2-m1 > 0) {
				data1 = false;
			}else {
				if(d2-d1 < 0) {
					data1 = true;
				}else if(d2-d1 > 0) {
					data1 = false;
				}else {
					iguais = true;
				}
			}
		}
		
		if(m1 < 10) {
			mx1 = "0" + Integer.toString(m1);
		}else {
			mx1 = Integer.toString(m1);
		}
		if(m2 < 10) {
			mx2 = "0" + Integer.toString(m2);
		}else {
			mx2 = Integer.toString(m2);
		}
		
		if(iguais) {
			System.out.println(String.format("As datas sao iguais (%d/%s/%d)",d1,mx1,a1));
		}else {
			if(data1) {
				System.out.println(String.format("A primeira data e maior (%d/%s/%d)",d1,mx1,a1));
			}else {
				System.out.println(String.format("A segunda data e maior (%d/%s/%d)",d2,mx2,a2));
			}
		}
		s.close();
	}

}
