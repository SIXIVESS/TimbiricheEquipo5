/**
 * Jugador.java
 */
package modelo;

import java.awt.Color;

/**
 * La clase Jugador representa a un jugador en el juego.
 *
 * @author Equipo 5
 */
public class Jugador {

    private String nombre;
    private Color color;
    private int puntaje;

    /**
     * Constructor para inicializar un jugador con un nombre y un color
     * específicos.
     *
     * @param nombre el nombre del jugador
     * @param color el color del jugador representado como un carácter
     */
    public Jugador(String nombre, Color color) {
        this.nombre = nombre;
        this.color = color;
        this.puntaje = 0;
    }

    /**
     * Obtiene el nombre del jugador.
     *
     * @return el nombre del jugador
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del jugador.
     *
     * @param nombre el nombre del jugador
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el color del jugador.
     *
     * @return el color del jugador representado como un carácter
     */
    public Color getColor() {
        return color;
    }

    /**
     * Establece el color del jugador.
     *
     * @param color el color del jugador representado como un carácter
     */
    public void setColor(Color color) {
        this.color = color;
    }

    /**
     * Obtiene el puntaje del jugador.
     *
     * @return el puntaje del jugador
     */
    public int getPuntaje() {
        return puntaje;
    }

    /**
     * Establece el puntaje del jugador.
     *
     * @param puntaje el puntaje del jugador
     */
    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    /**
     * Actualiza el puntaje del jugador por un valor específico.
     *
     * @param valor el valor por el que se actualizará el puntaje del jugador
     */
    public void actualizarPuntaje(int valor) {
        this.puntaje += valor;
    }

    /**
     * Permite que el jugador realice una jugada en el juego.
     *
     * @param jugador el jugador que realiza la jugada
     * @param x la coordenada x del primer punto
     * @param y la coordenada y del primer punto
     * @param x2 la coordenada x del segundo punto
     * @param y2 la coordenada y del segundo punto
     */
    public void realizarJugada(Jugador jugador, int x, int y, int x2, int y2) {
        // Aquí se implementaría la lógica para que el jugador realice una jugada
    }

    /**
     * Permite que el jugador abandone la partida.
     */
    public void abandonarJuego() {
        // Aquí se implementaría la lógica para que el jugador abandone la partida
    }

    @Override
    public String toString() {
        return String.format("%s        %d", nombre, puntaje);
    }
}
