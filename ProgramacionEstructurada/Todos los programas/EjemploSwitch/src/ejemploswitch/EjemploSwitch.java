/*
Utilizacion de un switch con efecto conmutador
David Villaluenga
21/10/2014
 */

package ejemploswitch;


public class EjemploSwitch   
{

    
    public static void main(String[] args) 
    {
    //Declaraciones
       boolean sw;
       int i;
       int pares, impares;
       pares = 0;
       impares = 0;
       //Inicializacion
       sw = true;
       
       //Bucle for
       for(i=1; i<=100; i++)
       {
           sw = !sw;
          
           
           if(sw)
           {
               pares = pares + i;
           
           }
           else
           {    
               impares = impares + i;
           }
       
      System.out.println("La suma de los pares del 1 al 100 es  "+ pares);
      System.out.println("La suma de los eimpares del 1 al 100 es  "+ impares);
       }
 
        
        
    }

}
