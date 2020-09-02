
package fechajuliana;

import java.util.Scanner;


public class FechaJuliana 
{

    
    public static void main(String[] args) 
    {
       
        int dia, ano;
        int i;
        int suma;
        suma = 0;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduce los dias ");
        dia = teclado.nextInt();
        System.out.println("Introduce el año ");
        ano = teclado.nextInt();
        
        
        for (i=1;dia>sumaDias(i,ano);i++)
        {
           dia = dia - sumaDias(i,ano);
           
        }
        
        
        System.out.print("El dia introducido es : "+dia+"/"+i+"/"+ano+"\n\n");
        
        
        
        
        
    }
    
     static int sumaDias(int mes, int ano)
    {
        int sum;
        sum= 0;
                
        
        switch(mes)
        {
            case 1:  case 3: case 5: case 7: case 8: case 10: case 12:
            sum = 31;
            break;
                
            case 4: case 6: case 9: case 11:
            sum = 30;
            break;
                
            case 2:
            if(ComprobarAno(ano))
            {
                    sum = 29;
            }            
            else
            {
                sum = 28;
            }
            break;
            default:
        
        }
    return sum;
    }
    
    
    
        //Metodo que devuelve true si el año introducido es bisiesto
    static boolean ComprobarAno(int ano)
    {
        return (ano % 4 == 0) &&  (ano % 100 != 0 || ano % 400 == 0);
    }
    


}
