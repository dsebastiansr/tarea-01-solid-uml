public class Boleto {
    private String usuario;
    private Asiento asiento;

    public Boleto(String usuario, Asiento asiento) {
        this.usuario = usuario;
        this.asiento = asiento;
    }

    public String resumen() {
        return "Boleto de " + usuario + " - asiento " + asiento.getCodigo()
                + " (" + asiento.getTipo() + ") $" + asiento.getPrecio();
    }
}
