public class FabricaEstandar implements FabricaAsientos {
    private double precio;

    public FabricaEstandar(double precio) { this.precio = precio; }

    public Asiento crearAsiento(String codigo) { return new AsientoEstandar(codigo, precio); }

    public Boleto crearBoleto(String usuario, Asiento asiento) { return new Boleto(usuario, asiento); }
}
