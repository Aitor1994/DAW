package ejercicios;

public class Ejercicio16 {

	public static void main(String[] args) {
		//Es el mismo ejercicio que el 5 pero con FOR:
		
		Integer resultadoSuma = 0;
		
		for (int contador = 0; contador <= 1000; contador++) {
			resultadoSuma += contador; //ResultadoSuma = resultadoSuma + Contador
			
			System.out.println("Nº de veces sumados: "+ contador);
			
			System.out.println(resultadoSuma);
			
		}

	}

}
