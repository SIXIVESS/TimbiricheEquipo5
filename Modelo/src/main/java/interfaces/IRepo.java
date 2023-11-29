package interfaces;

import dominio.DTO.CuadroDTO;
import dominio.DTO.LineaDTO;
import dominio.DTO.MarcadorDTO;

/**
 *
 * @author brawun
 */
public interface IRepo {

    MarcadorDTO obtenerMarcador();

    LineaDTO obtenerUltimaLinea();

    CuadroDTO obtenerUltimoCuadro();

    int obtenerTurnoSiguiente();
}
