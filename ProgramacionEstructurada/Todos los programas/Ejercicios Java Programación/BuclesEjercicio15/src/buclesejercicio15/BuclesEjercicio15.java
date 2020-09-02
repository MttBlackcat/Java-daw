/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



package buclesejercicio15;

import java.util.Scanner;

public class BuclesEjercicio15 
{
    
    public static void main(String[] args) 
    {
        int altura, i, j;
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Introducir la altura del triángulo:");
        altura = teclado.nextInt();
        
        for (i=1; i<=altura; i++)
        {
            System.out.print("\n");
            for (j=1; j <=i; j++)
            {
                System.out.print("*");
            }
            
        }
        System.out.print("\n");
    }

}
