
 
package figurasgeometricas;


public class Cilindro 
{

    //Declaracion de atributos
    float radio;
    float altura;
    
    //Constructores
    Cilindro()
    {
    }
    Cilindro(float radio, float altura)
    {
        this.radio = radio;
        this.altura = altura;
    }
    
    //Metodos
    
    //Metodo area de base
    float areaBaseCilindro()
    {
        return 3.141592f*radio*radio;
    }

    //Metodo superficie area lateral
    float areaLateralCilindro()
    {
        return 2 * 3.141592f * radio * altura;
    }

    //Metodo del area total
    float areaTotalCilindro()
    {
        return areaLateralCilindro() + 2 * areaBaseCilindro();
    }

    //Metodo que calcula el volumen
    float volumenCilindro()
    {
        return altura * areaBaseCilindro(); 
    }
}
