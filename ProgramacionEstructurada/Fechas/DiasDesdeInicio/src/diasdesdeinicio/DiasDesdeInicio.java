/*
    Algoritmo que pide por teclado una fecha en formato 
    dia, mes y año, y nos calcula y describe cuantos dias 
    han transcurrido desde el 1 de enero de ese mismo año
    hasta la fecha introducida
*/
package diasdesdeinicio;

import java.util.Scanner;

public class DiasDesdeInicio 
{

   
    public static void main(String[] args) 
    {
      
        int dia, mes, ano;
        int i;
        int suma;
        suma = 0;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduce el dia ");
        dia = teclado.nextInt();
        System.out.println("Introduce el mes ");
        mes = teclado.nextInt();
        System.out.println("Introduce el año ");
        ano = teclado.nextInt();
        
        
        
        for(i=1;i<=(mes-1);i++)
        {
            suma = suma + sumaDias(i,ano);
        }
        
        suma = suma + dia;
        
        System.out.println("Han transcurrido "+suma);
        
        
    
        
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
        
        
        }
    return sum;
    }
    
    
    
        //Metodo que devuelve true si el año introducido es bisiesto
        static boolean ComprobarAno(int ano)
    {
        return (ano % 4 == 0) &&  (ano % 100 != 0 || ano % 400 == 0);
    }
    
}
