
package numerosprimos;

public class NumerosPrimos 
{

   
    public static void main(String[] args) 
    {
        int i;
        boolean resultado;
        int contador;
        contador = 1;
        //El uno no es primo
        System.out.println("lista de los numeros primos: \n");
        System.out.printf(" %-6d",2);
        
        for(i=3;i<10000;i=i+2)
        {
            resultado = EsPrimo(i);
            if(resultado)
            {
                System.out.printf(" %-6d",i);
                contador++;
                if(contador%10==0)
                {
                    System.out.print("\n");
                }
            }
           
            
        }
    System.out.println("\n");   
        
    }
    //Funcion que devuelve true si el numero es primo
    static boolean EsPrimo(int n)
    {
        int i; 
        boolean primo;
        
        i = n/2;
        
        while(n%i != 0)
        {
            i--;
        }
        
        //Si salimos del bucle 
        primo = (i==1);
       /* for(i=2;i<(n/2);i++)
        {
            if(n%i==0)
            {
                primo = false;
            }
        }*/
        return primo;
    }
}
