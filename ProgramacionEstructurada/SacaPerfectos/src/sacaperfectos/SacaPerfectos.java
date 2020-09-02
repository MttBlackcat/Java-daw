
package sacaperfectos;


public class SacaPerfectos 
{

    public static void main(String[] args) 
    {
             SacaPerfectos();
    }
    
    //Saca los numero perfectos de los 100000 primeros numeros
    static void SacaPerfectos()
    {
        int i;
        
        for(i=6;i<100000;i++)
        {
            if(SumaDivMenosN(i)==i)
            {
                System.out.print(i+" ");
            }
        }
    }
    
      static int SumaDivMenosN(int n)
    {
        int suma;
        int divisor;
        
        suma = 1; 
        
        for (divisor=2; divisor <= n/2f; divisor++ )
        {
            if (n % divisor == 0)
            {
                suma = suma + divisor;
            }
        }
        return suma;
    }
    
}
