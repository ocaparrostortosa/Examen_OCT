
public class Profesor {
	//Creamos los atributos
	private String nombre;
	private String primerApellido;
	private boolean definitivo;
	//Creamos el constructor
	public Profesor(String nombre, String primerApellido, boolean definitivo) {
		this.nombre = nombre;
		this.primerApellido = primerApellido;
		this.definitivo = definitivo;
	}
	//Getters
	public String getNombre() {
		return nombre;
	}
	public String getPrimerApellido() {
		return primerApellido;
	}
	public boolean isDefinitivo() {
		return definitivo;
	}
	@Override
	public String toString() {
		return "NOMBRE:" + nombre + "::: APELLIDO=" + primerApellido + "::: DEFINITIVO=" + definitivo;
	}
	
	//Sobreescribimos toString
		
}
