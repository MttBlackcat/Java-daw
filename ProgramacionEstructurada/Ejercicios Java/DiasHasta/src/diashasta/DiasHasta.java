/*
    Algoritmo que pide por teclado una fecha dia, mes y año
    y nos calcula y escribe los dias que restan hasta el 31 de
    diciembre del año de la fecha
 */
package diashasta;

import java.util.Scanner;


public class DiasHasta {

   
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
        
        for(i=12;i>mes;i--)
        {
            suma = suma + sumaDias(i,ano);
        }
        
            suma = suma + sumaDias(mes,ano)- dia;
            
            System.out.println("Quedan "+suma+" dias para el 31 de diciembre ");
        
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
    
    
    
    
    
    
