import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Vuelo vuelo = new Vuelo("IB123 destino París");
        Viajero oscar = new Viajero("Oscar", vuelo);
        vuelo.suscribirObservador(oscar);
        Viajero pepe = new Viajero("Pepe", vuelo);
        vuelo.suscribirObservador(pepe);
        vuelo.setUltimoSuceso("Llegada del vuelo.");
        vuelo.eliminarObservador(pepe);
        vuelo.setUltimoSuceso("Salida de viajeros");
    }
}
