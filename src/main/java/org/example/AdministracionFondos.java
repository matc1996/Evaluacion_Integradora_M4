package org.example;

import java.util.Scanner;

/*se crea la clase para administrar los fondos y se definen 3 atributos*/
public class AdministracionFondos {
    public double saldo,deposito,retiro;

    /*se crea el constructor sin parametros y uno con el parametro de saldo.*/
    public AdministracionFondos() {
    }

    public AdministracionFondos(double saldo) {
        this.saldo = saldo;
    }

    /*se crean los getter y setters */
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


    //metodo para ver el saldo
    public String verSaldo() {
        return "Su saldo es de $"+ (int)saldo+" pesos";
    }

    /*se declara el método para realizar un deposito y en el se usa if para manejar
    su resultado segun el valor de la variable deposito */
    public String realizarDeposito(double deposito){
        if (deposito <= 0) {
            return "El monto del depósito debe ser mayor que cero";
        }
        else if (deposito > saldo){
            return "excede maximo del saldo";
        } else {
        saldo -= deposito;
        return "El deposito de $"+ (int)deposito+" se ha efectuado correctamente. " +
                            "El saldo restante es de: $"+ (int)saldo+ " pesos";
        }
    }

    /*se declara el método para retirar los fondos y en el se usa if para manejar
    su resultado segun el valor de la variable retiro */
    public String retirarFondos(double retiro) {
        if (retiro <= 0) {
            return ("El monto del retiro debe ser mayor que cero");
        }
        else if (retiro > saldo){
            return ("Excede su saldo, no puede retirar mas de lo que tiene.");
        } else {
            saldo -= retiro;
            return ("Retiro exitoso.\nEl saldo restante es de $"+ (int)saldo+ " pesos");
        }
    }

}
