
 package ejercicio6;

import java.util.Scanner;
 
public class Ejercicio6 
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
        if(numero1==numero2)
        {
            System.out.println("Los dos números son iguales  ");
        }
        else
        {
            System.out.println("Los dos números no son iguales  ");
        }
        
        
    }
    
}
