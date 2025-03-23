/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaz;
import EDDauxiliares.InfoEspecie;
import Logica.ArbolDicotomico;
import Logica.TablaHash;
import Logica.CalculoTiempos;
/**
 *
 * @author ile1
 */
public class Directa extends javax.swing.JFrame {
    private ArbolDicotomico arbolcargado;
    private String claveSeleccionada;
    private boolean buscarPorHash;  // true = hash, false = árbol
    int mouseX, mouseY;
    private TablaHash tabla;  // PROBANDO (lo puedes borrar si lo necesitas)
    public Directa(ArbolDicotomico arbol) {
        initComponents();
        this.arbolcargado= arbol;
        this.tabla = new TablaHash(50);
        this.buscarPorHash=true;
        arbol.construirIndice(tabla);
        String[] claves = this.tabla.getAllKeys();
    for (String clave : claves) {
        MenuOpcion.addItem(clave);}// PROBANDO (lo puedes borrar si lo necesitas)
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
        HASH = new javax.swing.JLabel();
        TIEMPOS = new javax.swing.JLabel();
        ARBOL = new javax.swing.JLabel();
        regresar1 = new javax.swing.JLabel();
        tabla_3 = new javax.swing.JLabel();
        tabla1 = new javax.swing.JLabel();
        plantas1 = new javax.swing.JLabel();
        plantas2 = new javax.swing.JLabel();
        plantas3 = new javax.swing.JLabel();
        MenuOpcion = new javax.swing.JComboBox<>();
        plantas4 = new javax.swing.JLabel();
        tabla2 = new javax.swing.JLabel();
        buscar = new javax.swing.JPanel();
        BUSCAR = new javax.swing.JButton();
        Output = new javax.swing.JScrollPane();
        OUTPUT = new javax.swing.JTextArea();
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

        HASH.setFont(new java.awt.Font("Vineta BT", 0, 18)); // NOI18N
        HASH.setForeground(new java.awt.Color(255, 255, 255));
        HASH.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        HASH.setText("HASHTABLE");
        HASH.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        HASH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HASHMouseClicked(evt);
            }
        });
        jPanel1.add(HASH, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 60, 190, 60));

        TIEMPOS.setFont(new java.awt.Font("Vineta BT", 0, 18)); // NOI18N
        TIEMPOS.setForeground(new java.awt.Color(255, 255, 255));
        TIEMPOS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TIEMPOS.setText("Ver tiempo");
        TIEMPOS.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TIEMPOS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TIEMPOSMouseClicked(evt);
            }
        });
        jPanel1.add(TIEMPOS, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 370, 190, 60));

        ARBOL.setFont(new java.awt.Font("Vineta BT", 0, 18)); // NOI18N
        ARBOL.setForeground(new java.awt.Color(255, 255, 255));
        ARBOL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ARBOL.setText("ARBOL");
        ARBOL.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ARBOL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ARBOLMouseClicked(evt);
            }
        });
        jPanel1.add(ARBOL, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, 190, 60));

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

        MenuOpcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuOpcionActionPerformed(evt);
            }
        });
        jPanel1.add(MenuOpcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 110, 30));

        plantas4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pngtree-branches-and-leaves-png-image_2423895-removebg-preview_3.png"))); // NOI18N
        jPanel1.add(plantas4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        tabla2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo-madera-png-pisos-madera-dura_53876-627635-removebg-preview.png"))); // NOI18N
        jPanel1.add(tabla2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 70, 300, 100));

        buscar.setBackground(new java.awt.Color(0, 51, 0));

        BUSCAR.setText("Buscar");
        BUSCAR.setToolTipText("");
        BUSCAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BUSCARActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout buscarLayout = new javax.swing.GroupLayout(buscar);
        buscar.setLayout(buscarLayout);
        buscarLayout.setHorizontalGroup(
            buscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buscarLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(BUSCAR, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(66, Short.MAX_VALUE))
        );
        buscarLayout.setVerticalGroup(
            buscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buscarLayout.createSequentialGroup()
                .addContainerGap(304, Short.MAX_VALUE)
                .addComponent(BUSCAR)
                .addGap(130, 130, 130))
        );

        jPanel1.add(buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 460));

        OUTPUT.setColumns(20);
        OUTPUT.setRows(5);
        Output.setViewportView(OUTPUT);

        jPanel1.add(Output, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 190, 420, 170));

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
    
    /**
    * Captura las coordenadas del cursor del ratón cuando se presiona el botón sobre el fondo.
    *
    * @param evt El evento del ratón que contiene la información del clic.
    */
    
    private void bgMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bgMousePressed
        mouseX = evt.getX();
        mouseY = evt.getY();
    }//GEN-LAST:event_bgMousePressed
    
    /**
    * Maneja el evento de arrastre del ratón sobre el fondo de la ventana.
    * Permite mover la ventana arrastrando el fondo con el ratón.
    *
    * @param evt El evento de arrastre del ratón que contiene la información del evento.
    */
    private void bgMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bgMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - mouseX, y - mouseY);
    }//GEN-LAST:event_bgMouseDragged

    /**
    * Maneja el evento de clic del ratón en el componente HASH.
    *
    * Este método se invoca cuando el usuario hace clic en el componente HASH.
    * Establece la variable 'buscarPorHash' a 'true' para indicar que la búsqueda
    * se realizará utilizando una tabla hash. También actualiza el texto del
    * componente OUTPUT para informar al usuario que el modo de búsqueda ha
    * cambiado a "Hash Table".
    *
    * @param evt El evento de clic del ratón que disparó este método.
    */
    private void HASHMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HASHMouseClicked
        buscarPorHash = true;
        OUTPUT.setText("Modo de búsqueda: Hash Table");
    }//GEN-LAST:event_HASHMouseClicked

    /**
    * Maneja el evento de clic del ratón en el componente 'regresar1'.
    *
    * Este método realiza las siguientes acciones:
    * 1.  Crea una nueva instancia de la clase 'Pagina1', pasando el árbol cargado actual como argumento.
    * 2.  Hace visible la nueva instancia de 'Pagina1'.
    * 3.  Oculta la ventana actual.
    *
    * @param evt El evento de clic del ratón que desencadenó esta acción.
    */
    private void regresar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regresar1MouseClicked
        Pagina1 pagina = new Pagina1(this.arbolcargado);
        pagina.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_regresar1MouseClicked

    /**
     * Maneja el evento de clic del ratón en el componente 'ARBOL'.
     * * Este método se ejecuta cuando el usuario hace clic en el componente 'ARBOL'.
     * Realiza las siguientes acciones:
     * * 1.  Establece la variable 'buscarPorHash' a 'false', indicando que la búsqueda
     * ya no se realizará utilizando un hash.
     * 2.  Actualiza el texto del componente 'OUTPUT' para mostrar el mensaje
     * "Modo de búsqueda: Arbol", informando al usuario que la búsqueda se realizará
     * utilizando un árbol.
     *
     * @param evt El objeto MouseEvent que contiene información sobre el evento del ratón.
     */
    private void ARBOLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ARBOLMouseClicked
        buscarPorHash = false;
        OUTPUT.setText("Modo de búsqueda: Arbol");
    }//GEN-LAST:event_ARBOLMouseClicked

    /**
     * Maneja el evento de acción cuando se selecciona un elemento del menú desplegable MenuOpcion.
     *
     * @param evt El evento de acción que desencadenó esta función. Contiene información sobre la acción realizada,
     * como el objeto fuente del evento y cualquier modificador de teclado o mouse que se haya presionado.
     * En este caso, se utiliza para obtener el elemento seleccionado del menú desplegable.
     */
    private void MenuOpcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuOpcionActionPerformed
    String seleccion = (String) MenuOpcion.getSelectedItem();  
    if (seleccion != null) {
        claveSeleccionada = seleccion;
        OUTPUT.setText("Seleccion: "+ seleccion);}
        
    }//GEN-LAST:event_MenuOpcionActionPerformed

    /**
     * Maneja el evento de clic del ratón en el componente 'TIEMPOS'.
     * <p>
     * Al hacer clic, se crea una instancia de la clase 'CalculoTiempos', que se encarga de comparar los tiempos de ejecución
     * de un árbol cargado con una clave seleccionada. El resultado de la comparación se muestra en el componente 'OUTPUT'.
     * </p>
     *
     * @param evt El evento de clic del ratón que desencadenó esta acción.
     * @see CalculoTiempos
     * @see #arbolcargado
     * @see #tabla
     * @see #claveSeleccionada
     * @see #OUTPUT
     */
    private void TIEMPOSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TIEMPOSMouseClicked
        CalculoTiempos tiempo = new CalculoTiempos(this.arbolcargado,this.tabla);
        OUTPUT.setText(tiempo.compararTiempos(claveSeleccionada));
    }//GEN-LAST:event_TIEMPOSMouseClicked

    /**
    * Realiza una búsqueda de información de una especie basada en la clave seleccionada.
    * La búsqueda se realiza utilizando un hash o un árbol de búsqueda, dependiendo del valor de la variable 'buscarPorHash'.
    *
    * @param evt El evento de acción que desencadenó la llamada a este método.
    */
    private void BUSCARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BUSCARActionPerformed
if (buscarPorHash) {
        InfoEspecie info = tabla.buscar(this.claveSeleccionada);
        OUTPUT.setText("Hash:"+ "\n"+info.toString());
        
    } else {
        InfoEspecie info =  arbolcargado.buscarInOrdenConRuta(this.claveSeleccionada);
        OUTPUT.setText("Arbol:"+ "\n"+ info.toString());}
    }//GEN-LAST:event_BUSCARActionPerformed

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
    private javax.swing.JLabel ARBOL;
    private javax.swing.JButton BUSCAR;
    private javax.swing.JLabel HASH;
    private javax.swing.JComboBox<String> MenuOpcion;
    private javax.swing.JTextArea OUTPUT;
    private javax.swing.JScrollPane Output;
    private javax.swing.JLabel TIEMPOS;
    private javax.swing.JPanel bg;
    private javax.swing.JPanel buscar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel plantas1;
    private javax.swing.JLabel plantas2;
    private javax.swing.JLabel plantas3;
    private javax.swing.JLabel plantas4;
    private javax.swing.JLabel regresar1;
    private javax.swing.JLabel tabla1;
    private javax.swing.JLabel tabla2;
    private javax.swing.JLabel tabla3;
    private javax.swing.JLabel tabla_3;
    // End of variables declaration//GEN-END:variables
}
