import java.util.Scanner;

public class ejemplo5 {
    public static void main(String[] args) {

        String[] usernames = new String[3];
        String[] passwords = new String[3];
        int[] rol = new int[3];

        boolean admin = false;
        boolean autenticado = false;
        usernames[0] = "sebastian";
        usernames[1] = "Luis";
        usernames[2] = "pedro";

        passwords[0] = "1234";
        passwords[1] = "12345";
        passwords[2] = "1718";

        rol[0] = 1;
        rol[1] = 0;
        rol[2] = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese su nombre de usuario");
        String usuario = sc.nextLine();

        System.out.println("Ingrese su contraseña");
        String clave = sc.nextLine();

        for(int i =0; i < usernames.length;i++){


                if (usernames[i].equals(usuario) && passwords[i].equals(clave) && rol[i] == 1){

                    autenticado = true;
                    admin = true;
                     break;
                }

        }


        if (autenticado == true && admin == true){
            System.out.println("Ingreso correctamente");
            System.out.println("Bienvenido ".concat(usuario).concat(" Usted es el puto amo!"));

        }else if(autenticado == true && admin == false){
            System.out.println("Ingreso correctamente");
            System.out.println("Bienvenido ".concat(usuario).concat(" persona comun y corriente!"));
        }else{

            System.out.println("Usuario o contraseña incorrectos");
        }
    }

}
