package acciones;

import dominio.DTO.JugadorDTO;
import java.util.List;
import envio.DTO.EnvioJugadoresDTO;
import envio.EnvioTamanio;
import interfaces.IPAFAccion;

/**
 *
 * @author brawun
 */
class CrearSalaPln implements IPAFAccion {

    private List<JugadorDTO> jugadores;

    public CrearSalaPln(List<JugadorDTO> jugadores) {
        this.jugadores = jugadores;
    }

    @Override
    public void ejecutar() {
        EnvioJugadoresDTO pj = new EnvioJugadoresDTO();
        pj.pasar(jugadores);
        EnvioTamanio pt = new EnvioTamanio();
        pt.pasar(jugadores.size());
    }

}
