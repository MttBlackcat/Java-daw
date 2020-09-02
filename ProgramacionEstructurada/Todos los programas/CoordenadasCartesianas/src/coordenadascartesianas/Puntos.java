/*
 
 */
package coordenadascartesianas;

public class Puntos 
{
    //Atributos
    float x;
    float y;
   
    //Constructor
    Puntos()
    {
    }
   
    
    //Metodos
    void setY(float y)
    {
       this.y=y; 
    }
    
    float getY()
    {
        return y;
    }
    
    void setX(float x)
    {
        this.x=x;
    }   
     
    float getX()
    {
        return x;
    }
   
    float DistanciaLineal()
    {
        return (float)Math.sqrt(x*x+y*y);
    }
    
    //Metodo para saber en que eje esta el punto
    String EstaEnEjes()
    {
        String cadena;
        
        if(x==0&&y==0)
        {
            cadena = "esta en el origen de coordenadas ";
        }
        else
        {
            if(y==0)
            {
                cadena = "esta en el eje x ";
            }
            else
                if(x==0)
                {
                    cadena = "esta en el eje y ";
                }
                else
                {
                    cadena = "no esta en ningun eje ";
                }
        }
        return cadena;
    }
    
    String Cuadrante()
    {
        String cadena;
        
        if(x==0&&y==0)
        {
            cadena = "esta entre 1, 2, 3 y 4 cuadrante ";
        }
        else
        {
            if(y==0)
            {
                if(x>0)
                {
                    cadena = "esta entre el 1 y 4 cuadrante ";
                }
                else
                {
                    cadena = "esta entre el 2 y 3 cuadrante ";
                }
                
            }
            else
            {
                if(x==0)
                {
                    if(y>0)
                    {
                        cadena = "esta entre el 1 y 2 cuadrante ";
                    }
                    else
                    {
                        cadena = "esta entre el 3 y 4 cuadrante ";
                    }
                }    
                else
                {
                   if(x>0)
                   {
                       if(y>0)
                       {
                            cadena = "esta en el 1 cuadrante ";
                       }
                       else
                       {
                            cadena = "esta en el 4 cuadrante ";
                       }
                   }
                   else
                   {
                       if(y>0)
                       {
                           cadena = "esta en el 2 cuadrante ";
                       }
                       else
                       {
                           cadena = "esta en el 3 cuadrante ";
                       }
                       
                   }
                   
                }
            } 
        }
        return cadena;
    }
}