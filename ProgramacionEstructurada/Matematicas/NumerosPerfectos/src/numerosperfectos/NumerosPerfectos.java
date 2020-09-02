
package numerosperfectos;

import java.util.Scanner;


public class NumerosPerfectos 
{

   
    public static void main(String[] args) 
    {
         // Objeto teclado
        Scanner teclado = new Scanner(System.in);
        
        // Declaración de variables
        int n;
   
        
        // Lectura y validación de n
        do
        {
            System.out.print("Dime un número entero y positivo: ");
            n = teclado.nextInt();
        } while (n <= 0);
        
        
        if(NumeroPerfecto(n))
        {
            System.out.println("Es un numero perfecto ");
        }
        else
         {
             System.out.println("No es un numero perfecto");
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
    static boolean NumeroPerfecto(int n)
    {
        boolean perfecto;
        
        perfecto = (SumaDivMenosN(n)==n);
        
        return perfecto;
    }
    
    
  
   
    
}


