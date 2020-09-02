/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package buclesejercicio11;


public class BuclesEjercicio11 
{

    public static void main(String[] args) 
    {
        int numero;
        
        System.out.println("Números del 1 al 100");
        //Bucle for
        for (numero=1;numero<=100;numero++)
        {
            if(numero%33==1)
            {
                System.out.print("\n");
            }
            System.out.print(numero + " ");
        }
    }

}
