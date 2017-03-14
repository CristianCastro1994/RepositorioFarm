/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

/**
 *
 * @author Richard
 */
public class Categoria extends javax.swing.JFrame {

    /**
     * Creates new form Categoria
     */
    public Categoria() {
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

        btngroupCategoria = new javax.swing.ButtonGroup();
        jTabbedPane4 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jRBTipoUsuario = new javax.swing.JRadioButton();
        jRBDescripcion1 = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jBNuevo1 = new javax.swing.JButton();
        jBGuardar1 = new javax.swing.JButton();
        jBModificar1 = new javax.swing.JButton();
        jBCancelar1 = new javax.swing.JButton();
        jBSalir1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CATEGORIA");

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(204, 255, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Críterios de Búsqueda"));
        jPanel3.setForeground(new java.awt.Color(153, 204, 0));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1.setToolTipText("Ingrese aquí");
        jPanel3.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 580, -1));

        jRBTipoUsuario.setBackground(new java.awt.Color(204, 255, 204));
        btngroupCategoria.add(jRBTipoUsuario);
        jRBTipoUsuario.setText("ID Categoria");
        jPanel3.add(jRBTipoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 132, -1));

        jRBDescripcion1.setBackground(new java.awt.Color(204, 255, 204));
        btngroupCategoria.add(jRBDescripcion1);
        jRBDescripcion1.setText("Descripción");
        jPanel3.add(jRBDescripcion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, 111, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 630, 100));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID", "Descripción"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 630, 180));

        jTabbedPane4.addTab("Buscar", jPanel1);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos de la Categoria"));
        jPanel4.setLayout(null);

        jLabel1.setText("ID Categoria:");
        jPanel4.add(jLabel1);
        jLabel1.setBounds(28, 30, 65, 14);

        jLabel2.setText("Descripción:");
        jPanel4.add(jLabel2);
        jLabel2.setBounds(28, 68, 58, 14);
        jPanel4.add(jTextField2);
        jTextField2.setBounds(105, 27, 117, 20);
        jPanel4.add(jTextField3);
        jTextField3.setBounds(105, 65, 290, 20);

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 630, 120));

        jTabbedPane4.addTab("Nuevo / Modificar", jPanel2);

        jBNuevo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/add-files-to-archive.png"))); // NOI18N
        jBNuevo1.setText("Nuevo");
        jBNuevo1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jBNuevo1.setFocusPainted(false);
        jBNuevo1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBNuevo1.setMaximumSize(new java.awt.Dimension(71, 59));
        jBNuevo1.setMinimumSize(new java.awt.Dimension(71, 59));
        jBNuevo1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jBGuardar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/disk.png"))); // NOI18N
        jBGuardar1.setText("Guardar");
        jBGuardar1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBGuardar1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jBModificar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/document-edit.png"))); // NOI18N
        jBModificar1.setText("Modificar");
        jBModificar1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBModificar1.setMaximumSize(new java.awt.Dimension(71, 59));
        jBModificar1.setMinimumSize(new java.awt.Dimension(71, 59));
        jBModificar1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jBCancelar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/dialog-cancel.png"))); // NOI18N
        jBCancelar1.setText("Cancelar");
        jBCancelar1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBCancelar1.setPreferredSize(new java.awt.Dimension(75, 59));
        jBCancelar1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jBSalir1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/exit.png"))); // NOI18N
        jBSalir1.setText("Salir");
        jBSalir1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBSalir1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jBSalir1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jTabbedPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 661, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jBCancelar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBModificar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBNuevo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBGuardar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBSalir1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 398, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jBNuevo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBGuardar1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBModificar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBCancelar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBSalir1)
                        .addGap(14, 14, 14)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Categoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Categoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Categoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Categoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Categoria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btngroupCategoria;
    private javax.swing.JButton jBCancelar1;
    private javax.swing.JButton jBGuardar1;
    private javax.swing.JButton jBModificar1;
    private javax.swing.JButton jBNuevo1;
    private javax.swing.JButton jBSalir1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton jRBDescripcion1;
    private javax.swing.JRadioButton jRBTipoUsuario;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
