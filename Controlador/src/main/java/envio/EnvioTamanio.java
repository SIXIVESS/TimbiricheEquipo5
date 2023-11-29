
package envio;

import observer.ObserverTablero;
import interfaces.IEnvio;

/**
 *
 * @author brawun
 */
public class EnvioTamanio implements IEnvio<Integer, ObserverTablero>{

    @Override
    public void pasar(Integer objeto) {
        ObserverTablero ft = new ObserverTablero();
        ft.procesar(objeto);
    }
}
