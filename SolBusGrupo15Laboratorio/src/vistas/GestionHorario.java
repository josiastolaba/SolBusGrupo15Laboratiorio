package vistas;

import accesoDatos.HorarioData;
import accesoDatos.RutaData;
import java.time.LocalTime;
import java.time.format.DateTimeParseException;
import static java.time.temporal.TemporalQueries.localTime;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import solbusgrupo15laboratorio.entidades.Horario;
import solbusgrupo15laboratorio.entidades.Ruta;

public class GestionHorario extends javax.swing.JInternalFrame {

    private RutaData rdata = new RutaData();
    private List<Ruta> rutas;

    private HorarioData hData = new HorarioData();
    private DefaultTableModel modelo;

    public GestionHorario() {
        initComponents();
        cargarRuta();
        modelo = (DefaultTableModel) jtListaDeHorarios.getModel();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jtHoraSalida = new javax.swing.JTextField();
        jtHoraLlegada = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jbGuardar = new javax.swing.JButton();
        jcbRuta = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jrEstado = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtListaDeHorarios = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();
        jbBuscar = new javax.swing.JButton();
        jBBorrar = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Horario");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Lista de Horarios");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jtHoraSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtHoraSalidaActionPerformed(evt);
            }
        });

        jtHoraLlegada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtHoraLlegadaActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel6.setText("Salida");

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel7.setText("Llegada");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/limpiar.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jbGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/nuevo.png"))); // NOI18N
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel3.setText("Ruta");

        jrEstado.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jrEstado.setText("Estado");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jrEstado)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jtHoraLlegada, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                        .addComponent(jtHoraSalida, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(jcbRuta, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbRuta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jtHoraSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jtHoraLlegada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(jrEstado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jbGuardar))
                .addGap(15, 15, 15))
        );

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel8.setText("Gestion Horario");

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jtListaDeHorarios.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jtListaDeHorarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Ruta", "Hora Salida", "Hora Llegada", "Estado"
            }
        ));
        jScrollPane2.setViewportView(jtListaDeHorarios);

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir.png"))); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jbBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar.png"))); // NOI18N
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        jBBorrar.setText("Borrar");
        jBBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBorrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jbBuscar)
                        .addGap(18, 18, 18)
                        .addComponent(jBBorrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton5))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 634, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButton5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addComponent(jBBorrar))
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(549, 549, 549))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(414, 414, 414))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(7, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtHoraSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtHoraSalidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtHoraSalidaActionPerformed

    private void jtHoraLlegadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtHoraLlegadaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtHoraLlegadaActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        try {
        Ruta ruta = (Ruta) jcbRuta.getSelectedItem();
        if (ruta == null) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar una ruta.");
            return;
        }
        String hSalida = jtHoraSalida.getText();
        if (hSalida.isEmpty()) {
            JOptionPane.showMessageDialog(null, "La hora de salida no puede estar vacía.");
            return;
        }
        LocalTime salida;
        try {
            salida = LocalTime.parse(hSalida);
        } catch (DateTimeParseException e) {
            JOptionPane.showMessageDialog(null, "La hora de salida debe tener el formato HH:mm.");
            return;
        }
        String hLlegada = jtHoraLlegada.getText();
        if (hLlegada.isEmpty()) {
            JOptionPane.showMessageDialog(null, "La hora de llegada no puede estar vacía.");
            return;
        }
        LocalTime llegada;
        try {
            llegada = LocalTime.parse(hLlegada);
        } catch (DateTimeParseException e) {
            JOptionPane.showMessageDialog(null, "La hora de llegada debe tener el formato HH:mm.");
            return;
        }
        if (!llegada.isAfter(salida)) {
            JOptionPane.showMessageDialog(null, "La hora de llegada debe ser posterior a la hora de salida.");
            return;
        }
        boolean estado = jrEstado.isSelected();

        Horario horario = new Horario(ruta, salida, llegada, estado);
        hData.aniadirNuevoHorario(horario);
        JOptionPane.showMessageDialog(null, "Horario añadido exitosamente.");
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(null, "Error al añadir el horario: " + ex.getMessage());
    }

    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        borrarFilaTabla(modelo);
        limpiar();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        
        borrarFilaTabla(modelo);
        cargarHorarioPorRuta();

    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jBBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBorrarActionPerformed
        try {
            int selectedRow = jtListaDeHorarios.getSelectedRow();

            if (selectedRow == -1) {
                JOptionPane.showMessageDialog(null, "No se ha seleccionado ninguna fila.");
                return;
            }

            Ruta ruta = (Ruta) jtListaDeHorarios.getValueAt(selectedRow, 0);
            LocalTime hSalida = (LocalTime) jtListaDeHorarios.getValueAt(selectedRow, 1);
            LocalTime hLlegada = (LocalTime) jtListaDeHorarios.getValueAt(selectedRow, 2);
            Horario horario = new Horario(ruta, hSalida, hLlegada, true);
            hData.modificarHorarioEstado(horario);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
        }
    }//GEN-LAST:event_jBBorrarActionPerformed
    public void limpiar() {

        jtHoraSalida.setText("");
        jtHoraLlegada.setText("");
        jrEstado.setSelected(false);
    }

    private void borrarFilaTabla(DefaultTableModel modelo) {
        if (modelo != null) {
            int rowCount = modelo.getRowCount();
            for (int i = rowCount - 1; i >= 0; i--) {
                modelo.removeRow(i);
            }
        }
    }

    public void cargarHorarioPorRuta() {
        borrarFilaTabla(modelo);
        List<Horario> listaH = new ArrayList<>();
        Ruta rut = (Ruta) jcbRuta.getSelectedItem();
        listaH = hData.buscarHorariosPorRuta(rut);

        for (Horario aux : listaH) {
            modelo.addRow(new Object[]{aux.getIdRuta(), aux.getHoraSalida(), aux.getHoraLlegada(), aux.isEstado()});

        }

    }

    public void cargarRuta() {

        rutas = rdata.listarRutas();

        for (Ruta item : rutas) {
            jcbRuta.addItem(item);
        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBBorrar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JComboBox<Ruta> jcbRuta;
    private javax.swing.JRadioButton jrEstado;
    private javax.swing.JTextField jtHoraLlegada;
    private javax.swing.JTextField jtHoraSalida;
    private javax.swing.JTable jtListaDeHorarios;
    // End of variables declaration//GEN-END:variables
}
