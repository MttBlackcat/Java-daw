
package sumadivisores2;

import java.util.Scanner;

public class SumaDivisores2
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
        
      
        System.out.println("\nLa suma de los divisores es: "+SumaDiv(n)+"\n");
        System.out.println("La suma de los divisores menos el mismo es: "+SumaDivMenosN(n)+"\n");
        
        if(NumeroPerfecto(n))
        {
            System.out.println("Es un numero perfecto ");
        }
        
    }
    
    //Metodo que calcula la suma de los divisores de un numero
    static int SumaDiv(int n)
    {
        int suma;
        int divisor;
        
        suma = n + 1; 
        
        for (divisor=2; divisor <= n/2f; divisor++ )
        {
            if (n % divisor == 0)
            {
                suma = suma + divisor;
            }
        }
        return suma;
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
