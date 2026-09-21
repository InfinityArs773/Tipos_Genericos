package universidad;

public abstract class Persona {
    
    protected String nombre;
    protected int id;
    protected String correo;

    public Persona(String nombre, int id, String correo) {
        this.nombre = nombre;
        this.id = id;
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getId() {
        return id;
    }

    public String getCorreo() {
        return correo;
    }
}