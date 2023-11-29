package vista.jugador;

import interfaces.IAjustes;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import dominio.Ajustes;
import dominio.Jugador;
import dominio.Preferencia;

/**
 *
 * @author chaly
 */
public class FrmConfiguracion extends javax.swing.JFrame {

    private IAjustes ajustes = new Ajustes();
    private String perfil = "255,255,255";
    private String colorSeleccionado;

    /**
     * Creates new form FrmConfiguracion
     */
    public FrmConfiguracion() {
        initComponents();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnJugar = new javax.swing.JButton();
        colorJugador = new javax.swing.JLabel();
        colorRojo = new javax.swing.JLabel();
        colorAzul = new javax.swing.JLabel();
        colorAmarillo = new javax.swing.JLabel();
        colorVerde = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Registro de Jugador");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setBackground(new java.awt.Color(102, 102, 255));
        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 255));
        jLabel2.setText("Registro");

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 102, 204));
        jLabel3.setText("Nombre de usuario");

        txtUsuario.setBackground(new java.awt.Color(194, 214, 245));
        txtUsuario.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(51, 0, 51));

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 102, 204));
        jLabel4.setText("Colores");

        btnJugar.setBackground(new java.awt.Color(153, 153, 153));
        btnJugar.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnJugar.setText("Registrarme");
        btnJugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJugarActionPerformed(evt);
            }
        });

        colorJugador.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        colorJugador.setMaximumSize(new java.awt.Dimension(50, 50));
        colorJugador.setMinimumSize(new java.awt.Dimension(50, 50));
        colorJugador.setPreferredSize(new java.awt.Dimension(50, 50));

        colorRojo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/colores/rojo.png"))); // NOI18N
        colorRojo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                colorRojoMouseClicked(evt);
            }
        });

        colorAzul.setIcon(new javax.swing.ImageIcon(getClass().getResource("/colores/azul.png"))); // NOI18N
        colorAzul.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                colorAzulMouseClicked(evt);
            }
        });

        colorAmarillo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/colores/amarillo.png"))); // NOI18N
        colorAmarillo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                colorAmarilloMouseClicked(evt);
            }
        });

        colorVerde.setIcon(new javax.swing.ImageIcon(getClass().getResource("/colores/verde.png"))); // NOI18N
        colorVerde.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                colorVerdeMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(248, 248, 248)
                            .addComponent(jLabel4))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGap(236, 236, 236)
                            .addComponent(jLabel2)
                            .addGap(159, 159, 159))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(202, 202, 202)
                            .addComponent(jLabel3))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(134, 134, 134)
                            .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(colorJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(217, 217, 217)
                        .addComponent(btnJugar, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(colorRojo)
                        .addGap(56, 56, 56)
                        .addComponent(colorAzul)
                        .addGap(53, 53, 53)
                        .addComponent(colorAmarillo)
                        .addGap(60, 60, 60)
                        .addComponent(colorVerde)))
                .addContainerGap(78, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(jLabel2)
                .addGap(45, 45, 45)
                .addComponent(jLabel3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(colorJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)))
                .addComponent(jLabel4)
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(colorRojo, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(colorAzul, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(colorAmarillo, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(colorVerde, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                .addComponent(btnJugar)
                .addGap(42, 42, 42))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 560, 550));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo2.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 620));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnJugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJugarActionPerformed
        registrarJugador();
    }//GEN-LAST:event_btnJugarActionPerformed

    private void colorRojoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_colorRojoMouseClicked
        this.perfil = "233,27,27";
        establecerColor((ImageIcon) colorRojo.getIcon(), "rojo.png");
    }//GEN-LAST:event_colorRojoMouseClicked

    private void colorAzulMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_colorAzulMouseClicked
        this.perfil = "0,62,255";
        establecerColor((ImageIcon) colorAzul.getIcon(), "azul.png");
    }//GEN-LAST:event_colorAzulMouseClicked

    private void colorAmarilloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_colorAmarilloMouseClicked
        this.perfil = "255,247,4";
        establecerColor((ImageIcon) colorAmarillo.getIcon(), "amarillo.png");
    }//GEN-LAST:event_colorAmarilloMouseClicked

    private void colorVerdeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_colorVerdeMouseClicked
        this.perfil = "70,210,45";
        establecerColor((ImageIcon) colorVerde.getIcon(), "verde.png");
    }//GEN-LAST:event_colorVerdeMouseClicked
  
    private void establecerColor(ImageIcon color, String colorSeleccionado) {
        this.colorJugador.setIcon(color);
        this.colorSeleccionado = colorSeleccionado;
    }

    public void registrarJugador() {
        ajustes.informacionJugador(this.txtUsuario.getText(), this.perfil);
        if (txtUsuario.getText().isBlank() || colorJugador.getIcon() == null) {
            JOptionPane.showMessageDialog(this, "Escriba un nickname y eliga un color", "Registro incompleto", JOptionPane.ERROR_MESSAGE);
        } else {
            Jugador jugador = new Jugador(this.txtUsuario.getText(), this.colorSeleccionado);
            Preferencia pref = new Preferencia("#F53333", "#4747EF", "#49E949");
            jugador.setColor("#F0F46C");
            jugador.setPerfil(this.perfil);
            jugador.setPreferencia(pref);
            new FrmMenuPrincipal(jugador).setVisible(true);
            this.dispose();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnJugar;
    private javax.swing.JLabel colorAmarillo;
    private javax.swing.JLabel colorAzul;
    private javax.swing.JLabel colorJugador;
    private javax.swing.JLabel colorRojo;
    private javax.swing.JLabel colorVerde;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}