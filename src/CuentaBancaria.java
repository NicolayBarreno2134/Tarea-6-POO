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

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }
    public void depositar(double monto) {
        if (monto <= 0) {
            System.out.println("Deposito invalido. Debe ser mayor a 0.");
            return;
        }
        saldo += monto;
    }
    public void retirar(double monto){
        if(monto <= 0){
            System.out.println("Retiro invalido. Debe ser mayor a 0.");
            return;
        }
        if (saldo-monto<0){
            System.out.println("Fondos insuficientes");
            return;
        }
        saldo -= monto;
    }
    public abstract double calcularInteresMensual();

    public void mostrarReporte(){
        System.out.println("Cuenta: "+numeroCuenta);
        System.out.println("Titular: "+titular);
        System.out.println("Saldo actual: "+saldo);
    }
}
