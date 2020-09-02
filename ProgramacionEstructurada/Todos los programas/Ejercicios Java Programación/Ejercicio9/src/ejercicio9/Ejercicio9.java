/*
    Escribe por pantalla el mayor de tres números
*/
package ejercicio9;

import java.util.Scanner;
 
public class Ejercicio9
{

   
    public static void main(String[] args) 
    {
        Scanner teclado = new Scanner(System.in);
        
        int numero1, numero2, numero3;
        
        System.out.println("Escribe un número entero:  ");
        numero1 = teclado.nextInt();
        
        System.out.println("Escribe otro número entero:  ");
        numero2 = teclado.nextInt();
        
         System.out.println("Escribe otro número entero:  ");
        numero3 = teclado.nextInt();
        //Algoritmo de resolucion con una alternativa doble
                
        if(numero1>numero2 && numero1>numero2)
        {
             System.out.println("\nEl valor mayor es:  "+numero1);
        }
        else
        {
            if(numero2>numero3)
                    {
                        System.out.println("\nEl valor mayor es:  "+numero2);
                    }
            else
                        System.out.println("\nEl valor mayor es:  "+numero3);
        }
    }
}
