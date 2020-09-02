/*
    Numero que son suma de numeros consecutivos
    Luis Carrera y David Villaluenga
    27/10/2014
 */

package numeroespecial;

import java.util.Scanner;

public class NumeroEspecial 
{

    
    public static void main(String[] args) 
    {
       //Declaracion de variables
        int numero;
        int contador;
        int suma = 0;
        Scanner teclado = new Scanner(System.in);
        
        do{
            System.out.println("Escribe un número entero positivo  ");
            numero = teclado.nextInt();
        }while(numero <= 0);
        
        
        for(contador=1; numero > suma ;contador++)
        {
           suma = contador + suma;
         
        }    
        
        if(suma==numero)
        {
            System.out.printf("El numero %d es un número especial\n",numero);
        }
        else
        {
             System.out.printf("El numero %d NO es un número especial\n", numero);
        }
        
        
        
        
    }

}
