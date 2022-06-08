package ListaDeExercicio1;

public class ex9 {

	public static void main(String[] args) {
		System.out.println("Fahrenheit  |  Celcius");
		for(int i = 50; i < 66; i++) {
			int x = (i-32)/(9/5);
			System.out.println(String.format("  %d  |  %d  ", i, x));
		}

	}

}
