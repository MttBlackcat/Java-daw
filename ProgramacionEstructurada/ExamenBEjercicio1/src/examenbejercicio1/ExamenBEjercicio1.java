

package examenbejercicio1;


public class ExamenBEjercicio1 
{

    
    public static void main(String[] args) 
    {
        // Creacion de objetos
        Poligono triangulo = new Poligono(3,10f);
        Poligono cuadrado  = new Poligono(4,10f);
        Poligono pentagono = new Poligono(5,10f);
        Poligono hexagono  = new Poligono(6,10f);
        Poligono heptagono = new Poligono(7,10f);
        Poligono octogono  = new Poligono(8,10f);
        
        
        //Escritura por pantalla de los resultados
        
        System.out.println("Triangulo:");
        System.out.println("El perimetro es "+triangulo.perimetro());
        System.out.println("El area es      "+triangulo.area());
        
        System.out.println("Cuadrado:");
        System.out.println("El perimetro es "+cuadrado.perimetro());
        System.out.println("El area es      "+cuadrado.area());
        
        System.out.println("Pentagono:");
        System.out.println("El perimetro es "+pentagono.perimetro());
        System.out.println("El area es      "+pentagono.area());
        
        System.out.println("Hexagono:");
        System.out.println("El perimetro es "+hexagono.perimetro());
        System.out.println("El area es      "+hexagono.area());
        
        System.out.println("Heptagono:");
        System.out.println("El perimetro es "+heptagono.perimetro());
        System.out.println("El area es      "+heptagono.area());
        
        System.out.println("Octogono:");
        System.out.println("El perimetro es "+octogono.perimetro());
        System.out.println("El area es      "+octogono.area());
        
       
    }
    
}
