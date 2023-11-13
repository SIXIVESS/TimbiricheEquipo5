/**
 * Tablero.java
 */
package modelo;

/**
 * La clase Tablero representa un tablero de juego para un juego específico.
 *
 * @author Equipo 5
 */
public class Tablero {

    private int dimension;
    private int[][] tablero;
    private int jugadorActual;

    /**
     * Constructor para inicializar un tablero con una dimensión específica.
     *
     * @param dimension la dimensión del tablero (tanto en largo como en ancho)
     */
    public Tablero(int dimension) {
        this.tablero = new int[dimension][dimension];
        this.dimension = dimension;
        this.jugadorActual = 0;
    }

    /**
     * Coloca una línea en el tablero entre dos coordenadas especificadas.
     *
     * @param x la coordenada x del primer punto
     * @param y la coordenada y del primer punto
     * @param x2 la coordenada x del segundo punto
     * @param y2 la coordenada y del segundo punto
     */
    public void colocarLinea(int x, int y, int x2, int y2) {
        // Aquí se implementaría la lógica para colocar una línea en el tablero
    }

    /**
     * Verifica si una línea entre dos coordenadas especificadas es válida.
     *
     * @param x la coordenada x del primer punto
     * @param y la coordenada y del primer punto
     * @param x2 la coordenada x del segundo punto
     * @param y2 la coordenada y del segundo punto
     * @return true si la línea es válida, de lo contrario false
     */
    public boolean esValido(int x, int y, int x2, int y2) {
        // Aquí se implementaría la lógica para verificar si una línea es válida
        return false;
    }

    /**
     * Verifica si un cuadrado en las coordenadas especificadas está completo.
     *
     * @param x la coordenada x del cuadrado
     * @param y la coordenada y del cuadrado
     * @return true si el cuadrado está completo, de lo contrario false
     */
    public boolean esCuadradoCompleto(int x, int y) {
        // Aquí se implementaría la lógica para verificar si un cuadrado está completo
        return false;
    }

    /**
     * Cambia al siguiente jugador en turno.
     */
    public void cambiarJugador() {
        // Aquí se implementaría la lógica para cambiar al siguiente jugador
    }

    /**
     * Determina el ganador de la partida en el tablero.
     *
     * @return el identificador del jugador ganador o 0 si no hay ganador aún
     */
    public int obtenerGanador() {
        // Aquí se implementaría la lógica para determinar el ganador de la partida
        return 0;
    }

    public int getJugadorActual() {
        return jugadorActual;
    }

    public void setJugadorActual(int jugadorActual) {
        this.jugadorActual = jugadorActual;
    }

    public int getDimension() {
        return dimension;
    }

    public void setDimension(int dimension) {
        this.dimension = dimension;
    }

    public int[][] getTablero() {
        return tablero;
    }

    public void setTablero(int[][] tablero) {
        this.tablero = tablero;
    }
    
    
}
