package ejercicio7;

import java.util.Scanner;
 
public class Ejercicio7
{

   
    public static void main(String[] args) 
    {
        Scanner teclado = new Scanner(System.in);
        
        int numero1, numero2;
        
        System.out.println("Escribe un número entero:  ");
        numero1 = teclado.nextInt();
        
        System.out.println("Escribe otro número entero:  ");
        numero2 = teclado.nextInt();
        
        //Algoritmo de resolucion con una alternativa doble
                
        if(numero1>numero2)
        {
             System.out.println("\nEl valor mayor es:  "+numero1);
        }
        else
        {
           System.out.println("\nEl valor mayor es:  "+numero2);
        }
   
    }
}
