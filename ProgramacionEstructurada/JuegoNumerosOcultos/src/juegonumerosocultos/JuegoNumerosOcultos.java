/*
El juego de los números ocultos consiste en que el ordenador genera un valor aleatorio entre 1 y 1000
y el jugador intenta averiguarlo indicando un valor dentro del rango. El ordenador responderá escribiendo
si lo ha acertado o si es mayor o menor que dicho valor.
El juego termina cuando se acierta el número oculto
 */
package juegonumerosocultos;

import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class JuegoNumerosOcultos 
{

    public static void main(String[] args) 
    {
        // Creación del objeto teclado
        Scanner teclado = new Scanner(System.in);
        
        // Declaraciones de variables
        int numOculto;
        int numero;
        int limitesup, limiteinf;
        
        numOculto = (int) (Math.random()*1000)+1;
        limitesup = 1000;
        limiteinf = 1;
        
        do
        {
            do
            {
                System.out.print("Dime un numerito entre " + limiteinf + " y " + limitesup + ": ");
                numero = teclado.nextInt();
            } while (numero > limitesup || numero < limiteinf);
            
            /* System.out.print("Dime un numerito entre " + limiteinf + " y " + limitesup + ": ");
            numero = teclado.nextInt();*/
            if (numero > numOculto)
            {
                limitesup = numero - 1;
            }
            else 
            {
                limiteinf = numero + 1;
            }    
        }while (numero < limiteinf && numero > limitesup || numero != numOculto);
        
        if (numero == numOculto)
        {
            System.out.println("Acertaste!!!");
        }
        
        
    }
    
}
