/*
    Programa. Calculo de Factorial
    Este programa calculo el factorial de un numero pedido por pantalla
    mediante tres bucles: for, while, do while
    David Villaluenga
    21/10/2014
 */

package calculodefactorial;

//Importacion de clases
import java.util.Scanner;

public class CalculoDeFactorial 
{

    
    public static void main(String[] args) 
    {
        //inicializacion de variables
        //Con integer se puede calcular hasta 12! con long hasta 20!  
        long factorial;
        int i, numero;
                     
        Scanner teclado = new Scanner(System.in);
                
        //Entrada de datos y comprobacion de su tamaño
      
        do{
            System.out.println("Escribe un numero entero positivo y no excesivamente grande   ");
            numero = teclado.nextInt();
            if(numero>=21 || numero<=0)
            {
             System.out.println("ERROR  Solo se pueden introducir numeros menores de 13 y mayores de cero");   
            }
        }while(numero>=21 || numero<=0);
     
        // Usamos función recursiva para el cálculo del factorial
        factorial = Fact(numero);
        System.out.println("El factorial del numero "+numero+" es "+factorial);
        
        //Bucle de calculo
        //Bucle for
        factorial = 1;
        for(i=1; i<=numero; i++)
            {
            factorial = factorial*i;
            }
            System.out.println("El factorial del numero mediante un bucle for "+numero+" es "+factorial);
            
           
 
        //Bucle while
        //reinicializacion de las variables
        factorial = 1;
        i=1;
        while(i<=numero)
             {
             factorial = factorial * i;
             i++;
             }
             System.out.println("El factorial del numero mediante un bucle while "+numero+" es "+factorial);
   
        //Bucle do while
        //reinicializacion de las variables
        i=1;
        factorial = 1;
        do
            {
            factorial =factorial * i;
            i++;
            }while(i<=numero);
            System.out.println("El factorial del numero mediante un bucle do while "+numero+" es "+factorial);

    }   
        
        
        
        
    static long Fact(int numero)
    {
        long f;
            
        if (numero == 1)
        {
            f = 1;
        }
        else
        {
            f = numero * Fact(numero - 1);
        }
        return f;
    }
        
        
        
        
    

}
