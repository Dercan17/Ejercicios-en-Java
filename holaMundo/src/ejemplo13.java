import java.util.Scanner;

public class ejemplo13 {
    public static void main(String[] args) {
        /*Crear una clase con el método main donde el desafío es buscar el número menor de mínimo 10 valores enteros,
        usando la clase Scanner ingresar la cantidad de números a comparar, luego utilizando una sentencia for iterar
        el numero de veces (ingresado) para pedir el numero entero, entonces se requiere:
        alcular el menor número e imprimir el valor.
        si el menor número es menor que 10, imprimir "El número menor es menor que 10!".
        si no, imprimir " el numero menor es igual o mayor que 10!".
         */

        Scanner s = new Scanner(System.in);

        System.out.println("Cuantos numeros desea comparar?");
        int comparador = s.nextInt();

        if(comparador < 10){

            System.out.println("!ERROR¡ el minimo numero que se puede comparar es 10");

        }else{

            int menor = Integer.MAX_VALUE;
            int numero;
            System.out.println(menor);

            for (int i = 0; i < comparador;i++){
                System.out.println("Ingrese el numero: "+""+(i+1));
                numero = s.nextInt();
                 menor = (numero < menor)? numero:menor;
            }

            System.out.println("El numero menor es: "+menor);

            if (menor >= 10){
                System.out.println("El numero "+menor+ " es mayor o igual  a 10!");
            }else if(menor  < 10){

                System.out.println("El numero "+menor+ " es menor a 10");
            }




        }

    }
}
