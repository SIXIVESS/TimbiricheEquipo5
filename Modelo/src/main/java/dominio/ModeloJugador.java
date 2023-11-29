package dominio;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author chaly
 */
public class ModeloJugador implements interfaces.IJugador {

    private Jugador jugador;

    public ModeloJugador() {
    }

    public static ModeloJugador getInstance() {
        return ModeloJugadorGuardar.INSTANCE;
    }

    private static class ModeloJugadorGuardar {
        private static final ModeloJugador INSTANCE = new ModeloJugador();
    }
    
    @Override
    public void informacionJugador(String nickname, String color) {
        jugador = new Jugador(nickname, color);
    }

    @Override
    public Jugador solicitarInformacion() {
        System.out.println(jugador);
        return new Jugador(jugador.getNombre(), jugador.getColor());
    }
}


