/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaz;

import Logica.ArbolDicotomico;

/**
 *
 * @author ile1
 */
public class Manual extends javax.swing.JFrame {
    
    ArbolDicotomico arbol = new ArbolDicotomico();

    int mouseX, mouseY;
    
    public Manual() {
        initComponents();
        arbol.iniciarBusquedaInteractiva();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        si = new javax.swing.JButton();
        Pregunta = new javax.swing.JLabel();
        regresar = new javax.swing.JLabel();
        tabla_3 = new javax.swing.JLabel();
        tabla1 = new javax.swing.JLabel();
        plantas1 = new javax.swing.JLabel();
        plantas2 = new javax.swing.JLabel();
        plantas3 = new javax.swing.JLabel();
        plantas4 = new javax.swing.JLabel();
        tabla2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(800, 500));

        bg.setBackground(new java.awt.Color(0, 102, 51));
        bg.setPreferredSize(new java.awt.Dimension(800, 500));
        bg.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                bgMouseDragged(evt);
            }
        });
        bg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                bgMousePressed(evt);
            }
        });
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(0, 102, 51));
        jButton1.setFont(new java.awt.Font("Vineta BT", 0, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("No");
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 220, -1, -1));

        si.setBackground(new java.awt.Color(0, 102, 51));
        si.setFont(new java.awt.Font("Vineta BT", 0, 24)); // NOI18N
        si.setForeground(new java.awt.Color(255, 255, 255));
        si.setText("Si");
        si.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siActionPerformed(evt);
            }
        });
        jPanel1.add(si, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        Pregunta.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Pregunta.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(Pregunta, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 310, 40));

        regresar.setFont(new java.awt.Font("Vineta BT", 0, 18)); // NOI18N
        regresar.setForeground(new java.awt.Color(255, 255, 255));
        regresar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        regresar.setText("<<REGRESAR");
        regresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        regresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                regresarMouseClicked(evt);
            }
        });
        jPanel1.add(regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 200, 60));

        tabla_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo-madera-png-pisos-madera-dura_53876-627635-removebg-preview_1.png"))); // NOI18N
        jPanel1.add(tabla_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        tabla1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo-madera-png-pisos-madera-dura_53876-627635-removebg-preview.png"))); // NOI18N
        jPanel1.add(tabla1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-70, 90, 300, 200));

        plantas1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pngtree-branches-and-leaves-png-image_2423895-removebg-preview_1.png"))); // NOI18N
        jPanel1.add(plantas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 0, -1, -1));

        plantas2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pngtree-branches-and-leaves-png-image_2423895-removebg-preview.png"))); // NOI18N
        jPanel1.add(plantas2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 320, -1, -1));

        plantas3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pngtree-branches-and-leaves-png-image_2423895-removebg-preview_2.png"))); // NOI18N
        jPanel1.add(plantas3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, -1, -1));

        plantas4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pngtree-branches-and-leaves-png-image_2423895-removebg-preview_3.png"))); // NOI18N
        jPanel1.add(plantas4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        tabla2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo-madera-png-pisos-madera-dura_53876-627635-removebg-preview.png"))); // NOI18N
        jPanel1.add(tabla2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 300, 200));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pngtree-a-big-tree-with-green-leaf-on-transparent-background-genrative-ai-png-image_11931910.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 150, 190));

        jLabel2.setFont(new java.awt.Font("Vineta BT", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("DE RECORRIDO");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 200, -1, 40));

        jLabel3.setFont(new java.awt.Font("Vineta BT", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("VER ARBOL ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 130, -1, 120));

        jPanel3.setBackground(new java.awt.Color(117, 91, 50));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 230, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 160, 230, -1));

        bg.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 760, 460));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bgMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bgMousePressed
        mouseX = evt.getX();
        mouseY = evt.getY();
    }//GEN-LAST:event_bgMousePressed

    private void bgMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bgMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - mouseX, y - mouseY);
    }//GEN-LAST:event_bgMouseDragged

    private void regresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regresarMouseClicked
        Pagina1 pagina = new Pagina1();
        pagina.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_regresarMouseClicked

    private void siActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siActionPerformed
        Pregunta.setText("hola");
    }//GEN-LAST:event_siActionPerformed

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
            java.util.logging.Logger.getLogger(Menu1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Pregunta;
    private javax.swing.JPanel bg;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel plantas1;
    private javax.swing.JLabel plantas2;
    private javax.swing.JLabel plantas3;
    private javax.swing.JLabel plantas4;
    private javax.swing.JLabel regresar;
    private javax.swing.JButton si;
    private javax.swing.JLabel tabla1;
    private javax.swing.JLabel tabla2;
    private javax.swing.JLabel tabla_3;
    // End of variables declaration//GEN-END:variables
}
