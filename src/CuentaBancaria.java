abstract class CuentaBancaria {
    private String numeroCuenta;
    private String titular;
    protected double saldo;

    public CuentaBancaria(String numeroCuenta, String titular, double saldoInicial) {
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        if (saldoInicial < 0) {
            System.out.println("Saldo inicial no puede ser negativo.Se asignara por defecto 0");
            this.saldo=0;
        }else {
            this.saldo = saldo;
        }
    }
}
