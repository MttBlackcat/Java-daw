package ejemplocomposicion;

class Persona
{
    // Atributos
    protected String nombre;
    protected int telefono;
    
    // Constructores
    Persona()
    {
    }
    Persona(String nombre, int telefono)
    {
        this.nombre = nombre;
        this.telefono = telefono;
    }
    
    // Métodos de la clase Persona

    // Sacar atributo nombre
    public String getNombre()
    {
        return nombre;
    }

    // Introducir atributo nombre
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    // Sacar atributo telefono 
    public int getTelefono()
    {
        return telefono;
    }

    // Introducir atributo telefono
    public void setTelefono(int telefono)
    {
        this.telefono = telefono;
    }
}
