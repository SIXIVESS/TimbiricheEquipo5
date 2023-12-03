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
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnJugar = new javax.swing.JButton();
        colorJugador = new javax.swing.JLabel();
        colorRojo = new javax.swing.JLabel();
        colorAmarillo = new javax.swing.JLabel();
        colorVerde = new javax.swing.JLabel();
        colorAzul = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Registro de Jugador");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Warung Kopi", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 102, 204));
        jLabel3.setText("Nombre de usuario");

        jLabel2.setBackground(new java.awt.Color(102, 102, 255));
        jLabel2.setFont(new java.awt.Font("Cocogoose", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 255));
        jLabel2.setText("Registro");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        txtUsuario.setBackground(new java.awt.Color(194, 214, 245));
        txtUsuario.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(51, 0, 51));

        jLabel4.setFont(new java.awt.Font("Warung Kopi", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 102, 204));
        jLabel4.setText("Colores");

        btnJugar.setBackground(new java.awt.Color(228, 193, 249));
        btnJugar.setFont(new java.awt.Font("Warung Kopi", 1, 18)); // NOI18N
        btnJugar.setForeground(new java.awt.Color(0, 51, 102));
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

        colorAzul.setIcon(new javax.swing.ImageIcon(getClass().getResource("/colores/azul.png"))); // NOI18N
        colorAzul.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                colorAzulMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(120, Short.MAX_VALUE)
                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(colorJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(120, 120, 120))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(216, 216, 216)
                        .addComponent(btnJugar, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(colorRojo)
                        .addGap(55, 55, 55)
                        .addComponent(colorAmarillo)
                        .addGap(55, 55, 55)
                        .addComponent(colorVerde)
                        .addGap(55, 55, 55)
                        .addComponent(colorAzul))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(240, 240, 240)
                        .addComponent(jLabel4)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(colorJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(colorRojo, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(colorAmarillo, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(colorVerde, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(colorAzul, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(65, 65, 65)
                .addComponent(btnJugar)
                .addGap(40, 40, 40))
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
        this.perfil = "239,71,111";
        establecerColor((ImageIcon) colorRojo.getIcon(), "rojo.png");
    }//GEN-LAST:event_colorRojoMouseClicked

    private void colorAmarilloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_colorAmarilloMouseClicked
        this.perfil = "255,209,102";
        establecerColor((ImageIcon) colorAmarillo.getIcon(), "amarillo.png");
    }//GEN-LAST:event_colorAmarilloMouseClicked

    private void colorVerdeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_colorVerdeMouseClicked
        this.perfil = "6,214,160";
        establecerColor((ImageIcon) colorVerde.getIcon(), "verde.png");
    }//GEN-LAST:event_colorVerdeMouseClicked

    private void colorAzulMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_colorAzulMouseClicked
        this.perfil = "17,138,178";
        establecerColor((ImageIcon) colorAzul.getIcon(), "azul.png");
    }//GEN-LAST:event_colorAzulMouseClicked
  
    private void establecerColor(ImageIcon color, String colorSeleccionado) {
        this.colorJugador.setIcon(color);
        this.colorSeleccionado = colorSeleccionado;
    }

    public void registrarJugador() {
        ajustes.informacionJugador(this.txtUsuario.getText(), this.perfil);
        if (txtUsuario.getText().isBlank() || colorJugador.getIcon() == null) {
            JOptionPane.showMessageDialog(this, "Escriba un usuario y eliga un color", "Registro incompleto", JOptionPane.ERROR_MESSAGE);
        } else {
            Jugador jugador = new Jugador(this.txtUsuario.getText(), this.colorSeleccionado);
            Preferencia pref = new Preferencia("#f8ea6b", "#8ce4ae", "#5fc2f4");
            jugador.setColor("#ff4b9f");
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
