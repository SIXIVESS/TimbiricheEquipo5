package interfaces;

import dominio.Jugador;
import dominio.Sala;

/**
 *
 * @author chaly
 */
public interface ISala {

    public void crearSala(Jugador jugador);

    public Sala obtenerSala();
}
