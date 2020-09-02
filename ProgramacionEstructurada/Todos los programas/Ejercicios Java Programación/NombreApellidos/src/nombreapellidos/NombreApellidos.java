/*
    Programa: Escritura de nombre y apellidos
    Descripción: escribe por pantallla nombre y apellidos introducidos
    Autor: David Villaluenga
    Fecha: 14/10/2014
 */

package nombreapellidos;

//Importacion de las clases necesarias
import java.util.Scanner;

public class NombreApellidos
{
    //Mouslo principal
    public static void main(String[] args) 
    {
     //Declaracion de la entrada por teclado   
     Scanner teclado = new Scanner(System.in);
     //Declaracion de variable
     String nombre, apellido1, apellido2;
     
     //Cuerpo principal del programa
     
     //Entrada de datos
     System.out.print("Introducir el nombre     ");
     nombre = teclado.nextLine();
     System.out.print("Introducir el primer apellido    ");
     apellido1 = teclado.nextLine();
     System.out.print("Introducir el segundo apellido    ");
     apellido2 = teclado.nextLine();
          
    //Estructura de calculo del programa
    
    
     //Salida de datos por pantalla
     System.out.println("Tu nombre es..");
     System.out.println(nombre+" "+apellido1+" "+apellido2);
     System.out.println(apellido1+" "+apellido2+" ,"+nombre);
     
    }
    
}

