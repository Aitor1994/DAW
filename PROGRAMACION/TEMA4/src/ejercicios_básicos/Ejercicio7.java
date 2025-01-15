package ejercicios_básicos;

public class Ejercicio7 {

	public static void main(String[] args) {
	//HEMOS CREADO UNA CLASE CON 4 METODOS QUE REALIZAN OPERACIONES CREANDO ASI UNA CALCULADORA, PODREMOS LLAMAR EN OTRO EJERCICIO
	//(CLASE) A CUALQUIERA DE ESTOS 4 METODOS (sumar, restar, multiplicar y dividir) PARA REALIZAR ESTAS OPERACIONES SIN TENER
	//QUE ESCRIBIR SU CODIGO, SIMPLEMENTE PEDIROS LOS DATOS NECESARIOS (EN ESTE CASO 2 NUMEROS) Y LLAMAREMOS AL METODO
	//POR EL NOMBRE QUE LE HEMOS DADO (sumar, restar, dividir y multiplicar)PARA ESTO USAMOS LOS METODOS.
		}
	//Vamos a crear una calculadora con un metodo para Resta, Sumar, Dividir y Multiplicar.
	
	//Creamos el metodo indicando el tipo que devuelve (INTEGER) el nombre que queremos darle al metodo (sumar) y entre () ponemos
	//los datos que necesita el Metodo para operar "Su tipo y el nombre que le demos (INT NUM, INT NUM2) dentro de los corchetes
	// {} iran las operaciones que usa el Metodo pra lograr el resultado,y siempre cada metodo  al Final lleva un RETURN , que es
	//basicamente lo que nos Devuelve , no da  el metodo al llamarlo (Realiza las operaciones necesarias dentro de  {} y nos 
	//devuelve lo que pongamos en RETURN.
	public static Integer sumar(int num, int num2) {
		Integer resultado = num + num2;
		return resultado;
	}
	public static Integer restar(int num, int num2) {
		Integer resultado = num - num2;
		return resultado;
	}
	public static Integer multiplicar(int num, int num2) {
		Integer resultado = num * num2;
		return resultado;
	}
	public static Integer dividir(int num, int num2) {
		Integer resultado = num/num2;
		return resultado;
		}
}
