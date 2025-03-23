/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaz;

import EDDauxiliares.InfoEspecie;
import EDDauxiliares.Step;
import EDDauxiliares.StepList;
import Interfaz.Manual;
import Logica.ArbolDicotomico;
import Logica.CalculoTiempos;
import Logica.GraphStreamArbol;
import Logica.NodoArbol;
import Logica.TablaHash;
import java.io.File;
import javax.swing.JFileChooser;
import java.util.Scanner;
/**
 *
 * @author ile1
 */
public class Pagina1 extends javax.swing.JFrame {

    int mouseX, mouseY;
    
    private ArbolDicotomico arbolcargado;
    public Pagina1(ArbolDicotomico arbol) {
        initComponents();
        this.arbolcargado = arbol;
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
        Directa = new javax.swing.JLabel();
        si = new javax.swing.JLabel();
        manual1 = new javax.swing.JLabel();
        si1 = new javax.swing.JLabel();
        regresar = new javax.swing.JLabel();
        tabla_3 = new javax.swing.JLabel();
        plantas1 = new javax.swing.JLabel();
        plantas2 = new javax.swing.JLabel();
        plantas3 = new javax.swing.JLabel();
        plantas4 = new javax.swing.JLabel();
        tabla2 = new javax.swing.JLabel();
        Arbol = new javax.swing.JLabel();
        MostrarArbolCompleto = new javax.swing.JButton();
        tabla1 = new javax.swing.JLabel();
        tabla3 = new javax.swing.JLabel();
        regresar1 = new javax.swing.JLabel();

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

        Directa.setFont(new java.awt.Font("Vineta BT", 0, 18)); // NOI18N
        Directa.setForeground(new java.awt.Color(255, 255, 255));
        Directa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Directa.setText("Directa");
        Directa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Directa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DirectaMouseClicked(evt);
            }
        });
        jPanel1.add(Directa, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 170, 140, 80));

        si.setFont(new java.awt.Font("Vineta BT", 0, 18)); // NOI18N
        si.setForeground(new java.awt.Color(255, 255, 255));
        si.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        si.setText("Busqueda");
        si.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        si.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                siMouseClicked(evt);
            }
        });
        jPanel1.add(si, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 160, 140, 50));

        manual1.setFont(new java.awt.Font("Vineta BT", 0, 18)); // NOI18N
        manual1.setForeground(new java.awt.Color(255, 255, 255));
        manual1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        manual1.setText("Manual");
        manual1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        manual1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                manual1MouseClicked(evt);
            }
        });
        jPanel1.add(manual1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 140, 80));

        si1.setFont(new java.awt.Font("Vineta BT", 0, 18)); // NOI18N
        si1.setForeground(new java.awt.Color(255, 255, 255));
        si1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        si1.setText("Busqueda");
        si1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        si1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                si1MouseClicked(evt);
            }
        });
        jPanel1.add(si1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 140, 30));

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

        plantas1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pngtree-branches-and-leaves-png-image_2423895-removebg-preview_1.png"))); // NOI18N
        jPanel1.add(plantas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 0, -1, -1));

        plantas2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pngtree-branches-and-leaves-png-image_2423895-removebg-preview.png"))); // NOI18N
        jPanel1.add(plantas2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 320, -1, -1));

        plantas3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pngtree-branches-and-leaves-png-image_2423895-removebg-preview_2.png"))); // NOI18N
        jPanel1.add(plantas3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, -1, -1));

        plantas4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pngtree-branches-and-leaves-png-image_2423895-removebg-preview_3.png"))); // NOI18N
        jPanel1.add(plantas4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        tabla2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo-madera-png-pisos-madera-dura_53876-627635-removebg-preview.png"))); // NOI18N
        jPanel1.add(tabla2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 150, 300, 200));

        Arbol.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pngtree-a-big-tree-with-green-leaf-on-transparent-background-genrative-ai-png-image_11931910.png"))); // NOI18N
        jPanel1.add(Arbol, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, -1, -1));

        MostrarArbolCompleto.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        MostrarArbolCompleto.setForeground(new java.awt.Color(255, 255, 255));
        MostrarArbolCompleto.setText("Mostrar Arbol");
        MostrarArbolCompleto.setBorderPainted(false);
        MostrarArbolCompleto.setContentAreaFilled(false);
        MostrarArbolCompleto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarArbolCompletoActionPerformed(evt);
            }
        });
        jPanel1.add(MostrarArbolCompleto, new org.netbeans.lib.awtextra.AbsoluteConstraints(234, 350, 280, 50));

        tabla1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo-madera-png-pisos-madera-dura_53876-627635-removebg-preview.png"))); // NOI18N
        jPanel1.add(tabla1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 320, 300, 200));

        tabla3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo-madera-png-pisos-madera-dura_53876-627635-removebg-preview.png"))); // NOI18N
        jPanel1.add(tabla3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 150, 300, 200));

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
        Menu1 menu = new Menu1();
        menu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_regresarMouseClicked

    private void si1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_si1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_si1MouseClicked

    private void manual1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manual1MouseClicked

        Manual manual = new Manual(this.arbolcargado);
        manual.setVisible(true);
        this.setVisible(false);
        //arbol.iniciarBusquedaInteractivaConVisual();
        
    }//GEN-LAST:event_manual1MouseClicked

    private void siMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_siMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_siMouseClicked

    private void DirectaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DirectaMouseClicked
        Directa directa = new Directa(this.arbolcargado);
        directa.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_DirectaMouseClicked

    private void regresar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regresar1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_regresar1MouseClicked

    private void MostrarArbolCompletoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarArbolCompletoActionPerformed
        GraphStreamArbol graph= new GraphStreamArbol("ARBOL");// TODO add your handling code here:
        graph.construir(this.arbolcargado);
        graph.mostrar();

    }//GEN-LAST:event_MostrarArbolCompletoActionPerformed

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
    private javax.swing.JLabel Arbol;
    private javax.swing.JLabel Directa;
    private javax.swing.JButton MostrarArbolCompleto;
    private javax.swing.JPanel bg;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel manual1;
    private javax.swing.JLabel plantas1;
    private javax.swing.JLabel plantas2;
    private javax.swing.JLabel plantas3;
    private javax.swing.JLabel plantas4;
    private javax.swing.JLabel regresar;
    private javax.swing.JLabel regresar1;
    private javax.swing.JLabel si;
    private javax.swing.JLabel si1;
    private javax.swing.JLabel tabla1;
    private javax.swing.JLabel tabla2;
    private javax.swing.JLabel tabla3;
    private javax.swing.JLabel tabla_3;
    // End of variables declaration//GEN-END:variables
}
