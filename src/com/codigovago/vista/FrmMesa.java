/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codigovago.vista;

import com.codigovago.controlador.Roles;

/**
 *
 * @author JEISON
 */
public class FrmMesa extends javax.swing.JFrame {

    /**
     * Creates new form FrmComandero
     */
    public static int ban; 
    Roles Roles = new Roles();
    public FrmMesa() {
        this.setUndecorated(true);
        initComponents();
        lblNombre.setText("Mesero: "+Roles.idEmpleado); 
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnMinimizar = new javax.swing.JButton();
        btnMesa1 = new javax.swing.JButton();
        btnMesa2 = new javax.swing.JButton();
        btnMesa3 = new javax.swing.JButton();
        btnMesa4 = new javax.swing.JButton();
        btnMesa5 = new javax.swing.JButton();
        btnMesa6 = new javax.swing.JButton();
        btnMesa7 = new javax.swing.JButton();
        btnMesa8 = new javax.swing.JButton();
        btnMesa9 = new javax.swing.JButton();
        btnMesa10 = new javax.swing.JButton();
        btnMesa11 = new javax.swing.JButton();
        btnMesa12 = new javax.swing.JButton();
        btnMesa13 = new javax.swing.JButton();
        btnMesa14 = new javax.swing.JButton();
        btnMesa15 = new javax.swing.JButton();
        btnMesa16 = new javax.swing.JButton();
        btnMesa17 = new javax.swing.JButton();
        btnMesa18 = new javax.swing.JButton();
        btnMesa19 = new javax.swing.JButton();
        btnMesa20 = new javax.swing.JButton();
        lblNombre = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        FondoComanda = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1360, 740));
        setMinimumSize(new java.awt.Dimension(1360, 740));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/codigovago/assets/icons/min.png"))); // NOI18N
        btnMinimizar.setBorderPainted(false);
        btnMinimizar.setContentAreaFilled(false);
        btnMinimizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinimizarActionPerformed(evt);
            }
        });
        getContentPane().add(btnMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 10, 40, 50));

        btnMesa1.setBorder(null);
        btnMesa1.setBorderPainted(false);
        btnMesa1.setContentAreaFilled(false);
        btnMesa1.setDefaultCapable(false);
        btnMesa1.setFocusable(false);
        btnMesa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMesa1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnMesa1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 160, 100, 100));

        btnMesa2.setBorder(null);
        btnMesa2.setBorderPainted(false);
        btnMesa2.setContentAreaFilled(false);
        btnMesa2.setDefaultCapable(false);
        btnMesa2.setFocusable(false);
        btnMesa2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMesa2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnMesa2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 160, 100, 90));

        btnMesa3.setBorder(null);
        btnMesa3.setBorderPainted(false);
        btnMesa3.setContentAreaFilled(false);
        btnMesa3.setDefaultCapable(false);
        btnMesa3.setFocusable(false);
        btnMesa3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMesa3ActionPerformed(evt);
            }
        });
        getContentPane().add(btnMesa3, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 160, 90, 90));

        btnMesa4.setBorder(null);
        btnMesa4.setBorderPainted(false);
        btnMesa4.setContentAreaFilled(false);
        btnMesa4.setDefaultCapable(false);
        btnMesa4.setFocusable(false);
        btnMesa4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMesa4ActionPerformed(evt);
            }
        });
        getContentPane().add(btnMesa4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 340, 100, 90));

        btnMesa5.setBorder(null);
        btnMesa5.setBorderPainted(false);
        btnMesa5.setContentAreaFilled(false);
        btnMesa5.setDefaultCapable(false);
        btnMesa5.setFocusable(false);
        btnMesa5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMesa5ActionPerformed(evt);
            }
        });
        getContentPane().add(btnMesa5, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 330, 100, 100));

        btnMesa6.setBorder(null);
        btnMesa6.setBorderPainted(false);
        btnMesa6.setContentAreaFilled(false);
        btnMesa6.setDefaultCapable(false);
        btnMesa6.setFocusable(false);
        btnMesa6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMesa6ActionPerformed(evt);
            }
        });
        getContentPane().add(btnMesa6, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 330, 100, 90));

        btnMesa7.setBorder(null);
        btnMesa7.setBorderPainted(false);
        btnMesa7.setContentAreaFilled(false);
        btnMesa7.setDefaultCapable(false);
        btnMesa7.setFocusable(false);
        btnMesa7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMesa7ActionPerformed(evt);
            }
        });
        getContentPane().add(btnMesa7, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 540, 430, 110));

        btnMesa8.setBorder(null);
        btnMesa8.setBorderPainted(false);
        btnMesa8.setContentAreaFilled(false);
        btnMesa8.setDefaultCapable(false);
        btnMesa8.setFocusable(false);
        btnMesa8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMesa8ActionPerformed(evt);
            }
        });
        getContentPane().add(btnMesa8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 140, 90, 60));

        btnMesa9.setBorder(null);
        btnMesa9.setBorderPainted(false);
        btnMesa9.setContentAreaFilled(false);
        btnMesa9.setDefaultCapable(false);
        btnMesa9.setFocusable(false);
        btnMesa9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMesa9ActionPerformed(evt);
            }
        });
        getContentPane().add(btnMesa9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 210, 90, 60));

        btnMesa10.setBorder(null);
        btnMesa10.setBorderPainted(false);
        btnMesa10.setContentAreaFilled(false);
        btnMesa10.setDefaultCapable(false);
        btnMesa10.setFocusable(false);
        btnMesa10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMesa10ActionPerformed(evt);
            }
        });
        getContentPane().add(btnMesa10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 280, 90, 60));

        btnMesa11.setBorder(null);
        btnMesa11.setBorderPainted(false);
        btnMesa11.setContentAreaFilled(false);
        btnMesa11.setDefaultCapable(false);
        btnMesa11.setFocusable(false);
        btnMesa11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMesa11ActionPerformed(evt);
            }
        });
        getContentPane().add(btnMesa11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 350, 90, 70));

        btnMesa12.setBorder(null);
        btnMesa12.setBorderPainted(false);
        btnMesa12.setContentAreaFilled(false);
        btnMesa12.setDefaultCapable(false);
        btnMesa12.setFocusable(false);
        btnMesa12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMesa12ActionPerformed(evt);
            }
        });
        getContentPane().add(btnMesa12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 430, 90, 60));

        btnMesa13.setBorder(null);
        btnMesa13.setBorderPainted(false);
        btnMesa13.setContentAreaFilled(false);
        btnMesa13.setDefaultCapable(false);
        btnMesa13.setFocusable(false);
        btnMesa13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMesa13ActionPerformed(evt);
            }
        });
        getContentPane().add(btnMesa13, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 500, 90, 70));

        btnMesa14.setBorder(null);
        btnMesa14.setBorderPainted(false);
        btnMesa14.setContentAreaFilled(false);
        btnMesa14.setDefaultCapable(false);
        btnMesa14.setFocusable(false);
        btnMesa14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMesa14ActionPerformed(evt);
            }
        });
        getContentPane().add(btnMesa14, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 580, 80, 70));

        btnMesa15.setBorder(null);
        btnMesa15.setBorderPainted(false);
        btnMesa15.setContentAreaFilled(false);
        btnMesa15.setDefaultCapable(false);
        btnMesa15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMesa15ActionPerformed(evt);
            }
        });
        getContentPane().add(btnMesa15, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 90, 60));

        btnMesa16.setBorder(null);
        btnMesa16.setContentAreaFilled(false);
        btnMesa16.setOpaque(false);
        getContentPane().add(btnMesa16, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 90, 50));

        btnMesa17.setBorder(null);
        btnMesa17.setContentAreaFilled(false);
        btnMesa17.setOpaque(false);
        getContentPane().add(btnMesa17, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 350, -1, -1));

        btnMesa18.setBorder(null);
        btnMesa18.setContentAreaFilled(false);
        btnMesa18.setOpaque(false);
        getContentPane().add(btnMesa18, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 440, 70, 30));

        btnMesa19.setBorder(null);
        btnMesa19.setContentAreaFilled(false);
        btnMesa19.setOpaque(false);
        getContentPane().add(btnMesa19, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 500, 90, 60));

        btnMesa20.setBorder(null);
        btnMesa20.setContentAreaFilled(false);
        btnMesa20.setOpaque(false);
        getContentPane().add(btnMesa20, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 580, 90, 50));

        lblNombre.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(255, 255, 255));
        lblNombre.setText("Nombre Empleado");
        getContentPane().add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 30, -1, -1));

        lblFecha.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        lblFecha.setForeground(new java.awt.Color(255, 255, 255));
        lblFecha.setText("Fecha y Hora");
        getContentPane().add(lblFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 30, -1, -1));

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/codigovago/assets/icons/max.png"))); // NOI18N
        btnSalir.setBorderPainted(false);
        btnSalir.setContentAreaFilled(false);
        btnSalir.setDefaultCapable(false);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 10, 50, 50));

        FondoComanda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/codigovago/assets/Mesas1.png"))); // NOI18N
        getContentPane().add(FondoComanda, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void btnMinimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinimizarActionPerformed
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_btnMinimizarActionPerformed
    private void btnMesa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMesa1ActionPerformed
        this.ban=1;
        FrmPlato FrmOrden = new FrmPlato();
        FrmOrden.setVisible(true);
    }//GEN-LAST:event_btnMesa1ActionPerformed
    private void btnMesa2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMesa2ActionPerformed
        this.ban=2;
        FrmPlato FrmOrden = new FrmPlato();
        FrmOrden.setVisible(true);
    }//GEN-LAST:event_btnMesa2ActionPerformed
    private void btnMesa3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMesa3ActionPerformed
        this.ban=3;
        FrmPlato FrmOrden = new FrmPlato();
        FrmOrden.setVisible(true);
    }//GEN-LAST:event_btnMesa3ActionPerformed
    private void btnMesa4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMesa4ActionPerformed
        this.ban=4;
        FrmPlato FrmOrden = new FrmPlato();
        FrmOrden.setVisible(true);
    }//GEN-LAST:event_btnMesa4ActionPerformed
    private void btnMesa5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMesa5ActionPerformed
        this.ban=5;
        FrmPlato FrmOrden = new FrmPlato();
        FrmOrden.setVisible(true);
    }//GEN-LAST:event_btnMesa5ActionPerformed
    private void btnMesa6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMesa6ActionPerformed
        this.ban=6;
        FrmPlato FrmOrden = new FrmPlato();
        FrmOrden.setVisible(true);
    }//GEN-LAST:event_btnMesa6ActionPerformed
    private void btnMesa7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMesa7ActionPerformed
        this.ban=7;
        FrmPlato FrmOrden = new FrmPlato();
        FrmOrden.setVisible(true);
    }//GEN-LAST:event_btnMesa7ActionPerformed
    private void btnMesa8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMesa8ActionPerformed
        this.ban=8;
        FrmPlato FrmOrden = new FrmPlato();
        FrmOrden.setVisible(true);
    }//GEN-LAST:event_btnMesa8ActionPerformed
    private void btnMesa9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMesa9ActionPerformed
        this.ban=9;
        FrmPlato FrmOrden = new FrmPlato();
        FrmOrden.setVisible(true);
    }//GEN-LAST:event_btnMesa9ActionPerformed
    private void btnMesa10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMesa10ActionPerformed
        this.ban=10;
        FrmPlato FrmOrden = new FrmPlato();
        FrmOrden.setVisible(true);
    }//GEN-LAST:event_btnMesa10ActionPerformed
    private void btnMesa11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMesa11ActionPerformed
        this.ban=11;
        FrmPlato FrmOrden = new FrmPlato();
        FrmOrden.setVisible(true);
    }//GEN-LAST:event_btnMesa11ActionPerformed
    private void btnMesa12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMesa12ActionPerformed
        this.ban=12;
        FrmPlato FrmOrden = new FrmPlato();
        FrmOrden.setVisible(true);
    }//GEN-LAST:event_btnMesa12ActionPerformed
    private void btnMesa13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMesa13ActionPerformed
        this.ban=13;
        FrmPlato FrmOrden = new FrmPlato();
        FrmOrden.setVisible(true);
    }//GEN-LAST:event_btnMesa13ActionPerformed
    private void btnMesa14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMesa14ActionPerformed
        this.ban=14;
        FrmPlato FrmOrden = new FrmPlato();
        FrmOrden.setVisible(true);
    }//GEN-LAST:event_btnMesa14ActionPerformed

    private void btnMesa15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMesa15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMesa15ActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FondoComanda;
    private javax.swing.JButton btnMesa1;
    private javax.swing.JButton btnMesa10;
    private javax.swing.JButton btnMesa11;
    private javax.swing.JButton btnMesa12;
    private javax.swing.JButton btnMesa13;
    private javax.swing.JButton btnMesa14;
    private javax.swing.JButton btnMesa15;
    private javax.swing.JButton btnMesa16;
    private javax.swing.JButton btnMesa17;
    private javax.swing.JButton btnMesa18;
    private javax.swing.JButton btnMesa19;
    private javax.swing.JButton btnMesa2;
    private javax.swing.JButton btnMesa20;
    private javax.swing.JButton btnMesa3;
    private javax.swing.JButton btnMesa4;
    private javax.swing.JButton btnMesa5;
    private javax.swing.JButton btnMesa6;
    private javax.swing.JButton btnMesa7;
    private javax.swing.JButton btnMesa8;
    private javax.swing.JButton btnMesa9;
    private javax.swing.JButton btnMinimizar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblNombre;
    // End of variables declaration//GEN-END:variables
}
