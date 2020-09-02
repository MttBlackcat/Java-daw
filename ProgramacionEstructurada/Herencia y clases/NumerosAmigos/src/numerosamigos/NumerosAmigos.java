/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numerosamigos;

import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class NumerosAmigos {

  
 public static void main(String[] args) 
    {
         // Objeto teclado
        Scanner teclado = new Scanner(System.in);
        
        // Declaración de variables
        int n1, n2;
   
        
        // Lectura y validación de n
        do
        {
            System.out.print("Dime un número entero y positivo: ");
            n1 = teclado.nextInt();
        } while (n1 <= 0);
        
         do
        {
            System.out.print("Dime un número entero y positivo: ");
            n2 = teclado.nextInt();
        } while (n2 <= 0);
        
        
        if(NumerosAmigos(n1 , n2))
        {
            System.out.println("Son numeros numero amigos ");
        }
        else
         {
             System.out.println("No son numeros amigos ");
         }     
      
    }
    
     //Calcula la suma de todos los divisores de un numero menos el propio numero
    static int SumaDivMenosN(int n)
    {
        int suma;
        int divisor;
        
        suma = 1; 
        
        for (divisor=2; divisor <= n/2f; divisor++ )
        {
            if (n % divisor == 0)
            {
                suma = suma + divisor;
            }
        }
        return suma;
    }
    
    //Mira si el numeno se perfecto (Cuando la suma de sus divisores menos el, es el mismo)
    static boolean NumerosAmigos(int n1 , int n2)
    {
          return (n1==SumaDivMenosN(n2))&& (n2==SumaDivMenosN(n1));
    }
    
    
  
   
    
}
