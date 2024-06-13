package vistas;

import accesoDatos.ColectivoData;
import accesoDatos.HorarioData;
import accesoDatos.PasajeData;
import accesoDatos.PasajeroData;
import accesoDatos.RutaData;
import java.time.LocalDate;
import java.awt.Color;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import solbusgrupo15laboratorio.entidades.Colectivo;
import solbusgrupo15laboratorio.entidades.Horario;
import solbusgrupo15laboratorio.entidades.Pasaje;
import solbusgrupo15laboratorio.entidades.Pasajero;
import solbusgrupo15laboratorio.entidades.Ruta;

public class CompraPasaje extends javax.swing.JInternalFrame {

    private PasajeroData pasajeroData = new PasajeroData();
    private ColectivoData coleData = new ColectivoData();
    private RutaData rutData = new RutaData();
    private HorarioData horaData = new HorarioData();
    private PasajeData pasajeData = new PasajeData();
    private Colectivo cole = null;
    private Ruta ruta = null;
    private Pasajero pasajero = null;
    private Horario horario = null;
    private List<Ruta> rutas;
    private List<Colectivo> colectivos;
    private List<Horario> horarios;
    private List<Pasaje> pasajes;
    private DefaultTableModel modeloHorario;
    private DefaultTableModel modeloAsiento;
    private DefaultTableModel modeloPasaje;

    public CompraPasaje() {
        initComponents();
        colectivos = coleData.listarColectivos();
        rutas = rutData.listarRutas();
        modeloHorario = (DefaultTableModel) JTHsSalidaYLlegada.getModel();
        modeloAsiento = (DefaultTableModel) JTAsientos.getModel();
        modeloPasaje = (DefaultTableModel) JTPasaje.getModel();
        cargarColectivos();
        cargarRutas();
        cargarFecha();
        cargarPasaje();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTHsSalidaYLlegada = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        JTAsientos = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        JBComprar = new javax.swing.JButton();
        jBAnular = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        JTDNIPasajero = new javax.swing.JTextField();
        JTNombre = new javax.swing.JTextField();
        JTApellido = new javax.swing.JTextField();
        JTCorreo = new javax.swing.JTextField();
        JTTelefono = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        JTPasaje = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        JCBColectivo = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        JCBRuta = new javax.swing.JComboBox<>();
        JTFecha = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        JTPrecio = new javax.swing.JTextField();

        setPreferredSize(new java.awt.Dimension(998, 450));

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel1.setText("Pasajes");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel5.setText("Horario");

        JTHsSalidaYLlegada.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Hora Salida", "Hora Llegada"
            }
        ));
        JTHsSalidaYLlegada.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTHsSalidaYLlegadaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(JTHsSalidaYLlegada);

        JTAsientos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Izquierda", "Derecha"
            }
        ));
        jScrollPane2.setViewportView(JTAsientos);
        if (JTAsientos.getColumnModel().getColumnCount() > 0) {
            JTAsientos.getColumnModel().getColumn(0).setHeaderValue("Pasaje");
            JTAsientos.getColumnModel().getColumn(1).setHeaderValue("Derecha");
        }

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel13.setText("Asientos");

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir_1.png"))); // NOI18N
        btnSalir.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSalirMouseExited(evt);
            }
        });
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        JBComprar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/facturar_1.png"))); // NOI18N
        JBComprar.setText("COMPRAR");
        JBComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBComprarActionPerformed(evt);
            }
        });

        jBAnular.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/anular.png"))); // NOI18N
        jBAnular.setText("Anular Pasaje");
        jBAnular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAnularActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel2.setText("DNI:");

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel9.setText("Nombre:");

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel10.setText("Apellido:");

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel11.setText("Correo:");

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel12.setText("Telefono:");

        JTApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTApellidoActionPerformed(evt);
            }
        });

        JTTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTTelefonoActionPerformed(evt);
            }
        });

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar_1.png"))); // NOI18N
        btnBuscar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBuscarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBuscarMouseExited(evt);
            }
        });
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel8.setText("Cargar Pasajero");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnBuscar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel11)
                                            .addComponent(jLabel12))
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JTDNIPasajero, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                            .addComponent(JTTelefono, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(JTCorreo)
                            .addComponent(JTApellido)
                            .addComponent(JTNombre, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(19, 19, 19))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(51, 51, 51))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTDNIPasajero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBuscar)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        JTPasaje.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Pasaje", "Pasajero", "Colectivo", "Ruta", "Fecha", "Hora", "Asiento", "Estado"
            }
        ));
        jScrollPane3.setViewportView(JTPasaje);

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel14.setText("Lista de Pasajes");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addGap(191, 191, 191))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel14)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel3.setText("Colectivo");

        JCBColectivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCBColectivoActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel4.setText("Ruta");

        JCBRuta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCBRutaActionPerformed(evt);
            }
        });

        JTFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFechaActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel6.setText("Fecha");

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel7.setText("Precio $");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(JCBColectivo, 0, 263, Short.MAX_VALUE)
                    .addComponent(JCBRuta, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JTFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JCBColectivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JCBRuta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addGap(189, 189, 189)
                            .addComponent(jLabel13))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jBAnular)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(JBComprar))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(101, 101, 101)))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalir))
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(9, 9, 9)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addComponent(btnSalir)
                        .addGap(76, 76, 76))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(72, 72, 72))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBAnular)
                    .addComponent(JBComprar))
                .addGap(76, 76, 76))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        try {
            Integer dni = Integer.parseInt(JTDNIPasajero.getText());
            pasajero = pasajeroData.buscasPasajeroPorDni(dni);
            if (pasajero != null) {
                JTNombre.setText(pasajero.getNombre());
                JTApellido.setText(pasajero.getApellido());
                JTCorreo.setText(pasajero.getCorreo());
                JTTelefono.setText(String.valueOf(pasajero.getTelefono()));
                cargarPasajeDni();
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Debe ingresar un número válido");
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnBuscarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseEntered
        btnBuscar.setBackground(new Color(128, 191, 255));
    }//GEN-LAST:event_btnBuscarMouseEntered

    private void btnBuscarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseExited
        btnBuscar.setBackground(new Color(187, 187, 187));
    }//GEN-LAST:event_btnBuscarMouseExited

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseEntered
        btnSalir.setBackground(new Color(128, 191, 255));
    }//GEN-LAST:event_btnSalirMouseEntered

    private void btnSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseExited
        btnSalir.setBackground(new Color(187, 187, 187));
    }//GEN-LAST:event_btnSalirMouseExited

    private void JCBRutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCBRutaActionPerformed
        Ruta rutaSeleccionado = (Ruta) JCBRuta.getSelectedItem();
        if (rutaSeleccionado != null) {
            cargarHorarios(rutaSeleccionado);
            cargarPasajeRuta();
        }
        
    }//GEN-LAST:event_JCBRutaActionPerformed

    private void JTTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTTelefonoActionPerformed

    }//GEN-LAST:event_JTTelefonoActionPerformed

    private void JTApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTApellidoActionPerformed

    }//GEN-LAST:event_JTApellidoActionPerformed

    private void JTFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFechaActionPerformed

    }//GEN-LAST:event_JTFechaActionPerformed

    private void JBComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBComprarActionPerformed
        int horaSelec = JTHsSalidaYLlegada.getSelectedRow();
        int asientoSelec = JTAsientos.getSelectedRow();

        if (horaSelec == -1) {
            JOptionPane.showMessageDialog(this, "Debe seleccionar una hora de salida.");
            return;
        }

        if (asientoSelec == -1) {
            JOptionPane.showMessageDialog(this, "Debe seleccionar un asiento.");
            return;
        }

        try {
            int dni = Integer.parseInt(JTDNIPasajero.getText());
            Pasajero pas = pasajeroData.buscasPasajeroPorDni(dni);
            if (pas == null) {
                JOptionPane.showMessageDialog(this, "Pasajero no encontrado.");
                return;
            }
            Colectivo col = (Colectivo) JCBColectivo.getSelectedItem();
            Ruta rut = (Ruta) JCBRuta.getSelectedItem();

            // Validar que el precio es un entero
            String precioStr = JTPrecio.getText();
            int precio;
            try {
                precio = Integer.parseInt(precioStr);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "El precio debe ser un número entero.");
                return;
            }

            LocalDate fech;
            try {
                fech = LocalDate.parse(JTFecha.getText());
            } catch (DateTimeParseException e) {
                JOptionPane.showMessageDialog(this, "La fecha no tiene un formato válido.");
                return;
            }

            int selectedRow = JTHsSalidaYLlegada.getSelectedRow();
            int selectedColumn = JTHsSalidaYLlegada.getSelectedColumn();
            String horariselec = String.valueOf(JTHsSalidaYLlegada.getValueAt(selectedRow, selectedColumn));

            LocalTime lc;
            try {
                lc = LocalTime.parse(horariselec);
            } catch (DateTimeParseException e) {
                JOptionPane.showMessageDialog(this, "La hora seleccionada no tiene un formato válido.");
                return;
            }

            selectedRow = JTAsientos.getSelectedRow();
            selectedColumn = JTAsientos.getSelectedColumn();
            String asienselec = String.valueOf(JTAsientos.getValueAt(selectedRow, selectedColumn));
            if (asienselec == null || asienselec.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Debe seleccionar un asiento válido.");
                return;
            }

            Pasaje pasaje = new Pasaje(pas, col, rut, fech, lc, Integer.parseInt(asienselec), precio);
            pasajeData.venderPasaje(pasaje);
            pasajeData.emitirRecibo(pasaje.getIdPasaje());

            borrarFilaTabla(modeloHorario);
            borrarFilaTabla(modeloAsiento);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "El DNI debe ser un número.");
        }

        limpiar();
    }//GEN-LAST:event_JBComprarActionPerformed

    private void JCBColectivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCBColectivoActionPerformed
        Colectivo colectivoSeleccionado = (Colectivo) JCBColectivo.getSelectedItem();
        if (colectivoSeleccionado != null) {
            cargarAsiento(colectivoSeleccionado);
        }
    }//GEN-LAST:event_JCBColectivoActionPerformed

    private void jBAnularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAnularActionPerformed
        int filaSeleccionada = JTPasaje.getSelectedRow();
        if (filaSeleccionada != -1) {
            int selectedRow = JTPasaje.getSelectedRow();
            int selectedColumn = JTPasaje.getSelectedColumn();
            String idPasajeAnular = String.valueOf(JTPasaje.getValueAt(selectedRow, selectedColumn));
            pasajeData.anularPasaje(Integer.valueOf(idPasajeAnular));
        }else{
            JOptionPane.showMessageDialog(this,"Seleccione el ID del Pasaje de la tabla");
        }
    }//GEN-LAST:event_jBAnularActionPerformed

    private void JTHsSalidaYLlegadaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTHsSalidaYLlegadaMouseClicked
        cargarPasajeHorario();
    }//GEN-LAST:event_JTHsSalidaYLlegadaMouseClicked
    private void cargarHorarios(Ruta ruta) {
        borrarFilaTabla(modeloHorario);
        List<Horario> horarios = horaData.buscarHorariosPorRuta(ruta);
        for (Horario horario : horarios) {
            modeloHorario.addRow(new Object[]{horario.getHoraSalida(), horario.getHoraLlegada()});
        }
    }

    private void cargarAsiento(Colectivo colectivo) {
        borrarFilaTabla(modeloAsiento);
        List<Integer> asientos = new ArrayList<>();

        for (int i = 1; i < colectivo.getCapacidad() + 1; i++) {
            asientos.add(i);
        }

        int capacidad = colectivo.getCapacidad();
        int mitad = capacidad / 2;

        for (int i = 0; i < mitad; i++) {
            String asientoIzquierda = asientos.get(i).toString();
            String asientoDerecha = (i + mitad < capacidad) ? asientos.get(i + mitad).toString() : "";
            modeloAsiento.addRow(new Object[]{asientoIzquierda, asientoDerecha});
        }
    }

    private void cargarPasaje(){
        borrarFilaTabla(modeloPasaje);
        pasajes = pasajeData.historialVentas();
        for (Pasaje pasaje : pasajes) {
            modeloPasaje.addRow(new Object[]{pasaje.getIdPasaje(),pasaje.getIdPasajero().getIdPasajero(),pasaje.getIdColectivo().getIdColectivo(),pasaje.getIdRuta().getIdRuta(),pasaje.getFechaViaje(),pasaje.getHoraViaje(),pasaje.getAsiento(),pasaje.getPrecio()});
        }
    }
    private void cargarPasajeDni(){
        borrarFilaTabla(modeloPasaje);
        Integer dni = Integer.parseInt(JTDNIPasajero.getText());
        pasajero = pasajeroData.buscasPasajeroPorDni(dni);
        List<Pasaje> pasajes = pasajeData.historialVentasXPasajero(pasajero);
        for (Pasaje pasaje : pasajes) {
            modeloPasaje.addRow(new Object[]{pasaje.getIdPasaje(),pasaje.getIdPasajero().getIdPasajero(),pasaje.getIdColectivo().getIdColectivo(),pasaje.getIdRuta().getIdRuta(),pasaje.getFechaViaje(),pasaje.getHoraViaje(),pasaje.getAsiento(),pasaje.getPrecio()});
        }
    }
    private void cargarPasajeRuta(){
        borrarFilaTabla(modeloPasaje);
        Ruta ruta = (Ruta)JCBRuta.getSelectedItem();
        List<Pasaje> pasajes = pasajeData.historialVentasXRuta(ruta.getIdRuta());
        for (Pasaje pasaje : pasajes) {
            modeloPasaje.addRow(new Object[]{pasaje.getIdPasaje(),pasaje.getIdPasajero().getIdPasajero(),pasaje.getIdColectivo().getIdColectivo(),pasaje.getIdRuta().getIdRuta(),pasaje.getFechaViaje(),pasaje.getHoraViaje(),pasaje.getAsiento(),pasaje.getPrecio()});
        }
    }
    private void cargarPasajeHorario(){
        borrarFilaTabla(modeloPasaje);
        int filaSeleccionada = JTHsSalidaYLlegada.getSelectedRow();
        if (filaSeleccionada != -1) {
            LocalTime horario = (LocalTime) JTHsSalidaYLlegada.getValueAt(filaSeleccionada, 1);
            List<Pasaje> pasajes = pasajeData.historialVentasXHorario(horario);
            for (Pasaje pasaje : pasajes) {
                modeloPasaje.addRow(new Object[]{pasaje.getIdPasaje(),pasaje.getIdPasajero().getIdPasajero(),pasaje.getIdColectivo().getIdColectivo(),pasaje.getIdRuta().getIdRuta(),pasaje.getFechaViaje(),pasaje.getHoraViaje(),pasaje.getAsiento(),pasaje.getPrecio()});
            }
        }
    }
    private void cargarColectivos() {
        for (Colectivo item : colectivos) {
            JCBColectivo.addItem(item);
        }
    }

    private void cargarRutas() {
        for (Ruta item : rutas) {
            JCBRuta.addItem(item);
        }
    }

    private void cargarFecha() {
        JTFecha.setText(String.valueOf(LocalDate.now()));
        JTFecha.setEnabled(false);
    }

    private void borrarFilaTabla(DefaultTableModel modelo) {
        if (modelo != null) {
            int rowCount = modelo.getRowCount();
            for (int i = rowCount - 1; i >= 0; i--) {
                modelo.removeRow(i);
            }
        }
    }

    private void limpiar() {
        JTDNIPasajero.setText("");
        JTNombre.setText("");
        JTApellido.setText("");
        JTCorreo.setText("");
        JTTelefono.setText("");
        JTPrecio.setText("");
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBComprar;
    private javax.swing.JComboBox<Colectivo> JCBColectivo;
    private javax.swing.JComboBox<Ruta> JCBRuta;
    private javax.swing.JTextField JTApellido;
    private javax.swing.JTable JTAsientos;
    private javax.swing.JTextField JTCorreo;
    private javax.swing.JTextField JTDNIPasajero;
    private javax.swing.JTextField JTFecha;
    private javax.swing.JTable JTHsSalidaYLlegada;
    private javax.swing.JTextField JTNombre;
    private javax.swing.JTable JTPasaje;
    private javax.swing.JTextField JTPrecio;
    private javax.swing.JTextField JTTelefono;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton jBAnular;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
