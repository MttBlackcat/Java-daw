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
public class Profesor extends Persona
{
    // Atributos
    String asignatura;
    int num_despacho;
    
    // Constructores
    Profesor()
    {
        
    }
    
    Profesor(String nombre, String telefono, String asignatura, int num_despacho)
    {
        super(nombre,telefono);
        this.asignatura = asignatura;
        this.num_despacho = num_despacho;
    }
    
    // Métodos
    String getAsignatura()
    {
        return asignatura;
    }
    
    void setAsignatura(String asignatura)
    {
        this.asignatura = asignatura;
    }
    
    int getNum_despacho()
    {
        return num_despacho;
    }
    
    void setTelefono(int num_despacho)
    {
        this.num_despacho = num_despacho;
    }
}
