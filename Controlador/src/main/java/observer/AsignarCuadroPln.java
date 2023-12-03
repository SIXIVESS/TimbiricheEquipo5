package observer;

import dominio.DTO.CuadroDTO;
import tuberias.DTO.EnvioCuadroDTO;
import interfaces.IPAFAccion;

/**
 *
 * @author brawun
 */
class AsignarCuadroPln implements IPAFAccion {

    private CuadroDTO cuadro;

    public AsignarCuadroPln(CuadroDTO cuadro) {
        this.cuadro = cuadro;
    }

    @Override
    public void ejecutar() {
        EnvioCuadroDTO pc = new EnvioCuadroDTO();
        pc.pasar(cuadro);
    }

}
