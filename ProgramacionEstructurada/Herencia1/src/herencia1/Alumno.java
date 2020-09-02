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
public class Alumno extends Persona
{
    // Atributos
    int matricula;
    float nota_teoria;
    float nota_practica;
    
    // Constructores
    Alumno()
    {
        
    }
    
    Alumno(String nombre, String telefono, int matricula, float nota_teoria, float nota_practica)
    {
        super(nombre, telefono);
        this.matricula = matricula;
        this.nota_teoria = nota_teoria;
        this.nota_practica = nota_practica;
    }
    
    // Métodos
    int getMatricula()
    {
        return matricula;
    }
    
    void setMatricula(int matricula)
    {
        this.matricula = matricula;
    }
    
    float getNota_teoria()
    {
        return nota_teoria;
    }
    
    void setNota_teoria(float nota_teoria)
    {
        this.nota_teoria = nota_teoria;
    }
    
    float getNota_practica()
    {
        return nota_practica;
    }
    
    void setNota_practica(float nota_practica)
    {
        this.nota_practica = nota_practica;
    }
    
    float media(float nota_teoria, float nota_practica)
    {
        return (nota_teoria + nota_practica) / 2;
    }
   
}
