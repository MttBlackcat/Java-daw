/*
    Programa: Calculos en un rectangulo
    Descripción: Calculo del perimetro y del area
    Autor: David Villaluenga
    Fecha: 14/10/2014
 */

package calculosenunrectangulo;

//Importacion de las clases necesarias
import java.util.Scanner;

public class CalculosEnUnRectangulo 
{
    //Mouslo principal
    public static void main(String[] args) 
    {
     //Declaracion de la entrada del teclado   
     Scanner teclado = new Scanner(System.in);
     //Declaracion de variable
     float lado1 , lado2;
     float perimetro , area;
     
     //Cuerpo principal del programa
     
     //Entrada de datos
     System.out.print("Introducir primer lado    ");
     lado1 = teclado.nextFloat();
     System.out.print("\nIntroducir segundo lado    ");
     lado2 = teclado.nextFloat();
     
     //Estructura de calculo del programa
     perimetro = 2*lado1 + 2*lado2;
     area = lado1 * lado2;
     
     //Salida de datos por pantalla
     System.out.println("\n\tEl area del rectangulo es  "+ area  + "\n\tEl perimetro del rectangulo es   " + perimetro);
     
    
    
    }
    
}
