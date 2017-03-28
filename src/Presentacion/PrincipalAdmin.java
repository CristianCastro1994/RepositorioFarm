/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;
import Datos.DCliente;
import Datos.DDetalleVenta;
import Datos.DProducto;
import Datos.DVenta;
import Funciones.FDetalleVenta;
import Funciones.FProducto;
import Funciones.FVenta;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.sql.Blob;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Richard
 */
public class PrincipalAdmin extends javax.swing.JFrame {
DCliente datos = new DCliente();
boolean controlVenta = false;

    /**
     * Creates new form Principal
     */
    public PrincipalAdmin() {
        initComponents();
        Calendar c2 = new GregorianCalendar();
        jCFechaVenta.setCalendar(c2);
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jBEmpleados = new javax.swing.JButton();
        jBClientes = new javax.swing.JButton();
        jBProductos = new javax.swing.JButton();
        jBCompras = new javax.swing.JButton();
        jBVentas = new javax.swing.JButton();
        jBCajas = new javax.swing.JButton();
        jBEstado = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jTNombre = new javax.swing.JTextField();
        jBCliente = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTClave = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTDetalleVenta = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jTTotal = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jTTotalReal = new javax.swing.JTextField();
        jTTotalPeso = new javax.swing.JTextField();
        jTTotalDolar = new javax.swing.JTextField();
        jBCotizacion = new javax.swing.JButton();
        jCFechaVenta = new com.toedter.calendar.JDateChooser();
        jCComprobante = new javax.swing.JComboBox<>();
        jLabel19 = new javax.swing.JLabel();
        jSCantidad = new javax.swing.JSpinner();
        jLImagen = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem19 = new javax.swing.JMenuItem();
        jMenuItem20 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem21 = new javax.swing.JMenuItem();
        jMenuItem22 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenu9 = new javax.swing.JMenu();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenuItem18 = new javax.swing.JMenuItem();
        jMenu10 = new javax.swing.JMenu();
        jMenu11 = new javax.swing.JMenu();
        jMenu12 = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SISTEMA DE FARMACIA");

        jBEmpleados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/archivo-icono-5812-32.png"))); // NOI18N
        jBEmpleados.setText("Empleados");

        jBClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/address-book-2.png"))); // NOI18N
        jBClientes.setText("Clientes");

        jBProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/emblem-package.png"))); // NOI18N
        jBProductos.setText("Productos");
        jBProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBProductosActionPerformed(evt);
            }
        });

        jBCompras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/emblem-money.png"))); // NOI18N
        jBCompras.setText("Compras");

        jBVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/application-exit.png"))); // NOI18N
        jBVentas.setText("Ventas");
        jBVentas.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jBVentas.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jBVentas.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jBCajas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/1488350833_vault.png"))); // NOI18N
        jBCajas.setText("Caja");

        jBEstado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/chart.png"))); // NOI18N
        jBEstado.setText("Estado");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/user.png"))); // NOI18N
        jLabel5.setText("Cliente");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 12, -1, -1));

        jTNombre.setEditable(false);
        jPanel2.add(jTNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 10, 595, -1));

        jBCliente.setText("...");
        jBCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBClienteActionPerformed(evt);
            }
        });
        jPanel2.add(jBCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(886, 10, 52, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/calendar.png"))); // NOI18N
        jLabel4.setText("Fecha");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1077, 12, -1, -1));

        jLabel6.setText("Cotizacion");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(232, 74, -1, -1));

        jTClave.setFont(new java.awt.Font("sansserif", 0, 36)); // NOI18N
        jTClave.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTClaveKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTClaveKeyTyped(evt);
            }
        });
        jPanel2.add(jTClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(1005, 60, 261, 70));

        jLabel8.setText("Clave");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(956, 113, -1, -1));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/gnome-searchtool.png"))); // NOI18N
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1272, 52, -1, -1));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/fileprint.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1272, 112, -1, -1));

        jTDetalleVenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Cant", "Descripcion", "Desc.", "Precio U.", "Importe"
            }
        ));
        jScrollPane2.setViewportView(jTDetalleVenta);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 171, 1309, 347));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1422, 523, -1, 37));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/United States of America.png"))); // NOI18N
        jLabel10.setText("Dolar");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(232, 96, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Brazil.png"))); // NOI18N
        jLabel11.setText("Real");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(232, 118, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Argentina.png"))); // NOI18N
        jLabel12.setText("Peso");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(232, 140, -1, -1));
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(1564, 523, -1, 35));
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(2069, 523, 48, 35));
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(2856, 523, -1, 35));

        jTTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTTotalActionPerformed(evt);
            }
        });
        jPanel2.add(jTTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(704, 537, 106, 35));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos32/Paraguay.png"))); // NOI18N
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(654, 540, -1, -1));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos32/United States of America (USA).png"))); // NOI18N
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(828, 540, -1, -1));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos32/Brazil.png"))); // NOI18N
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(996, 537, -1, -1));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos32/Argentina.png"))); // NOI18N
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 537, -1, -1));

        jTTotalReal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTTotalRealActionPerformed(evt);
            }
        });
        jPanel2.add(jTTotalReal, new org.netbeans.lib.awtextra.AbsoluteConstraints(1046, 537, 106, 35));

        jTTotalPeso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTTotalPesoActionPerformed(evt);
            }
        });
        jPanel2.add(jTTotalPeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(1226, 537, 106, 35));

        jTTotalDolar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTTotalDolarActionPerformed(evt);
            }
        });
        jPanel2.add(jTTotalDolar, new org.netbeans.lib.awtextra.AbsoluteConstraints(872, 536, 106, 35));

        jBCotizacion.setText("COTIZACION");
        jBCotizacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCotizacionActionPerformed(evt);
            }
        });
        jPanel2.add(jBCotizacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(294, 89, -1, -1));

        jCFechaVenta.setBackground(new java.awt.Color(36, 33, 33));
        jCFechaVenta.setForeground(new java.awt.Color(207, 207, 207));
        jCFechaVenta.setDateFormatString("yyyy-MM-dd");
        jCFechaVenta.setEnabled(false);
        jCFechaVenta.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jPanel2.add(jCFechaVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(1157, 10, 152, 30));

        jCComprobante.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ticket", "Factura", " " }));
        jPanel2.add(jCComprobante, new org.netbeans.lib.awtextra.AbsoluteConstraints(667, 52, 213, -1));

        jLabel19.setText("Comprobante:");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(582, 57, -1, -1));

        jSCantidad.setFont(new java.awt.Font("sansserif", 0, 36)); // NOI18N
        jSCantidad.setValue(1);
        jPanel2.add(jSCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(786, 90, 133, 50));

        jLImagen.setBackground(new java.awt.Color(204, 255, 204));
        jLImagen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLImagen.setText("Imagen");
        jLImagen.setToolTipText("");
        jLImagen.setFocusable(false);
        jPanel2.add(jLImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 150, 130));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jBEmpleados)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBClientes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBProductos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBCompras)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBVentas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBCajas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBEstado)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jBVentas, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBClientes)
                            .addComponent(jBProductos)
                            .addComponent(jBCompras)
                            .addComponent(jBCajas)
                            .addComponent(jBEstado)))
                    .addComponent(jBEmpleados))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setText("Nombre:");

        jLabel2.setText("Cargo:");

        jLabel3.setText("Fecha:");

        jMenu1.setText("Archivo");

        jMenu3.setText("Iniciar Sesión");
        jMenu1.add(jMenu3);

        jMenuItem19.setText("Cerrar Sesión");
        jMenu1.add(jMenuItem19);

        jMenuItem20.setText("Salir del Sistema");
        jMenu1.add(jMenuItem20);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Almacén");
        jMenuBar1.add(jMenu2);

        jMenu4.setText("Compras");

        jMenuItem21.setText("Compra");
        jMenu4.add(jMenuItem21);

        jMenuItem22.setText("Proveedores");
        jMenu4.add(jMenuItem22);

        jMenuBar1.add(jMenu4);

        jMenu5.setText("Ventas");

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F6, 0));
        jMenuItem2.setText("Venta");
        jMenu5.add(jMenuItem2);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F7, 0));
        jMenuItem3.setText("Verificar Producto");
        jMenu5.add(jMenuItem3);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F8, 0));
        jMenuItem4.setText("Cliente");
        jMenu5.add(jMenuItem4);

        jMenuBar1.add(jMenu5);

        jMenu6.setText("Consultas");

        jMenuItem5.setText("Ventas Realizadas");
        jMenu6.add(jMenuItem5);

        jMenuItem6.setText("Ventas Detalladas");
        jMenu6.add(jMenuItem6);

        jMenuItem7.setText("Estadística Mensual");
        jMenu6.add(jMenuItem7);

        jMenuItem8.setText("Compras Realizadas");
        jMenu6.add(jMenuItem8);

        jMenuItem9.setText("Compras Detalladas");
        jMenu6.add(jMenuItem9);

        jMenuBar1.add(jMenu6);

        jMenu7.setText("Mantenimiento");

        jMenuItem10.setText("Empleado");
        jMenu7.add(jMenuItem10);

        jMenuItem11.setText("Tipo de Documento");
        jMenu7.add(jMenuItem11);

        jMenuItem12.setText("Tipo Usuario");
        jMenu7.add(jMenuItem12);

        jMenuBar1.add(jMenu7);

        jMenu8.setText("Anulaciones");

        jMenuItem13.setText("Anular Venta");
        jMenu8.add(jMenuItem13);

        jMenuItem14.setText("Anular Compra");
        jMenu8.add(jMenuItem14);

        jMenuBar1.add(jMenu8);

        jMenu9.setText("Herramientas");

        jMenuItem15.setText("Cambiar Contraseña");
        jMenu9.add(jMenuItem15);

        jMenuItem16.setText("Calculadora");
        jMenu9.add(jMenuItem16);

        jMenuItem17.setText("Respaldar BD");
        jMenu9.add(jMenuItem17);

        jMenuItem18.setText("Restaurar BD");
        jMenu9.add(jMenuItem18);

        jMenuBar1.add(jMenu9);

        jMenu10.setText("Ayuda");

        jMenu11.setText("Solicita Ayuda");
        jMenu10.add(jMenu11);

        jMenu12.setText("Ayuda");
        jMenu10.add(jMenu12);

        jMenuBar1.add(jMenu10);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(208, 208, 208)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(142, 142, 142))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 125, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void cargarDetalle(){
        DefaultTableModel modelo;
        FDetalleVenta func = new FDetalleVenta();
        modelo = func.VistaDetalle();
        jTDetalleVenta.setModel(modelo);
    }
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
new CalculoVuelto().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTTotalActionPerformed

    private void jTTotalRealActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTTotalRealActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTTotalRealActionPerformed

    private void jTTotalPesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTTotalPesoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTTotalPesoActionPerformed

    private void jTTotalDolarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTTotalDolarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTTotalDolarActionPerformed
    public void cargarImagen(){
        try {
            Blob blob;
            
               
            FProducto func = new FProducto();
            
            blob = func.mostrarImagen(jTClave.getText());
            byte[] data = blob.getBytes(1, (int)blob.length());
               BufferedImage img = null;
               img = ImageIO.read(new ByteArrayInputStream(data));
             jLImagen.setIcon(new ImageIcon(img.getScaledInstance(200, 200, Image.SCALE_DEFAULT)));  
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Este producto no tiene imagen");
        } 
    
    }
    
    
    private void jBClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBClienteActionPerformed
     BusquedaCliente form = new BusquedaCliente();
        form.toFront();
        form.setVisible(true);
    }//GEN-LAST:event_jBClienteActionPerformed

    
public void mostrarCalculo(){
    FVenta func = new FVenta();
    DVenta datosVenta = new DVenta();
    
    if (func.mostrarCalculo()){
        jTTotal.setText(String.valueOf(datosVenta.getTotal()));
        jTTotalDolar.setText(String.valueOf(datosVenta.getTotalDolar()));
        jTTotalPeso.setText(String.valueOf(datosVenta.getTotalPeso()));
        jTTotalReal.setText(String.valueOf(datosVenta.getTotalReal()));
    }
}
    
    private void jBCotizacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCotizacionActionPerformed
new Cotizacion().setVisible(true);
     // TODO add your handling code here:
    }//GEN-LAST:event_jBCotizacionActionPerformed

    private void jTClaveKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTClaveKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jTClaveKeyReleased

    private void jTClaveKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTClaveKeyTyped
char c = evt.getKeyChar();



        FVenta func = new FVenta();
        DVenta datos = new DVenta();
        
        FDetalleVenta funcion = new FDetalleVenta();
        DDetalleVenta datosDetalle = new DDetalleVenta();
if (jTNombre.getText().length() == 0){
    evt.consume();
    JOptionPane.showMessageDialog(null, "Registre primero el Cliente");
    jTNombre.requestFocus();
    return;
}

        if (c == evt.VK_ENTER) {
            if (controlVenta == false) {
                datos.setComprobante(jCComprobante.getSelectedItem().toString());
                if (func.insertarVenta(datos)){
//                    JOptionPane.showMessageDialog(null, "La venta se ha creado");
                    controlVenta = true;
                }
            }
            
            datosDetalle.setcantidadDetalle(Float.valueOf(jSCantidad.getValue().toString()));
            datosDetalle.setcodigoProducto(Integer.valueOf(jTClave.getText()));
            if (funcion.insertarDetalleVenta(datosDetalle)) {
            jLImagen.setIcon(null);
            jSCantidad.setValue(1);
            cargarDetalle();
            cargarImagen();
            mostrarCalculo();
            jTClave.setText("");
            jTClave.requestFocus();
            }
        }
// TODO add your handling code here:
    }//GEN-LAST:event_jTClaveKeyTyped

    private void jBProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBProductosActionPerformed
new Producto().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jBProductosActionPerformed

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
            java.util.logging.Logger.getLogger(PrincipalAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCajas;
    private javax.swing.JButton jBCliente;
    private javax.swing.JButton jBClientes;
    private javax.swing.JButton jBCompras;
    private javax.swing.JButton jBCotizacion;
    private javax.swing.JButton jBEmpleados;
    private javax.swing.JButton jBEstado;
    private javax.swing.JButton jBProductos;
    private javax.swing.JButton jBVentas;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jCComprobante;
    private com.toedter.calendar.JDateChooser jCFechaVenta;
    private javax.swing.JLabel jLImagen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu12;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem19;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem20;
    private javax.swing.JMenuItem jMenuItem21;
    private javax.swing.JMenuItem jMenuItem22;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSpinner jSCantidad;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTClave;
    private javax.swing.JTable jTDetalleVenta;
    public static javax.swing.JTextField jTNombre;
    private javax.swing.JTextField jTTotal;
    private javax.swing.JTextField jTTotalDolar;
    private javax.swing.JTextField jTTotalPeso;
    private javax.swing.JTextField jTTotalReal;
    // End of variables declaration//GEN-END:variables
}
