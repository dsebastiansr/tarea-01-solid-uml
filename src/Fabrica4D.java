public class Fabrica4D implements FabricaAsientos {
    private double precio;

    public Fabrica4D(double precio) { this.precio = precio; }

    public Asiento crearAsiento(String codigo) { return new Asiento4D(codigo, precio); }

    public Boleto crearBoleto(String usuario, Asiento asiento) { return new Boleto(usuario, asiento); }
}
