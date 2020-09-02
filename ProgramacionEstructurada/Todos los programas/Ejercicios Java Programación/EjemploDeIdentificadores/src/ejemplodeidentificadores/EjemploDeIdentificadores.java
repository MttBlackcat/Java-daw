/*
Ejemplo de identificadores, tipos, variables y valores
Autor: David y Luis
Fecha: 10/10/2014
 */

package ejemplodeidentificadores;

import java.util.Scanner;

//Clase ppal. del programa
public class EjemploDeIdentificadores
{

    //En este ejercicio vemos identificadores, tipos y valores
    public static void main(String[] args) 
    {       
        //Creamos el objeto teclado
        Scanner teclado = new Scanner(System.in);
        
        
        //  Declaraciones de variables
        byte emp;
        short ep;
        int e;
        long el;
        float nr;
        double nrd;
        char letra;
        String cadena;
        boolean vl;
        
        
        
        //Iniciaización de valores a las variables
        
        //emp = 25;
        System.out.print("Introduce un valor entero muy pequeño  ");
        emp = teclado.nextByte();
        //ep = 12575;
        System.out.print("Introduce un valor entero pequeño    ");
        ep = teclado.nextShort();
        //e = 15000000;
        System.out.print("Introduce un valor entero    ");
        e = teclado.nextInt();
        //el = 1234567846444L;
        System.out.print("Introduce un valor entero grande   ");
        el = teclado.nextLong();
        //nr = 3.141592f;
        System.out.print("Introduce un valor real   ");
        nr = teclado.nextFloat();
        //nrd = 888888888888888888888888.888888d;
        System.out.print("Introduce un valor doble   ");
        nrd = teclado.nextDouble();
        //letra = 'd';*/
        System.out.print("Introduce un valor char   ");
        teclado.nextLine();
        letra = teclado.nextLine().charAt(0);
        //cadena = "Hola";
        System.out.print("Introduce una cadena de caracteres   ");
        cadena = teclado.nextLine();
        //vl = false;*/
        System.out.print("Introduce un valor true/false  ");
        vl = teclado.nextBoolean();
                
        
      
        
        // Salida
        System.out.println("El valor byte es: " + emp);
        System.out.println("El valor short es: " + ep);
        System.out.println("El valor int es: " + e);
        System.out.println("El valor long es: " + el);
        System.out.printf("El valor float es: %.3f\n", nr);
        System.out.println("El valor double es: " + nrd);
        System.out.println("El valor char es: " + letra);
        System.out.println("El valor String es:  "+ cadena);
        System.out.printf("El valor float es: %.3f. El valor char es:   %c\n", nrd, letra );
        System.out.println("El valor boolean es:  "+ vl);
        
        
        
        
        
        
        
        
        
    }
}
