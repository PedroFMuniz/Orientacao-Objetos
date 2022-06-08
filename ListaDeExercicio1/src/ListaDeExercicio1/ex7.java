package ListaDeExercicio1;

import java.util.Scanner;

public class ex7 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Insira o produto:");
		String nome = s.next();
		System.out.println("Insira o valor do produto:");
		float valor = s.nextFloat();
		System.out.println("Insira a quantidade do produto:");
		int quantidade = s.nextInt();
		float total = valor*quantidade;
		float desconto = 0;
		if(quantidade <= 5) {
			desconto = 2;
		}else if(quantidade <= 10) {
			desconto = 3;
		}else {
			desconto = 5;
		}
		float pagamento = total - (total*(desconto/100));
		
		System.out.println(String.format("Total: R$ %.2f\nDesconto: R$ %.2f\nTotal a pagar: R$ %.2f", total, total*(desconto/100), pagamento));
	}
}
