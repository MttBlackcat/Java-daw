/*
     Calcula el coste de la conexion a internet del hotel Campanilla
     en Alicante
    David Villaluenga y Luis Carrera
    24/10/2014
*/


package tarifainternet;

import java.util.Scanner;

public class TarifaInternet 
{

    
    public static void main(String[] args) 
    {
        //Declaracion de variables
        int horaI, minutoI, horaF, minutoF;
        int minutoTotal = 0;
        //int minutoTotalI, minutoTotalF, tiempoTotal;
        float precioFinal;
        
        Scanner teclado = new Scanner(System.in);
        
        //Lectura de datos
        do 
        {
            System.out.println("Escribe la hora de inicio de conexion: ");
            horaI = teclado.nextInt();
        } while (horaI < 0 || horaI > 23);
        
        do 
        {
            System.out.println("Escribe el minuto de inicio de conexion: ");
            minutoI = teclado.nextInt();
        } while (minutoI < 0 || minutoI > 59);
        
        do 
        {
            System.out.println("Escribe la hora final de conexion: ");
            horaF = teclado.nextInt();
        } while (horaF < 0 || horaF > 23);
        
        do 
        {
            System.out.println("Escribe el minuto final de conexion: ");
            minutoF = teclado.nextInt();
        } while (minutoF < 0 || minutoF > 59);
        
        /*
        minutoTotalI = horaI*60 + minutoI;
        minutoTotalF = horaF*60 + minutoF;
        
        if(minutoTotalI < minutoTotalF)
        {
           tiempoTotal = minutoTotalF-minutoTotalI; 
        }
        else
        {
            tiempoTotal = (1440 - minutoTotalI) + minutoTotalF;
        }
        
        */
        
       
        // Calculamos los minutos totales de conexión 
        if (horaF > horaI) 
        {
            minutoTotal = (horaF - horaI) * 60;
        }
        else
        {
            if (horaF < horaI)
            {
                minutoTotal = (24 - horaI + horaF) * 60;
            }
            else
            {
                if (minutoF <= minutoI)
                {
                    minutoTotal = 1440;
                }
                
            }
        }
        
        if (minutoF >= minutoI)
        {
            minutoTotal = minutoTotal + (minutoF - minutoI);
        }
        else
        {
            minutoTotal = (minutoTotal - 60) + (60 - minutoI + minutoF);
        }
        
        
        // Mostramos en pantalla el tiempo total de conexión
        System.out.println("Total minutos: " + minutoTotal);
        
        
    }

}
