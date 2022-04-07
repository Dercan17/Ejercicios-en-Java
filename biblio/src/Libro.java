import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Libro {
    private String nombre;
    private int precio;
    private int stock;
    private int valorTotal;
    private ArrayList<Autores> autores = new ArrayList<>();
    ;


    public Libro() {
    }

    public Libro(String nombre, int precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
        this.valorTotal = precio * stock;


    }

    public List<Autores> getAutores() {
        return this.autores;
    }

    public void setAutores(Autores autor) {
        this.autores.add(autor);
    }


    public void setNombreLibro(String nuevoNombre) {
        this.nombre = nuevoNombre;

    }

    public int getValorTotal() {
        return valorTotal;
    }


    public String getNombreLibro() {
        return nombre;
    }

    public void setPrecioLibro(int nuevoPrecio) {
        this.precio = nuevoPrecio;

    }

    public int getPrecioLibro() {
        return precio;
    }

    public int getStockLibro() {
        return stock;
    }

    public void setStockLibro(int nuevoStock) {
        this.stock = nuevoStock;

    }

    public String getAuthorsHowString(List<Autores> authors) {

        String autores;

        return autores = authors.stream()
                .map(Autores::getNombreAutor)
                .collect(Collectors.joining(", "));
    }

    public List deleteAutores(String nombre) {
        Stream<Autores> autores = (getAutores().stream().filter(autor -> autor.getNombreAutor().equals(nombre.toLowerCase())));

        List<Autores> lista = autores.collect(Collectors.toList());

        return lista;


    }
}
