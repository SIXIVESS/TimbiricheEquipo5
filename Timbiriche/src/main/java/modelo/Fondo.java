package modelo;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author chaly
 */
public class Fondo extends JPanel {

    public void fondo(Graphics g) {
        Image fondo = new ImageIcon(getClass().getResource("/fondo.png")).getImage();
        g.drawImage(fondo, 0, 0, getWidth(), getHeight(), this);
    }

    protected void pintar(Graphics g) {
        super.paintComponent(g);
        fondo(g);
    }
}
