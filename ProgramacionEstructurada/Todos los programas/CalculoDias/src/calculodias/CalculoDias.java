/*
     Este programa calculo el numero de dias entre dos fechas
     David Villaluenga
     08/11/2014
 */
package calculodias;

import java.util.Scanner;

public class CalculoDias 
{

    public static void main(String[] args) 
    {
        //Declaracion de variables
        int dia1 ,mes1, anno1;
        int dia2 ,mes2, anno2;
        int suma;
        
    
        //Inicializacion de  variables
        
        dia1 = MeteDato("Dia entrada");
        mes1 = MeteDato("Mes entrada");
        anno1 = MeteDato("Año de entrada");
        dia2 = MeteDato("Dia salida");
        mes2 = MeteDato("Mes salida");
        anno2 = MeteDato("Año de salida");

        
        //Calculos
        if(mes1==mes2 && anno1==anno2)
        {
            suma = dia2 - dia1;
        }
        else
        {
            if(mes1<mes2 && anno1==anno2)
            {
                suma = SumaDias(mes1, anno1) - dia1;
                mes1++;
                while(mes1<mes2)
                {
                    suma = suma + SumaDias(mes1, anno1);
                    mes1++;
                }
                suma = suma + dia2;
            }
            else
            {
                suma = SumaDias(mes1, anno1) - dia1; 
                mes1++;
                while(anno1<anno2 || mes1<mes2)
                {
                    if(mes1>12)
                    {
                        mes1=1;
                        anno1++;
                    }  
                    else
                    {
                    suma = suma + SumaDias(mes1, anno1);
                    mes1++;
                    }
                }    
                suma = suma + dia2;
                    
            }
        }
        
        System.out.println("El numero de dias es: "+suma+" dias\n");
    }
    
    
    
    //Metodo para introducir un entero por teclado
    static int MeteDato(String lectura)
    {
        int dato;
                
        Scanner teclado = new Scanner(System.in);
        
        
        System.out.println("Escribe el valor de "+lectura+":");
        dato = teclado.nextInt();
        
        return dato;
    }
    
    //Funcion que devuelve el numero de dias de un mes determinado
    static int SumaDias(int mes, int anno)
    {
        int dia;
        dia = 0;
        
        switch(mes)
        {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                dia = 31;
                break;
            case 4: case 6: case 9: case 11:
                dia = 30;
                break;
            case 2:
                if((anno%4==0)||(anno%400!=0||anno%100==0))
                {
                    dia = 29;
                }
                else
                {
                    dia = 28;
                }
                break;
            default:
                System.out.println("El numero del mes debe ser real");
        }   
        return dia;
    }
    
    
}
