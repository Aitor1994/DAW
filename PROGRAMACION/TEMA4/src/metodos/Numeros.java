package metodos;

public class Numeros {

	public static void sumarNumero(Integer array[], Integer num) {
		for (int i = 0; i < array.length; i++) {
			 num = num + i;
			 System.out.print(num + " + " );
		}
	}
}
