/*
    Algoritmo que lee por teclado el dia, mes y año de nacimiento
    de una persona y calcula y escribe en pantalla su edad en años
 */
package edaddeunapersona;

import java.util.Calendar;
import java.util.Scanner;
import java.util.GregorianCalendar;

public class EdadDeUnaPersona 
{


    public static void main(String[] args) 
    {

        //Variables
        Scanner teclado = new Scanner(System.in);
        Calendar dma = new GregorianCalendar();
        
        
        int diaI, mesI, anoI;
        int diaF, mesF, anoF;
        int edad;
        
        
         //Lectura por pantalla
         System.out.println("Escribe tu dia de nacimiento ");
         diaI = teclado.nextInt();
         System.out.println("Escribe tu mes de nacimiento ");
         mesI = teclado.nextInt();
         System.out.println("Escribe tu año de nacimiento ");
         anoI = teclado.nextInt();
         
        //Fecha actual 
        diaF= dma.get(Calendar.DAY_OF_MONTH);
        //Enero es el mes 0 y diciembre el 11
        mesF = dma.get(Calendar.MONTH)+1;
        anoF = dma.get(Calendar.YEAR);
         
         //Calculos
        edad = anoF-anoI;
  
            if (mesF<mesI || (mesF==mesI && diaF<diaI))
            {
                edad--;
            }
           
            
    System.out.printf("Tu edad es: %2d años\n",edad);
         
         
         
        
    }
    
    
    
    
    
}
