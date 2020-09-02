
package prismasregulares;

public class Prisma 
{
    //Atributos
    int ladosBase;
    int lado;
    int altura;
    
    //Constructores
    Prisma()
    {
    }
    Prisma(int ladosBase, int lado, int altura)
    {
        this.ladosBase = ladosBase;
        this.lado = lado;
        this.altura = altura;
    }
    
    public int numeroDeVertices()
    {
        return ladosBase*2;
    }
    
    public int numeroDeAristas()
    {
        return ladosBase*3;
    }
    
    public int areaLateral()
    {
      return perimetroBase()*altura;  
    }
    
    private int perimetroBase()
    {
        return  lado*ladosBase;
    }
    public int perimetro()
    {
         return perimetroBase()*2 + altura*ladosBase;
    }
    
    
    
    
    
    
    
}
