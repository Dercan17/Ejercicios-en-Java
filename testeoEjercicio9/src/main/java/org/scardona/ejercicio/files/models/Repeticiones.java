package org.scardona.ejercicio.files.models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Repeticiones {

 /*Crear una función o metodo que reciba un arreglo de números y que retorne un objecto con el número
    que tiene más ocurrencias seguidas en un arreglo y con la cantidad de veces que aparece en la secuencia.
    La función debe analizar el arreglo de izquierda a derecha para que en caso de que dos números cumplan
    la condición, el que aparece por primera vez de izquierda a derecha será el que se imprimirá.
    La salida de los datos para el arreglo en el ejemplo (1,2,2,5,4,6,7,8,8,8) sería la siguiente:
    Longest: 3
    Number: 8
*/


    public static HashMap<Integer, Integer> sondear(int[] numeros) {

        HashMap<Integer, Integer> numbers = new HashMap<Integer, Integer>();

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


    public static String repetido(Map<Integer, Integer> numbers) {

        List<Map.Entry<Integer, Integer>> solucion = new ArrayList<>();


        String mensaje = "";
        Integer mayor = 0;



        for (Integer i : numbers.keySet()) {


            mayor = (numbers.get(i) > mayor) ? numbers.get(i) : mayor;


        }


        Integer finalMayor = mayor;


        solucion = numbers.entrySet().stream()
                .filter(e -> finalMayor <= e.getValue()).toList();

        mensaje = " " + solucion;
        return mensaje;

    }


}
