/*
     Calcula el coste de la conexion a internet del hotel Campanilla
     en Alicante
    David Villaluenga y Luis Carrera
    24/10/2014
*/


package calculodiastotal;

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
        
       
        // Calculamos los minutos totales de conexión (hora final mayor que inicial)
        if (horaF > horaI)
        {
            minutoTotal = (horaF - horaI) * 60;
            
            if (minutoF >= minutoI)
            {
                minutoTotal = minutoTotal + (minutoF - minutoI);
            }
            else
            {
                minutoTotal = (minutoTotal - 60) + (60 - minutoI + minutoF);
            }
        }
        
        
        // Calculamos los minutos totales de conexión (hora final menor que inicial)
        if (horaF < horaI)
        {
            minutoTotal = (24 - horaI + horaF) * 60;
            
            if (minutoF >= minutoI)
            {
                minutoTotal = minutoTotal + (minutoF - minutoI);
            }
            else
            {
                minutoTotal = (minutoTotal - 60) + (60 - minutoI + minutoF);
            }
        }
        
        // Calculamos los minutos totales de conexión (hora final igual que inicial)
        if (horaF == horaI)
        {
                       
            if (minutoF >= minutoI)
            {
                minutoTotal = minutoTotal + (minutoF - minutoI);
            }
            else
            {
                minutoTotal = 1440 - (minutoI - minutoF);
            }
        }
        //System.out.println("Total minutos: " + minutoTotal);
        //Calculos de consumo
        if (minutoTotal<=60)
        {
            precioFinal = 1 + 0.03f*60;
        }
        else
        {
            if (minutoTotal<=120)
            {
                precioFinal = 2.80f + 0.02f *(minutoTotal - 60);
            }
            else
            {
                precioFinal = 4.00f + (minutoTotal - 120)*0.01f;
            }
        }
        
        //Calculo del precio mas IVA
        precioFinal = precioFinal * 1.20f;

        //Resultado por pantalla
        System.out.printf("El importe de la conexion es de %.2f €\n",precioFinal);
    }

}
