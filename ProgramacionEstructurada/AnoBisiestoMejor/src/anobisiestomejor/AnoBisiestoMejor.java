
package anobisiestomejor;

import java.util.Scanner;


public class AnoBisiestoMejor {

    
    
        
    public static void main(String[] args) 
    {
        int ano;
        boolean resultado;   
        String solucion;
        // Pedimos el año
        ano = MeteDato();
        
        // Controlamos si es bisiesto
        resultado = ComprobarAno(ano);
        if(resultado)
        {
            solucion = "Es bisiesto";
        }
        else
        {
            solucion = "No es bisiesto";
        }
        // Mostramos por pantalla
        System.out.println("El año " + ano + " " + solucion);
                
    }
    
    static int MeteDato()
    {
        int ano;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce año: ");
        ano = teclado.nextInt();
        return ano;
    }
    //Devuelve true si es bisiesto y false si no lo es
    static boolean ComprobarAno(int ano)
    {
        return (ano % 4 == 0)&&  (ano % 100 != 0 || ano % 400 == 0);
    }
    
}
