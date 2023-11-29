package envio.DTO;

import dominio.DTO.JugadorDTO;
import observer.ObserverJugador;
import interfaces.IEnvio;

/**
 *
 * @author brawun
 */
public class EnvioJugadorDTO implements IEnvio<JugadorDTO, ObserverJugador> {

    @Override
    public void pasar(JugadorDTO objeto) {
        ObserverJugador fj = new ObserverJugador();
        fj.procesar(objeto);
    }
}
