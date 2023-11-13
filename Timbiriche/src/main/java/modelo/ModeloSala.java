package modelo;

import interfaces.ISala;
import interfaces.ISalaEspera;

import java.util.Arrays;
import java.util.List;


/**
 *
 * @author chaly
 */
public class ModeloSala implements ISala{
    
    private Sala sala;
    private ISalaEspera salaE;

    public ModeloSala() {
        salaE = new SalaEspera();
    }
    public static ModeloSala getInstance() {
        return ModeloSalaGuardar.INSTANCE;
    }
    
     private static class ModeloSalaGuardar {

        private static final ModeloSala INSTANCE = new ModeloSala();
    }

    @Override
    public void crearSala(Jugador jugador) {

        Jugador jugad = new Jugador(jugador.getNombre(), jugador.getColor());
        sala = salaE.crearSala(jugad); 
    }

    @Override
    public Sala obtenerSala() {
        return new Sala(generarListaJugadores(sala.getJugadores()), sala.getCodigoAmigo());
    }

    private List<Jugador> generarListaJugadores(List<Jugador> jugad) {
        if (!jugad.isEmpty()) {
            Jugador jugador = new Jugador(jugad.get(0).getNombre(), jugad.get(0).getColor());
            return Arrays.asList(jugador);
        }
        return null;
    }
}
