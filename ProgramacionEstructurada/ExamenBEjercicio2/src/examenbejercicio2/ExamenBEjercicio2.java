
package examenbejercicio2;

import java.util.Scanner;

public class ExamenBEjercicio2 {

    
    public static void main(String[] args) 
    {
       Scanner teclado = new Scanner(System.in); 
       int valor;
       char letra;
       int i;
       int contador=0;
       
       
       
       do{
       contador++;    
       System.out.println("Apuesta "+contador);    
       System.out.println("=================");   
           
       for(i=1; i<=14;i++)
       {
          valor = (int)(Math.random()*100)+1;
          if(valor<=50)
          {
              System.out.printf("%2d.     1\n",i);
          }
          else
          {
              if(valor<=80)
              {
                 System.out.printf("%2d.       X\n",i);
              }
              else
              {
                  System.out.printf("%2d.        2\n",i);
              }
          }
          
       }
           
           
       System.out.print("Deseas continuar S/N: ");
       letra = teclado.nextLine().charAt(0);
           
       } while(letra != 'N'&& letra!='n');
        
        
    }
   
}
