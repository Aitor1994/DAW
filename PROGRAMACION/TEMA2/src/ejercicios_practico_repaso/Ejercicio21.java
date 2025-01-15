package ejercicios_practico_repaso;

import java.util.Scanner;

public class Ejercicio21 {

	public static void main(String[] args) {
		//Mejorar el ejercicio anterior para que el cuadrado sea de NxN. Es decir, solicitar al usuario un 
		//número (tendrá que ser mayor a 0, si no lo es, volver a solicitarlo) y dibujar el cuadrado con 
		//ese número de filas y columnas.
		Scanner sc = new Scanner(System.in);
		
		      for (int i = 0; i < 5; i++) {
					for (int j = 0; j < 5; j++) {
						if(i == j) {
							System.out.print("* ");
							
						}else {
							System.out.print("- ");
						}
						
					}
					System.out.println();
				}sc.close();
			}

		}
	
		

	
