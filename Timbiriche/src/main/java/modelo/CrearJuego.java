//package modelo;
//
//import vista.FrmCrearJuego;
//
///**
// *
// * @author chaly
// */
//public class CrearJuego implements ICrearJuego {
//
//    IMenuPrincipal menuPrincipal;
//    IAjustes ajustes;
//    FrmCrearJuego crearJuego;
//
//    public CrearJuego(IMenuPrincipal menuPrincipal) {
//
//        this.menuPrincipal = menuPrincipal;
//        crearJuego = new FrmCrearJuego(this);
//        ajustes = new Ajustes(this);
//    }
//    
//     @Override
//    public void siguiente() {
//        ajustes.abrirPantalla();
//        crearJuego.dispose();
//    }
//
//    @Override
//    public void abrirMenu() {
//        crearJuego.setVisible(true);
//    }
//
//    @Override
//    public void regresarMenu() {
//       menuPrincipal.abrirMenu();
//       crearJuego.dispose();
//    }
//
//    @Override
//    public void cantidadJugador() {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }
//
//    @Override
//    public void crearJuego() {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }
//
//    @Override
//    public void crearCodigo() {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }
//    
//    
//
//}
