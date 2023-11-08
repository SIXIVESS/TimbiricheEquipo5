

package com.mycompany.timbiriche;

import modelo.IMenuPrincipal;
import vista.FrmMenuPrincipal;

/**
 *
 * @author chaly
 */


    public class Timbiriche {
    public static void main(String[] args) {
        IMenuPrincipal menuPrincipal = new IMenuPrincipal(); 
        new FrmMenuPrincipal(menuPrincipal).setVisible(true);
    }
}
