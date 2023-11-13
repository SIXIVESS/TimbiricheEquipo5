package modelo;

import java.util.List;

/**
 *
 * @author chaly
 */
public class Sala {

    private List<Jugador> jugadores;
    private String codigoAmigo;

    public Sala(String codigoAmigo) {
        this.codigoAmigo = codigoAmigo;
    }
    
    public Sala(List<Jugador> generarListaJugadores, String codigoAmigo) {
        this.jugadores = jugadores;
        this.codigoAmigo = codigoAmigo;
    }

    public List<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public String getCodigoAmigo() {
        return codigoAmigo;
    }

    public void setCodigoAmigo(String codigoAmigo) {
        this.codigoAmigo = codigoAmigo;
    }

}
