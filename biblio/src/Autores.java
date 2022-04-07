import java.util.ArrayList;

public class Autores {
    private String nombre;
    private String email;
    private String genero;

    public Autores(String nombre, String email, String genero) {
        this.nombre = nombre;
        this.email = email;
        this.genero = genero;
    }

    public String getNombreAutor() {
        return nombre;
    }

    public void setNombreAutor(String nuevoNombre) {
        this.nombre = nuevoNombre;

    }

    public void setEmailAutor(String nuevoEmail) {
        this.email = nuevoEmail;

    }

    public String getEmailAutor() {
        return email;
    }

    public void setGeneroAutor(String nuevoGenero) {
        this.genero = nuevoGenero;

    }

    public String getGeneroAutor() {
        return genero;
    }


}
