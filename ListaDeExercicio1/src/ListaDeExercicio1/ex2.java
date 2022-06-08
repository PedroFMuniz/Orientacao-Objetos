package ListaDeExercicio1;
import java.util.Arrays;
import java.util.Scanner;
import java.util.List;

public class ex2 {

	public static void main(String[] args) {
		List<String> vogais = Arrays.asList("a", "e", "i", "o", "u");
		List<String> consoantes = Arrays.asList("b", "c", "d", "f", "g", "h", "j", "k", "l", "m", "n", "p", "q", "r", "s", "t", "v", "x", "y", "w", "z");
		List<String> numeros = Arrays.asList("0", "1", "2", "3", "4", "5", "6", "7", "8", "9");	
		
		System.out.println("Digite um caracter: ");
		
		Scanner s = new Scanner(System.in);
		
		String c = s.next().toLowerCase();
		
		if(vogais.contains(c)) {
			System.out.println("Voce digitou uma vogal!");
		}else if(consoantes.contains(c)) {
			System.out.println("Voce digitou uma consoante!");
		}else if(numeros.contains(c)) {
			System.out.println("Voce digitou um numero!");
		}else {
			System.out.println("Voce digitou um caracter qualquer!");
		}
		s.close();
	}

}
