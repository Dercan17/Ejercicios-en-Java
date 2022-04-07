
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Biblioteca {
    private ArrayList<Libro> libros = new ArrayList<>();


    public ArrayList<Libro> getLibros() {

        return libros;
    }

    public void setLibros(Libro libros) {
        this.libros.add(libros);
    }


    public int valorTotal() {
        int valorTotal = 0;

        for (Libro libros:getLibros()) {
            valorTotal += libros.getValorTotal();
        }
        return valorTotal;
    }

    public int StockTotal() {
        int stockTotal = 0;

        for (Libro libro:getLibros()) {
            stockTotal += libro.getStockLibro();

        }

        return stockTotal;
    }

    public String buscarLibro(String busqueda) {
        String nombre = "";
        int precio = 0;
        int stock = 0;
        String autores = "";
        String mensaje = "";
        ArrayList<String> encontrados = new ArrayList<>();


        for (Libro libros : getLibros()) {
            nombre = libros.getNombreLibro();
            precio = libros.getPrecioLibro();
            stock = libros.getStockLibro();
            autores = libros.getAuthorsHowString(libros.getAutores());

            if (nombre.contains(busqueda) || autores.contains(busqueda)) {
                mensaje = "Nombre: " + nombre + "\n" + "Precio: " + precio + "\n" + "Unidades disponibles : " + stock + "\n" + "Autores: " + autores + " "+"\n";

                encontrados.add(mensaje);
            }
        }
        if (encontrados.isEmpty()) {
            return "No existe";
        } else {


            return encontrados.toString();
        }
    }





}









