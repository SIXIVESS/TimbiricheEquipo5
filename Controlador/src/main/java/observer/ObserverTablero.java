
package observer;

import interfaces.IObserver;
import dominio.Tablero;
import envio.EnvioTablero;

/**
 *
 * @author brawun
 */
public class ObserverTablero implements IObserver<Integer, Tablero, EnvioTablero>{

    @Override
    public void procesar(Integer objeto) {
        Tablero tablero = new Tablero(objeto);
        tablero.generaInstanciasDeFormaJuego();
        EnvioTablero pt = new EnvioTablero();
        pt.pasar(tablero);
    } 
}
