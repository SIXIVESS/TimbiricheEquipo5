package interfaces;

/**
 * La interfaz ICrearJuego proporciona métodos para la creación y gestión de un
 * juego en una aplicación. Los métodos incluyen la configuración de la cantidad
 * de jugadores, la creación del juego y la generación de un código específico
 * para el juego. También incluye métodos relacionados con la navegación en el
 * menú, como avanzar al siguiente paso, regresar al menú principal y abrir el
 * menú.
 *
 * @author Equipo 5
 */
public interface ICrearJuego {

    /**
     * Permite al usuario establecer la cantidad de jugadores para el juego.
     */
    public void cantidadJugador();

    /**
     * Crea un nuevo juego con la configuración actual.
     */
    public void crearJuego();

    /**
     * Genera un código único para el juego recién creado.
     */
    public void crearCodigo();

    /**
     * Permite al usuario avanzar al siguiente paso en la creación del juego.
     */
    public void siguiente();

    /**
     * Permite al usuario regresar al menú principal desde la pantalla de
     * creación de juego.
     */
    public void regresarMenu();

    /**
     * Abre el menú de creación de juego en la aplicación o juego.
     */
    public void abrirMenu();
}
