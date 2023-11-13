package modelo;

import interfaces.IAjustes;
import interfaces.IJugador;
import interfaces.ISala;

/**
 *
 * @author chaly
 */
public class Ajustes implements IAjustes {

    private IJugador jugador = ModeloJugador.getInstance();
    private ISala sala = ModeloSala.getInstance();

    @Override
    public void informacionJugador(String nombre, String color) {
        jugador.informacionJugador(nombre, color);
    }

    @Override
    public Jugador solicitarInformacion() {
        return jugador.solicitarInformacion();
    }

    @Override
    public void crearSala(Jugador jugador) {
        sala.crearSala(jugador);
    }

    @Override
    public Sala obtenerSala() {
        return sala.obtenerSala();
    }

}
