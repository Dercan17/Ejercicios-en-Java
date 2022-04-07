import java.util.Scanner;

public class ejemplo3 {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int[] pares = new int[20];

       for(int i = 0;i< pares.length; i++){
           int par = (i+1) *2;
           pares[i] = par;

       }
        for (int par: pares
             ) {
            System.out.println(par);
        }

    }
}
