public class AsientoEstandar extends Asiento {
    public AsientoEstandar(String codigo, double precio) { super(codigo, precio); }

    public String getExperiencia() { return "Experiencia clasica"; }

    public String getTipo() { return "Estandar"; }
}
