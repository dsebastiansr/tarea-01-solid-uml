// Fabrica abstracta: cada fabrica crea la familia Asiento + Boleto de un tipo
public interface FabricaAsientos {
    Asiento crearAsiento(String codigo);

    Boleto crearBoleto(String usuario, Asiento asiento);
}
