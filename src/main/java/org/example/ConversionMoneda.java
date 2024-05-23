package org.example;

public class ConversionMoneda {
    /*se crea la clase para convertir la moneda y se definen 2 atributos*/
    private int moneda;
    private double saldoConvertido;

    /*se crea constructor con un parametro y sin parametros*/
    public ConversionMoneda() {
    }

    public ConversionMoneda(int moneda) {
        this.moneda = moneda;
    }

    /*se crean los getter y setters */
    public int getMoneda() {
        return moneda;
    }

    public void setMoneda(int moneda) {
        this.moneda = moneda;
    }

    public double getSaldoConvertido() {
        return saldoConvertido;
    }

    public void setSaldoConvertido(double saldoConvertido) {
        this.saldoConvertido = saldoConvertido;
    }

    //Definimos valores de otras monedas
    double dolar = 0.0011;
    double euro = 0.001016;

    //se declara el método para convertir la moneda
    public String conversionMoneda(AdministracionFondos admin, int moneda) {
        saldoConvertido = 0;
        /*usamos un if para manejar el resultado del método*/
        if (moneda == 1){
            saldoConvertido = admin.saldo * dolar;
            return "$"+(int)admin.saldo+" pesos son igual a $" + saldoConvertido + " dolares" ;
        } else if (moneda == 2) {
            saldoConvertido = admin.saldo * euro;
            return "$"+(int)admin.saldo+" pesos son igual a $" + saldoConvertido + " euros";
        } else {
            return "Esta moneda no esta disponible aun.";
        }

    }

}
