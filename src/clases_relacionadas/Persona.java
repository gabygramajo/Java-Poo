package clases_relacionadas;

public class Persona {
    private String nombre;
    private String apellido;
    private Sexo sexo;
    private int edad;

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Persona(String nombre, String apellido, Sexo sexo, int edad) {
        this(nombre, apellido);
        this.sexo = sexo;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public int getEdad() {
        return edad;
    }

    public String nombreCompleto() {
        return nombre + " " + apellido;
    }

    @Override
    public String toString() {
        return "Identidad : " + nombre + " " + apellido + ", " +
                "Sexo : " + sexo + ", " +
                "Edad : " + edad;
    }
}
