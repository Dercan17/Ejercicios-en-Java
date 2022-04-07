import java.sql.SQLOutput;
import java.util.Scanner;

public class ejemplo4 {
    public static void main(String[] args) {
        String username = "sebastian";
        String password = "12345";

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese su nombre de usuario");
        String usuario = sc.nextLine();

        System.out.println("Ingrese su contraseña");
        String clave = sc.nextLine();

        boolean autenticado = false;
        if(username.equals(usuario) && password.equals(clave)){
            autenticado = true;

        }
            if (autenticado){
                System.out.println("Ingreso correctamente");
                System.out.println("Bienvenido ".concat(usuario).concat("!"));

            }else{
                System.out.println("Usuario o contraseña incorrectos");
            }
    }
}
