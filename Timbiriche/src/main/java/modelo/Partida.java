/*
 * Partida.java
 */
package modelo;

import java.awt.Color;
import java.util.ArrayList;

/**
 * La clase Partida se encarga de administrar una partida del juego. Contiene un
 * tablero, un sistema de turno y una lista de jugadores. Permite agregar
 * jugadores, iniciar y finalizar la partida, así como reiniciarla y determinar
 * al ganador.
 */
public class Partida {

    private Tablero tablero;
    private Turno turno;
    private ArrayList<Jugador> jugadores;

    /**
     * Constructor para inicializar una partida con un tablero de dimensiones
     * específicas y un número total de jugadores.
     *
     * @param dimension la dimensión del tablero de la partida
     * @param totalJugadores el número total de jugadores en la partida
     */
    public Partida(int dimension, int totalJugadores) {
        this.tablero = new Tablero(dimension);
        this.turno = new Turno(totalJugadores);
        this.jugadores = new ArrayList<>();
    }

    /**
     * Agrega un jugador a la partida con un nombre y un color específicos.
     *
     * @param nombre el nombre del jugador
     * @param color el color del jugador representado como un carácter
     */
    public void agregarJugador(String nombre, String color) {
        jugadores.add(new Jugador(nombre, color));
    }

    /**
     * Inicia la partida con los jugadores y el tablero configurados.
     */
    public void iniciarPartida() {
        // Aquí se implementaría la lógica para iniciar la partida
    }

    /**
     * Finaliza la partida y muestra los resultados finales.
     */
    public void finalizarPartida() {
        // Aquí se implementaría la lógica para finalizar la partida
    }

    /**
     * Determina el jugador ganador de la partida.
     *
     * @return el identificador del jugador ganador o 0 si no hay ganador aún
     */
    public int obtenerGanador() {
        // Aquí se implementaría la lógica para determinar el ganador de la partida
        return 0;
    }

    /**
     * Verifica si la partida ha finalizado.
     *
     * @return true si la partida ha finalizado, de lo contrario false
     */
    public boolean esPartidaFinalizada() {
        // Aquí se implementaría la lógica para verificar si la partida ha finalizado
        return false;
    }

    public Tablero getTablero() {
        return tablero;
    }

    public Turno getTurno() {
        return turno;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }
    
}
