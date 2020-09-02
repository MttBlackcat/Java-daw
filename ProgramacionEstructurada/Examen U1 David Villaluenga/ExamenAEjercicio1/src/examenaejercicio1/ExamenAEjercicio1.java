/*
    Programa que muestra por pantalla operaciones con digitos binarios
 */

package examenaejercicio1;

/*
    David Villaluenga
    05/12/2014
*/

//importamos la clase Scanner
import java.util.Scanner;

public class ExamenAEjercicio1 
{

   
    public static void main(String[] args) 
    {
       //Creacion de objetos Binarios
       Binario binario1 = new Binario();
       Binario binario2 = new Binario(1,1);
       
       //Creacion del objeto teclado
       Scanner teclado = new Scanner(System.in);
       
       
       //Introduccion de datos del objeto binario1
       do{
       System.out.print("Escribe el primer digito binario: "); 
       binario1.setDigito1(teclado.nextInt());
       if(binario1.getDigito1()!=0 && binario1.getDigito1()!=1)
       {
           System.out.println("\nEl valor debe ser cero o uno.");
       }
       }while(binario1.getDigito1()!=0 && binario1.getDigito1()!=1);
       
       do{
       System.out.print("Escribe el segundo digito binario: "); 
       binario1.setDigito2(teclado.nextInt());
       if(binario1.getDigito2()!=0 && binario1.getDigito2()!=1)
       {
           System.out.println("\nEl valor debe ser cero o uno.");
       }
      }while(binario1.getDigito2()!=0 && binario1.getDigito2()!=1);
       
       
       //Salida de resultados
       System.out.println("Numero binario 1: "+binario1.getDigito1()+", "+binario1.getDigito2());
       System.out.println("El valor de la suma de sus digitos es:  "+binario1.suma());
       System.out.println("El valor del acarreo de sus digitos es: "+binario1.acarreo()+"\n");
       
       System.out.println("Numero binario 2: "+binario2.getDigito1()+", "+binario2.getDigito2());
       System.out.println("El valor de la suma de sus digitos es:  "+binario2.suma());
       System.out.println("El valor del acarreo de sus digitos es: "+binario2.acarreo()+"\n\n");
    }
    
}
