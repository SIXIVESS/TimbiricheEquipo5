
package envio;

import dominio.Jugador;
import java.util.List;
import observer.ObserverMarcador;
import interfaces.IEnvio;

/**
 *
 * @author brawun
 */
public class EnvioJugadores implements IEnvio<List<Jugador>, ObserverMarcador>{

    @Override
    public void pasar(List<Jugador> objeto) {
        ObserverMarcador fm = new ObserverMarcador();
        fm.procesar(objeto);
    }
}