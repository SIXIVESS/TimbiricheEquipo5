package interfaces;

import dominio.DTO.LineaDTO;
import dominio.DTO.CuadroDTO;
import dominio.DTO.JugadorDTO;
import java.util.List;

/**
 *
 * @author brawun
 */
public interface IPAF {

    void crearSala(List<JugadorDTO> jugadores);

    void asignarLinea(LineaDTO linea);

    void asignarCuadro(CuadroDTO cuadro);

    void retirarJugador(JugadorDTO jugador);
}
