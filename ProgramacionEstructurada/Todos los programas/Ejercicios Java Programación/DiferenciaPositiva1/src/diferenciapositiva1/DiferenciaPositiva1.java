/*
    Ejercicio que lee dos numeros cualquiera y nos calcula y 
            escribe su diferencia positiva
*/
package diferenciapositiva1;

import java.util.Scanner;
 
public class DiferenciaPositiva1
{

   
    public static void main(String[] args) 
    {
        Scanner teclado = new Scanner(System.in);
        
        int numero1, numero2, diferencia;
        
        System.out.println("Escribe un número entero:  ");
        numero1 = teclado.nextInt();
        
        System.out.println("Escribe otro número entero:  ");
        numero2 = teclado.nextInt();
        //Algoritmo de resolucion con una alternativa doble
        diferencia=numero1-numero2;
        
        if(diferencia<0)
        {
           diferencia=-diferencia;
        }
       System.out.println("El valor de la diferencia positiva es:  "+diferencia);
        
        
    }
    
}
