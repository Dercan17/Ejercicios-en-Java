package org.scardona.ejercicio.files.models;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class Ovejas {


    public static List<String> ovejasFiltradas(HashMap<String, String> ovejas) {
        List ovejasF = ovejas.entrySet()
                .stream()
                .filter(oveja ->  "rojo".contains(oveja.getValue()) && oveja.getKey().contains("Na"))
                .collect(Collectors.toList());


        return ovejasF;
    }

}
