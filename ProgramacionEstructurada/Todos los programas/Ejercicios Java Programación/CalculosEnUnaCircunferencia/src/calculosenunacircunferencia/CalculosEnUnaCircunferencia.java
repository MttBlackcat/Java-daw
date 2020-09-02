/*
    Programa: Calculos en una circuferencia
    Descripción: Calculo del longitud, area, volumen
    Autor: David Villaluenga
    Fecha: 14/10/2014
 */

package calculosenunacircunferencia;

//Importacion de las clases necesarias
import java.util.Scanner;

public class CalculosEnUnaCircunferencia
{
    //Mouslo principal
    public static void main(String[] args) 
    {
     //Declaracion de la entrada del teclado   
     Scanner teclado = new Scanner(System.in);
     //Declaracion de variable
     float radio;
     float longitud, area, volumen;
     
     //Cuerpo principal del programa
     
     //Entrada de datos
     System.out.print("Introducir el radio de la circunferencia    ");
     radio = teclado.nextFloat();
     
     
    //Estructura de calculo del programa
    longitud = 6.283184f * radio;
    area = 3.141592f * radio * radio;
    volumen = 4f/3 * 3.141592f * radio * radio * radio;
     
     //Salida de datos por pantalla
     System.out.println("\n\nLa longitud de la circunferencia es   " + longitud);
     System.out.println("El area de la circunferencia es       " + area);
     System.out.println("El volumen de la circunferencia es    " + volumen);
    
    }
    
}
