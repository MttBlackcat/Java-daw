/*
    Este programa lee dos numeros y realiza las operaciones basicas 
    en distintas funciones
    David Villaluenga 
    28/10/2014
 */

package funciones;

import java.util.Scanner;

public class Funciones 
{

    
    public static void main(String[] args) 
    {
    
        //Declaraciones principales
        int num1, num2;
        int s,d,p;
        float c;
        Scanner teclado = new Scanner(System.in);
        
       
        System.out.println("Escribe el primer numero ");
        num1=teclado.nextInt();    
        System.out.println("Escribe el segundo numero ");
        num2=teclado.nextInt();   
        
        //Calculos
        //Llamadas a las funciones
        s = suma(num1,num2);
        System.out.println("La suma es: "+s);
        
        d = diferencia(num1,num2);
        System.out.println("La diferencia es: "+d);
        
        p = producto(num1,num2);
        System.out.println("El producto es: "+p);
        
        c = suma(num1,num2);
        System.out.print("El cociente es: " + p+ "\n");
        
    }
    //Funcion suma
    static int suma(int a, int b)
    {
        //Declaraciones locales
        int s;
        //calculo de la suma
        s = a + b;
        
        return s;
    }
    //Funcion diferencia
    static int diferencia(int a, int b)
    {
        //Declaraciones locales
        int d;
        //calculo de la suma
        d = a - b;
        
        return d;
    }
    //Funcion producto
    static int producto(int a, int b)
    {
        //Declaraciones locales
        int p;
        p=0;
        //calculo de la suma
        for(int i=1; i<=b;i++)
        {
        p = p + a;
        }
        return p;
    }
    static float division(int a, int b)
    {
        //Declaraciones locales
        float c;
        //calculo de la suma
        
        c = (float)a / b;
        
        return c;
    }
    
    
    
}
