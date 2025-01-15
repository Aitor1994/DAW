package ejercicio20;

public class Alumnos {
	private String dni;
	private String nombre;
	private Integer edad;
	private Double nota;
	
	//Los metodos de las clases no son STATIC.
	//Metodos GET / SET :
	//Se crean en la CLASS NO EN EL MAIN, SIRVEN PARA LUEGO EN EL MAIN PODER USAR EL GET Y EL SET PARA OBETENER O DARLE VALROES
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getEdad() {
		return edad;
	}
	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	public Double getNota() {
		return nota;
	}
	public void setNota(Double nota) {
		this.nota = nota;
	}
	public void aprobar() {
		this.nota = 5.0;
	}
	public Alumnos (String dnii) {
		this.dni = dnii;
	}
}

