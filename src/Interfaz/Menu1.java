/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaz;

/**
 *
 * @author ile1
 */
public class Menu1 extends javax.swing.JFrame {

    int mouseX, mouseY;
    
    public Menu1() {
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
        unimet = new javax.swing.JLabel();
        buscar = new javax.swing.JLabel();
        titulo3 = new javax.swing.JLabel();
        cargar = new javax.swing.JLabel();
        titulo1 = new javax.swing.JLabel();
        tabla_2 = new javax.swing.JLabel();
        tabla = new javax.swing.JLabel();
        arboles = new javax.swing.JLabel();
        plantas1 = new javax.swing.JLabel();
        plantas2 = new javax.swing.JLabel();
        plantas3 = new javax.swing.JLabel();
        plantas4 = new javax.swing.JLabel();
        tabla_3 = new javax.swing.JLabel();
        rama = new javax.swing.JLabel();
        rama1 = new javax.swing.JLabel();

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

        unimet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logo-unimet-6.png"))); // NOI18N
        jPanel1.add(unimet, new org.netbeans.lib.awtextra.AbsoluteConstraints(434, 70, 80, 40));

        buscar.setFont(new java.awt.Font("Vineta BT", 0, 24)); // NOI18N
        buscar.setForeground(new java.awt.Color(255, 255, 255));
        buscar.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        buscar.setText("BUSCAR");
        jPanel1.add(buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 360, 160, 60));

        titulo3.setFont(new java.awt.Font("Vineta BT", 0, 22)); // NOI18N
        titulo3.setForeground(new java.awt.Color(255, 255, 255));
        titulo3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        titulo3.setText("DICOTÓMICO");
        jPanel1.add(titulo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, -1, 50));

        cargar.setFont(new java.awt.Font("Vineta BT", 0, 24)); // NOI18N
        cargar.setForeground(new java.awt.Color(255, 255, 255));
        cargar.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        cargar.setText("CARGAR");
        jPanel1.add(cargar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 280, 170, 60));

        titulo1.setFont(new java.awt.Font("Vineta BT", 0, 22)); // NOI18N
        titulo1.setForeground(new java.awt.Color(255, 255, 255));
        titulo1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        titulo1.setText("ARBOL");
        jPanel1.add(titulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 80, -1, 50));

        tabla_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo-madera-png-pisos-madera-dura_53876-627635-removebg-preview_1.png"))); // NOI18N
        jPanel1.add(tabla_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 350, -1, -1));

        tabla.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo-madera-png-pisos-madera-dura_53876-627635-removebg-preview.png"))); // NOI18N
        jPanel1.add(tabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 380, 190));

        arboles.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/istockphoto-1486094729-612x612-removebg-preview.png"))); // NOI18N
        jPanel1.add(arboles, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, -1, -1));

        plantas1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pngtree-branches-and-leaves-png-image_2423895-removebg-preview_1.png"))); // NOI18N
        jPanel1.add(plantas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 0, -1, -1));

        plantas2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pngtree-branches-and-leaves-png-image_2423895-removebg-preview.png"))); // NOI18N
        jPanel1.add(plantas2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 320, -1, -1));

        plantas3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pngtree-branches-and-leaves-png-image_2423895-removebg-preview_2.png"))); // NOI18N
        jPanel1.add(plantas3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, -1, -1));

        plantas4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pngtree-branches-and-leaves-png-image_2423895-removebg-preview_3.png"))); // NOI18N
        jPanel1.add(plantas4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        tabla_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo-madera-png-pisos-madera-dura_53876-627635-removebg-preview_1.png"))); // NOI18N
        jPanel1.add(tabla_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 270, -1, -1));

        rama.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/39-392656_ramas-hojas-freetoedit-rama-de-hojas-png-removebg-preview.png"))); // NOI18N
        jPanel1.add(rama, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 310, 280, -1));

        rama1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/39-392656_ramas-hojas-freetoedit-rama-de-hojas-png-removebg-preview.png"))); // NOI18N
        jPanel1.add(rama1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, -1, -1));

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
    private javax.swing.JLabel arboles;
    private javax.swing.JPanel bg;
    private javax.swing.JLabel buscar;
    private javax.swing.JLabel cargar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel plantas1;
    private javax.swing.JLabel plantas2;
    private javax.swing.JLabel plantas3;
    private javax.swing.JLabel plantas4;
    private javax.swing.JLabel rama;
    private javax.swing.JLabel rama1;
    private javax.swing.JLabel tabla;
    private javax.swing.JLabel tabla_2;
    private javax.swing.JLabel tabla_3;
    private javax.swing.JLabel titulo1;
    private javax.swing.JLabel titulo3;
    private javax.swing.JLabel unimet;
    // End of variables declaration//GEN-END:variables
}
