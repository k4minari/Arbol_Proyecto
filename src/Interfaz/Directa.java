/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaz;

/**
 *
 * @author ile1
 */
public class Directa extends javax.swing.JFrame {

    int mouseX, mouseY;
    
    public Directa() {
        initComponents();
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
        regresar = new javax.swing.JLabel();
        regresar3 = new javax.swing.JLabel();
        regresar2 = new javax.swing.JLabel();
        regresar1 = new javax.swing.JLabel();
        tabla_3 = new javax.swing.JLabel();
        tabla1 = new javax.swing.JLabel();
        plantas1 = new javax.swing.JLabel();
        plantas2 = new javax.swing.JLabel();
        plantas3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        plantas4 = new javax.swing.JLabel();
        tabla2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        tabla3 = new javax.swing.JLabel();

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

        regresar.setFont(new java.awt.Font("Vineta BT", 0, 18)); // NOI18N
        regresar.setForeground(new java.awt.Color(255, 255, 255));
        regresar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        regresar.setText("HASHTABLE");
        regresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        regresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                regresarMouseClicked(evt);
            }
        });
        jPanel1.add(regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 60, 190, 60));

        regresar3.setFont(new java.awt.Font("Vineta BT", 0, 18)); // NOI18N
        regresar3.setForeground(new java.awt.Color(255, 255, 255));
        regresar3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        regresar3.setText("Ver tiempo");
        regresar3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        regresar3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                regresar3MouseClicked(evt);
            }
        });
        jPanel1.add(regresar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 370, 190, 60));

        regresar2.setFont(new java.awt.Font("Vineta BT", 0, 18)); // NOI18N
        regresar2.setForeground(new java.awt.Color(255, 255, 255));
        regresar2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        regresar2.setText("ARBOL");
        regresar2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        regresar2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                regresar2MouseClicked(evt);
            }
        });
        jPanel1.add(regresar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, 190, 60));

        regresar1.setFont(new java.awt.Font("Vineta BT", 0, 18)); // NOI18N
        regresar1.setForeground(new java.awt.Color(255, 255, 255));
        regresar1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        regresar1.setText("<<REGRESAR");
        regresar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        regresar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                regresar1MouseClicked(evt);
            }
        });
        jPanel1.add(regresar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 200, 60));

        tabla_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo-madera-png-pisos-madera-dura_53876-627635-removebg-preview_1.png"))); // NOI18N
        jPanel1.add(tabla_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        tabla1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo-madera-png-pisos-madera-dura_53876-627635-removebg-preview.png"))); // NOI18N
        jPanel1.add(tabla1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 380, 300, 70));

        plantas1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pngtree-branches-and-leaves-png-image_2423895-removebg-preview_1.png"))); // NOI18N
        jPanel1.add(plantas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 0, -1, -1));

        plantas2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pngtree-branches-and-leaves-png-image_2423895-removebg-preview.png"))); // NOI18N
        jPanel1.add(plantas2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 320, -1, -1));

        plantas3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pngtree-branches-and-leaves-png-image_2423895-removebg-preview_2.png"))); // NOI18N
        jPanel1.add(plantas3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 110, 30));

        plantas4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pngtree-branches-and-leaves-png-image_2423895-removebg-preview_3.png"))); // NOI18N
        jPanel1.add(plantas4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        tabla2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo-madera-png-pisos-madera-dura_53876-627635-removebg-preview.png"))); // NOI18N
        jPanel1.add(tabla2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 70, 300, 100));

        jPanel2.setBackground(new java.awt.Color(0, 51, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 230, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 460, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 460));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 190, 420, 170));

        tabla3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo-madera-png-pisos-madera-dura_53876-627635-removebg-preview.png"))); // NOI18N
        jPanel1.add(tabla3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 300, 100));

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

    }//GEN-LAST:event_regresarMouseClicked

    private void regresar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regresar1MouseClicked
        Pagina1 pagina = new Pagina1();
        pagina.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_regresar1MouseClicked

    private void regresar2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regresar2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_regresar2MouseClicked

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void regresar3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regresar3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_regresar3MouseClicked

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
    private javax.swing.JPanel bg;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel plantas1;
    private javax.swing.JLabel plantas2;
    private javax.swing.JLabel plantas3;
    private javax.swing.JLabel plantas4;
    private javax.swing.JLabel regresar;
    private javax.swing.JLabel regresar1;
    private javax.swing.JLabel regresar2;
    private javax.swing.JLabel regresar3;
    private javax.swing.JLabel tabla1;
    private javax.swing.JLabel tabla2;
    private javax.swing.JLabel tabla3;
    private javax.swing.JLabel tabla_3;
    // End of variables declaration//GEN-END:variables
}
