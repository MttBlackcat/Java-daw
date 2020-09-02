/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia1;

/**
 *
 * @author Alumno
 */
public class Persona 
{
    // Atributos
    private String nombre;
    private String telefono;
    
    // Constructores
    Persona()
    {
        
    }
    
    Persona(String nombre, String telefono)
    {
        this.nombre = nombre;
        this.telefono = telefono;
    }
    
    // Mètodos
    String getNombre()
    {
        return nombre;
    }
    
    void setNombre(String nombre)
    {
        this.nombre = nombre;
    }
    
    String getTelefono()
    {
        return telefono;
    }
    
    void setTelefono(String telefono)
    {
        this.telefono = telefono;
    }
}
