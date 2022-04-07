package org.scardona.ejercicio.files.models;

import org.junit.jupiter.api.*;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

//@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class OvejasTest {
    @Test
    void filtrarOvejasNotNullTest(){

        HashMap<String,String> ovejas = new HashMap<>();
        ovejas.put("Noa",  "azul" );
        ovejas.put("Euge",  "rojo"  );
        ovejas.put("Navidad",  "rojo" );
        ovejas.put( "Ki Na Ma", "rojo" );
        ovejas.put( "AAAAAaaaaa",  "rojo");
        ovejas.put( "Nnnnnnnn",  "rojo");
        List ovejasFiltradas =  Ovejas.ovejasFiltradas(ovejas);
        assertNotNull(ovejasFiltradas);



    }

    @Test
    void filtrarOvejasTest(){

        HashMap<String,String> ovejas = new HashMap<>();
        ovejas.put("Noa",  "azul" );
        ovejas.put("Euge",  "rojo"  );
        ovejas.put("Navidad",  "rojo" );
        ovejas.put( "Ki Na Ma", "rojo" );
        ovejas.put( "AAAAAaaaaa",  "rojo");
        ovejas.put( "Nnnnnnnn",  "rojo");

      List<String> esperado = new ArrayList<String>() ;
        esperado.add("Ki Na Ma=rojo");
        esperado.add("Navidad=rojo");

        List<String> ovejasFiltradas =  Ovejas.ovejasFiltradas(ovejas);
        assertEquals(ovejasFiltradas.size(),esperado.size());


    }
}