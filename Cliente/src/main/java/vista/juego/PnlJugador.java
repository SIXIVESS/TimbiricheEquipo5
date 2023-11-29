
package vista.juego;

import dominio.Jugador;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.ImageIcon;

/**
 *
 * @author brawun
 */
public class PnlJugador extends javax.swing.JPanel {

    /**
     * Instancia del jugador al desplegar.
     */
    private Jugador jugador;

    /**
     * Crea PnlJugador.
     */
    public PnlJugador(Jugador jugador) {
        initComponents();
        this.setSize(new Dimension(280, 80));
        this.jugador = jugador;
        if(!this.jugador.getRutaColor().isBlank()){
            this.labelColor.setIcon(new ImageIcon("src/main/resources/colores/" + this.jugador.getRutaColor()));
        }
        this.labelNombre.setText(this.jugador.getNombre());
        this.labelPuntos.setText(this.jugador.getPuntaje() + "");
        if(this.jugador.getColor() != null){
            this.setBackground(Color.decode(this.jugador.getColor()));
        }
    }
    
    /**
     * Establece el jugador.
     * @param jugador 
     */
    public void setJugador(Jugador jugador){
        this.jugador = jugador;
    }
    
    /**
     * Establece el puntaje de un jugador.
     * @param puntaje 
     */
    public void setPuntaje(int puntaje){
        this.jugador.setPuntaje(puntaje);
        this.labelPuntos.setText(puntaje + "");
        this.labelPuntos.revalidate();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelColor = new javax.swing.JLabel();
        labelPuntos = new javax.swing.JLabel();
        labelNombre = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        labelColor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        labelColor.setMaximumSize(new java.awt.Dimension(50, 50));
        labelColor.setMinimumSize(new java.awt.Dimension(50, 50));
        labelColor.setPreferredSize(new java.awt.Dimension(50, 50));

        labelPuntos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelPuntos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelPuntos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        labelPuntos.setMaximumSize(new java.awt.Dimension(50, 50));
        labelPuntos.setMinimumSize(new java.awt.Dimension(50, 50));
        labelPuntos.setPreferredSize(new java.awt.Dimension(50, 50));

        labelNombre.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelColor, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelPuntos, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelPuntos, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelColor, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(labelNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel labelColor;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelPuntos;
    // End of variables declaration//GEN-END:variables
}