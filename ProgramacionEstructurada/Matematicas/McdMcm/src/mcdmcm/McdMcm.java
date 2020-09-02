/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mcdmcm;

import java.util.Scanner;

public class McdMcm 
{

    
    public static void main(String[] args) 
    {
    
        Scanner teclado = new Scanner(System.in);
        int numero1, numero2;
        int mcd , mcm;
        
        System.out.println("Escribe el numero entero mayor ");
        numero1 = teclado.nextInt();
        //Validar el numero menor
        do
        {
        System.out.println("Escribe el numero entero menor  ");
        numero2 = teclado.nextInt();
        if(numero1<numero2)
            {
            System.out.println("El numero debe ser menor o igual que el primero ");
            }
        }while(numero1<numero2);
       
        //Solucion iterativa
        mcd = McdIterativo(numero1,numero2);
        mcm = numero1 * numero2 / mcd;
        
        System.out.println("El Mcd de "+numero1+" y "+numero2+" Es de forma iterativa "+mcd);
        System.out.println("El MCM de "+numero1+" y "+numero2+" Es de forma iterativa "+mcm);
        
        //Solucion recursiva
        mcd = McdIterativo(numero1,numero2);
        mcm = numero1 * numero2 / mcd;
        System.out.println("El Mcd de "+numero1+" y "+numero2+" Es de forma recursiva "+mcd);
        System.out.println("El MCM de "+numero1+" y "+numero2+" Es de forma recursiva "+mcm);
    }
    
    // Cálculo con función iterativa
    static int McdIterativo(int num1, int num2)
    {
        int resto;
       
        resto=num1%num2;
        
            while(resto != 0)
            {
                num1 = num2;
                num2 = resto;
                resto=num1%num2;
            }
       return num2;
    }
    
    // Cálculo con función recursiva
    static int McdRecursiva(int n1 , int n2)
    {
       if(n1%n2 == 0)
       {
       }
       else
       {
         McdRecursiva(n2,n1%n2);  
       }
       return n2;
    }
    
    
}
