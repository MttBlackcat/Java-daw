/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sumacifras;

import java.util.Scanner;

public class SumaCifras 
{

    
    public static void main(String[] args) 
    {
    
        Scanner teclado = new Scanner(System.in);
        int numero;
        int sumaI, sumaR;
        
        System.out.println("Escribe un numero entero  ");
        numero = teclado.nextInt();
        
        sumaI = SumaI(numero);
        System.out.println("La suma de las cifras es:  "+sumaI);
        
        sumaR = SumaR(numero);
        System.out.println("La suma de las cifras es:  "+sumaR);
    }
    
    // Cálculo con función iterativa
    static int SumaI(int numero)
    {
        
        int suma = 0;
        
        do
        {
        suma = suma + numero%10;    
        numero=numero/10;
        
        }while(numero>0);
        
        return suma;
    }
    
    // Cálculo con función recursiva
    static int SumaR(int numero)
    {
        int suma;
        
        if (numero == 0)
        {
            suma = 0;
        }
        else
        {
            suma = numero % 10 + SumaR(numero / 10);
        }
        return suma;
    }
    
    
}
