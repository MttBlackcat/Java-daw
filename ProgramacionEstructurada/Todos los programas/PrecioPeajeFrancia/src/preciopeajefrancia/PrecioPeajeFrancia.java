/*
     Calcula el coste del viaje por la carretera de peaje francesa L'Autoroute
    du Soleil
    David Villaluenga y Luis Carrera
    24/10/2014
*/

package preciopeajefrancia;

//Importacion de clases
import java.util.Scanner;

public class PrecioPeajeFrancia 
{
    
    
    public static void main(String[] args) 
    {
        //Variables
        char vehiculo;
        int kme, kms;
        int kmr;
        float cuotaBase;
        float precioFinal;
        
        Scanner teclado = new Scanner(System.in);
        do
        {
        //Introduccion de datos
        System.out.println("Escribe el tipo de vehiculo: M MOTO, T TURISMO, C CAMION, A AUTOBUS");
        vehiculo = teclado.nextLine().charAt(0);
        }while(vehiculo != 'M' && vehiculo != 'T' && vehiculo != 'C' && vehiculo != 'A');
        
        do
            {
            System.out.print("Escribe el kilometro de entrada: ");
            kme = teclado.nextInt();
            if(kme<0||kme>1350)
                {
                    System.out.println("Escribe el kilometro de entrada debe ser mayor que cero"
                            + " y menor que 1350");
                }
            }while(kme<0||kme>1350);
        
        do
            {
            System.out.print("Escribe el kilometro de salida: ");
            kms = teclado.nextInt();
            
            if(kms >1350 || kms<0)
                {
                    System.out.println("Escribe el kilometro de salida debe ser mayor de cero"
                            + " y menor de 1350");   
                }
            }while(kms>1350 || kms<0);
        
        // Cálculo de los kilómetros recorridos
        if (kme > kms)
        {
            kmr = kme - kms;
        }
        else
        {
            kmr = kms - kme;
        }
        
        // Cálculo de la cuota base
        if (kmr <= 50)
        {
            cuotaBase = 1.50f;
        }
        else 
        {
            if (kmr <= 100)
            {
                cuotaBase = 2.5f;
            }
            else
                if (kmr <= 300)
                {
                    cuotaBase = 2.5f + (kmr-100) * 0.02f;
                }
                else
                {
                    cuotaBase = 2.5f + 4.00f + (kmr-300) * 0.01f;
                }
        }
        
        // Modificaciones de la cuota base por el tipo de vehículo
        if (vehiculo == 'M')
        {
            cuotaBase = cuotaBase / 2.0f;
        }
        else
        {
            if (vehiculo == 'C' || vehiculo == 'A')
            {
                cuotaBase = cuotaBase * 1.20f;
            }
        }
        
        // Cuota base máximo 12 euros
        if (cuotaBase > 12.0f)
        {
            cuotaBase = 12.0f;
        }
        
        // Calculamos el precio final y mostramos en pantalla
        precioFinal = cuotaBase * 1.10f;
        System.out.printf("Vas a pagar: %.2f €\n", precioFinal);
    }

}
