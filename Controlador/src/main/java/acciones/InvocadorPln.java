package acciones;

import dominio.DTO.CuadroDTO;
import dominio.DTO.JugadorDTO;
import dominio.DTO.LineaDTO;
import java.util.List;
import interfaces.IPAF;
import interfaces.IPAFAccion;

/**
 *
 * @author brawun
 */
public class InvocadorPln implements IPAF {

    IPAFAccion comando;

    @Override
    public void crearSala(List<JugadorDTO> jugadores) {
        comando = new CrearSalaPln(jugadores);
        comando.ejecutar();
    }

    @Override
    public void asignarLinea(LineaDTO linea) {
        comando = new AsignarLineaPln(linea);
        comando.ejecutar();
    }

    @Override
    public void asignarCuadro(CuadroDTO cuadro) {
        comando = new AsignarCuadroPln(cuadro);
        comando.ejecutar();
    }

    @Override
    public void retirarJugador(JugadorDTO jugador) {
        comando = new RetirarJugadorPln(jugador);
        comando.ejecutar();
    }
}
