import java.util.ArrayList;
import java.util.List;

public class ProcesoCompra {
    private List<PasoCompra> pasos = new ArrayList<>();

    public void agregarPaso(PasoCompra paso) { pasos.add(paso); }

    public void ejecutar(Compra compra) {
        for (PasoCompra paso : pasos) {
            paso.procesar(compra);
        }
    }
}
