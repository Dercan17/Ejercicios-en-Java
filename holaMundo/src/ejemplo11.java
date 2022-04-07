import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.HashMap;
public class ejemplo11 {
    public static void main(String[] args) {
    /*Crear una función o metodo que reciba un arreglo de números y que retorne un objecto con el número
    que tiene más ocurrencias seguidas en un arreglo y con la cantidad de veces que aparece en la secuencia.
    La función debe analizar el arreglo de izquierda a derecha para que en caso de que dos números cumplan
    la condición, el que aparece por primera vez de izquierda a derecha será el que se imprimirá.
    La salida de los datos para el arreglo en el ejemplo (1,2,2,5,4,6,7,8,8,8) sería la siguiente:
    Longest: 3
    Number: 8
*/

        int cantidad = 10;

        int numeros[] = llenarArray(cantidad);




        HashMap<Integer, Integer> numbers = sondear(numeros);
        String mensaje = repetido( numbers);
        System.out.println(numbers);
        System.out.println(mensaje);
    }



    public static int[] llenarArray( int cantidad){
        int[] numeros = new int[cantidad];
        Random ram = new Random();
        for(int i = 0; i < numeros.length; i++) {


            numeros[i] = ram.nextInt(10);


        }
        return numeros;
    }

    public static HashMap<Integer, Integer> sondear(int[] numeros) {

        HashMap<Integer, Integer> numbers = new HashMap<Integer, Integer>();
        int num = 0;
        int cont = 0;


        for (int i = 0; i < numeros.length; i++) {


            for (int j = 0; j < numeros.length; j++) {


                if (numeros[i] == numeros[j]) {

                    cont += 1;

                  }
            }


            numbers.put(numeros[i], cont);
            cont = 0;



        }

        return numbers;
    }


    public static String repetido( HashMap<Integer, Integer> numbers){

        HashMap<Integer, Integer> solucion = new HashMap<Integer, Integer>();


        String mensaje = "";
          Integer mayor = 0;
          Integer ok = 0;




        for (Integer i: numbers.keySet()) {
            for (Integer j: numbers.keySet()) {

                if(numbers.get(i) > numbers.get(j)){

                     mayor = i;

                      ok = numbers.get(i);


                    continue;

                }

            }

        }


        solucion.put(mayor,ok);

        mensaje = " "+ solucion;
        return mensaje;

    }


    }



