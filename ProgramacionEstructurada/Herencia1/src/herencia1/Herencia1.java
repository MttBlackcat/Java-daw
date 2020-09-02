/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia1;

/**
 *
 * @author Alumno
 */
public class Herencia1 
{

    public static void main(String[] args) 
    {
        // Creación de objetos
        Persona person = new Persona("Pedro", "123456789");
        Profesor profe = new Profesor("Paco", "987654321", "Java", 12);
        Alumno alum = new Alumno("María", "123498765", 100, 9.5f, 10f );
        
        // Mostrar datos
        System.out.println("\nDatos de la persona: ");
        System.out.println("Nombre: " + person.getNombre());
        System.out.println("Teléfono: " + person.getTelefono());
        
        System.out.println("\nDatos del profesor: ");
        System.out.println("Nombre: " + profe.getNombre());
        System.out.println("Teléfono: " + profe.getTelefono());
        System.out.println("Asignatura: " + profe.getAsignatura());
        System.out.println("Número despacho: " + profe.getNum_despacho());
        
        System.out.println("\nDatos del alumno: ");
        System.out.println("Nombre: " + alum.getNombre());
        System.out.println("Teléfono: " + alum.getTelefono());
        System.out.println("Matrícula: " + alum.getMatricula());
        System.out.println("Nota Teoría: " + alum.getNota_teoria());
        System.out.println("Nota Práctica: " + alum.getNota_practica());
        System.out.println("Media: " + alum.media(alum.getNota_teoria(), alum.getNota_practica()));
    }
    
}
