/**
 * Turno.java
 */
package dominio;

/**
 * La clase Turno se encarga de administrar el turno de los jugadores en el
 * juego. Controla el jugador actual y el número total de jugadores en el juego.
 *
 * @author Equipo 5
 */
public class Turno {

    private int jugadorActual;
    private int totalJugadores;

    /**
     * Constructor para inicializar el sistema de turno con el número total de
     * jugadores.
     *
     * @param totalJugadores el número total de jugadores en el juego
     */
    public Turno(int totalJugadores) {
        this.totalJugadores = totalJugadores;
        this.jugadorActual = 0;
    }

    /**
     * Obtiene el identificador del jugador que tiene el turno actual.
     *
     * @return el identificador del jugador actual
     */
    public int obtenerJugadorActual() {
        return this.jugadorActual;
    }

    /**
     * Cambia el turno al siguiente jugador en el ciclo de turnos. Aquí se
     * implementaría la lógica para cambiar al siguiente jugador.
     */
    public void cambiarJugador() {
        // Aquí se implementaría la lógica para cambiar al siguiente jugador
    }

    /**
     * Reinicia el orden de los turnos y establece el primer jugador como el
     * jugador inicial. Aquí se implementaría la lógica para reiniciar el orden
     * de los turnos.
     */
    public void reiniciarTurnos() {
        // Aquí se implementaría la lógica para reiniciar el orden de los turnos
    }

    /**
     * Verifica si es el turno de un jugador específico.
     *
     * @param jugador el identificador del jugador a verificar
     * @return true si es el turno del jugador específico, de lo contrario false
     */
    public boolean esTurnoDe(int jugador) {
        // Aquí se implementaría la lógica para verificar si es el turno de un jugador específico
        return false;
    }

    /**
     * Obtiene el siguiente jugador en el orden de turnos.
     *
     * @return el identificador del siguiente jugador en el orden de turnos
     */
    public int obtenerSiguienteJugador() {
        // Aquí se implementaría la lógica para obtener el siguiente jugador en el orden de turnos
        return 0;
    }
}
