package org.scardona.ejercicio.files.models;

public class NombreMasLArgo {

    /* Escribir un programa utilizando Java que encuentre los dos elementos del arreglo que sumados dan 10.
        Se deben imprimir ambos números como resultado separados por un espacio
        (en el orden en que aparecen en el arreglo).
        Por ejemplo, para el arreglo (1,3,4,2,7,0) el resultado seria: 3 7
         */
    public static String nombreMasLargo(String nombre1,String nombre2,String nombre3) {

    String[] n1 = nombre1.split(" ");
    String[] n2 = nombre2.split(" ");
    String[] n3 = nombre3.split(" ");
    String nom1 = n1[0];
    String nom2 = n2[0];
    String nom3 = n3[0];
    String nom = nom1.length() > nom2.length() ? nom1 : nom2;
    nom = nom.length() > nom3.length() ? nom : nom3;
        return nom;

    }

}
