package vista.jugador;

import dominio.Fondo;
import interfaces.IMenuPrincipal;
import javax.swing.JOptionPane;
import dominio.Jugador;

public class FrmMenuPrincipal extends javax.swing.JFrame {

    private Jugador jugador;
    Fondo fondo = new Fondo();
    IMenuPrincipal menuPrincipal;

    /**
     * Creates new form FrmMenuPrincipal
     */
    public FrmMenuPrincipal(Jugador jugador) {
        initComponents();
        if (jugador == null) {
            FrmConfiguracion config = new FrmConfiguracion();
            config.setVisible(true);
        } else {
            this.jugador = jugador;
        }
    }
    
    public FrmMenuPrincipal(IMenuPrincipal menuPrincipal) {
        this.menuPrincipal = menuPrincipal;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        btnUnirse = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnColores = new javax.swing.JButton();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Timbiriche");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/foto2.jpg"))); // NOI18N

        lblTitulo.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(51, 204, 255));
        lblTitulo.setText("Timbiriche");

        btnUnirse.setBackground(new java.awt.Color(255, 204, 255));
        btnUnirse.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        btnUnirse.setText("Unirse a un juego");
        btnUnirse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUnirseActionPerformed(evt);
            }
        });

        btnSalir.setBackground(new java.awt.Color(204, 204, 204));
        btnSalir.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnColores.setBackground(new java.awt.Color(255, 255, 175));
        btnColores.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        btnColores.setText("Cambiar colores");
        btnColores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnColoresActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(156, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(151, 151, 151))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblTitulo)
                        .addGap(173, 173, 173))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(btnUnirse, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(btnColores, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(254, 254, 254)
                        .addComponent(btnSalir)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUnirse, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnColores, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(112, 112, 112)
                .addComponent(btnSalir)
                .addGap(39, 39, 39))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 40, 580, 710));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo2.png"))); // NOI18N
        getContentPane().add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1453, 810));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        int confirm = JOptionPane.showConfirmDialog(this, "¿Seguro que quiere cerrar el juego?", "Confirmación", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnUnirseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUnirseActionPerformed
        new FrmUnirseJuego(this.jugador).setVisible(true);
        dispose();
    }//GEN-LAST:event_btnUnirseActionPerformed

    private void btnColoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnColoresActionPerformed
        FrmPreferenciaColores conf = FrmPreferenciaColores.getInstance(this.jugador);
        conf.setVisible(true);
    }//GEN-LAST:event_btnColoresActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnColores;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnUnirse;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblTitulo;
    // End of variables declaration//GEN-END:variables
}
