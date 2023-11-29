
package envio.DTO;

import dominio.DTO.LineaDTO;
import observer.ObserverLinea;
import interfaces.IEnvio;

/**
 *
 * @author brawun
 */
public class EnvioLineaDTO implements IEnvio<LineaDTO, ObserverLinea>{

    @Override
    public void pasar(LineaDTO objeto) {
        ObserverLinea fl = new ObserverLinea();
        fl.procesar(objeto);
    }   
}