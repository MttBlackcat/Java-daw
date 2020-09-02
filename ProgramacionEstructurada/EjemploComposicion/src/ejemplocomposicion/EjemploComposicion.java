
package ejemplocomposicion;

//import java.util.Scanner;

public class EjemploComposicion
{
    public static void main(String[] args) 
    {
        // Creamos el objeto teclado
        //Scanner teclado = new Scanner(System.in);
        
        // Creación de los objetos prof y alum
        Profesor prof = new Profesor("Eduardo", 912222222, "Programación", 15);
        Alumno alum = new Alumno("Borja", 913333333, 12345);
        
        // Escritura de los datos de prof
        System.out.println("\nDatos del profesor:");
        System.out.println("Nombre:     "+prof.getNombre());
        System.out.println("Teléfono:   "+prof.getTelefono());
        System.out.println("Asignatura: "+prof.getAsignatura());
        System.out.println("Despacho:   "+prof.getNum_despacho());
        
        // Escritura de los datos de alum
        System.out.println("\nDatos del alumno:");
        System.out.println("Nombre:         "+alum.getNombre());
        System.out.println("Teléfono:       "+alum.getTelefono());
        System.out.println("Matrícula:      "+alum.getNum_matricula());
        
        // Creación del objeto trabajoFC
        TrabajoFinDeCiclo trabajoFC = new TrabajoFinDeCiclo("PORTAL VPAZ",
                                                             prof, alum, 9.5f);
        
        // Escritura de los datos del trabajoFC
        System.out.println("\nDatos del Trabajo Fin de Ciclo:");
        System.out.println("Título:   "+trabajoFC.getTitulo());
        System.out.println("Profesor: "+trabajoFC.getProfesor().getNombre());
        System.out.println("Alumno:   "+trabajoFC.getAlumno().getNombre());
        System.out.println("Nota:     "+trabajoFC.getNota());
    }
}
