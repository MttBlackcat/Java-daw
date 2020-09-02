package ejemplocomposicion;

public class TrabajoFinDeCiclo
{
    // Atributos
    private Profesor profesor;
    private Alumno alumno;
    private String titulo;
    private float nota;
    
    // Constructores
    TrabajoFinDeCiclo()
    {
    }
    TrabajoFinDeCiclo(String titulo, Profesor profesor, Alumno alumno, float nota)
    {
        this.titulo = titulo;
        this.profesor = profesor;
        this.alumno = alumno;
        this.nota = nota;
    }
    
    // Métodos

    // Metodo para extraer el título del trabajo
    public String getTitulo()
    {
        return titulo;
    }

    // Metodo para meter el título del trabajo
    public void setTitulo(String titulo)
    {
        this.titulo = titulo;
    }

    // Metodo para extraer los datos del profesor
    public Profesor getProfesor()
    {
        return profesor;
    }

    // Metodo para meter los datos del profesor
    public void setProfesor(Profesor profesor)
    {
        this.profesor = profesor;
    }

    // Metodo para extraer los datos del alumno
    public Alumno getAlumno()
    {
        return alumno;
    }

    // Metodo para meter los datos del alumno
    public void setAlumno(Alumno alumno)
    {
        this.alumno = alumno;
    }

    // Metodo para extraer la nota del trabajo
    public float getNota()
    {
        return nota;
    }

    // Metodo para meter la nota del trabajo
    public void setNota(float nota)
    {
        this.nota = nota;
    }
}
