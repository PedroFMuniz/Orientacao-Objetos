package ListaDeExercicio1;

public class ex10 {

	public static void main(String[] args) {
		int x = 1;
		int soma = 0;
		for(int i = 1; i < 100; i += 2) {
			soma += i/x;
			x++;
		}
		System.out.println(soma);
	}

}
