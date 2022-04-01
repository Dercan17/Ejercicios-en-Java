package org.scardona.ejercicio.files.models;

import java.util.*;

public class Files {

    /* Escribir un programa utilizando Java que encuentre los dos elementos del arreglo que sumados dan 10.
        Se deben imprimir ambos números como resultado separados por un espacio
        (en el orden en que aparecen en el arreglo).
        Por ejemplo, para el arreglo (1,3,4,2,7,0) el resultado seria: 3 7
         */

    int[] numeros = {1,3,2,4,7,0};
    public static String sondear(int[] numeros){
        int numj=0,numi = 0;

        for(int i= 0; i < numeros.length;i++){

            for(int j = i+1; j < numeros.length;j++){

                if(numeros[j] + numeros[i] == 10){
                    numj = numeros[j];
                    numi = numeros[i];
                    String mensaje = "los numeros son: "+numi+" y "+numj;
                    return mensaje;
                }

            }

        }
        String mensaje = "los numeros son: "+numi+" y "+numj;
        return mensaje;


    }

}
