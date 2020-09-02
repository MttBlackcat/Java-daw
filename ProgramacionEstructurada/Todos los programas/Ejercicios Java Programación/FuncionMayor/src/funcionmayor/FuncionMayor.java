/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package funcionmayor;

import java.util.Scanner;


public class FuncionMayor 
  {

    
    public static void main(String[] args) 
    {
        int num1, num2, num3;
        int resultado;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Escribe el primer numero ");
        num1=teclado.nextInt();    
        System.out.println("Escribe el segundo numero ");
        num2=teclado.nextInt();   
        System.out.println("Escribe el tercer numero ");
        num3=teclado.nextInt();   
        
        resultado = mayor(num1,num2,num3);
        
        System.out.print("El numero mayor es:  " + resultado + "\n");
        
    }

    
    static int mayor(int a, int b, int c)
    {
        int aux;
        
        if(a>b && a>c)
        {
            aux = a;
        }
        else
        {     
              if(b>c)
               {
                   aux = b;
               }
               else
               {
                   aux = c;
               }
            }        
            
        return aux;
    }
    
    
    
    
    
    
}
