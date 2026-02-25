package iteracion5;

import java.util.ArrayList;
import java.util.List;

public class Monetizacion {
    private List<Pago> pagos;

    public Monetizacion() {
        this.pagos = new ArrayList<>();
    }

    public void registrarPago(Pago pago) {
        pagos.add(pago);
    }
}