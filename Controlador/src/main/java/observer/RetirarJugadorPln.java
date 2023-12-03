package observer;

import dominio.DTO.JugadorDTO;
import tuberias.DTO.EnvioJugadorDTO;
import interfaces.IPAFAccion;

/**
 *
 * @author brawun
 */
public class RetirarJugadorPln implements IPAFAccion {

    private JugadorDTO jugador;

    public RetirarJugadorPln(JugadorDTO jugador) {
        this.jugador = jugador;
    }

    @Override
    public void ejecutar() {
        EnvioJugadorDTO pj = new EnvioJugadorDTO();
        pj.pasar(jugador);
    }

}
