package repaso_;

public class Caballo {

	private String nombre;
	private Integer carrerasGanadas;
	private String color;
	private Integer edad;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getCarrerasGanadas() {
		return carrerasGanadas;
	}
	public void setCarrerasGanadas(Integer carrerasGanadas) {
		this.carrerasGanadas = carrerasGanadas;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Integer getEdad() {
		return edad;
	}
	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	
	
	public void imprimeCarrerasGanadas() {
		System.out.println("El numero de carraras ganadas es:" + this.carrerasGanadas);
	}
	public Integer anyoNacimiento() {
		return 2025 - edad;
	}
	public void incrementarCarrerasGanadas() {
		carrerasGanadas = carrerasGanadas + 1;
	}
	public Caballo() {}
	
	public Caballo(String nombre, Integer carrerasGanadas,String color, Integer edad) {
		this.nombre = nombre;
		this.carrerasGanadas = carrerasGanadas;
		this.color = color;
	    this.edad = edad;}
	}
