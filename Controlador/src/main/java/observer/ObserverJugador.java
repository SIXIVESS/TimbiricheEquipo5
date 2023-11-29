
package observer;

import interfaces.IObserver;
import dominio.Jugador;
import dominio.DTO.JugadorDTO;
import envio.EnvioJugador;

/**
 *
 * @author brawun
 */
public class ObserverJugador implements IObserver<JugadorDTO, Jugador, EnvioJugador> {

    @Override
    public void procesar(JugadorDTO objeto) {
        Jugador jugador = new Jugador(objeto.getNombreJugador(), objeto.getRutaAvatar());
        EnvioJugador pj = new EnvioJugador();
        pj.pasar(jugador);
    }
}
