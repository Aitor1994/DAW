package ejercicio22;

public class Alumno {
	// Los metodos de las clases no son STATIC.
	// Metodos GET / SET :
	// Se crean en la CLASS NO EN EL MAIN, SIRVEN PARA LUEGO EN EL MAIN PODER USAR
	// EL GET Y EL SET PARA OBETENER O DARLE VALROES
	private String dni;
    private Integer nota;
    //Hemos creado en alumno un "TIPO" curso que lleva los atributos de su clase"En este caso curso"
	private Curso curso;
	
    public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	@Override
	public String toString() {
		return "Alumno [dni=" + dni + ", nota=" + nota + ", curso=" + curso + "]";
	}

	//ESTO SERIA UN CONSTRUCTOR CON PARAMETRO, PARA ELLO NO TENDRIAMOS QUE USAR GET Y SET
	public Alumno(String dni) {
		super();
		this.dni = dni;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public Integer getNota() {
		return nota;
	}

	public void setNota(Integer nota) {
		this.nota = nota;
	}

	public void aprobar() {
		this.nota = 5;
	}

}

