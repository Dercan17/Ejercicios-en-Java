
import java.util.ArrayList;
import java.util.Scanner;

public class ejemplo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
       ;
        int ceros = 0;
        int positivos = 0;
        int negativos = 0;


        System.out.println("Cuantos numeros desea ingresar?");
        n = sc.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < a.length; i++) {

            System.out.println("Ingrese un numero: " + " Numeros ingresados " + i);
            a[i] = sc.nextInt();

        }


        for (int j = 0; j < a.length; j++) {

            if (a[j] > 0) {
                positivos++;
            } else if (a[j] < 0) {
                negativos++;
            } else if (a[j] == 0) {
                ceros++;
            }
        }
        System.out.println("Los numeros positivos son: "+positivos);
        System.out.println("Los numeros negativos son: "+negativos);
        System.out.println("El numero de ceros es: "+ceros);
    }
}

