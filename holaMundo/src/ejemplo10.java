import java.util.Scanner;
public class ejemplo10 {
    public static void main(String[] args) {
       /* Obtener el nombre mas largo de tres personas, según los siguientes requerimientos
        Calcular e Imprimir el nombre de la persona que tenga el nombre más largo (en cantidad de caracteres)
          (Imprimir sólo uno de los tres, el de más caracteres en el nombre.)
        Podría usar .split(" "); del objeto String para separar nombre y apellido en un arreglo
        , y con el indice cero accedemos al nombre de la persona.
        Restricción no usar loops en el desarrollo de la tarea.
        Ejemplo del resultado: "Guillermo Doe tiene el nombre más largo."*/

        Scanner s = new Scanner(System.in);

        System.out.println("primera persona ingrese su nombre y apellido");
        String nombre1 = s.nextLine();

        System.out.println("segunda persona ingrese su nombre y apellido");
        String nombre2 = s.nextLine();

        System.out.println("tercera persona ingrese su nombre y apellido");
        String nombre3 = s.nextLine();


      String[] n1 = nombre1.split(" ");
      String[] n2 = nombre2.split(" ");
      String[] n3 = nombre3.split(" ");

      String nom1 = n1[0];
      String nom2 = n2[0];
      String nom3 = n3[0];

      String nom = (nom1.length() > nom2.length())? nom1:nom2;
      nom = (nom.length() > nom3.length())? nom:nom3;

        System.out.println("El nombre mas largo es: "+nom);







    }
}
