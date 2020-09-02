package ejemploalternativamultiple2;

import java.util.Scanner;
 
public class EjemploAlternativaMultiple2
{

   
    public static void main(String[] args) 
    {
        Scanner teclado = new Scanner(System.in);
        
        String nombre;
        char inicial;
        
        System.out.println("Escribe un nombre  ");
        nombre = teclado.nextLine();
        
        //captura de la inicial del nomre
        inicial = nombre.charAt(0);
        
        System.out.println("Tu nombre empieza por  "+inicial);
              
        //Algoritmo de resolucion con una alternativa doble
       switch(inicial)
       {
           case 'A': 
           case 'E':
           case 'I':              
           case 'O':
           case 'U':System.out.println("Tu nombre empieza por vocal");
           break;
           default:System.out.println("Tu nombre empieza por consonante  ");
                   
       }
       
    }
}
