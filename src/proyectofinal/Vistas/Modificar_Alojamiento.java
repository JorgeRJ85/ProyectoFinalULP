/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal.Vistas;

import com.toedter.calendar.JTextFieldDateEditor;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;
import proyectofinal.AccesoaDatos.AlojamientoData;
import proyectofinal.AccesoaDatos.CiudadData;
import proyectofinal.AccesoaDatos.PaqueteData;
import proyectofinal.Entidades.Alojamiento;
import proyectofinal.Entidades.Ciudad;
import proyectofinal.Entidades.Paquete;


public class Modificar_Alojamiento extends javax.swing.JInternalFrame {

    /**
     * Creates new form Modificar_Alojamiento
     */
    // private DefaultTableModel modelo;
    private DefaultTableModel modelo = new DefaultTableModel() {
        // Hacer que las columnas 1 hasta la 4 no sean editables
        @Override
        public boolean isCellEditable(int row, int column) {

            if (column == 4) { //Columna 1 hasta 4
                return true;
            } else {
                return false;
            }

        }
    };

    public Modificar_Alojamiento() {
        initComponents();
        jdCalendarioActual.setCalendar(Calendar.getInstance());
        armarCabecera();
        jbActualizar.setEnabled(false);
        jbCargarAlojamiento.setEnabled(false);
        ((JTextFieldDateEditor)jdCalendarioActual.getDateEditor()).setEditable(false);
        ((JTextFieldDateEditor)jdFechaInicio.getDateEditor()).setEditable(false);
        ((JTextFieldDateEditor)jdFechaSalida.getDateEditor()).setEditable(false);
        
    }
    private PaqueteData pd = new PaqueteData();
    private AlojamientoData ad = new AlojamientoData();
    private CiudadData cd = new CiudadData();

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuModAlo1 = new proyectofinal.Vistas.componentes.MenuModAlo();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jdFechaInicio = new com.toedter.calendar.JDateChooser();
        jdFechaSalida = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        jcTipoAlojamiento = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jcServicio = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jtImporteDiario = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jcEstado = new javax.swing.JCheckBox();
        jbActualizar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtPaquetesVencidos = new javax.swing.JTable();
        jbBuscarPaquetes = new javax.swing.JButton();
        jbCargarAlojamiento = new javax.swing.JButton();
        jdCalendarioActual = new com.toedter.calendar.JDateChooser();
        jtIdAlojamiento = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setClosable(true);

        jPanel1.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Fecha de Inicio:");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Fecha de Salida:");

        jdFechaSalida.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jdFechaSalidaKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Tipo de Alojamiento:");

        jcTipoAlojamiento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hotel", "Hostel", "Departamento" }));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Servicio :");

        jcServicio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Desayuno", "Desayuno - Almuerzo", "Desayuno - Almuerzo - Cena" }));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Importe Diario: ");

        jtImporteDiario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtImporteDiarioKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Estado:");

        jcEstado.setBackground(new java.awt.Color(255, 153, 0));

        jbActualizar.setBackground(new java.awt.Color(0, 94, 47));
        jbActualizar.setForeground(new java.awt.Color(255, 255, 255));
        jbActualizar.setText("Actualizar");
        jbActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbActualizarActionPerformed(evt);
            }
        });

        jPanel2.setOpaque(false);

        jtPaquetesVencidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jtPaquetesVencidos);

        jbBuscarPaquetes.setBackground(new java.awt.Color(133, 53, 0));
        jbBuscarPaquetes.setForeground(new java.awt.Color(255, 255, 255));
        jbBuscarPaquetes.setText("Cargar Paquetes Vencidos");
        jbBuscarPaquetes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarPaquetesActionPerformed(evt);
            }
        });

        jbCargarAlojamiento.setBackground(new java.awt.Color(133, 53, 0));
        jbCargarAlojamiento.setForeground(new java.awt.Color(255, 255, 255));
        jbCargarAlojamiento.setText("Cargar");
        jbCargarAlojamiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCargarAlojamientoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 15, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jbBuscarPaquetes)
                        .addGap(151, 151, 151))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jbCargarAlojamiento)
                        .addGap(199, 199, 199))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jbBuscarPaquetes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbCargarAlojamiento))
        );

        jtIdAlojamiento.setEditable(false);

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("ID");

        jLabel8.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));

        jLabel9.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));

        jLabel10.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));

        jLabel11.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Modificar Alojamiento");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(46, 46, 46)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jtIdAlojamiento, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jdFechaInicio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jdFechaSalida, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(164, 164, 164))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jcEstado)
                                    .addComponent(jcTipoAlojamiento, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jcServicio, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jtImporteDiario, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 39, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jbActualizar)
                                .addGap(209, 209, 209))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(92, 92, 92))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jdCalendarioActual, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(138, 138, 138))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addComponent(jdCalendarioActual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jtIdAlojamiento, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jdFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jdFechaSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jcTipoAlojamiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jcServicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jtImporteDiario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jcEstado))
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(jbActualizar)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout menuModAlo1Layout = new javax.swing.GroupLayout(menuModAlo1);
        menuModAlo1.setLayout(menuModAlo1Layout);
        menuModAlo1Layout.setHorizontalGroup(
            menuModAlo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuModAlo1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        menuModAlo1Layout.setVerticalGroup(
            menuModAlo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(menuModAlo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(menuModAlo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbBuscarPaquetesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarPaquetesActionPerformed

        LocalDate fechaIngreso = jdCalendarioActual.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        List<Paquete> paquete = pd.listarPaquetePorFechaSalida(fechaIngreso);

        borrarFilas();
        for (Paquete paquetex : paquete) {
            modelo.addRow(new Object[]{
                paquetex.getIdPaquete(),
                paquetex.getDestino().getNombre(),
                paquetex.getAlojamiento().getIdAlojamiento(),
                paquetex.getPasaje().getIdPasaje()

            });
        }
        jbCargarAlojamiento.setEnabled(true);
    }//GEN-LAST:event_jbBuscarPaquetesActionPerformed

    private void jbCargarAlojamientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCargarAlojamientoActionPerformed
        try {
            int filaActual = jtPaquetesVencidos.getSelectedRow();
            Integer idAlojamiento = (Integer) jtPaquetesVencidos.getValueAt(filaActual, 2);

            Alojamiento alojamiento = new Alojamiento();
            alojamiento = ad.buscarAlojamiento(idAlojamiento);
            //**************Seteando Campos *****************
            jdFechaInicio.setDate(null);
            jdFechaSalida.setDate(null);
            jcEstado.setSelected(false);
            jtImporteDiario.setText("");
            jcTipoAlojamiento.setSelectedIndex(0);
            jcServicio.setSelectedIndex(0);

            jdFechaInicio.setDate(java.sql.Date.valueOf(alojamiento.getFechaing()));
            jdFechaSalida.setDate(java.sql.Date.valueOf(alojamiento.getFechaOn()));

            if (alojamiento.getServicio().toLowerCase().equalsIgnoreCase("Desayuno".toLowerCase())) {
                jcServicio.setSelectedIndex(0);
            } else if (alojamiento.getServicio().toLowerCase().equalsIgnoreCase("Desayuno - Almuerzo".toLowerCase())) {
                jcServicio.setSelectedIndex(1);
            } else if (alojamiento.getServicio().toLowerCase().equalsIgnoreCase("Desayuno - Almuerzo - Cena".toLowerCase())) {
                jcServicio.setSelectedIndex(2);
            }

            if (alojamiento.getTipoAlojam().equalsIgnoreCase("Hotel")) {
                jcTipoAlojamiento.setSelectedIndex(0);
            } else if (alojamiento.getTipoAlojam().equalsIgnoreCase("Hostel")) {
                jcTipoAlojamiento.setSelectedIndex(1);
            } else {
                jcTipoAlojamiento.setSelectedIndex(2);
            }
            jtIdAlojamiento.setText("" + alojamiento.getIdAlojamiento());
            jtImporteDiario.setText("" + alojamiento.getImporteDiario());
            jcEstado.setSelected(alojamiento.isEstado());

            jcTipoAlojamiento.setSelectedItem(alojamiento.getTipoAlojam());
            jcServicio.setSelectedItem(alojamiento.getServicio());

            String x = (String) jtPaquetesVencidos.getValueAt(jtPaquetesVencidos.getSelectedRow(), 1);
            if (!x.isEmpty()) {
                jbActualizar.setEnabled(true);
            }
        } catch (ArrayIndexOutOfBoundsException arr) {
            JOptionPane.showMessageDialog(this, "Campos y/o Tabla Vacia");
        }


    }//GEN-LAST:event_jbCargarAlojamientoActionPerformed

    private void jbActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbActualizarActionPerformed
        try {
            Ciudad ciudadD = new Ciudad();
            int filaActual = jtPaquetesVencidos.getSelectedRow();
            String ciudadDestino = (String) jtPaquetesVencidos.getValueAt(filaActual, 1);
            ciudadD = cd.buscarCiudadPorNombre(ciudadDestino);
            int idAlo = Integer.parseInt(jtIdAlojamiento.getText());

            LocalDate fechaIng = jdFechaInicio.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            LocalDate fechaSal = jdFechaSalida.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            double importeD = Double.parseDouble(jtImporteDiario.getText());

            Alojamiento alojamientoA = new Alojamiento(idAlo, fechaIng, fechaSal, jcEstado.isSelected(), jcServicio.getSelectedItem().toString(), importeD, ciudadD, jcTipoAlojamiento.getSelectedItem().toString());
            
            if(fechaIng.isBefore(fechaSal)){
                
                ad.modificarAlojamiento(alojamientoA);
            }else{
                JOptionPane.showMessageDialog(this, "Fecha de Salida Incorrecta!!");
            }
            
        } catch (ArrayIndexOutOfBoundsException arr) {
            JOptionPane.showMessageDialog(this, "Campos y/o Tabla Vacia");
        }
    }//GEN-LAST:event_jbActualizarActionPerformed

    private void jtImporteDiarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtImporteDiarioKeyTyped

        char c = evt.getKeyChar();
        String text = jtImporteDiario.getText();

        // Verificar si ya hay un punto en el campo
        if (c == '.' && text.contains(".")) {
            evt.consume(); // Ignorar el carácter '.' adicional
        } else if (!(Character.isDigit(c) || c == '.')) {
            evt.consume();
        }

    }//GEN-LAST:event_jtImporteDiarioKeyTyped

    private void jdFechaSalidaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jdFechaSalidaKeyTyped


    }//GEN-LAST:event_jdFechaSalidaKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbActualizar;
    private javax.swing.JButton jbBuscarPaquetes;
    private javax.swing.JButton jbCargarAlojamiento;
    private javax.swing.JCheckBox jcEstado;
    private javax.swing.JComboBox<String> jcServicio;
    private javax.swing.JComboBox<String> jcTipoAlojamiento;
    private com.toedter.calendar.JDateChooser jdCalendarioActual;
    private com.toedter.calendar.JDateChooser jdFechaInicio;
    private com.toedter.calendar.JDateChooser jdFechaSalida;
    private javax.swing.JTextField jtIdAlojamiento;
    private javax.swing.JTextField jtImporteDiario;
    private javax.swing.JTable jtPaquetesVencidos;
    private proyectofinal.Vistas.componentes.MenuModAlo menuModAlo1;
    // End of variables declaration//GEN-END:variables

    private void armarCabecera() {

        modelo.addColumn("idPaquete");
        modelo.addColumn("Ciudad Destino");
        modelo.addColumn("idAlojamiento");
        modelo.addColumn("idPasaje");
        jtPaquetesVencidos.setModel(modelo);
    }

    private void borrarFilas() {

        int filas = jtPaquetesVencidos.getRowCount() - 1;

        for (int i = filas; i >= 0; i--) {

            modelo.removeRow(i);
        }
    }

}
