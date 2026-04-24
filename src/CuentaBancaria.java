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
//Cuenta Ahorros
class CuentaAhorros extends CuentaBancaria{
    public CuentaAhorros(String numeroCuenta, String titular, double saldoInicial) {
        super(numeroCuenta, titular, saldoInicial);
    }
    @Override
    public double calcularInteresMensual() {
        double interes=getSaldo()*0.03/12;
        saldo+=interes;
        return interes;
    }
}
//Cuenta Corriente
class CuentaCorriente extends CuentaBancaria{
    public CuentaCorriente(String numeroCuenta, String titular, double saldoInicial) {
        super(numeroCuenta, titular, saldoInicial);
    }
    @Override
    public void retirar(double monto) {
        if (monto <= 0) {
            System.out.println("Retiro invalido. Debe ser mayor a 0.");
            return;
        }
        if (saldo-monto<-500){
            System.out.println("Sobregiro maximo alcanzado(-500 USD)");
            return;
        }
        saldo -= monto;
    }
    @Override
    public double calcularInteresMensual() {
        return 0;
    }
}
class CuentaInversion extends CuentaBancaria{
    public CuentaInversion(String numeroCuenta, String titular, double saldoInicial) {
        super(numeroCuenta, titular, saldoInicial);
    }
    @Override
    public double calcularInteresMensual(){
        double tasaAnual;
        if (getSaldo()<1000){
            tasaAnual=0.04;
        } else if (getSaldo()<=5000) {
            tasaAnual=0.05;
        } else {
            tasaAnual=0.06;
        }
        double interes=getSaldo()*tasaAnual/12;
        saldo+=interes;
        return interes;
    }
}
