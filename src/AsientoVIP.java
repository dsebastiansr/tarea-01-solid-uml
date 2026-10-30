public class AsientoVIP extends Asiento {
    public AsientoVIP(String codigo, double precio) { super(codigo, precio); }

    public String getExperiencia() { return "Mas espacio y comodidad"; }

    public String getTipo() { return "VIP"; }
}
