public class Main2 {
    static void main() {
        CuentaAhorros ahorros1=new CuentaAhorros("001","Ana Perez",1200);
        CuentaCorriente corriente1=new CuentaCorriente("002","Luis Gomez",800);
        CuentaInversion inversion1=new CuentaInversion("003","Maria Lopez",7000);

        double totalInteres=0;

        System.out.println("===== REPORTE MENSUAL DEL BANCO =====");
        double interesAhorros = ahorros1.calcularInteresMensual();
        ahorros1.mostrarReporte();
        System.out.println("Interes generado: $"+interesAhorros);
        System.out.println("------------------------------------");
        totalInteres +=interesAhorros;

        double interesCorriente = corriente1.calcularInteresMensual();
        corriente1.mostrarReporte();
        System.out.println("Interes generado: $"+interesCorriente);
        System.out.println("-----------------------------------");
        totalInteres +=interesCorriente;

        double interesInversion = inversion1.calcularInteresMensual();
        inversion1.mostrarReporte();
        System.out.println("Interes generado: $"+interesInversion);
        System.out.println("----------------------------------");
        totalInteres +=interesInversion;

        System.out.println("TOTAL INTERESES DEL BANCO: $"+interesInversion);
    }
}
