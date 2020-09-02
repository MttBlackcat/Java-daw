/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciocircunferencia;

/**
 *
 * @author Alumno
 */
public class Circunferencia 
{
    // Atributos
    private float radio;
        
    // Constructores
    Circunferencia()
    {
        
    }
    
    Circunferencia(float radio)
    {
        this.radio = radio;
    }
    
    // Métodos
    public float getRadio()
    {
        return radio;
    }
    
    public void setRadio(float radio)
    {
        this.radio = radio;
    }
    
    public float longitudCircunferencia()
    {
        return 2 * 3.141592f * radio;
    }
    
    public float areaCirculo()
    {
        return 3.141592f * radio * radio;
    }
    
    public float volumenEsfera()
    {
        return 4f / 3 * 3.141592f * (radio * radio * radio);
    }
   
}
