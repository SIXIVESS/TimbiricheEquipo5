package interfaces;

/**
 * La interfaz IUnirseJuego proporciona métodos para unirse a un juego existente
 * en una aplicación o juego. Los métodos incluyen ingresar un código específico
 * para unirse al juego, avanzar al siguiente paso en el proceso de unirse y
 * regresar al menú principal desde la pantalla de unirse a un juego.
 *
 * @author Equipo 5
 */
public interface IUnirseJuego {

    /**
     * Permite al usuario ingresar un código específico para unirse a un juego.
     */
    public void ingresarCodigo();

    /**
     * Permite al usuario avanzar al siguiente paso en el proceso de unirse a un
     * juego.
     */
    public void siguiente();

    /**
     * Permite al usuario regresar al menú principal desde la pantalla de unirse
     * a un juego.
     */
    public void regresarMenu();

}
