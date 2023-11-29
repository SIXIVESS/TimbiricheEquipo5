
package interfaces;

/**
 *
 * @author brawun
 * @param <I> Entrada
 * @param <O> FiltroSalida
 */
public interface IEnvio<I, O> {

    void pasar(I objeto);
}
