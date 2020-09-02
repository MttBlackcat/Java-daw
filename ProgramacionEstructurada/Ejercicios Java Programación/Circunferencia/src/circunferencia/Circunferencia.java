/*
Programa de calculo de la longitud de una circunferencia
Autor: David Villaluenga
Fecha: 7/10/2014
 */

package circunferencia;


import java.util.Scanner;

//Clase ppal. del programa
public class Circunferencia 
{

    //Metodo principal de la clase
    public static void main(String[] args) 
    {       
        //  Declaraciones
        float radio;
        float longitud;
        
        //Creacion del objeto teclao para poder leer
        System.out.print("Introducir el radio de la circunferencia.. . ");
        Scanner teclado = new Scanner (System.in);
        
        
        // Lectura de datos
        radio = teclado.nextFloat();
        
        //Calculo de la longitud
        longitud = 2*3.141592f*radio; 
        
        //Escritura del resultado en pantalla
        
        }
    
}
