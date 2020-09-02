/*
    Clase que opera con digitos binarios
 */

package examenaejercicio1;

/*
    David Villaluenga
    05/12/2014
*/
public class Binario 
{
    //Atributos
    int digito1;
    int digito2;
    
    //Constructores
    //Construcctor por defecto
    Binario()
    {
    }
    
    //Constructor con parametros
    Binario(int digito1, int digito2)
    {
        this.digito1=digito1;
        this.digito2=digito2;
    }
    
    //Metodos de la clase
    
    //Metodo para extraer digito1
    public int getDigito1()
    {
       return digito1; 
    }
    
    //Metodo para modificar digito1
    public void setDigito1(int digito1)
    {
        this.digito1 = digito1;
    }

    //Metodo para extraer digito2
    public int getDigito2()
    {
       return digito2; 
    }
    
    //Metodo para modificar digito2
    public void setDigito2(int digito2)
    {
        this.digito2 = digito2;
    }

    //Metodo que devuelve la suma de los dos digitos
    public int suma()
    {
        int sum;
        
        if(digito1==1||digito2==1)
        {
            sum = 1;
        }
        else
        {
            sum=0;
        }
        return sum;
    }
    
    //Metodo que devuelve el acarreo de los dos digitos
    public int acarreo()
    {
        int aux;
        
        if(digito1==1&&digito2==1)
        {
            aux = 1;
        }
        else
        {
            aux=0;
        }
        return aux;
    }

}
