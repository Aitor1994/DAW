package ejercicios_practico_repaso;


import java.util.Random;
import java.util.Scanner;

public class ejercicio23 {

	public static void main(String[] args) {
		// Realizar un programa que simule el lanzamiento de un dado durante N veces. En
		// primer lugar,
		// solicitaremos al usuario cuántas veces quiere que lancemos el dado. A
		// continuación,
		// imprimiremos por consola el resultado de lanzar de manera aleatoria el dado
		// cada una de las
		// veces.
		Random random = new Random();
		Scanner sc = new Scanner(System.in);
		int numero1 = 0;
		int numero2 = 0;
		int numero3 = 0;
		int numero4 = 0;
		int numero5 = 0;
		int numero6 = 0;

		System.out.println("¿Cuantas veces quieres lanzar el dado?: ");

		int veces = sc.nextInt();

		for (int contador = 0; contador < veces; contador++) {
			Integer aleatorio = random.nextInt(1, 7);

			if (aleatorio == 1) {
				numero1++;
				System.out.println("El numero 1 ha salido:" + numero1);
				
			}
			if (aleatorio == 2) {
				numero2++;
			
				
			}
			if (aleatorio == 3) {
				numero3++;
				
				
			}
			if (aleatorio == 4) {
				numero4++;
				
				
			}
			if (aleatorio == 5) {
				numero5++;
				
				
			}
			if (aleatorio == 6) {
				numero6++;
				
			}
		}
		
		System.out.println("El numero 6 ha salido:" + numero6);
		System.out.println("El numero 5 ha salido:" + numero5);
		System.out.println("El numero 4 ha salido:" + numero4);
		System.out.println("El numero 3 ha salido:" + numero3);
		System.out.println("El numero 2 ha salido:" + numero2);
		System.out.println("El numero 1 ha salido:" + numero1);
sc.close();
	}

}
