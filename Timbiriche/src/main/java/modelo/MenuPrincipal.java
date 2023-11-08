package modelo;

import vista.FrmMenuPrincipal;

/**
 *
 * @author chaly
 */
public class MenuPrincipal implements IMenuPrincipal{
    ICrearJuego crearJuego;
    IUnirseJuego unirseJuego;
    FrmMenuPrincipal menuPrincipal;

    public MenuPrincipal() {
        this.crearJuego = new ICrearJuego(this) {};
        this.unirseJuego = new IUnirseJuego(this);
        this.menuPrincipal = new FrmMenuPrincipal(this);
    }
    
    
    
    
}
