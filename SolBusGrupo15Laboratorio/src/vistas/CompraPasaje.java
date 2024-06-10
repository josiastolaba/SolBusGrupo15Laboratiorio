
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
    private DefaultTableModel modeloHorario;
    private DefaultTableModel modeloAsiento;
//    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
//    DateTimeFormatter formattertime = DateTimeFormatter.ofPattern("HH:mm");
    
    public CompraPasaje() {
        initComponents();
        colectivos = coleData.listarColectivos();
        rutas = rutData.listarRutas();
        modeloHorario = (DefaultTableModel) JTHsSalidaYLlegada.getModel();
        modeloAsiento = (DefaultTableModel) JTAsientos.getModel();
        cargarColectivos();
        cargarRutas();
        cargarFecha();
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(404, 404, 404)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(JBComprar)
                                .addGap(342, 342, 342)
                                .addComponent(btnSalir)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel10))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(JTNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(JTDNIPasajero, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnBuscar))
                                .addComponent(JTTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(JTCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(JTApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(33, 33, 33)
                                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(90, 90, 90)
                                                .addComponent(jLabel4))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(82, 82, 82)
                                                .addComponent(jLabel3)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(JCBColectivo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(2, 2, 2)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(41, 41, 41))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap())
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(JTFecha, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                                            .addComponent(JTPrecio))
                                        .addGap(32, 32, 32))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(JCBRuta, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(JTDNIPasajero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel6)
                                .addComponent(JTFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel7)
                            .addComponent(JTPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addComponent(JCBRuta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(JCBColectivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnBuscar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JTNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
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
                            .addComponent(jLabel12))))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSalir)
                    .addComponent(JBComprar))
                .addGap(67, 67, 67))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        try{
            Integer dni = Integer.parseInt(JTDNIPasajero.getText());
            pasajero = pasajeroData.buscasPasajeroPorDni(dni);
            if(pasajero != null){
                JTNombre.setText(pasajero.getNombre());
                JTApellido.setText(pasajero.getApellido());
                JTCorreo.setText(pasajero.getCorreo());
                JTTelefono.setText(String.valueOf(pasajero.getTelefono()));
            }
        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(this, "Debe ingresar un número válido");
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnBuscarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseEntered
        btnBuscar.setBackground(new Color(128, 191, 255));
    }//GEN-LAST:event_btnBuscarMouseEntered

    private void btnBuscarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseExited
        btnBuscar.setBackground(new Color(187,187,187));
    }//GEN-LAST:event_btnBuscarMouseExited

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseEntered
        btnSalir.setBackground(new Color(128,191,255));
    }//GEN-LAST:event_btnSalirMouseEntered

    private void btnSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseExited
        btnSalir.setBackground(new  Color(187,187,187));
    }//GEN-LAST:event_btnSalirMouseExited

    private void JCBRutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCBRutaActionPerformed
        Ruta rutaSeleccionado = (Ruta)JCBRuta.getSelectedItem();
        if (rutaSeleccionado != null) {
            cargarHorarios(rutaSeleccionado);
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
        if(horaSelec!=-1){
            if(asientoSelec!=-1){
                int dni = Integer.parseInt(JTDNIPasajero.getText());
                Pasajero pas = pasajeroData.buscasPasajeroPorDni(dni);
                Colectivo col = (Colectivo)JCBColectivo.getSelectedItem();
                Ruta rut = (Ruta)JCBRuta.getSelectedItem();
                double precio = Double.parseDouble(JTPrecio.getText());
                LocalDate fech = LocalDate.parse(JTFecha.getText());
                int selectedRow = JTHsSalidaYLlegada.getSelectedRow();
                int selectedColumn = JTHsSalidaYLlegada.getSelectedColumn();
                String horariselec = String.valueOf(JTHsSalidaYLlegada.getValueAt(selectedRow, selectedColumn));
                LocalTime lc = LocalTime.parse(horariselec);
                selectedRow =JTAsientos.getSelectedRow();
                selectedColumn =JTAsientos.getSelectedColumn();
                String asienselec = String.valueOf(JTAsientos.getValueAt(selectedRow, selectedColumn));
                Pasaje pasaje = new Pasaje(pas, col, rut, fech, lc, asientoSelec, precio);
                pasajeData.venderPasaje(pasaje);
                borrarFilaTabla(modeloHorario);
                borrarFilaTabla(modeloAsiento); 
            }
        }
    }//GEN-LAST:event_JBComprarActionPerformed

    private void JCBColectivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCBColectivoActionPerformed
        Colectivo colectivoSeleccionado = (Colectivo)JCBColectivo.getSelectedItem();
        if (colectivoSeleccionado != null) {
            cargarAsiento(colectivoSeleccionado);
        }
    }//GEN-LAST:event_JCBColectivoActionPerformed
    private void cargarHorarios(Ruta ruta){
        borrarFilaTabla(modeloHorario);
        List<Horario> horarios = horaData.buscarHorariosPorRuta(ruta);
        for (Horario horario : horarios) {
            modeloHorario.addRow(new Object[]{horario.getHoraSalida(), horario.getHoraLlegada()});
        }
    }
   private void cargarAsiento(Colectivo colectivo){
    borrarFilaTabla(modeloAsiento);
    List<Integer> asientos = new ArrayList<>();
    
    for (int i = 1; i < colectivo.getCapacidad()+1; i++){
        asientos.add(i);
    }

    int capacidad = colectivo.getCapacidad();
    int mitad = capacidad / 2;

    for (int i = 0; i < mitad; i++){
        String asientoIzquierda = asientos.get(i).toString();
        String asientoDerecha = (i + mitad < capacidad) ? asientos.get(i + mitad).toString() : "";
        modeloAsiento.addRow(new Object[]{asientoIzquierda, asientoDerecha});
    }
}
    private void cargarColectivos() {
        for (Colectivo item : colectivos) {
            JCBColectivo.addItem(item);
        }
    }
    private void cargarRutas(){
        for (Ruta item : rutas) {
            JCBRuta.addItem(item);
        }
    }
    private void cargarFecha(){
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
    private javax.swing.JTextField JTPrecio;
    private javax.swing.JTextField JTTelefono;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnSalir;
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
    // End of variables declaration//GEN-END:variables
}
