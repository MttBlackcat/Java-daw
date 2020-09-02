package ejemplocomposicion;

// Clase hija Profesor
class Profesor extends Persona
{
    // Atributos
    private String asignatura;
    private int num_despacho;
    
    // Constructores de la subclase Profesor
    Profesor()
    {
    }
    Profesor(String nombre, int telefono, String asignatura, int num_despacho)
    {
        super(nombre,telefono);
        this.asignatura = asignatura;
        this.num_despacho = num_despacho;
    }
    
    // Métodos de la subclase Profesor

    // Sacar atributo asignatura
    public String getAsignatura()
    {
        return asignatura;
    }

    // Meter atributo asignatura
    public void setAsignatura(String asignatura)
    {
        this.asignatura = asignatura;
    }

    // Sacar atributo num_despacho
    public int getNum_despacho()
    {
        return num_despacho;
    }

    // Meter atributo num_despacho
    public void setNum_despacho(int num_despacho)
    {
        this.num_despacho = num_despacho;
    }
}
