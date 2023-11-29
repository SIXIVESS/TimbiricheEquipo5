package interfaces;

import dominio.Jugador;

/**
 *
 * @author chaly
 */
public interface IJugador {

    public void informacionJugador(String nombre, String color);

    public Jugador solicitarInformacion();
}
