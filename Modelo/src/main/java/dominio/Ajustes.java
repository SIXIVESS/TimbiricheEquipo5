package dominio;

import interfaces.IAjustes;
import interfaces.IJugador;
import interfaces.ISala;

/**
 *
 * @author chaly
 */
public class Ajustes implements IAjustes {

    private IJugador jugador = ModeloJugador.getInstance();

    @Override
    public void informacionJugador(String nombre, String color) {
        jugador.informacionJugador(nombre, color);
    }

    @Override
    public Jugador solicitarInformacion() {
        return jugador.solicitarInformacion();
    }
}
