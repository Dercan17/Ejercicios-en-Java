import java.util.Scanner;

public class ejemplo8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);



        System.out.println("Ingrese el primer numero a escanear");
        int n1 = s.nextInt();

        System.out.println("Ingrese el segundo numero a escanear");
        int n2 = s.nextInt();


        String max = (n1>n2)? n1+ " y " + n2:n2+" Y "+n1;

        System.out.println("el orden es: " + max);


    }

}
