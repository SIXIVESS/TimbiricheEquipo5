package interfaces;

/**
 * La interfaz IAjustes proporciona métodos para ajustes de configuración en un
 * juego o aplicación. Los métodos incluyen la selección de color y avatar, el
 * establecimiento del nombre del jugador, la selección de siguiente sala de
 * espera y los métodos relacionados con botones para regresar a salas
 * específicas.
 *
 * @author Equipo 5
 */
public interface IAjustes {

    /**
     * Permite al usuario seleccionar un color específico para la configuración.
     */
    public void seleccionColor();

    /**
     * Permite al usuario seleccionar un avatar específico para la
     * configuración.
     */
    public void seleccionAvatar();

    /**
     * Permite al usuario establecer su nombre de jugador en la configuración.
     */
    public void nombreJugador();

    /**
     * Permite al usuario seleccionar la siguiente sala de espera en la
     * configuración.
     */
    public void seleccionSigSalaEspera();

    /**
     * Acción relacionada con el botón para regresar a la pantalla de creación
     * de sala.
     */
    public void btnRegresarCrearSala();

    /**
     * Acción relacionada con el botón para regresar a la pantalla de unirse a
     * una sala.
     */
    public void btnRegresarUnirseSala();

    /**
     * Abre la pantalla de ajustes en la aplicación o juego.
     */
    public void abrirPantalla();

}
