public class CuentaBancaria {
    String titular;
    double saldo;

    public  CuentaBancaria(String titular, double saldoInicial) {
       this.titular = titular;
       this.saldo = saldoInicial;
    }

    public void verSaldo() {
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: " + saldo + "€");
    }

    public void ingresarSaldo(double cantidad) {
        saldo = saldo + cantidad;
        System.out.println("Ha ingresado " + cantidad + "€");
    }

    public void retirarSaldo(double cantidad) {
        if (cantidad > saldo){
            System.out.println("Saldo insuficiente");
        }
        else {
            saldo = saldo - cantidad;
            System.out.println("Ha retirado " + cantidad + "€");
        }
    }

}
