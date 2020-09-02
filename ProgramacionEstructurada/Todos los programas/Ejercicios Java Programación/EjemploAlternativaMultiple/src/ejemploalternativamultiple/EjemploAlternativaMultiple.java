package ejemploalternativamultiple;

import java.util.Scanner;
 
public class EjemploAlternativaMultiple
{

   
    public static void main(String[] args) 
    {
        Scanner teclado = new Scanner(System.in);
        
        int nota;
        
        System.out.println("Escribe la nota del alumn@  ");
        nota = teclado.nextInt();
        
        
        //Algoritmo de resolucion con una alternativa doble
       switch(nota)
       {
           case 0:
           case 1:
           case 2:              
           case 4:
               System.out.println("Vuelva otro dia  ");
               break;
               
           case 5:
           case 6:
               System.out.println("Estas aprobado  ");
               break;
           case 7:
           case 8:
               System.out.println("Muy bien notable  ");
               break;
               
           case 9:
           case 10:
               System.out.println("Sobrealiente   ");
               break;
               
           default:
               System.out.println("Error del sistema  ");
               
       
       }
       
    }
}
