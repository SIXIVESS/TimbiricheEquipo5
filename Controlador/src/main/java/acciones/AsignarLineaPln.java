package acciones;

import dominio.DTO.LineaDTO;
import envio.DTO.EnvioLineaDTO;
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
