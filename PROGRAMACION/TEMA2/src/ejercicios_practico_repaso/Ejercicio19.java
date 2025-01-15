package ejercicios_practico_repaso;
		import java.util.Scanner;

		public class Ejercicio19 {

			public static void main(String[] args) {
				// Conversor de € a pesetas :
				Scanner sc = new Scanner(System.in);
				int numero1;
				double euros;
				double pesetas;
				do {
					System.out.println("Eliga la opcion que vaya a necesitar: \r\n" + "1 - Pasar de Pesetas a Euros \r\n"
							+ "2 - Pasar de Euros a Pesetas \r\n" + "3 - Salir ");
					numero1 = sc.nextInt();
					if (numero1 == 1) {
						System.out.println("Introduzca la cantidad en €: ");
						euros = sc.nextInt();
						pesetas = euros * 166.386;
						System.out.println(euros + "€" + " ,serian: " + pesetas + " pesetas. \r\n");
					} else if (numero1 == 2) {
						System.out.println("Introduzca la cantidad en Pesetas: ");
						pesetas = sc.nextDouble();
						euros = pesetas * 0.00601;
						System.out.println(pesetas + "pesetas" + " ,serian: " + euros + " €. \r\n");
					} else if (numero1 == 3) {
						System.out.println("Ha elegido la opcion: Cerrar programa.");
					} else {
						System.out.println("Error, introduzca un numero valido. \r\n");
					}

				} while (numero1!=3);
		sc.close();
			}

		}

	
