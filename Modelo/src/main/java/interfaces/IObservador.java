
package interfaces;

import dominio.FormaJuego;
import java.util.List;

/**
 *
 * @author brawun
 */
public interface IObservador {

    void actualiza(List<FormaJuego> movimiento);
}
