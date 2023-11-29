
package envio.DTO;

import dominio.DTO.CuadroDTO;
import observer.ObserverCuadro;
import interfaces.IEnvio;

/**
 *
 * @author brawun
 */
public class EnvioCuadroDTO implements IEnvio<CuadroDTO, ObserverCuadro>{

    @Override
    public void pasar(CuadroDTO objeto) {
        ObserverCuadro fc = new ObserverCuadro();
        fc.procesar(objeto);
    }
}
