/*
    Programa: Calculos en una circuferencia
    Descripción: Calculo del longitud, area, volumen
    Autor: David Villaluenga
    Fecha: 14/10/2014
 */

package ejerciciodeoperaciones;

//Importacion de las clases necesarias
import java.util.Scanner;

public class EjercicioDeOperaciones
{
    //Mouslo principal
    public static void main(String[] args) 
    {
     //Declaracion de la entrada por teclado   
     Scanner teclado = new Scanner(System.in);
     //Declaracion de variable
     float numero1 , numero2;
     float suma, diferencia, producto, cociente;
     //Cuerpo principal del programa
     
     //Entrada de datos
     System.out.print("Introducir el primer número     ");
     numero1 = teclado.nextFloat();
     System.out.print("Introducir el segundo número    ");
     numero2 = teclado.nextFloat();
     
    //Estructura de calculo del programa
    suma = numero1 + numero2;
    diferencia = numero1 - numero2;
    producto = numero1 * numero2;
    cociente = numero1 / numero2;
     
     //Salida de datos por pantalla
     System.out.println("\nLa suma de los dos números es          " + suma);
     System.out.println("La diferencia de los dos números es    " + diferencia);
     System.out.println("El producto de los dos números es      " + producto);
     System.out.println("El cociente de los dos números es      " + cociente);
    
    }
    
}

