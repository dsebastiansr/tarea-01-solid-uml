// Datos que fluyen por los pasos de la compra (arquitectura de flujo de datos)
public class Compra {
    public String usuario;
    public Asiento asiento;
    public FabricaAsientos fabrica;
    public double montoPagado;
    public Boleto boleto;
    public boolean valida = true;
    public String error;

    public Compra(String usuario, Asiento asiento, FabricaAsientos fabrica, double montoPagado) {
        this.usuario = usuario;
        this.asiento = asiento;
        this.fabrica = fabrica;
        this.montoPagado = montoPagado;
    }
}
