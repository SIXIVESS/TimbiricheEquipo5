package vista.jugador;

import cliente.Cliente;
import interfaces.ICliente;
import interfaces.IActualizable;
import java.awt.Color;
import java.util.List;
import javax.swing.ImageIcon;
import dominio.Jugador;
import dominio.Marcador;
import enumeradores.MensajeSockets;
import vista.juego.FrmTablero;

/**
 *
 * @author chaly
 */
public class FrmSalaEspera extends javax.swing.JFrame implements IActualizable {

    private Jugador jugador;
    private String ip;
    private int port;
    private static FrmSalaEspera instance;

    private ICliente sck;

    private int jugadoresDibujados = 0;

    /**
     * Creates new form FrmSalaEspera
     */
    public FrmSalaEspera(Jugador jugador) {
        this.jugador = jugador;
        initComponents();
        this.lblNombre.setText(this.jugador.getNombre());
        this.colorUsuario.setBackground(generarColor(jugador.getPerfil()));
        this.sck = (ICliente) new Cliente(jugador, this);
        this.setVisible(true);
    }

    public Color generarColor(String color) {
        String rgb[] = color.split(",");
        return new Color(Integer.parseInt(rgb[0]), Integer.parseInt(rgb[1]), Integer.parseInt(rgb[2]));
    }
    
    public static FrmSalaEspera getInstance(Jugador jugador) {
        if (instance == null) {
            instance = new FrmSalaEspera(jugador);
        }
        return instance;
    }

    public boolean ejecutarConexion(Jugador jugador, String ip, int port) {
        this.jugador = jugador;
        this.ip = ip;
        this.port = port;
        if (sck.conectarAlServidor(this.ip, this.port)) {
            System.out.println("Conectado con exito");
            sck.enviarAlServidor(this.jugador);
            sck.escucharAlServidor();
            return true;
        } else {
            System.out.println("No se pudo conectar con el servidor");
            return false;
        }
    }

    public void recibirMensaje(String mensaje) {
        lblMensaje.setText(mensaje);
        lblMensaje.revalidate();
        validate();
    }

    public void recibirJugadores(List<Jugador> jugadores) {
        for (int i = 0; i < jugadores.size(); i++) {
            switch (i) {
                case 0:
                    this.lblIconJugador1.setIcon(new ImageIcon("src/main/resources/colores/" + jugadores.get(i).getRutaColor()));
                    this.lblNombreJugador1.setText(jugadores.get(i).getNombre());
                    break;
                case 1:
                    this.lblIconJugador2.setIcon(new ImageIcon("src/main/resources/colores/" + jugadores.get(i).getRutaColor()));
                    this.lblNombreJugador2.setText(jugadores.get(i).getNombre());
                    break;
                case 2:
                    this.lblIconJugador3.setIcon(new ImageIcon("src/main/resources/colores/" + jugadores.get(i).getRutaColor()));
                    this.lblNombreJugador3.setText(jugadores.get(i).getNombre());
                    break;
                case 3:
                    this.lblIconJugador4.setIcon(new ImageIcon("src/main/resources/colores/" + jugadores.get(i).getRutaColor()));
                    this.lblNombreJugador4.setText(jugadores.get(i).getNombre());
                    break;
                default:
                    break;
            }
        }
    }
    
    @Override
    public void actualizarSocket(Object mensaje) {
        if (mensaje instanceof String) {
            recibirMensaje((String) mensaje);
        } else if (mensaje instanceof List) {
            recibirJugadores((List<Jugador>) mensaje);
        } else if (mensaje instanceof Marcador) {
            FrmTablero tablero = new FrmTablero((Marcador) mensaje, this.jugador);
            tablero.setVisible(true);
            this.dispose();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        colorUsuario = new javax.swing.JPanel();
        lblNombre = new javax.swing.JLabel();
        lblMensaje = new javax.swing.JLabel();
        btnVotar = new javax.swing.JButton();
        pnlJugador1 = new javax.swing.JPanel();
        lblIconJugador1 = new javax.swing.JLabel();
        lblNombreJugador1 = new javax.swing.JLabel();
        pnlJugador3 = new javax.swing.JPanel();
        lblIconJugador3 = new javax.swing.JLabel();
        lblNombreJugador3 = new javax.swing.JLabel();
        pnlJugador2 = new javax.swing.JPanel();
        lblIconJugador2 = new javax.swing.JLabel();
        lblNombreJugador2 = new javax.swing.JLabel();
        pnlJugador4 = new javax.swing.JPanel();
        lblIconJugador4 = new javax.swing.JLabel();
        lblNombreJugador4 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Sala de Espera...");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setForeground(new java.awt.Color(255, 255, 255));

        jLabel9.setFont(new java.awt.Font("Cocogoose", 1, 48)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 153, 255));
        jLabel9.setText("Sala de espera");

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/espera.jpg"))); // NOI18N

        jLabel11.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 102, 204));
        jLabel11.setText("Color:");

        jLabel12.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 102, 204));
        jLabel12.setText("Nombre:");

        colorUsuario.setForeground(new java.awt.Color(153, 255, 153));

        javax.swing.GroupLayout colorUsuarioLayout = new javax.swing.GroupLayout(colorUsuario);
        colorUsuario.setLayout(colorUsuarioLayout);
        colorUsuarioLayout.setHorizontalGroup(
            colorUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        colorUsuarioLayout.setVerticalGroup(
            colorUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        lblNombre.setFont(new java.awt.Font("Warung Kopi", 0, 18)); // NOI18N

        lblMensaje.setFont(new java.awt.Font("Montserrat", 1, 10)); // NOI18N
        lblMensaje.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(189, 221, 245), 2, true));

        btnVotar.setBackground(new java.awt.Color(169, 222, 249));
        btnVotar.setFont(new java.awt.Font("Warung Kopi", 1, 24)); // NOI18N
        btnVotar.setForeground(new java.awt.Color(0, 51, 102));
        btnVotar.setText("VOTAR");
        btnVotar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVotarActionPerformed(evt);
            }
        });

        pnlJugador1.setBackground(new java.awt.Color(255, 255, 255));
        pnlJugador1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(189, 221, 245), 2, true));
        pnlJugador1.setMaximumSize(new java.awt.Dimension(250, 75));
        pnlJugador1.setMinimumSize(new java.awt.Dimension(250, 75));
        pnlJugador1.setPreferredSize(new java.awt.Dimension(538, 69));

        lblIconJugador1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblNombreJugador1.setFont(new java.awt.Font("Warung Kopi", 0, 18)); // NOI18N
        lblNombreJugador1.setForeground(new java.awt.Color(85, 126, 190));

        javax.swing.GroupLayout pnlJugador1Layout = new javax.swing.GroupLayout(pnlJugador1);
        pnlJugador1.setLayout(pnlJugador1Layout);
        pnlJugador1Layout.setHorizontalGroup(
            pnlJugador1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlJugador1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lblIconJugador1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblNombreJugador1, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        pnlJugador1Layout.setVerticalGroup(
            pnlJugador1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlJugador1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlJugador1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblNombreJugador1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblIconJugador1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9))
        );

        pnlJugador3.setBackground(new java.awt.Color(255, 255, 255));
        pnlJugador3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(189, 221, 245), 2, true));
        pnlJugador3.setMaximumSize(new java.awt.Dimension(250, 75));
        pnlJugador3.setMinimumSize(new java.awt.Dimension(250, 75));

        lblIconJugador3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblNombreJugador3.setFont(new java.awt.Font("Warung Kopi", 0, 18)); // NOI18N
        lblNombreJugador3.setForeground(new java.awt.Color(85, 126, 190));

        javax.swing.GroupLayout pnlJugador3Layout = new javax.swing.GroupLayout(pnlJugador3);
        pnlJugador3.setLayout(pnlJugador3Layout);
        pnlJugador3Layout.setHorizontalGroup(
            pnlJugador3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlJugador3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lblIconJugador3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblNombreJugador3, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        pnlJugador3Layout.setVerticalGroup(
            pnlJugador3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlJugador3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlJugador3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblNombreJugador3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblIconJugador3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8))
        );

        pnlJugador2.setBackground(new java.awt.Color(255, 255, 255));
        pnlJugador2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(189, 221, 245), 2, true));
        pnlJugador2.setMaximumSize(new java.awt.Dimension(250, 75));
        pnlJugador2.setMinimumSize(new java.awt.Dimension(250, 75));

        lblIconJugador2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblNombreJugador2.setFont(new java.awt.Font("Warung Kopi", 0, 18)); // NOI18N
        lblNombreJugador2.setForeground(new java.awt.Color(85, 126, 190));

        javax.swing.GroupLayout pnlJugador2Layout = new javax.swing.GroupLayout(pnlJugador2);
        pnlJugador2.setLayout(pnlJugador2Layout);
        pnlJugador2Layout.setHorizontalGroup(
            pnlJugador2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlJugador2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lblIconJugador2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblNombreJugador2, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        pnlJugador2Layout.setVerticalGroup(
            pnlJugador2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlJugador2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlJugador2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblNombreJugador2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblIconJugador2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8))
        );

        pnlJugador4.setBackground(new java.awt.Color(255, 255, 255));
        pnlJugador4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(189, 221, 245), 2, true));
        pnlJugador4.setMaximumSize(new java.awt.Dimension(250, 75));
        pnlJugador4.setMinimumSize(new java.awt.Dimension(250, 75));

        lblIconJugador4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblNombreJugador4.setFont(new java.awt.Font("Warung Kopi", 0, 18)); // NOI18N
        lblNombreJugador4.setForeground(new java.awt.Color(85, 126, 190));

        javax.swing.GroupLayout pnlJugador4Layout = new javax.swing.GroupLayout(pnlJugador4);
        pnlJugador4.setLayout(pnlJugador4Layout);
        pnlJugador4Layout.setHorizontalGroup(
            pnlJugador4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlJugador4Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lblIconJugador4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblNombreJugador4, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        pnlJugador4Layout.setVerticalGroup(
            pnlJugador4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlJugador4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlJugador4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblNombreJugador4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblIconJugador4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8))
        );

        jLabel13.setFont(new java.awt.Font("Cocogoose", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(155, 136, 255));
        jLabel13.setText("Lista de jugadores");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(88, 88, 88))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel11))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(colorUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVotar, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10)
                .addGap(19, 19, 19))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(jLabel13))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnlJugador1, javax.swing.GroupLayout.PREFERRED_SIZE, 537, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(pnlJugador3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(pnlJugador2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(pnlJugador4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(colorUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnVotar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnlJugador1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnlJugador2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnlJugador3, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnlJugador4, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(455, 455, 455))
        );

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 760));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnVotarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVotarActionPerformed
        if (sck.enviarAlServidor(MensajeSockets.VOTO)) {
            //Cambiar texto del boton de votar
            if (this.btnVotar.getText().equals("VOTAR")) {
                this.btnVotar.setText("CANCELAR VOTO");
            } else if (this.btnVotar.getText().equals("CANCELAR VOTO")) {
                this.btnVotar.setText("VOTAR");
            }
        } else {
            System.out.println("Error en conexion");
        }
    }//GEN-LAST:event_btnVotarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVotar;
    private javax.swing.JPanel colorUsuario;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel lblIconJugador1;
    private javax.swing.JLabel lblIconJugador2;
    private javax.swing.JLabel lblIconJugador3;
    private javax.swing.JLabel lblIconJugador4;
    private javax.swing.JLabel lblMensaje;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNombreJugador1;
    private javax.swing.JLabel lblNombreJugador2;
    private javax.swing.JLabel lblNombreJugador3;
    private javax.swing.JLabel lblNombreJugador4;
    private javax.swing.JPanel pnlJugador1;
    private javax.swing.JPanel pnlJugador2;
    private javax.swing.JPanel pnlJugador3;
    private javax.swing.JPanel pnlJugador4;
    // End of variables declaration//GEN-END:variables

}
