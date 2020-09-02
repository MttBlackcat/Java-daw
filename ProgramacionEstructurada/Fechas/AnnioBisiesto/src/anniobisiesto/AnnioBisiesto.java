/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anniobisiesto;

import java.util.Scanner;


public class AnnioBisiesto 
{

    public static void main(String[] args) 
    {
        int ano;
        String resultado;   
        
        // Pedimos el año
        ano = MeteDato();
        
        // Controlamos si es bisiesto
        resultado = ComprobarAno(ano);
        
        // Mostramos por pantalla
        System.out.println("El año " + ano + " " + resultado);
                
    }
    
    static int MeteDato()
    {
        int ano;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce año: ");
        ano = teclado.nextInt();
        return ano;
    }
    
    static String ComprobarAno(int ano)
    {
        String resultado;
        
        if ((ano % 4 == 0)&&  (ano % 100 != 0 || ano % 400 == 0))
        {
           
                resultado = "es bisiesto";
        }   
         else
            {
                resultado = "no es bisiesto";
            }
        return resultado;
    }
       
}
