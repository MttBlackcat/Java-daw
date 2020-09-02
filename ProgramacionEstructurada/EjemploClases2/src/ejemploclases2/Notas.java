
package ejemploclases2;

public class Notas 
{
    //Atributos de la clase
    private String nombre;
    private float notaTeoria;
    private float notaPractica;
    
    //Construcctores
    public Notas()
    {
    }
    
    public Notas(String nombre, float notaTeoria, float notaPractica)
    {
        this.nombre = nombre;
        this.notaPractica = notaPractica;
        this.notaTeoria = notaTeoria;
    }
    
    //Metodo para sacar el nombre de un alumno
    public String getNombre()
    {
        return nombre;
    } 
    
    //Metodo para sacar la nota de practicas
    public float getNotaPractica()
    {
        return notaPractica;
    }   

      //Metodo para sacar la nota de teoria de un alumno
    public float getNotaTeoria() 
    {
        return notaTeoria;
    }
    
    //Metodo para introducir el nombre de un alumno
    public void setNombre(String nombre) 
    {
        this.nombre = nombre;
    }

    //Metodo para modificar la nota de un alumno
    public void setNotaTeoria(float notaTeoria) 
    {
        this.notaTeoria = notaTeoria;
    }

    //Metodo para odificar la nota de practicas
    public void setNotaPractica(float notaPractica) 
    {
        this.notaPractica = notaPractica;
    }

    //Metodo para extraer la nota media de un alumno
    public float notaMedia()
    {
        return (notaPractica+notaTeoria)/2;
    }

    //Metodo que cambia la nota de teoria por la nota de practica
    public void cambiaNotas()
    {   
        float aux;
        aux = notaTeoria;
        notaTeoria = notaPractica;
        notaPractica = aux;
    }
    public String imprimeTodo()
    {
        return ("El alumno " + nombre + "\n Tiene una nota de practicas de "+notaPractica
                +"\nTiene una nota de teoria de "+notaTeoria+"\nTiene una nota media "
                +notaMedia());
    }
    public float notaMayor()
    {
        float aux;
        
            if(notaPractica>notaTeoria)
            {
                aux = notaPractica;
            }    
            else
            {
                aux = notaTeoria;
            }
        return aux;
    }

    public float notaMenor()
    {
        float aux;
        
            if(notaPractica>notaTeoria)
            {
                aux = notaTeoria;
            }    
            else
            {
                aux = notaPractica;
            }
        return aux;
    }
    
}


    