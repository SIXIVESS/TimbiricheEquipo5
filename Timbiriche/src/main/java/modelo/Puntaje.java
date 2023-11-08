/*
 * Puntaje.java
 */
package modelo;

/**
 * La clase Puntaje se encarga de gestionar el puntaje de un jugador en el
 * juego. Permite obtener, actualizar y reiniciar el puntaje del jugador.
 *
 * @author EQuipo 5
 */
public class Puntaje {

    private int puntaje;

    /**
     * Constructor para inicializar el puntaje en 0 al inicio del juego.
     */
    public Puntaje() {
        this.puntaje = 0;
    }

    /**
     * Obtiene el puntaje actual del jugador.
     *
     * @return el puntaje actual del jugador
     */
    public int obtenerPuntaje() {
        return this.puntaje;
    }

    /**
     * Actualiza el puntaje del jugador sumando el valor proporcionado.
     *
     * @param valor el valor a sumar al puntaje actual del jugador
     */
    public void actualizarPuntaje(int valor) {
        this.puntaje += valor;
    }

    /**
     * Reinicia el puntaje del jugador, estableciéndolo en 0.
     */
    public void reiniciarPuntaje() {
        this.puntaje = 0;
    }
}
