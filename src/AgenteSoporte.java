public class AgenteSoporte extends ManejadorReporte {
    protected boolean puedeResolver(boolean grave) { return !grave; }

    protected void resolver(String reporte) {
        System.out.println("Agente de soporte resolvio: " + reporte);
    }
}
