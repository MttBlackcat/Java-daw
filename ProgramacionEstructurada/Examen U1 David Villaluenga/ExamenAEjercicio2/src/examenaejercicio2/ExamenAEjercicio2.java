/*
    Programa para obtener de manera aleatoria una apuesta de Euromillones
 */

package examenaejercicio2;

/*
    David Villaluenga
    05/12/2014
*/ 

//importamos la clase Scanner
import java.util.Scanner;

public class ExamenAEjercicio2 
{

    
    public static void main(String[] args) 
    {
        
      //Atributos  
      char letra;
      int aleatorio1, aleatorio2, aleatorio3, aleatorio4, aleatorio5;
      int estrella1, estrella2;
      int contador = 0;
      
      //Inicializamos el objeto Scanner
      Scanner teclado = new Scanner(System.in);
      
      //Bucle principal
      do{
            //Actualizamos el contador
            contador++;


            //Generacion de los numeros y comprobamos la no repeticion
            aleatorio1 = (int)(Math.random()*50)+1;

            do{
                aleatorio2= (int)(Math.random()*50)+1;
            }while(aleatorio1==aleatorio2);

            do{
                aleatorio3 = (int)(Math.random()*50)+1;
            }while(aleatorio1==aleatorio3 || aleatorio2==aleatorio3);

            do{
                aleatorio4 = (int)(Math.random()*50)+1;
            }while(aleatorio1==aleatorio4 || aleatorio2==aleatorio4 || aleatorio3==aleatorio4);

            do{
                aleatorio5 = (int)(Math.random()*50)+1;
            }while(aleatorio1==aleatorio5 || aleatorio2==aleatorio5 || aleatorio3==aleatorio5 || aleatorio4==aleatorio5);

            //Generacion de las estrellas y comprobacion de la no repeticion
            estrella1 = (int)(Math.random()*11)+1;

            do{
                estrella2= (int)(Math.random()*11)+1;
            }while(estrella1==estrella2);


            //Resultados por pantalla
            System.out.println("\nApuesta número "+contador);
            System.out.println("===============================");
            System.out.println("Números:     "+aleatorio1+", "+aleatorio2+", "+aleatorio3+", "+aleatorio4+", "+aleatorio5);
            System.out.println("Estrellas:   "+estrella1+", "+estrella2+"\n");
            
            //Sentencia para repetir la apuesta
            do{
                System.out.print("Deseas obtener otra apuesta S/N: ");
                letra = teclado.nextLine().charAt(0);
            }while(letra!='N'&& letra!='n' && letra!='S' && letra!='s');

      
        }while (letra!='N' && letra!='n');
      
      System.out.println("\n");
    }
        
}
