
package envio.DTO;

import dominio.DTO.JugadorDTO;
import java.util.List;
import observer.ObserverJugadores;
import interfaces.IEnvio;

/**
 *
 * @author brawun
 */
public class EnvioJugadoresDTO implements IEnvio<List<JugadorDTO>, ObserverJugadores> {

    @Override
    public void pasar(List<JugadorDTO> objeto) {
        ObserverJugadores fj = new ObserverJugadores();
        fj.procesar(objeto);
    }
    
}
