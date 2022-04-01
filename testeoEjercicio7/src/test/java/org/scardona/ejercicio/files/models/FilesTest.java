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
class FilesTest {

    @Test
    void fixFiles() {
        int[] numeros = {1,3,2,4,7,0};
        String num1 = Files.sondear(numeros);

        assertEquals(num1, "los numeros son: 3 y 7");
    }


    @Test
    void fixFiles1() {
        int[] numeros = {1,2,2,4,8,0};
        String num1 = Files.sondear(numeros);

        assertEquals(num1, "los numeros son: 2 y 8");
    }


    @Test
    void fixFiles3() {
        int[] numeros = {5,3,2,4,7,5};
        String num1 = Files.sondear(numeros);

        assertEquals(num1, "los numeros son: 5 y 5");
    }
}