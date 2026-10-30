public abstract class ManejadorReporte {
    private ManejadorReporte siguiente;

    public void setSiguiente(ManejadorReporte siguiente) { this.siguiente = siguiente; }

    public void atender(String reporte, boolean grave) {
        if (puedeResolver(grave)) {
            resolver(reporte);
        } else if (siguiente != null) {
            siguiente.atender(reporte, grave);
        } else {
            System.out.println("Reporte sin resolver: " + reporte);
        }
    }

    protected abstract boolean puedeResolver(boolean grave);

    protected abstract void resolver(String reporte);
}
