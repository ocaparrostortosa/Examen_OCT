import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//importa las bibliotecas que creas necesaria.
public class Curso
{
  public static void main (String[]arg)
  {
    Alumno alumno1 = new Alumno("joaquinto", "pocas luces", 13);
    Alumno alumno2 = new Alumno("alvaro", "elistillo de clase", 15);
    Alumno alumno3 = new Alumno("antonio", "pedante sabelotodo", 43);
    Alumno alumno4 = new Alumno("beatriz", "aprueba todo", 23);
    Alumno alumno5 = new Alumno("carmen", "brillante brillante", 17);
    Profesor profesor1 = new Profesor("augusto", "mecargotodo", true);
    Profesor profesor2 = new Profesor("pedrito", "machacón", false);

    //crea un objeto de tipo modulo
    Modulo modulo1 = new Modulo("", "");
    //añade los alumnos y los profesores
    List<Alumno> alumnos = new ArrayList<Alumno>();
    alumnos.add(alumno1);
    alumnos.add(alumno2);
    alumnos.add(alumno3);
    alumnos.add(alumno4);
    alumnos.add(alumno5);
    //lee desde la clase scanner el nombre del módulo
    //y las horas del mismo, dichas horas deben estar comprendidas entre
    //3 a 8
    System.out.println("Introduzca el nombre del modulo y las horas del mismo:");
    Scanner sc = new Scanner(System.in);
    	String nombreModulo = sc.next();
    	String horasModulo = sc.next();
    sc.close();
    //usa una expresión regular para controlar el dato introducido
    //tanto para que sea un entero y esté en ese rango de valor
    //igual con el  nombre del módulo, deben ser solo letras
    //NO puede lanzarse una excepción por introducir un valor no entero
    //en el caso que la cantidad introducida no corresponda al rango anterior
    //o no sea una cadena de letras el nombre del módulo
    //se establecerá 6 horas en caso de una lectura errónea
    //y DEFAULT como nombre del ciclo  en caso incorrecto 
    String expresionRegularNombre = "[a-zA-Z]+";
    String expresionRegularHoras = "[3-8]";
    if(nombreModulo.matches(expresionRegularNombre) && horasModulo.matches(expresionRegularHoras)){
    	modulo1 = new Modulo(nombreModulo, horasModulo);
    	modulo1.setProfesores(profesor1, profesor2);
    	//Examen ambiguo me lo tienes que dar por correcto
    	modulo1.setAlumnos(alumnos);
    	modulo1.obtenerAlumnosMenores();
    	//imprime la referencia del módulo
    	System.out.println(modulo1);
    	System.out.println("<--------------------------------------->");
    	//imprime la lista de alumnos
        System.out.println("Lista de alumnos: \n"+modulo1.getAlumnos());
        //imprime la lista alumnes menores de edad
        System.out.println("Lista de alumnos menores: \n"+modulo1.obtenerAlumnosMenores());
        //imprime la lista de profesores
        System.out.println("Lista de profesores: \n"+modulo1.getProfesores(profesor1, profesor2));
    } else{
    	System.out.println("Los valores introducidos no son válidos.");
    }	
    
  }
}
