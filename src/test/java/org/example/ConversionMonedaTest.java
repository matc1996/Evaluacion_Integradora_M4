package org.example;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class ConversionMonedaTest {
    public static ConversionMoneda conversionMoneda;

    /* Instanciamos la clase ConversionMoneda para usar su método y
    usamos el BeforeAll para que se ejecute antes que los Test.
     */
    @BeforeAll
    public static void configuracionInicial(){
        conversionMoneda = new ConversionMoneda();
    }

    //Hacemos los Test para cada moneda usando en este caso 1000 pesos como referencia.
    @Test
    void conversionMonedaDolar() {
        AdministracionFondos admin = new AdministracionFondos(1000);
        int moneda = 1;
        String resultado = conversionMoneda.conversionMoneda(admin, moneda);
        assertEquals("$1000 pesos son igual a $1.1 dolares", resultado);
    }

    @Test
    void ConversionMonedaEuro() {
        AdministracionFondos admin = new AdministracionFondos(1000);
        int moneda = 2;
        String resultado = conversionMoneda.conversionMoneda(admin, moneda);
        assertEquals("$1000 pesos son igual a $1.016 euros",resultado);
    }

    @Test
    void ConversionMoneddaError() {
        AdministracionFondos admin = new AdministracionFondos(1000);
        int moneda = 3;
        String resultado = conversionMoneda.conversionMoneda(admin, moneda);
        assertEquals("Esta moneda no esta disponible aun.", resultado);
    }



}