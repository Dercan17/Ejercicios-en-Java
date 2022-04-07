import javax.swing.text.BadLocationException;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class main {
    public static void main(String[] args) {
        //variables
        Scanner scanner = new Scanner(System.in);
        Biblioteca nuevaBiblioteca = new Biblioteca();
        Autores autor ;
        Libro libro1  = new Libro();

        int i = 3;
        System.out.println("==========Bienvenido a la biblioteca ================");


        while (i > 2) {

            System.out.println("Cosas que puede hacer en la biblioteca!");
            System.out.println("Ingresar un libro = 1");
            System.out.println("buscar un libro por nombre o autor = 2");
            System.out.println("Mirar cuantos libros tenemos en la biblioteca = 3");
            System.out.println("Saber el valor de todos los libros de la biblioteca = 4");
            System.out.println("Eliminar un autor = 5");
            System.out.println("Salir = 0");
            System.out.println("que accion desea realizar?");
            int opcion = scanner.nextInt();


            switch (opcion) {
                case 1:
                    System.out.println("=====Datos autor======");


                    System.out.println("Nombre del autor: ");
                    String nombreAutor = scanner.next();

                    System.out.println("email del autor");
                    String email = scanner.next();

                    System.out.println("Genero del autor");
                    String genero = scanner.next();

                    autor = new Autores(nombreAutor, email, genero);

                    System.out.println("=====Datos libro=====");

                    System.out.println();

                    System.out.println("Nombre del libro: ");
                    String nombre = scanner.next();

                    System.out.println("precio del libro: ");
                    int precio = scanner.nextInt();

                    System.out.println("Unidades del libro para ingresar: ");
                    int stock = scanner.nextInt();


                    libro1 = new Libro(nombre, precio, stock);
                    libro1.setAutores(autor);
                    nuevaBiblioteca.setLibros(libro1);


                    break;
                case 2:
                    System.out.println("Ingrese el libro o el autor a buscar");
                    String busqueda = scanner.next();

                    System.out.println(nuevaBiblioteca.buscarLibro(busqueda));
                    break;
                case 3:

                    System.out.println("Tenemos "+nuevaBiblioteca.StockTotal()+" libros para ti");
                    break;

                case 4:
                    System.out.println("Toda nuestra coleccion de libros tiene un valor de: $"+nuevaBiblioteca.valorTotal());

                case 5:


                    System.out.println("nombre del autor que desea eliminar?");
                   String name = scanner.next();
                    List<Autores> autoris = libro1.deleteAutores(name);



                    break;

                case 0:
                    System.out.println("============= gracias por visitar la biblioteca, Vuelva pronto!===========");
                    i = 0;
                    break;

                default:
                    System.out.println("Opcion inexistente ingrese otra opcion");
                    break;
            }


        }


    }


}
