
package prismasregulares;

public class Prisma 
{
    //Atributos
    int ladosBase;
    float lado;
    float altura;
    
    //Constructores
    Prisma()
    {
    }
    Prisma(int ladosBase, float lado, float altura)
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
    
    public float areaLateral()
    {
      return perimetroBase()*altura;  
    }
    
    private float perimetroBase()
    {
        return  lado*ladosBase;
    }
    public float perimetro()
    {
         return perimetroBase()*2 + altura*ladosBase;
    }
    
    
    
    
    
    
    
}
