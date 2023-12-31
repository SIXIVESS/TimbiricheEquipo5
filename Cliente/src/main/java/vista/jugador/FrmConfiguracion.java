package vista.jugador;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import dominio.Jugador;
import dominio.Preferencia;
import java.awt.Font;

/**
 *
 * @author chaly
 */
public class FrmConfiguracion extends javax.swing.JFrame {
    
    Font fontTitulo = new Font("Cocogoose", Font.BOLD, 48);
     Font fontSubtitulo = new Font("Warung Kopi", Font.BOLD, 24);
     Font fontBotones = new Font("Warung Kopi", Font.BOLD, 18);
      Font fontTexto = new Font("Warung Kopi", Font.PLAIN, 14);

    private String perfil = "255,255,255";
    private String colorSeleccionado;

    /**
     * Creates new form FrmConfiguracion
     */
    public FrmConfiguracion() {
        initComponents();
          lblRegistro.setFont(fontTitulo);
        lblColores.setFont(fontSubtitulo);
        lblNombre.setFont(fontSubtitulo);
      
        txtUsuario.setFont(fontTexto);
        btnJugar.setFont(fontBotones);
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
        lblRegistro = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        lblColores = new javax.swing.JLabel();
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

        lblRegistro.setBackground(new java.awt.Color(102, 102, 255));
        lblRegistro.setFont(new java.awt.Font("Cocogoose", 1, 48)); // NOI18N
        lblRegistro.setForeground(new java.awt.Color(102, 102, 255));
        lblRegistro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRegistro.setText("Registro");
        lblRegistro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lblNombre.setFont(new java.awt.Font("Warung Kopi", 1, 24)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(255, 102, 204));
        lblNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombre.setText("Nombre de usuario:");
        lblNombre.setAlignmentY(0.0F);

        txtUsuario.setBackground(new java.awt.Color(234, 239, 247));
        txtUsuario.setFont(new java.awt.Font("Warung Kopi", 0, 14)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(102, 102, 102));
        txtUsuario.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(189, 221, 245), 2, true));

        lblColores.setFont(new java.awt.Font("Warung Kopi", 1, 24)); // NOI18N
        lblColores.setForeground(new java.awt.Color(255, 102, 204));
        lblColores.setText("Colores:");

        btnJugar.setBackground(new java.awt.Color(228, 193, 249));
        btnJugar.setFont(new java.awt.Font("Warung Kopi", 1, 18)); // NOI18N
        btnJugar.setForeground(new java.awt.Color(102, 0, 102));
        btnJugar.setText("Registrarme");
        btnJugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJugarActionPerformed(evt);
            }
        });

        colorJugador.setBackground(new java.awt.Color(235, 241, 243));
        colorJugador.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(189, 221, 245), 2, true));
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
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnJugar, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(lblColores))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(colorRojo)
                        .addGap(55, 55, 55)
                        .addComponent(colorAmarillo)
                        .addGap(55, 55, 55)
                        .addComponent(colorVerde)
                        .addGap(55, 55, 55)
                        .addComponent(colorAzul)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addComponent(lblRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE)
                .addGap(137, 137, 137))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(colorJugador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(lblNombre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(lblRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(lblNombre)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(colorJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblColores)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(colorRojo)
                    .addComponent(colorAmarillo)
                    .addComponent(colorVerde)
                    .addComponent(colorAzul))
                .addGap(56, 56, 56)
                .addComponent(btnJugar)
                .addContainerGap(76, Short.MAX_VALUE))
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblColores;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblRegistro;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
