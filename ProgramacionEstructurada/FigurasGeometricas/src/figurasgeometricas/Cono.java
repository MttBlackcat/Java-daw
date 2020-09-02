
 
package figurasgeometricas;


public class Cono 
{

    //Declaracion de atributos
    float radio;
    float altura;
    
    //Constructores
    Cono()
    {
    }
    Cono(float radio, float altura)
    {
        this.radio = radio;
        this.altura = altura;
    }
    
    //Metodos
    
    //Metodo generatriz
    float generatrizCono()
    {
        return (float)Math.sqrt((radio*radio)+(altura*altura));
    }
    
    //Metodo area de base
    float areaBaseCono()
    {
        return 3.141592f*radio*radio;
    }

    //Metodo superficie area lateral
    float areaLateralCono()
    {
        return 3.141592f*radio*generatrizCono();
    }

    //Metodo del area total del cono
    float areaTotalCono()
    {
        return areaLateralCono() + areaBaseCono();
    }

    //Metodo que calcula el volumen
    float volumenCono()
    {
        return 1f/3 * 3.141592f * radio * radio * altura; 
    }
}
