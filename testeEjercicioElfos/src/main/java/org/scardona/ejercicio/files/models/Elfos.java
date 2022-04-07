package org.scardona.ejercicio.files.models;


import java.util.Arrays;
import java.util.HashMap;

public class Elfos {


    public static HashMap<String, Integer> organizarRegalos(String lista) {

        HashMap<String, Integer> regalosContados = new HashMap<>();

        String[] regalos = lista.split(" ");


        int count = 0;

        for (int j = 0; j < regalos.length; j++) {

            for (int i = 0; i < regalos.length; i++) {

                if (regalos[j].equals(regalos[i])) {

                    count++;
                }
            }

            if(!regalos[j].contains("_"))
            regalosContados.put(regalos[j], count);
            count = 0;

        }
        System.out.println(regalosContados);
        return regalosContados;

    }


}
