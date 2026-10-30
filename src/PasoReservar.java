public class PasoReservar implements PasoCompra {
    public void procesar(Compra compra) {
        if (!compra.valida) return;
        if (compra.asiento.getEstado() != EstadoAsiento.DISPONIBLE) {
            compra.valida = false;
            compra.error = "Asiento no disponible";
            return;
        }
        compra.asiento.setEstado(EstadoAsiento.EN_PROCESO_DE_COMPRA);
    }
}
