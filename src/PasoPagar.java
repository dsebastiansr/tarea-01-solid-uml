public class PasoPagar implements PasoCompra {
    public void procesar(Compra compra) {
        if (!compra.valida) return;
        if (compra.montoPagado < compra.asiento.getPrecio()) {
            compra.valida = false;
            compra.error = "Pago insuficiente";
            compra.asiento.setEstado(EstadoAsiento.DISPONIBLE); // se libera el asiento
        }
    }
}
