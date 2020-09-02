/*
    Programa: Cociente y resto de una operacion con enteros
    Descripción: Calculo del cociente y resto
    Autor: David Villaluenga
    Fecha: 14/10/2014
 */

package cocienteyresto;

//Importacion de las clases necesarias
import java.util.Scanner;

public class CocienteYResto
{
    //Mouslo principal
    public static void main(String[] args) 
    {
     //Declaracion de la entrada por teclado   
     Scanner teclado = new Scanner(System.in);
     //Declaracion de variable
     int numero1 , numero2;
     int resto, cociente;
     //Cuerpo principal del programa
     
     //Entrada de datos
     System.out.print("Introducir el primer número     ");
     numero1 = teclado.nextInt();
     System.out.print("Introducir el segundo número    ");
     numero2 = teclado.nextInt();
     
    //Estructura de calculo del programa
    resto = numero1 % numero2;
    cociente = numero1 / numero2;
     
     //Salida de datos por pantalla
    System.out.println("\nEl cociente de los dos números es      " + cociente);
    System.out.println("El resto de la division es               " + resto);
     
    
    }
    
}

