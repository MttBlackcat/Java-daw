
package coordenadascartesianas;

import java.util.Scanner;

public class CoordenadasCartesianas
{

    public static void main(String[] args) 
    {
    
        Scanner teclado = new Scanner(System.in);
        
        Puntos puntoA = new Puntos();
        
        Puntos puntoB = new Puntos();
        
        
        System.out.print("Escribe el valor de x del primer punto: ");
        puntoA.setX(teclado.nextFloat());
        System.out.print("Escribe el valor de y del primer punto: ");
        puntoA.setY(teclado.nextFloat());
        
        
        System.out.print("Escribe el valor de x del segundo punto: ");
        puntoB.setX(teclado.nextFloat());
        System.out.print("Escribe el valor de y del segundo punto: ");
        puntoB.setY(teclado.nextFloat());
        
        
         //Creamos un nuevo objeto que sea el vector que une los dos puntos
        Puntos puntoUnion = new Puntos();
        //Los puntos del vector union son:
        puntoUnion.setX(puntoA.getX()- puntoB.getX());
        puntoUnion.setY(puntoA.getY()- puntoB.getY());
        
        System.out.println("La distancia entre los puntos y el origen es: ");
        System.out.println("Punto A: "+puntoA.DistanciaLineal());
        System.out.println("El punto "+puntoA.EstaEnEjes()+puntoA.Cuadrante());
        System.out.println("Punto B: "+puntoB.DistanciaLineal());
        System.out.println("El punto "+puntoB.EstaEnEjes()+puntoB.Cuadrante());
        
        System.out.println("La distancia entre los puntos es: "+puntoUnion.DistanciaLineal());
    }
    
}
