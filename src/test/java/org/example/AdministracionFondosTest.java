package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdministracionFondosTest {
    public static AdministracionFondos admin;

    /* Instanciamos la clase Administracion de fondos para usar sus métodos y
    usamos el BeforeAll para que se ejecute antes que los Test.
     */
    @BeforeEach
    public void configuracion() {
         admin = new AdministracionFondos(1000);
    }

    /*Hacemos el Test para ver el saldo.*/
    @Test
    void versaldo() {
        String resultado = admin.verSaldo();
        assertEquals("Su saldo es de $"+(int)admin.saldo+" pesos", resultado);
    }
    /*Hacemos el test para realizar depositos con los 3 posibles resultados dependiendo del valor que le pasemos deposito.*/
    @Test
    void realizarDepositoMenorZero() {
        double deposito = 0;
        String resultado = admin.realizarDeposito(deposito);
        assertEquals("El monto del depósito debe ser mayor que cero",resultado);
    }

    @Test
    void realizarDepositoMayorSaldo() {
        double deposito = 1001 ;
        String resultado = admin.realizarDeposito(deposito);
        assertEquals("excede maximo del saldo",resultado);
    }

    @Test
    void realizarDeposito() {
        double deposito = 500;
        String resultado = admin.realizarDeposito(deposito);
        assertEquals("El deposito de $"+ (int)deposito+" se ha efectuado correctamente. " +
                "El saldo restante es de: $"+ (int)admin.saldo+ " pesos",resultado);
    }


    /*Hacemos el test para retirar fondos con los 3 posibles resultados dependiendo del valor que le pasemos a retiro.*/
    @Test
    void retirarFondosMenorZero() {
        double retiro = 0;
        String resultado = admin.retirarFondos(retiro);
        assertEquals("El monto del retiro debe ser mayor que cero",resultado);
    }

    @Test
    void retirarFondosMayorSaldo() {
        double retiro = 1001;
        String resultado = admin.retirarFondos(retiro);
        assertEquals("Excede su saldo, no puede retirar mas de lo que tiene.",resultado);
    }

    @Test
    void retirarFondos() {
        double retiro = 500;
        String resultado = admin.retirarFondos(retiro);
        assertEquals("Retiro exitoso.\nEl saldo restante es de $"+ (int)admin.saldo+ " pesos",resultado);
    }

}