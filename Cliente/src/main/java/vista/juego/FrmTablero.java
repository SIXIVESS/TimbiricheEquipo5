
package vista.juego;

import dominio.FormaJuego;
import dominio.Tablero;
import dominio.Marcador;
import dominio.Jugador;
import dominio.Sala;
import dominio.Linea;
import dominio.Cuadro;
import java.util.List;
import interfaces.IActualizable;
import cliente.Cliente;
import interfaces.ICliente;
import interfaces.IObservador;
import javax.swing.JOptionPane;
import vista.jugador.FrmMenuPrincipal;

/**
 *
 * @author brawun
 */
public class FrmTablero extends javax.swing.JFrame implements IObservador, IActualizable {

    private Sala sala;
    private Jugador jugador;
    private ICliente sck;
    private PnlTablero pnlTablero;

    public FrmTablero(Marcador marcador, Jugador jugador) {
        this.jugador = jugador;
        initComponents();
        this.setTitle("Sala de juego - " + jugador.getNombre());
        this.setLocationRelativeTo(null);
        this.setResizable(false);

        this.sck = (ICliente) new Cliente(this.jugador, this);

        //Inicializar Sala
        Tablero tablero = new Tablero(marcador.getJugadores().size());
        this.sala = new Sala(marcador, tablero, marcador.getJugadores().size());
        System.out.println(this.sala.toString());

        establecerColores();
        establecerMarcador();
        establecerTablero();
    }

    private void establecerColores() {
        int index = this.sala.getMarcador().getJugadores().indexOf(this.jugador);
        this.sala.getMarcador().getJugadores().get(index).setColor(this.jugador.getColor());

        int indicador = 0;
        for (int i = 0; i < this.sala.getMarcador().getJugadores().size(); i++) {
            if (!this.sala.getMarcador().getJugadores().get(i).equals(this.jugador)) {
                this.sala.getMarcador().getJugadores().get(i).setColor(this.jugador.getPreferencia().getColores().get(indicador));
                indicador++;
            }
        }
    }

    private void establecerMarcador() {
        for (int i = 0; i < this.sala.getMarcador().getJugadores().size(); i++) {
            switch (i) {
                case 0:
                    pnlJugador1.add(new PnlJugador(this.sala.getMarcador().getJugadores().get(i)));
                    pnlJugador1.revalidate();
                    break;
                case 1:
                    pnlJugador2.add(new PnlJugador(this.sala.getMarcador().getJugadores().get(i)));
                    pnlJugador2.revalidate();
                    break;
                case 2:
                    pnlJugador3.add(new PnlJugador(this.sala.getMarcador().getJugadores().get(i)));
                    pnlJugador3.revalidate();
                    break;
                case 3:
                    pnlJugador4.add(new PnlJugador(this.sala.getMarcador().getJugadores().get(i)));
                    pnlJugador4.revalidate();
                    break;
                default:
                    break;
            }

            this.validate();

        }
    }

    private void actualizarMarcador(Marcador marcador) {
        for (int i = 0; i < this.sala.getMarcador().getJugadores().size(); i++) {
            switch (i) {
                case 0:
                    ((PnlJugador) pnlJugador1.getComponent(0)).setPuntaje(marcador.getJugadores().get(i).getPuntaje());
                    pnlJugador1.revalidate();
                    break;
                case 1:
                    ((PnlJugador) pnlJugador2.getComponent(0)).setPuntaje(marcador.getJugadores().get(i).getPuntaje());
                    pnlJugador2.revalidate();
                    break;
                case 2:
                    ((PnlJugador) pnlJugador3.getComponent(0)).setPuntaje(marcador.getJugadores().get(i).getPuntaje());
                    pnlJugador3.revalidate();
                    break;
                case 3:
                    ((PnlJugador) pnlJugador4.getComponent(0)).setPuntaje(marcador.getJugadores().get(i).getPuntaje());
                    pnlJugador4.revalidate();
                    break;
                default:
                    break;
            }

            this.validate();
        }
    }

    private void establecerTablero() {
        this.pnlTablero = new PnlTablero(this.sala.getTablero(), jugador);
        pnlTablero.agrega(this);

        pnlTablero.setSize(this.pnlFondoTablero.getSize());
        pnlTablero.setBorder(this.pnlFondoTablero.getBorder());
        this.pnlFondoTablero.add(pnlTablero);
        pnlTablero.estableceTablero();
        pnlTablero.setVisible(true);
        pnlTablero.repaint();
    }

    /**
     * Retorna la sala que se esta trabajando.
     *
     * @return
     */
    public Sala getSala() {
        return sala;
    }

    /**
     * Establece la sala de trabajo.
     *
     * @param sala
     */
    public void setSala(Sala sala) {
        this.sala = sala;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pnlFondoMarcador = new javax.swing.JPanel();
        pnlJugador1 = new javax.swing.JPanel();
        pnlJugador2 = new javax.swing.JPanel();
        pnlJugador3 = new javax.swing.JPanel();
        pnlJugador4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        pnlFondoTablero = new javax.swing.JPanel();
        pnlFondoOpt = new javax.swing.JPanel();
        btnAbandonar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        pnlFondoMarcador.setBackground(new java.awt.Color(255, 204, 255));
        pnlFondoMarcador.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlFondoMarcador.setPreferredSize(new java.awt.Dimension(300, 500));

        pnlJugador1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlJugador1.setMaximumSize(new java.awt.Dimension(278, 80));
        pnlJugador1.setMinimumSize(new java.awt.Dimension(278, 80));

        javax.swing.GroupLayout pnlJugador1Layout = new javax.swing.GroupLayout(pnlJugador1);
        pnlJugador1.setLayout(pnlJugador1Layout);
        pnlJugador1Layout.setHorizontalGroup(
            pnlJugador1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnlJugador1Layout.setVerticalGroup(
            pnlJugador1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        pnlJugador2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlJugador2.setMaximumSize(new java.awt.Dimension(278, 80));
        pnlJugador2.setMinimumSize(new java.awt.Dimension(278, 80));

        javax.swing.GroupLayout pnlJugador2Layout = new javax.swing.GroupLayout(pnlJugador2);
        pnlJugador2.setLayout(pnlJugador2Layout);
        pnlJugador2Layout.setHorizontalGroup(
            pnlJugador2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnlJugador2Layout.setVerticalGroup(
            pnlJugador2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        pnlJugador3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlJugador3.setMaximumSize(new java.awt.Dimension(278, 80));
        pnlJugador3.setMinimumSize(new java.awt.Dimension(278, 80));

        javax.swing.GroupLayout pnlJugador3Layout = new javax.swing.GroupLayout(pnlJugador3);
        pnlJugador3.setLayout(pnlJugador3Layout);
        pnlJugador3Layout.setHorizontalGroup(
            pnlJugador3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnlJugador3Layout.setVerticalGroup(
            pnlJugador3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        pnlJugador4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlJugador4.setMaximumSize(new java.awt.Dimension(278, 80));
        pnlJugador4.setMinimumSize(new java.awt.Dimension(278, 80));

        javax.swing.GroupLayout pnlJugador4Layout = new javax.swing.GroupLayout(pnlJugador4);
        pnlJugador4.setLayout(pnlJugador4Layout);
        pnlJugador4Layout.setHorizontalGroup(
            pnlJugador4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnlJugador4Layout.setVerticalGroup(
            pnlJugador4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel1.setText("Turno de:");

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N

        javax.swing.GroupLayout pnlFondoMarcadorLayout = new javax.swing.GroupLayout(pnlFondoMarcador);
        pnlFondoMarcador.setLayout(pnlFondoMarcadorLayout);
        pnlFondoMarcadorLayout.setHorizontalGroup(
            pnlFondoMarcadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFondoMarcadorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlFondoMarcadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField1)
                    .addComponent(pnlJugador1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlJugador2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlJugador3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlJugador4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlFondoMarcadorLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlFondoMarcadorLayout.setVerticalGroup(
            pnlFondoMarcadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFondoMarcadorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlJugador1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlJugador2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlJugador3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlJugador4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addGap(12, 12, 12))
        );

        pnlFondoTablero.setBackground(new java.awt.Color(255, 255, 255));
        pnlFondoTablero.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlFondoTablero.setMaximumSize(new java.awt.Dimension(650, 650));
        pnlFondoTablero.setMinimumSize(new java.awt.Dimension(650, 650));

        javax.swing.GroupLayout pnlFondoTableroLayout = new javax.swing.GroupLayout(pnlFondoTablero);
        pnlFondoTablero.setLayout(pnlFondoTableroLayout);
        pnlFondoTableroLayout.setHorizontalGroup(
            pnlFondoTableroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 648, Short.MAX_VALUE)
        );
        pnlFondoTableroLayout.setVerticalGroup(
            pnlFondoTableroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 648, Short.MAX_VALUE)
        );

        pnlFondoOpt.setBackground(new java.awt.Color(255, 204, 255));
        pnlFondoOpt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnAbandonar.setBackground(new java.awt.Color(255, 51, 51));
        btnAbandonar.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        btnAbandonar.setText("Abandonar Partida");
        btnAbandonar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbandonarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlFondoOptLayout = new javax.swing.GroupLayout(pnlFondoOpt);
        pnlFondoOpt.setLayout(pnlFondoOptLayout);
        pnlFondoOptLayout.setHorizontalGroup(
            pnlFondoOptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFondoOptLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(btnAbandonar, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        pnlFondoOptLayout.setVerticalGroup(
            pnlFondoOptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFondoOptLayout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addComponent(btnAbandonar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlFondoMarcador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlFondoOpt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlFondoTablero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlFondoTablero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(pnlFondoMarcador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnlFondoOpt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAbandonarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbandonarActionPerformed
        int confirm = JOptionPane.showConfirmDialog(this, "¿Seguro que quiere abandonar la partida?", "Abandonar partida", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            this.jugador.setPuntaje(0);
            this.dispose();
            new FrmMenuPrincipal(this.jugador).setVisible(true);
        }
    }//GEN-LAST:event_btnAbandonarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbandonar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPanel pnlFondoMarcador;
    private javax.swing.JPanel pnlFondoOpt;
    private javax.swing.JPanel pnlFondoTablero;
    private javax.swing.JPanel pnlJugador1;
    private javax.swing.JPanel pnlJugador2;
    private javax.swing.JPanel pnlJugador3;
    private javax.swing.JPanel pnlJugador4;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actualizarSocket(Object mensaje) {
        if (mensaje instanceof Marcador) {
            System.out.println("Actualizando marcador");
            Marcador marcador = (Marcador) mensaje;
            actualizarMarcador((Marcador) mensaje);

            for (int i = 0; i < marcador.getJugadores().size(); i++) {
                if (marcador.getJugadores().indexOf(this.jugador) == marcador.getSiguiente()) {
                    this.pnlTablero.actualizaTurno(true);
                }
            }
        } else if (mensaje instanceof List) {
            List<FormaJuego> formas = (List<FormaJuego>) mensaje;

            for (int i = 0; i < formas.size(); i++) {
                for (Jugador jugador : this.sala.getMarcador().getJugadores()) {
                    if (jugador.equals(formas.get(i).getJugador())) {
                        formas.get(i).setJugador(jugador);
                        if (i == 0) {
                            this.pnlTablero.actualizaLineaTablero((Linea) formas.get(i));
                        } else {
                            this.pnlTablero.actualizaCuadroTablero((Cuadro) formas.get(i));
                        }
                    }
                }
            }
        }
    }

    @Override
    public void actualiza(List<FormaJuego> movimiento) {
        sck.enviarAlServidor(movimiento);
    }
}
