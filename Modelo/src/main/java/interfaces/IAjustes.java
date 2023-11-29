package interfaces;

import java.awt.Color;
import dominio.Jugador;
import dominio.Sala;

/**
 * La interfaz IAjustes proporciona métodos para ajustes de configuración en un
 * juego o aplicación. Los métodos incluyen la selección de color y avatar, el
 * establecimiento del nombre del jugador, la selección de siguiente sala de
 * espera y los métodos relacionados con botones para regresar a salas
 * específicas.
 *
 * @author Equipo 5
 */
public interface IAjustes {

    public void informacionJugador(String nombre, String color);

    public Jugador solicitarInformacion();

}
