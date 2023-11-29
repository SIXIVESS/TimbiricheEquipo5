package interfaces;

/**
 *
 * @author brawun
 * @param <I> Entrada
 * @param <O> Salida
 * @param <P> Pipe de salida
 */
public interface IObserver<I, O, P> {

    void procesar(I objeto);
}
