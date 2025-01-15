package ejercicios_practico_repaso;

import java.util.Scanner;

public class ejercicio24 {

	public static void main(String[] args) {
		Integer numero = 0;
		Scanner sc = new Scanner (System.in);
		int suma = 0;
		do {
			System.out.println("Dame unnumero mayor a 0 ");
			numero = sc.nextInt();
			
		} while (numero <= 0);
		for (int i = 1; i <= numero; i++) {
			if (i%2==1) { //Es impar, i % 2 != 0
				suma = suma + i; //suma +=i;
				sc.close();
			}
			
			
		}

	}

}
