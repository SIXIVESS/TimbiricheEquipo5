package modelo;

import vista.FrmCrearJuego;


/**
 *
 * @author chaly
 */
public class CrearJuego implements ICrearJuego{
    
    IMenuPrincipal menuPrincipal;
    IAjustes ajustes;
    FrmCrearJuego crearJuego;
    
    public CrearJuego(IMenuPrincipal menuPrincipal){
         crearJuego = FrmCrearJuego(this);
        this.menuPrincipal=menuPrincipal;
        ajustes= new Ajustes(this);
       
        
    }


    
    
}
