package observer;

import dominio.DTO.LineaDTO;
import tuberias.DTO.EnvioLineaDTO;
import interfaces.IPAFAccion;

/**
 *
 * @author brawun
 */
class AsignarLineaPln implements IPAFAccion {

    private LineaDTO linea;

    public AsignarLineaPln(LineaDTO linea) {
        this.linea = linea;
    }

    @Override
    public void ejecutar() {
        EnvioLineaDTO pl = new EnvioLineaDTO();
        pl.pasar(linea);
    }
}
