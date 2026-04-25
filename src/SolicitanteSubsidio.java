public class SolicitanteSubsidio {
    private String nombreCompleto;
    private String cedula;
    private double ingresosMensuales;
    private int cantidadVehiculos;
    private boolean viveEnEcuador;

    public SolicitanteSubsidio(String nombreCompleto, String cedula, double ingresosMensuales, int cantidadVehiculos, boolean viveEnEcuador) {
        this.nombreCompleto = nombreCompleto;
        this.cedula = cedula;
        this.ingresosMensuales = ingresosMensuales;
        this.cantidadVehiculos = cantidadVehiculos;
        this.viveEnEcuador = viveEnEcuador;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public String getCedula() {
        return cedula;
    }

    public double getIngresosMensuales() {
        return ingresosMensuales;
    }

    public int getCantidadVehiculos() {
        return cantidadVehiculos;
    }

    public boolean isViveEnEcuador() {
        return viveEnEcuador;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setIngresosMensuales(double ingresosMensuales) {
        if(ingresosMensuales <= 470){
            this.ingresosMensuales = ingresosMensuales;
        } else {
            System.out.println("Error. Debe tener ingresos mensuales menores o iguales a $1200");
        }
    }

    public void setCantidadVehiculos(int cantidadVehiculos) {
        if(cantidadVehiculos > 0){
            this.cantidadVehiculos = cantidadVehiculos;
        } else {
            System.out.println("Error. El numero debe ser positivo");
        }
    }

    public void setViveEnEcuador(boolean viveEnEcuador) {
        this.viveEnEcuador = viveEnEcuador;
    }
    public boolean subsidioAprobado(){
        if(ingresosMensuales <= 1200 && cantidadVehiculos <= 1 && viveEnEcuador){
            return true;
        } else {
            return  false;
        }
    }
    public void generarResultado(){
        if(subsidioAprobado()){
            System.out.println("Subsidio aprobado");
        } else {
            System.out.println("Subsidio rechazado");
            System.out.println("Motivo: ");
            if(ingresosMensuales > 1200){
                System.out.println(" - Ingresos mayores a 1200");
            }
            if(cantidadVehiculos > 1){
                System.out.println(" - Posee mas de un vehiculo");
            }
            if(!viveEnEcuador){
                System.out.println(" - No vive en Ecuador");
            }
        }
    }
    @Override
    public String toString(){
        return "\n===== Datos del solicitante ===== \nNombre: " + nombreCompleto
        + "\nCedula: " + cedula + "\nIngresos mensuales: " +
        ingresosMensuales + "\nViven en Ecuador: " + viveEnEcuador;
    }
    public static void mostrarReglasSubsidio(){
        System.out.println("\n===== Reglas para obtener el subsidio =====");
        System.out.println("\n1. Tener ingresos mensuales menores o iguales a $1200");
        System.out.println("\n2. No poseer más de un vehículo registrado");
        System.out.println("\n3. Tener residencia en Ecuador");
    }
    public double calcularConsumoMensual(){
        double kmMensuales = 400;
        return kmMensuales / 40;
    }
    public double calcularConsumoMensual(double kmExtra){
        double kmMensuales = 400;
        return (kmMensuales + kmExtra) / 40;
    }
}
