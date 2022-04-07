package org.scardona.ejercicio.files.models;

import org.junit.jupiter.api.*;


import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class ElfosTest {

    @Test
    void organizarRegalosTest() {
        String carta = "bici coche balón _playstation bici coche peluche";

        HashMap<String, Integer> expected = new HashMap<>();
        expected.put("bici", 2);
        expected.put("coche", 2);
        expected.put("balón", 1);
        expected.put("peluche", 1);

        HashMap<String, Integer> actual= Elfos.organizarRegalos(carta);

        assertEquals(expected, actual);
    }

}

   
    
     
    
    
    
