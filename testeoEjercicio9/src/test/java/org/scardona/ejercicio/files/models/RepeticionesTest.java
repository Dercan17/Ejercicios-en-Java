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
import java.util.*;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.*;

//@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class RepeticionesTest {

    @Test
    void sondeoTest() {
        int[] numeros = {1, 2, 3, 4, 5, 6, 6, 6, 6};
        HashMap<Integer, Integer> nums = Repeticiones.sondear(numeros);

        assertNotNull(nums);

    }

    @Test
    void repetidoTest() {
        int[] numeros = {1, 2, 3, 4, 5, 6, 6, 6, 6};
        HashMap<Integer, Integer> nums = Repeticiones.sondear(numeros);
        String repetido = Repeticiones.repetido(nums);

        assertNotNull(nums);
        assertEquals(repetido, " [6=4]");

    }


    @Test
    void repetidoTest2() {
        int[] numeros = {1, 6, 6, 6, 6 , 3, 4, 5, 2, 2, 2, 2, 2};
        Map<Integer, Integer> nums = Repeticiones.sondear(numeros);
        String repetido = Repeticiones.repetido(nums);

        assertNotNull(nums);
        assertEquals(repetido, " [2=5]");

    }
    @Test
    void repetidoTest3() {
        int[] numeros = {1,1,1,1,1,1,1,1,1,1,1, 6, 6, 6, 6 , 3, 4, 5, 2, 2, 2, 2, 2};
        Map<Integer, Integer> nums = Repeticiones.sondear(numeros);
        String repetido = Repeticiones.repetido(nums);

        assertNotNull(nums);
        assertEquals(repetido, " [1=11]");

    }
}