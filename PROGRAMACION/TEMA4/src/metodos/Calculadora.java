package metodos;

public class Calculadora {
	public static final String SUMAR  = "ADD";
	public static final String RESTAR  = "SUB";
	public static final String DIVIDIR  = "DIV";
	public static final String MULTIPLICAR  = "MUL";


	//Esto es una clase sin metodo main
	public static Integer suma(Integer num, Integer num2) {
		Integer suma = num + num2;
		return suma;
}
	public static Integer restar(Integer num, Integer num2) {
		Integer resta = num - num2;
		return resta;
	}
	public static Integer multiplicar(Integer num, Integer num2){
		Integer multiplicar = num * num2;
		return multiplicar;
	}
	public static Integer dividir(Integer num, Integer num2) {
		Integer dividir = num/num2;
		return dividir;
	}
	public static void calcular(String cadena, Integer num, Integer num2) {
		if (cadena.equals("ADD")) {
			System.out.println(suma(num,num2));
			
		}
		else if (cadena.equals("SUB")) {
			System.out.println(restar(num,num2));
		}
		else if (cadena.equals("DIV")) {
			System.out.println(dividir(num,num2));
		}
		else if (cadena.equals("MUL")) {
			System.out.println(multiplicar(num,num2));
		}
		else {
			System.out.println("Operacion no encontrada.");
		}
		
	}
}