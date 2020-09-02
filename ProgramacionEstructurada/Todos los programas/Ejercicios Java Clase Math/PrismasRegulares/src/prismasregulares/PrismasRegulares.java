
package prismasregulares;


public class PrismasRegulares {

    
    public static void main(String[] args) 
    {
    
        Prisma triangular = new Prisma(3, 10, 30);
        Prisma cuadrangular = new Prisma(4, 10, 30);
        Prisma pentagonal = new Prisma(5, 10, 30);
        Prisma hexagonal = new Prisma(6, 10, 30);
        
        
        System.out.println("Del prisma triangular: ");
        System.out.println("Numero de vertices  "+triangular.numeroDeVertices());
        System.out.println("Numero de aristas   "+triangular.numeroDeAristas()); 
        System.out.println("Area lateral        "+triangular.areaLateral());
        System.out.println("Valor del perimetro "+triangular.perimetro()+"\n");
    
        System.out.println("Del prisma cuadrangular: ");
        System.out.println("Numero de vertices  "+cuadrangular.numeroDeVertices());
        System.out.println("Numero de aristas   "+cuadrangular.numeroDeAristas()); 
        System.out.println("Area lateral        "+cuadrangular.areaLateral());
        System.out.println("Valor del perimetro "+cuadrangular.perimetro()+"\n");
    
        System.out.println("Del prisma pentagonal: ");
        System.out.println("Numero de vertices  "+pentagonal.numeroDeVertices());
        System.out.println("Numero de aristas   "+pentagonal.numeroDeAristas()); 
        System.out.println("Area lateral        "+pentagonal.areaLateral());
        System.out.println("Valor del perimetro "+pentagonal.perimetro()+"\n");
    
        System.out.println("Del prisma hexagonal: ");
        System.out.println("Numero de vertices  "+hexagonal.numeroDeVertices());
        System.out.println("Numero de aristas   "+hexagonal.numeroDeAristas()); 
        System.out.println("Area lateral        "+hexagonal.areaLateral());
        System.out.println("Valor del perimetro "+hexagonal.perimetro()+"\n");
    }
    
}   
