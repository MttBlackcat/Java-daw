
package sumadivisores;

import java.util.Scanner;

public class SumaDivisores 
{

    public static void main(String[] args) 
    {
        // Objeto teclado
        Scanner teclado = new Scanner(System.in);
        
        // Declaración de variables
        int n;
        int divisor;
        int suma;
        
        
        // Lectura y validación de n
        do
        {
            System.out.print("Dime un número entero y positivo: ");
            n = teclado.nextInt();
            suma = n + 1; 
        } while (n <= 0);
        
        System.out.print("\nLos divisores de " + n + " son: 1, ");
        for (divisor=2; divisor <= n/2f; divisor++ )
        {
            if (n % divisor == 0)
            {
                System.out.print(divisor + ", ");
                suma = suma + divisor;
            }
        }
        System.out.print("y "+ n + ".\n");
        System.out.println("La suma de los divisores es: "+suma+"\n");
    }
}
