
package capicua;

import java.util.Scanner;

public class Capicua 
{

   
    
    public static void main(String[] args) 
    {
       Scanner teclado = new Scanner(System.in); 
        
       int i;
       int n, contador;
       int aux, num;
       boolean capicua;
       
       System.out.println("Escribe un número: ");
       n = teclado.nextInt();
       
       num=n;
       
       contador=0;
       
        while(num!=0)
        {
            num=num/10;
            contador++;
            //System.out.println(contador);
        }     
        
        aux = contador;
        capicua=true;
        
           for(i=1;i<=contador/2;i++)
           {
               if(Saca(n,i)!=Saca(n,aux))
               {
               capicua=false;  
               }
               
               aux--;
           }
      if(capicua)
      {
          System.out.println("Es capicua");
      }
      else
      {
          System.out.println("No es capicua");
      }
        
    }
 
    static int Saca(int n, int contador)
    {
        int i;
       
        for(i=1;i<contador;i++)
        {
            n=n/10;
        }
        return n%10;
    }
    
    
    
    
    
    
    
}
