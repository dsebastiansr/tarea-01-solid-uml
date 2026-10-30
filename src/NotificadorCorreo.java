public class NotificadorCorreo implements Notificador {
    public void enviar(String usuario, String mensaje) {
        System.out.println("[Correo a " + usuario + "] " + mensaje);
    }
}
