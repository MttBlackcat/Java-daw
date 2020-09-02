

package examenbejercicio1;


public class Poligono 
{
    //Atributos
    int numLado;
    float lado;
    
    //Constructores
    Poligono()
    {
    
    }
            
    Poligono(int numLado, float lado)
    {
        this.numLado = numLado;
        this.lado = lado;
    }

    /**
     * @return the numLado
     */
    int getNumLado() {
        return numLado;
    }

    /**
     * @param numLado the numLado to set
     */
    void setNumLado(int numLado) {
        this.numLado = numLado;
    }

    /**
     * @return the lado
     */
    float getLado() {
        return lado;
    }

    /**
     * @param lado the lado to set
     */
    void setLado(float lado) {
        this.lado = lado;
    }
    
    public float perimetro()
    {
        return lado*numLado;
    }
    
    public float area()
    {
        float resultado;
        
        switch(numLado)
        {
            case 3:  resultado = lado*(1.73f*lado/2)/2; break;
            case 4:  resultado = lado*lado; break;
            case 5: 
            case 6:  
            case 7:  
            case 8:  resultado = (perimetro()*apotema()/2); break;
            default: resultado=0;
        }
           return resultado;  
    }
    
    private float apotema()
    {
        float resultado;
        
        switch(numLado)
        {
            case 5: resultado = lado/1.45f; break;
            case 6: resultado = (float)Math.sqrt(lado*lado-(lado*lado/4)); break;
            case 7: resultado =  lado/0.9629f; break;   
            case 8: resultado = lado/0.828f; break; 
            default: resultado = 0;    
        }
        
        return resultado;
    }
}
    
    

