package ejemplocomposicion;

// Clase hija Alumno
class Alumno extends Persona
{
    // Atributos
    private int num_matricula;
    
    // Constructores de la subclase Alumno
    Alumno()
    {
    }
    Alumno(String nombre, int telefono, int num_matricula)
    {
        super(nombre,telefono);
        this.num_matricula = num_matricula;
    }
    
    // Métodos de la subclase Alumno

    // Sacar atributo num_matricula
    public int getNum_matricula()
    {
        return num_matricula;
    }

    // Meter atributo num_matricula
    public void setNum_matricula(int num_matricula)
    {
        this.num_matricula = num_matricula;
    }
}