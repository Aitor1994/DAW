package ejercicios_básicos;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		/* Lleva el método realizado en el ejercicio anterior a una nueva clase llamada “Calculadora”. Prueba su
           funcionamiento desde el método main con algún test.*/
		Scanner sc = new Scanner(System.in);
		
		//En el metodo main , creamos nuestro codigo normal, y llamamos a la funcion calculadora, que previamente hemos
		//creado con a su vez el metodo Sumar dentro para que nos de el resultado
		System.out.println("Introduce el primer numero: ");
		Integer num = sc.nextInt();
		System.out.println("Introduce el segundo numero: ");
		Integer num2 = sc.nextInt();
		
		//Una vez hemos pedido o creado los datos necesarios, llamamos a la funcion con el nombre que le hallamos dado y le 
		//datos entre () que hemos dicho al crear la funcion que necesitaria.A de coincidir el Tipo y el numero de datos
		//los nombres no es necesario al estar en metodos distintos.EL ORDEN DE LLAMADA ES IMPORTANTE TAMBIEN, HA DE SER
		//IGUAL AL ORDEN DE LOS DATOS CUANDO CREAMOS LA FUNCION.
		Integer resultado = calculadora(num, num2);
		System.out.println(resultado);
 sc.close();
	}

	public static Integer calculadora (int num, int num2) {
		Integer resultado = Ejercicio5.sumar(num, num2);
		return resultado;
		}
	}

