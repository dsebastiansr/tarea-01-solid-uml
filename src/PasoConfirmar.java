public class PasoConfirmar implements PasoCompra {
    private Notificador notificador;

    public PasoConfirmar(Notificador notificador) { this.notificador = notificador; }

    public void procesar(Compra compra) {
        if (!compra.valida) return;
        compra.asiento.setEstado(EstadoAsiento.RESERVADO);
        compra.boleto = compra.fabrica.crearBoleto(compra.usuario, compra.asiento);
        notificador.enviar(compra.usuario, "Compra confirmada: " + compra.boleto.resumen());
    }
}
