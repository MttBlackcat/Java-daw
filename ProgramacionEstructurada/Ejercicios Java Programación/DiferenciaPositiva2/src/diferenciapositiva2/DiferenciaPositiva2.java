/*
    Ejercicio que lee dos numeros cualquiera y nos calcula y 
            escribe su diferencia positiva
*/
package diferenciapositiva2;

import java.util.Scanner;
 
public class DiferenciaPositiva2
{

   
    public static void main(String[] args) 
    {
        Scanner teclado = new Scanner(System.in);
        
        int numero1, numero2;
        
        System.out.println("Escribe un número entero:  ");
        numero1 = teclado.nextInt();
        
        System.out.println("Escribe otro número entero:  ");
        numero2 = teclado.nextInt();
        //Algoritmo de resolucion con una alternativa doble
          
        if(numero1>numero2)
        {
           numero1=numero1-numero2;
        }
        else
        {
            numero1=numero2-numero1;            
        }
       System.out.println("El valor de la diferencia positiva es:  "+numero1);
        
        
    }
    
}
