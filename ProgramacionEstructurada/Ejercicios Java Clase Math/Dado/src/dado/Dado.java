
package dado;


public class Dado 
{

    
    public static void main(String[] args)
    {
        int i;
        
        for(int j = 1;j<=6;j++)
        {
        
        i = 1 + (int)(Math.round(Math.random()*48.49));
        
        System.out.println(i);
        }
        
    }
    
}
