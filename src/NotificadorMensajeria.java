public class NotificadorMensajeria implements Notificador {
    public void enviar(String usuario, String mensaje) {
        System.out.println("[Mensajeria a " + usuario + "] " + mensaje);
    }
}
