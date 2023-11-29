
package interfaces;

import dominio.FormaJuego;
import java.util.List;

/**
 *
 * @author brawun
 */
public interface IObservable {

    void agrega(IObservador observador);

    void notificaMovimiento(List<FormaJuego> movimiento);
}
