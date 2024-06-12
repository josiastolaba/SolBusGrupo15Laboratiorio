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
        jLabel2 = new javax.swing.JLabel();
        JTDNIPasajero = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        JCBColectivo = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        JCBRuta = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        JTFecha = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTHsSalidaYLlegada = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        JTAsientos = new javax.swing.JTable();
        JTPrecio = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        JTNombre = new javax.swing.JTextField();
        JTApellido = new javax.swing.JTextField();
        JTCorreo = new javax.swing.JTextField();
        JTTelefono = new javax.swing.JTextField();
        btnSalir = new javax.swing.JButton();
        JBComprar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        JTPasaje = new javax.swing.JTable();
        jBAnular = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(998, 450));

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel1.setText("Pasajes");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel2.setText("DNI");

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

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel5.setText("Horario");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel6.setText("Fecha");

        JTFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFechaActionPerformed(evt);
            }
        });

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

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel7.setText("Precio $");

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

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar.png"))); // NOI18N
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

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel9.setText("Nombre");

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel10.setText("Apellido");

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel11.setText("Correo");

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel12.setText("Telefono");

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel13.setText("Asientos");

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

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir.png"))); // NOI18N
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

        JBComprar.setText("COMPRAR");
        JBComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBComprarActionPerformed(evt);
            }
        });

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

        jBAnular.setText("Anular Pasaje");
        jBAnular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAnularActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel10))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(JTDNIPasajero, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JTCorreo, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnBuscar)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(JTNombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                                    .addComponent(JTApellido, javax.swing.GroupLayout.Alignment.LEADING)))
                            .addComponent(JTTelefono))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(JCBColectivo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(JCBRuta, 0, 313, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(189, 189, 189)
                                        .addComponent(jLabel13)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addComponent(jLabel6))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(JTFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(JTPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(404, 404, 404)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JBComprar)
                        .addGap(342, 342, 342)
                        .addComponent(btnSalir)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBAnular)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(JTDNIPasajero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(JTFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(JCBColectivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel4))
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(btnBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JTNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(JCBRuta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JTPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JTApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JTCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JTTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSalir)
                    .addComponent(JBComprar)
                    .addComponent(jBAnular))
                .addGap(67, 67, 67))
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
