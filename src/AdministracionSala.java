public class AdministracionSala extends ManejadorReporte {
    protected boolean puedeResolver(boolean grave) { return true; }

    protected void resolver(String reporte) {
        System.out.println("Administracion de la sala resolvio: " + reporte);
    }
}
