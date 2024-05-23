package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class AlkeWallet {
    public static void main(String[] args) {
        /*se crea un objeto de tipo AdministradorFondos con un saldo inicial de 500.000*/
        AdministracionFondos admin = new AdministracionFondos(500000);

        //se declara el objeto entrada de tipo Scanner para ingresar valores por teclado
        Scanner entrada = new Scanner(System.in);

        //declaramos la variable para el menu
        int opc;

        /*definimos el menu dentro de un do-while y usamos tambien
        un switch para controlar la opcion elegida en la variable opc*/
        do {
            System.out.println("Menu");
            System.out.println("1.Ver Saldo");
            System.out.println("2.Realizar Deposito");
            System.out.println("3.Retirar Fondos");
            System.out.println("4.Convertir Moneda");
            System.out.println("5.Salir");
            System.out.println("elije tu opcion: ");
            opc = entrada.nextInt();
            switch (opc) {
                case 1:
                    //usamos el metodo verSaldo de la clase administracionFondos
                    String resultadoVerSAldo = admin.verSaldo();
                    System.out.println(resultadoVerSAldo);
                    break;
                case 2:
                    System.out.println("Interfaz de deposito.");
                    System.out.println("Inserta el monto a depositar: $");
                    //ingresamos el deposito por teclado para usar el metodo de realizar un deposito
                    double deposito = entrada.nextDouble();
                    String resultadoDeposito = admin.realizarDeposito(deposito);
                    System.out.println(resultadoDeposito);
                    break;
                case 3:
                    System.out.println("Interfaz de Retiro de Fondos.");
                    System.out.println("¿Cuanto deseas retirar?: $");//ingresamos el retiro por teclado para usar el metodo de retirar los fondos
                    double retiro = entrada.nextDouble();
                    String resultadoRetiro = admin.retirarFondos(retiro);
                    System.out.println(resultadoRetiro);
                    break;
                case 4:
                    System.out.println("¿a que moneda deseas convertir?(1.dolar - 2.euro)"); //imprimimos las opciones  disponibles para convertir
                    //ingresamos la moneda a la que queremos convertir por teclado para usar el metodo para convertir la moneda
                    int moneda = entrada.nextInt();
                    ConversionMoneda conversion = new ConversionMoneda(moneda);//se crea el objeto y se usa el método
                    String resultadoConversion = conversion.conversionMoneda(admin, moneda);
                    System.out.println(resultadoConversion);
                    break;
                case 5:
                    System.out.println("Adios");
                    break;
                default:
                    System.out.println("opción invalida");

            }
        }while (opc != 5) ;


    }
}