/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyectofinal.Vistas;

import desplazable.Desface;

import AppPackage.AnimationClass;
import java.awt.event.KeyEvent;
import java.io.IOException;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author orell
 */
public class menu extends javax.swing.JFrame {

    /**
     * Creates new form menu
     */
    public Clip clip;
    public String Ruta = "/sonido/";

    public menu() {
        initComponents();
        setLocationRelativeTo(null);
        jlMenuCiudad.setEnabled(false);
        jlMenuAlojamiento.setEnabled(false);
        jlMenuPaquete.setEnabled(false);
        jlMenuModificarAlojamiento.setEnabled(false);
        jlMenuEliminar1.setEnabled(false);
//        JInternalFrame Modificar_Alojamiento = new JInternalFrame();
//        Modificar_Alojamiento.setResizable(false);
    }

    public void Sonido(String archivo) {
        try {
            clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(getClass().getResourceAsStream(Ruta + archivo + ".wav")));
            clip.start();
        } catch (IOException | LineUnavailableException | UnsupportedAudioFileException e) {
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

        jdEscritorio = new javax.swing.JDesktopPane();
        menuLogin1 = new proyectofinal.Vistas.componentes.MenuLogin();
        menuPanel1 = new proyectofinal.Vistas.componentes.MenuPanel();
        jlMenuAlojamiento = new javax.swing.JLabel();
        jlMenuPaquete = new javax.swing.JLabel();
        jlMenuCiudad = new javax.swing.JLabel();
        jlMenuModificarAlojamiento = new javax.swing.JLabel();
        jlMenuConsultas = new javax.swing.JLabel();
        jlMenuEliminar1 = new javax.swing.JLabel();
        voz6 = new javax.swing.JLabel();
        voz1 = new javax.swing.JLabel();
        voz2 = new javax.swing.JLabel();
        voz3 = new javax.swing.JLabel();
        voz4 = new javax.swing.JLabel();
        voz5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jtfUsuario = new javax.swing.JTextField();
        jlUsuario = new javax.swing.JLabel();
        jpfContraseña = new javax.swing.JPasswordField();
        jlContrasena = new javax.swing.JLabel();
        jbLogin = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        menuPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlMenuAlojamiento.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlMenuAlojamiento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectofinal/Vistas/iconos/icons8-hotel-50.png"))); // NOI18N
        jlMenuAlojamiento.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jlMenuAlojamiento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlMenuAlojamientoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jlMenuAlojamientoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlMenuAlojamientoMouseExited(evt);
            }
        });
        menuPanel1.add(jlMenuAlojamiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 50, -1));

        jlMenuPaquete.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlMenuPaquete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectofinal/Vistas/iconos/icons8-worldwide-delivery-50.png"))); // NOI18N
        jlMenuPaquete.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jlMenuPaquete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlMenuPaqueteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jlMenuPaqueteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlMenuPaqueteMouseExited(evt);
            }
        });
        menuPanel1.add(jlMenuPaquete, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 50, -1));

        jlMenuCiudad.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlMenuCiudad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectofinal/Vistas/iconos/icons8-buildings-50.png"))); // NOI18N
        jlMenuCiudad.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jlMenuCiudad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlMenuCiudadMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jlMenuCiudadMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlMenuCiudadMouseExited(evt);
            }
        });
        menuPanel1.add(jlMenuCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 50, -1));

        jlMenuModificarAlojamiento.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlMenuModificarAlojamiento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectofinal/Vistas/iconos/icons8-edit-property-50.png"))); // NOI18N
        jlMenuModificarAlojamiento.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jlMenuModificarAlojamiento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlMenuModificarAlojamientoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jlMenuModificarAlojamientoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlMenuModificarAlojamientoMouseExited(evt);
            }
        });
        menuPanel1.add(jlMenuModificarAlojamiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 50, -1));

        jlMenuConsultas.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlMenuConsultas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectofinal/Vistas/iconos/icons8-book-50.png"))); // NOI18N
        jlMenuConsultas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jlMenuConsultas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlMenuConsultasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jlMenuConsultasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlMenuConsultasMouseExited(evt);
            }
        });
        menuPanel1.add(jlMenuConsultas, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 530, 50, -1));

        jlMenuEliminar1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlMenuEliminar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectofinal/Vistas/iconos/icons8-delete-50.png"))); // NOI18N
        jlMenuEliminar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jlMenuEliminar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlMenuEliminar1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jlMenuEliminar1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlMenuEliminar1MouseExited(evt);
            }
        });
        menuPanel1.add(jlMenuEliminar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 50, -1));

        voz6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectofinal/Vistas/iconos/icons8-voice-20.png"))); // NOI18N
        voz6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                voz6MouseClicked(evt);
            }
        });
        menuPanel1.add(voz6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 520, -1, -1));

        voz1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectofinal/Vistas/iconos/icons8-voice-20.png"))); // NOI18N
        voz1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                voz1MouseClicked(evt);
            }
        });
        menuPanel1.add(voz1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        voz2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectofinal/Vistas/iconos/icons8-voice-20.png"))); // NOI18N
        voz2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                voz2MouseClicked(evt);
            }
        });
        menuPanel1.add(voz2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        voz3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectofinal/Vistas/iconos/icons8-voice-20.png"))); // NOI18N
        voz3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                voz3MouseClicked(evt);
            }
        });
        menuPanel1.add(voz3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));

        voz4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectofinal/Vistas/iconos/icons8-voice-20.png"))); // NOI18N
        voz4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                voz4MouseClicked(evt);
            }
        });
        menuPanel1.add(voz4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, -1, -1));

        voz5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectofinal/Vistas/iconos/icons8-voice-20.png"))); // NOI18N
        voz5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                voz5MouseClicked(evt);
            }
        });
        menuPanel1.add(voz5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, -1, -1));

        jPanel3.setOpaque(false);
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(51, 51, 51,90));

        jtfUsuario.setBackground(new java.awt.Color(51, 51, 51));
        jtfUsuario.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jtfUsuario.setForeground(new java.awt.Color(255, 255, 255));
        jtfUsuario.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jtfUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfUsuarioActionPerformed(evt);
            }
        });

        jlUsuario.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jlUsuario.setForeground(new java.awt.Color(255, 255, 255));
        jlUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectofinal/Vistas/iconos/icons8-user-30.png"))); // NOI18N
        jlUsuario.setText("Usuario");

        jpfContraseña.setBackground(new java.awt.Color(51, 51, 51));
        jpfContraseña.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jpfContraseña.setForeground(new java.awt.Color(255, 255, 255));
        jpfContraseña.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));

        jlContrasena.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jlContrasena.setForeground(new java.awt.Color(255, 255, 255));
        jlContrasena.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectofinal/Vistas/iconos/icons8-lock-30.png"))); // NOI18N
        jlContrasena.setText("Contraseña");

        jbLogin.setBackground(new java.awt.Color(0, 51, 255));
        jbLogin.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jbLogin.setForeground(new java.awt.Color(255, 255, 255));
        jbLogin.setText("Login");
        jbLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jbLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jbLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlContrasena)
                            .addComponent(jlUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(54, 54, 54)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jpfContraseña)
                            .addComponent(jtfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(60, 60, 60))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlUsuario))
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jpfContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlContrasena))
                .addGap(28, 28, 28)
                .addComponent(jbLogin)
                .addGap(40, 40, 40))
        );

        jPanel3.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectofinal/Vistas/iconos/icons8-user-50.png"))); // NOI18N
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 130, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectofinal/Vistas/iconos/avion.png"))); // NOI18N
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        javax.swing.GroupLayout menuLogin1Layout = new javax.swing.GroupLayout(menuLogin1);
        menuLogin1.setLayout(menuLogin1Layout);
        menuLogin1Layout.setHorizontalGroup(
            menuLogin1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLogin1Layout.createSequentialGroup()
                .addComponent(menuPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        menuLogin1Layout.setVerticalGroup(
            menuLogin1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menuPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 777, Short.MAX_VALUE)
            .addGroup(menuLogin1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jdEscritorio.setLayer(menuLogin1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jdEscritorioLayout = new javax.swing.GroupLayout(jdEscritorio);
        jdEscritorio.setLayout(jdEscritorioLayout);
        jdEscritorioLayout.setHorizontalGroup(
            jdEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jdEscritorioLayout.createSequentialGroup()
                .addComponent(menuLogin1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jdEscritorioLayout.setVerticalGroup(
            jdEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jdEscritorioLayout.createSequentialGroup()
                .addComponent(menuLogin1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jdEscritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdEscritorio)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jtfUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfUsuarioActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jtfUsuarioActionPerformed

    private void jbLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLoginActionPerformed
        // TODO add your handling code here:

        String usuario = "admin";
        String pass = "admin";
        if (jpfContraseña.getText().equals(pass) && jtfUsuario.getText().equals(usuario)) {

            JOptionPane.showMessageDialog(this, "Opciones Desbloqueadas");
            if (usuario.equals(jtfUsuario.getText()) && pass.equals(jpfContraseña.getText())) {

                jlMenuCiudad.setEnabled(true);
                jlMenuAlojamiento.setEnabled(true);
                jlMenuPaquete.setEnabled(true);
                jlMenuModificarAlojamiento.setEnabled(true);
                jlMenuEliminar1.setEnabled(true);
                jbLogin.setEnabled(false);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Usuario y/o Contraseña Incorrectas!!!");
        }

    }//GEN-LAST:event_jbLoginActionPerformed

    private void jlMenuConsultasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlMenuConsultasMouseClicked
        // TODO add your handling code here:
        jdEscritorio.repaint();
        Consultas c = new Consultas();
        c.setVisible(true);
        jdEscritorio.add(c);
        jdEscritorio.moveToFront(c);
    }//GEN-LAST:event_jlMenuConsultasMouseClicked

    private void jlMenuModificarAlojamientoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlMenuModificarAlojamientoMouseClicked
        // TODO add your handling code here:
        jdEscritorio.repaint();
        Modificar_Alojamiento mod = new Modificar_Alojamiento();
        if (jlMenuModificarAlojamiento.isEnabled()) {
            mod.setVisible(true);
            jdEscritorio.add(mod);
            jdEscritorio.moveToFront(mod);
        }
    }//GEN-LAST:event_jlMenuModificarAlojamientoMouseClicked

    private void jlMenuCiudadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlMenuCiudadMouseClicked
        // TODO add your handling code here:
        CiudadAgregar ciudadA = new CiudadAgregar();
        if (jlMenuCiudad.isEnabled()) {
            ciudadA.setVisible(true);
        }
    }//GEN-LAST:event_jlMenuCiudadMouseClicked

    private void jlMenuPaqueteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlMenuPaqueteMouseClicked
        // TODO add your handling code here:
        AgregarPaquete ap = new AgregarPaquete();

        if (jlMenuPaquete.isEnabled()) {
            ap.setVisible(true);
            jdEscritorio.add(ap);
            jdEscritorio.moveToFront(ap);
        }
    }//GEN-LAST:event_jlMenuPaqueteMouseClicked

    private void jlMenuAlojamientoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlMenuAlojamientoMouseClicked
        // TODO add your handling code here:
        AgregarAlojamiento aa = new AgregarAlojamiento();
        if (jlMenuAlojamiento.isEnabled()) {
            aa.setVisible(true);
        }
    }//GEN-LAST:event_jlMenuAlojamientoMouseClicked

    private void jlMenuEliminar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlMenuEliminar1MouseClicked
        // TODO add your handling code here:
        if (jlMenuEliminar1.isEnabled()) {
            jdEscritorio.repaint();
            Eliminar elis = new Eliminar();
            elis.setVisible(true);
            jdEscritorio.add(elis);
            jdEscritorio.moveToFront(elis);
        }
    }//GEN-LAST:event_jlMenuEliminar1MouseClicked

    private void voz1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_voz1MouseClicked
        Sonido("Agregar Ciudad");
    }//GEN-LAST:event_voz1MouseClicked

    private void voz2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_voz2MouseClicked
        // TODO add your handling code here:
        Sonido("Agregar Alojamiento");

    }//GEN-LAST:event_voz2MouseClicked

    private void voz3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_voz3MouseClicked
        // TODO add your handling code here:
        Sonido("Agregar Paquete");

    }//GEN-LAST:event_voz3MouseClicked

    private void voz4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_voz4MouseClicked
        Sonido("Modificar Alojamient");
    }//GEN-LAST:event_voz4MouseClicked

    private void voz5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_voz5MouseClicked
        Sonido("Eliminar");

    }//GEN-LAST:event_voz5MouseClicked

    private void voz6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_voz6MouseClicked
        Sonido("Consulta de Paquetes");

    }//GEN-LAST:event_voz6MouseClicked

    private void jlMenuCiudadMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlMenuCiudadMouseEntered
        Sonido("Agregar Ciudad");
    }//GEN-LAST:event_jlMenuCiudadMouseEntered

    private void jlMenuAlojamientoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlMenuAlojamientoMouseEntered
        Sonido("Agregar Alojamiento");
    }//GEN-LAST:event_jlMenuAlojamientoMouseEntered

    private void jlMenuPaqueteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlMenuPaqueteMouseEntered
        Sonido("Agregar Paquete");
    }//GEN-LAST:event_jlMenuPaqueteMouseEntered

    private void jlMenuModificarAlojamientoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlMenuModificarAlojamientoMouseEntered
        Sonido("Modificar Alojamient");
    }//GEN-LAST:event_jlMenuModificarAlojamientoMouseEntered

    private void jlMenuEliminar1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlMenuEliminar1MouseEntered
        Sonido("Eliminar");
    }//GEN-LAST:event_jlMenuEliminar1MouseEntered

    private void jlMenuConsultasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlMenuConsultasMouseEntered
        Sonido("Consulta de Paquetes");
    }//GEN-LAST:event_jlMenuConsultasMouseEntered

    private void jlMenuCiudadMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlMenuCiudadMouseExited
        clip.stop();
    }//GEN-LAST:event_jlMenuCiudadMouseExited

    private void jlMenuAlojamientoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlMenuAlojamientoMouseExited
        clip.stop();
    }//GEN-LAST:event_jlMenuAlojamientoMouseExited

    private void jlMenuPaqueteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlMenuPaqueteMouseExited
        clip.stop();
    }//GEN-LAST:event_jlMenuPaqueteMouseExited

    private void jlMenuModificarAlojamientoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlMenuModificarAlojamientoMouseExited
        clip.stop();
    }//GEN-LAST:event_jlMenuModificarAlojamientoMouseExited

    private void jlMenuEliminar1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlMenuEliminar1MouseExited
        clip.stop();
    }//GEN-LAST:event_jlMenuEliminar1MouseExited

    private void jlMenuConsultasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlMenuConsultasMouseExited
        clip.stop();
    }//GEN-LAST:event_jlMenuConsultasMouseExited
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton jbLogin;
    private javax.swing.JDesktopPane jdEscritorio;
    private javax.swing.JLabel jlContrasena;
    private javax.swing.JLabel jlMenuAlojamiento;
    private javax.swing.JLabel jlMenuCiudad;
    private javax.swing.JLabel jlMenuConsultas;
    private javax.swing.JLabel jlMenuEliminar1;
    private javax.swing.JLabel jlMenuModificarAlojamiento;
    private javax.swing.JLabel jlMenuPaquete;
    private javax.swing.JLabel jlUsuario;
    private javax.swing.JPasswordField jpfContraseña;
    private javax.swing.JTextField jtfUsuario;
    private proyectofinal.Vistas.componentes.MenuLogin menuLogin1;
    private proyectofinal.Vistas.componentes.MenuPanel menuPanel1;
    private javax.swing.JLabel voz1;
    private javax.swing.JLabel voz2;
    private javax.swing.JLabel voz3;
    private javax.swing.JLabel voz4;
    private javax.swing.JLabel voz5;
    private javax.swing.JLabel voz6;
    // End of variables declaration//GEN-END:variables
}