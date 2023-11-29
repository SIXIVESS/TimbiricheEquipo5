package acciones;

import dominio.DTO.JugadorDTO;
import envio.DTO.EnvioJugadorDTO;
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
