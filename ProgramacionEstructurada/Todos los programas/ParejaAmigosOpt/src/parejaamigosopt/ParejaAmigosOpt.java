
package parejaamigosopt;

import java.util.Scanner;


public class ParejaAmigosOpt {

   
    public static void main(String[] args)
    {
       // Objeto teclado
        Scanner teclado = new Scanner(System.in);
        
        // Declaración de variables
        int n1, n2;
    
   
        System.out.println("Lista de números amigos: ");
        // Lectura y validación de n
     
        
        for(n1=2;n1<100000;n1++)
        {
            
            if(n1==SumaDivMenosN(SumaDivMenosN(n1)))
            {
                System.out.println(n1+" - "+SumaDivMenosN(n1));
            }
           
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
