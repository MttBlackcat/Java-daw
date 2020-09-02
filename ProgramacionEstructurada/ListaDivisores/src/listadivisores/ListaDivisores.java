/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listadivisores;

import java.util.Scanner;

public class ListaDivisores 
{

    public static void main(String[] args) 
    {
        // Objeto teclado
        Scanner teclado = new Scanner(System.in);
        
        // Declaración de variables
        int n;
        int divisor;
        
        // Lectura y validación de n
        do
        {
            System.out.print("Dime un número entero y positivo: ");
            n = teclado.nextInt();
        } while (n <= 0);
        
        System.out.print("\nLos divisores de " + n + " son: ");
        for (divisor=1; divisor <= n/2f; divisor++ )
        {
            if (n % divisor == 0)
            {
                System.out.print(divisor + " ");
            }
        }
        System.out.print(n + "\n");
    }
}
