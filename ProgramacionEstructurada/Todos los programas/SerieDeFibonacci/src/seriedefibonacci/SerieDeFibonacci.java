/*
    Programa que calcula la sucesion de Fibonnacci de manera recursiva e iterativa
    Es una sucesion numerica que empieza por 0 y 1 y cada siguiente valor es 
    suma de los dos valores anteriores de la sucesión
*/
package seriedefibonacci;

import java.util.Scanner;

public class SerieDeFibonacci {

    
    public static void main(String[] args)
    {
      int termino;  
      int num;
      int i;  
      
      Scanner teclado= new Scanner(System.in);
      
      System.out.println("Numero de terminos de la serie: ");
      num = teclado.nextInt();
      
      //GenerarSerieFibonacci(num);
      
       for(i=1;i<=num;i++)
            {
                termino=GenerarSucesionRecursivaFibonacci(i);
                System.out.print(termino+" ");
            }
    }
    
    
    //Funcion sucesion de Fibonacci recursiva
    static int GenerarSucesionRecursivaFibonacci(int i)
    {
        int termino;
        
        if(i==1)
        {
            termino = 0;
        }
        else
            if(i==2)
            {
                termino=1;
            }
            else
            {
                termino= GenerarSucesionRecursivaFibonacci(i-1)+GenerarSucesionRecursivaFibonacci(i-2);
            }
       return termino;
    }
    
    
    
    //Funcion sucesion de Fibonacci iterativa
    static void GenerarSerieFibonacci(int num)
    {
      int n1, n2;
      int Fib;
      int i;
      
      n1=1;
      n2=0;
      
      
        System.out.print("\nLa serie de Fibonacci es: \n"+n2+" "+n1+" ");
      //Metodo iterativo
      for(i=3;i<=num;i++)
      {
          Fib=n1+n2;
          n2 = n1;
          n1 = Fib;
          System.out.print(Fib+" ");
          if(i%10==0)
          {
              System.out.print("\n");
          }
      }
        
    System.out.println("\n");
    }
    
}
