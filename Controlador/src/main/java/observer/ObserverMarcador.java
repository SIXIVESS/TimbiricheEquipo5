
package observer;

import interfaces.IObserver;
import dominio.Jugador;
import dominio.Marcador;
import java.util.List;
import envio.EnvioMarcador;

/**
 *
 * @author brawun
 */
public class ObserverMarcador implements IObserver<List<Jugador>, Marcador, EnvioMarcador>{

    @Override
    public void procesar(List<Jugador> objeto) {
        Marcador marcador = new Marcador(objeto);
        EnvioMarcador pm = new EnvioMarcador();
        pm.pasar(marcador);
    }   
}