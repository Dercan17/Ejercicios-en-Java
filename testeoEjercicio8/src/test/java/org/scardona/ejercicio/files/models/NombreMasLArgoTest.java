package org.scardona.ejercicio.files.models;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.*;

//@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class NombreMasLArgoTest {

    @Test
    void nombreLargoTest() {
        String nombre1 = "Sebastian Cardona";
        String nombre2 = "ernestoPerez perez";
        String nombre3 = "Luisito perez";
        String nombreLargo  = NombreMasLArgo.nombreMasLargo(nombre1,nombre2,nombre3);

        assertEquals(nombreLargo, "ernestoPerez");
        assertNotNull(nombreLargo);
    }

    @Test
    void nombreLargoTest2() {
        String nombre1 = "Sebastian Cardona";
        String nombre2 = "luis perez";
        String nombre3 = "Luisito perez";
        String nombreLargo  = NombreMasLArgo.nombreMasLargo(nombre1,nombre2,nombre3);

        assertEquals(nombreLargo, "Sebastian");
        assertNotNull(nombreLargo);

    }

}