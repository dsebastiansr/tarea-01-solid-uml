public abstract class Asiento {
    private String codigo;
    private double precio;
    private EstadoAsiento estado;

    public Asiento(String codigo, double precio) {
        this.codigo = codigo;
        this.precio = precio;
        this.estado = EstadoAsiento.DISPONIBLE;
    }

    public abstract String getExperiencia();

    public abstract String getTipo();

    public String getCodigo() { return codigo; }

    public double getPrecio() { return precio; }

    public EstadoAsiento getEstado() { return estado; }

    public void setEstado(EstadoAsiento estado) { this.estado = estado; }
}
