import java.util.ArrayList;
import java.util.List;

public class Modulo {
	//Creamos los atributos
	private String nombre;
	private String horasDuracion;
	private Profesor[] profesores = new Profesor[2];
	private List<Alumno> alumnos;
	//Constructor que inicializa nombre y horas
	public Modulo(String nombre, String horasModulo) {
		this.nombre = nombre;
		this.horasDuracion = horasModulo;
	}
	//Getters
	public String getNombre() {
		return nombre;
	}
	public String getHorasDuracion() {
		return horasDuracion;
	}
	public String getProfesores(Profesor profesor1, Profesor profesor2) {
		String profesores = profesor1.toString();
		profesores += "\n" + profesor2.toString();
		return profesores;
	}
	public List<Alumno> getAlumnos() {
		return alumnos;
	}
	//Metodo que devuelve una coleccion de menores de edad
	public List<Alumno> obtenerAlumnosMenores(){
		List<Alumno> menores = new ArrayList<Alumno>();
		for (Alumno alumno : alumnos) {
			if(alumno.getEdad() < 18){
				menores.add(alumno);
			}
		}
		return menores;	
	}
	//Setters
	public void setProfesores(Profesor profesor1, Profesor profesor2) {
		profesores[0]= profesor1;
		profesores[1]= profesor2;
	}
	public void setAlumnos(List<Alumno> alumnos) {
		this.alumnos = alumnos;
	}
	//toString
	@Override
	public String toString() {
		return "NOMBRE DEL MODULO:\n" + nombre + " \nHORAS:" + horasDuracion + "\nPROFESORES: \n" + profesores[0] +"\n"+ profesores[1]
				+ " \nALUMNOS: \n" + alumnos;
	}
	
	
}
