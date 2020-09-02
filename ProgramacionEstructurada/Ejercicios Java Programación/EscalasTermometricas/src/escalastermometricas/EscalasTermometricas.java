/*
    Programa: Calculo de temperaturas en distintas escalas
    Descripción: Calculo del longitud, area, volumen
    Autor: David Villaluenga
    Fecha: 14/10/2014
 */

package escalastermometricas;

//Importacion de las clases necesarias
import java.util.Scanner;

public class EscalasTermometricas
{
    //Mouslo principal
    public static void main(String[] args) 
    {
     //Declaracion de la entrada por teclado   
     Scanner teclado = new Scanner(System.in);
     //Declaracion de variable
     float centigrados;
     float fahrenheit, kelvin, reamur;
     
     //Cuerpo principal del programa
     
     //Entrada de datos
     System.out.print("Introducir la temperatura en grados centigrados     ");
     centigrados = teclado.nextFloat();
          
    //Estructura de calculo del programa
    fahrenheit = 9* centigrados / 5 + 32;
    reamur = 4 * centigrados / 5; 
    kelvin = 273 + centigrados;
    
     //Salida de datos por pantalla
     System.out.println("La temperatura en grados Fahrenheit es    " + fahrenheit);
     System.out.println("La temperatura en grados Kelvin es        " + kelvin);
     System.out.println("La temperatura en grados Reamur es        " + reamur);
    
    }
    
}

