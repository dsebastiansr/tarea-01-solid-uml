import java.util.ArrayList;
import java.util.List;

public class Sala {
    private String nombre;
    private List<Asiento> asientos = new ArrayList<>();

    public Sala(String nombre) { this.nombre = nombre; }

    public void agregarAsiento(Asiento asiento) { asientos.add(asiento); }

    public Asiento buscarAsiento(String codigo) {
        for (Asiento a : asientos) {
            if (a.getCodigo().equals(codigo)) return a;
        }
        return null;
    }

    public void mostrarMapa() {
        System.out.println("Mapa de " + nombre);
        for (Asiento a : asientos) {
            System.out.println(a.getCodigo() + " [" + a.getTipo() + "] $" + a.getPrecio() + " - " + a.getEstado());
        }
    }
}
