
package vista.jugador;

import dominio.Preferencia;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import dominio.Jugador;

/**
 *
 * @author brawun
 */
public class FrmPreferenciaColores extends javax.swing.JFrame {


    private Jugador jugador;
    private Preferencia preferencias;
    private List<PnlColorChooser> chooser = new ArrayList<>();
    private static FrmPreferenciaColores instance;

    /**
     * Crea FrmPreferencias
     */
    private FrmPreferenciaColores(Jugador jugador) {
        this.jugador = jugador;
        initComponents();
        PnlColorChooser pnlJugador = new PnlColorChooser(this.jugador.getColor());
        chooser.add(pnlJugador);
        tabbed.add(pnlJugador);
        tabbed.setTitleAt(0, "Tu jugador");

        List<String> colores = this.jugador.getPreferencia().getColores();

        for (int i = 1; i <= colores.size(); i++) {
            PnlColorChooser pnl = new PnlColorChooser(colores.get(i-1));
            chooser.add(pnl);
            tabbed.add(pnl);
            tabbed.setTitleAt(i, "Jugador #" + (i + 1));
        }
    }

    public static FrmPreferenciaColores getInstance(Jugador jugador) {
        if (instance == null) {
            instance = new FrmPreferenciaColores(jugador);
        }
        return instance;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        guardar = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        tabbed = new javax.swing.JTabbedPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Ajusta tus colores del tablero");
        setMinimumSize(new java.awt.Dimension(300, 300));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        guardar.setBackground(new java.awt.Color(153, 255, 153));
        guardar.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        guardar.setText("Guardar");
        guardar.setMaximumSize(new java.awt.Dimension(50, 100));
        guardar.setMinimumSize(new java.awt.Dimension(50, 100));
        guardar.setPreferredSize(new java.awt.Dimension(50, 100));
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });

        cancelar.setBackground(new java.awt.Color(255, 153, 153));
        cancelar.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        cancelar.setText("Cancelar");
        cancelar.setMaximumSize(new java.awt.Dimension(50, 100));
        cancelar.setMinimumSize(new java.awt.Dimension(50, 100));
        cancelar.setPreferredSize(new java.awt.Dimension(50, 100));
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });

        tabbed.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        tabbed.setMaximumSize(new java.awt.Dimension(270, 270));
        tabbed.setMinimumSize(new java.awt.Dimension(270, 270));
        tabbed.setPreferredSize(new java.awt.Dimension(270, 270));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tabbed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabbed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Guarda preferenciaserencias.
     *
     * @param evt
     */
    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
        Color color = chooser.get(0).getColorEscogido();
        String colorHex1 = String.format("#%02x%02x%02x", color.getRed(), color.getGreen(), color.getBlue());
        color = chooser.get(1).getColorEscogido();
        String colorHex2 = String.format("#%02x%02x%02x", color.getRed(), color.getGreen(), color.getBlue());
        color = chooser.get(2).getColorEscogido();
        String colorHex3 = String.format("#%02x%02x%02x", color.getRed(), color.getGreen(), color.getBlue());
        color = chooser.get(3).getColorEscogido();
        String colorHex4 = String.format("#%02x%02x%02x", color.getRed(), color.getGreen(), color.getBlue());

        this.jugador.setColor(colorHex1);
        preferencias = new Preferencia(colorHex2, colorHex3, colorHex4);
        this.jugador.setPreferencia(preferencias);
        this.dispose();
    }//GEN-LAST:event_guardarActionPerformed


    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_cancelarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelar;
    private javax.swing.JButton guardar;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTabbedPane tabbed;
    // End of variables declaration//GEN-END:variables
}
