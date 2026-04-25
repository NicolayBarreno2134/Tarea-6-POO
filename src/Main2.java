import java.util.ArrayList;
import java.util.List;

public class Main2 {
    static void main() {
        List<CuentaBancaria> cuentas = new ArrayList<>();
            cuentas.add(new CuentaAhorros("001", "Ana Pérez", 1200));
            cuentas.add(new CuentaCorriente("002", "Luis Gómez", 800));
            cuentas.add(new CuentaInversion("003", "María López", 7000));

        double totalIntereses = 0;

        System.out.println("===== REPORTE MENSUAL DEL BANCO =====");
        for (CuentaBancaria cuenta : cuentas) {
            double interes = cuenta.calcularInteresMensual();
            cuenta.mostrarReporte();
            System.out.println("Interés mensual generado: $" + interes);
            System.out.println("-------------------------------------");
            totalIntereses += interes;
        }
        System.out.println("TOTAL INTERESES DEL BANCO: $" + totalIntereses);
    }
}
