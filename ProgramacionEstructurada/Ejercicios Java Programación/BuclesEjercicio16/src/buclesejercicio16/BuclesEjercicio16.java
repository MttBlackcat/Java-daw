/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package buclesejercicio16;

import java.util.Scanner;

public class BuclesEjercicio16 
{

    
    public static void main(String[] args) 
    {
        int altura, i, j, k;
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Introducir la altura del triángulo:");
        altura = teclado.nextInt();
        
        for (i=1; i<=altura; i++)
        {
            System.out.print("\n");
            //Escritura de blancos
            for (j=altura; j>i; j--)
            {
               System.out.print(" ");
            }
            //Escritura de asteriscos
            for (k=1 ; k<=i ; k++)
            {
               System.out.print("*");  
            }
                        
        }
        System.out.print("\n");
    }

}
