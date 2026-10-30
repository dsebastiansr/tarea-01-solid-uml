public class FabricaVIP implements FabricaAsientos {
    private double precio;

    public FabricaVIP(double precio) { this.precio = precio; }

    public Asiento crearAsiento(String codigo) { return new AsientoVIP(codigo, precio); }

    public Boleto crearBoleto(String usuario, Asiento asiento) { return new Boleto(usuario, asiento); }
}
