import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main() {
        List<CuentaBancaria> cuentas=new ArrayList<>();
        CuentaAhorros ahorros1=new CuentaAhorros("001","Ana Perez",1200);
        CuentaCorriente corriente1=new CuentaCorriente("002","Maria Lopez",800);
    }
}
