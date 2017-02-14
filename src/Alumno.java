
public class Alumno {
	//Creamos los atributos de la clase
	private String nombre;
	private String apellidos;
	private int edad;
	//Creamos el contructor e inicializamos los atributos
	public Alumno(String nombre, String apellidos, int i) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = i;
	}
	
	//Getters
	public String getNombre() {
		return nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public int getEdad() {
		return edad;
	}
	
	//Sobreescribimos el metodo toString
	@Override
	public String toString() {
		return "NOMBRE:" + nombre + "::: APELLIDOS:" + apellidos + "::: EDAD:" + edad + "\n";
	}		
}
