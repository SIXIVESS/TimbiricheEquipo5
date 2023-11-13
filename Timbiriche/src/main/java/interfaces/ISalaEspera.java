package interfaces;

import modelo.Jugador;
import modelo.Sala;

/**
 * La interfaz ISalaEspera representa la sala de espera en un juego o
 * aplicación. Esta interfaz define los métodos necesarios para gestionar la
 * sala de espera.
 *
 * @author Equipo 5
 */
public interface ISalaEspera {
  public Sala crearSala(Jugador anfitrion);

    public void unirseSala(String codigo, Jugador jugador);
}
