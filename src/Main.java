public class Main {
    public static void main(String[] args) {
        // El administrador configura los precios por tipo de asiento
        FabricaAsientos f4D = new Fabrica4D(12.0);
        FabricaAsientos fVIP = new FabricaVIP(10.0);
        FabricaAsientos fEst = new FabricaEstandar(6.0);

        Sala sala = new Sala("Sala 1");
        sala.agregarAsiento(f4D.crearAsiento("A1"));
        sala.agregarAsiento(fVIP.crearAsiento("B1"));
        sala.agregarAsiento(fEst.crearAsiento("C1"));
        sala.mostrarMapa();

        ProcesoCompra proceso = new ProcesoCompra();
        proceso.agregarPaso(new PasoReservar());
        proceso.agregarPaso(new PasoPagar());
        proceso.agregarPaso(new PasoConfirmar(new NotificadorCorreo()));

        Compra c1 = new Compra("ana", sala.buscarAsiento("B1"), fVIP, 10.0);
        proceso.ejecutar(c1);

        Compra c2 = new Compra("luis", sala.buscarAsiento("B1"), fVIP, 10.0);
        proceso.ejecutar(c2);
        System.out.println("Compra de luis: " + (c2.valida ? "ok" : c2.error));

        sala.mostrarMapa();

        ManejadorReporte agente = new AgenteSoporte();
        agente.setSiguiente(new AdministracionSala());
        agente.atender("No me llego el boleto", false);
        agente.atender("Me cobraron doble", true);

        new NotificadorMensajeria().enviar("ana", "La funcion se retrasa 15 minutos");
    }
}
