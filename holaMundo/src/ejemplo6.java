import java.util.Scanner;
public class ejemplo6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int max = 0;


        System.out.println("ingrese el numero 1");
        int num1 = s.nextInt();

        System.out.println("ingrese el numero 2");
        int num2 = s.nextInt();

        System.out.println("ingrese el numero 3");
        int num3 = s.nextInt();


        max = (num1 > num2)? num1: num2;
        max = (max > num3)? max: num3;

        System.out.println("max = " + max);
    }
}
