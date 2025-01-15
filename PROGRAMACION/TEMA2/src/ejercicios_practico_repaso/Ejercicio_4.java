package ejercicios_practico_repaso;

import java.util.Scanner;

public class Ejercicio_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Intorduzca un precio: ");
		Double precio = sc.nextDouble();
		System.out.println("Intorduzca las unidades que desea del producto: ");
		int unidades = sc.nextInt();
		Double iva=0.0;
	
		if (unidades >= 100 ) {
			iva = 0.40;
		    }
		if (unidades>= 25 && unidades <= 100) {
			iva = 0.20;
			}
		if (unidades >=10 && unidades<= 25) {
			iva = 0.10;
		}
		
		Double subtotal= precio*unidades;
		double totalDescuento = subtotal*iva;
		
		System.out.println("El precio con descuento seria de = "+ (subtotal - totalDescuento));
		sc.close();
      
}}
