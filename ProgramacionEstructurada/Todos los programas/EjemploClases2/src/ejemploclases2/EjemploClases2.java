
package ejemploclases2;

import java.util.Scanner;

public class EjemploClases2 
{

    
    public static void main(String[] args) 
    {
        Scanner teclado = new Scanner(System.in);
        
        Notas alumno1 = new Notas("Pepito Perez", 10.0f, 7.5f);
        
        Notas alumno2;
        alumno2 = alumno1;
        
        Notas alumno3 = new Notas();
    
        System.out.println("Datos del primer alumno.\nNombre: "+alumno1.getNombre() );
        System.out.printf("Nota Practica: %.2f\n",alumno1.getNotaPractica());
        System.out.printf("Nota Teoria: %.2f\n",alumno1.getNotaTeoria());
        System.out.printf("Nota Media: %.2f\n\n",alumno1.notaMedia());
        
        
        alumno1.setNombre("juanito");
        alumno2.setNotaPractica(8.30f);
        
        System.out.println("Datos del primer alumno.\nNombre: "+alumno2.getNombre() );
        System.out.printf("Nota Practica: %.2f\n",alumno2.getNotaPractica());
        System.out.printf("Nota Teoria: %.2f\n",alumno2.getNotaTeoria());
        System.out.printf("Nota Media: %.2f\n\n",alumno2.notaMedia());
    
        System.out.println("Escribe el nombre del alumno");
        alumno3.setNombre(teclado.nextLine());
        
        System.out.println("Escribe nota de teoria");
        alumno3.setNotaTeoria(teclado.nextFloat());
        
        System.out.println("Escribe nota de practicas");
        alumno3.setNotaPractica(teclado.nextFloat());
        
        
        System.out.println("Datos del tercer alumno.\nNombre: "+alumno3.getNombre() );
        System.out.printf("Nota Practica: %.2f\n",alumno3.getNotaPractica());
        System.out.printf("Nota Teoria: %.2f\n",alumno3.getNotaTeoria());
        System.out.printf("Nota Media: %.2f\n\n",alumno3.notaMedia());
        
        
        System.out.println("\nLa nota mayor del alumno 1 es: "+alumno1.notaMayor());
        System.out.println("\nLa nota menor del alumno 1 es: "+alumno1.notaMenor());
        System.out.println("\n"+alumno2.imprimeTodo());
        
    }
    
}