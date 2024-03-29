/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenparcial1.interactiva;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author juanf
 */
public class gui extends javax.swing.JFrame {

    
    private Tienda modelo;
    private Factura factura;
    /**
     * Creates new form gui
     */
    public gui() {
        inicializar();
        initComponents();
    }

    
    public void inicializar(){
        modelo = new Tienda();
        factura = new Factura();
        
        
    }
    
    public ImageIcon cargarImagen(){
        String nombre = (String) listaProductos.getSelectedItem();
        String path = "";
        switch(nombre){
            case "Postre de Chocolate":
                path = "img\\postre.jpg";
                break;
            case "Pan dulce de coco":
                path = "img\\panCoco.jpg";
                break;
            case "Rosquilla":
                path = "img\\dona.jpg";
                break;
            case "Empanada":
                path = "img\\empanada.jpg";
                break;
            case "Papas Aborrajadas":
                path = "img\\papa.jpg";
                break;
            case "Chorizo":
                path = "img\\chorizo.jpg";
                break;
             case "COca Cola":
                path = "img\\cocacola.jpg";
                break;
            case "Hit mora":
                path = "img\\hit.jpg";
                break;
            case "Tinto":
                path = "img\\cafe.jpg";
                break;
            case "Chocolate":
                path = "img\\chocolate.jpg";
                break;
             case "Vive 100":
                path = "img\\vive100.jpg";
                break;
            case "Gatorade":
                path = "img\\gatorade.jpg";
                break;
                
        }
        if(!path.equals("")){
            ImageIcon pr = new ImageIcon(path);
            return pr;
        }else{
            return null;
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

        jScrollPane1 = new javax.swing.JScrollPane();
        estadoCompra = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        cantidadText = new javax.swing.JTextField();
        listaProductos = new javax.swing.JComboBox<>();
        nombreProducto = new javax.swing.JLabel();
        tipoProducto = new javax.swing.JLabel();
        precioProducto = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        precioTotal = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        inventarioBoton = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        cargarBoton = new javax.swing.JButton();
        valroInventarioBoton = new javax.swing.JButton();
        productosVencidosBoton = new javax.swing.JButton();
        utilidadPorMesBoton = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        codigo = new javax.swing.JLabel();
        presentacion = new javax.swing.JLabel();
        fechaVencimiento = new javax.swing.JLabel();
        cantidad = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(500, 500));

        estadoCompra.setEditable(false);
        estadoCompra.setColumns(20);
        estadoCompra.setRows(5);
        estadoCompra.setVerifyInputWhenFocusTarget(false);
        jScrollPane1.setViewportView(estadoCompra);

        jLabel1.setText("Estado de su compra:");

        jLabel2.setText("Elegir un producto:");

        jLabel3.setText("Información del producto:");

        jLabel4.setText("Nombre:");

        jLabel5.setText("Código:");

        jLabel6.setText("Precio:");

        jLabel7.setText("Cantidad:");

        jButton1.setText("Agregar a factura");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Generar Factura");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        cantidadText.setText("0");
        cantidadText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantidadTextActionPerformed(evt);
            }
        });

        listaProductos.setModel(new DefaultComboBoxModel(modelo.listaNombres()));
        listaProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaProductosActionPerformed(evt);
            }
        });

        jLabel8.setText("Precio total producto:");

        inventarioBoton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        inventarioBoton.setText("Ver inventario");
        inventarioBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inventarioBotonActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("Modo de venta de productos");

        cargarBoton.setText("Registrar");
        cargarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargarBotonActionPerformed(evt);
            }
        });

        valroInventarioBoton.setText("Valor Inventario");
        valroInventarioBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valroInventarioBotonActionPerformed(evt);
            }
        });

        productosVencidosBoton.setText("Productos a vencer");
        productosVencidosBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productosVencidosBotonActionPerformed(evt);
            }
        });

        utilidadPorMesBoton.setText("Utilidad por mes");
        utilidadPorMesBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                utilidadPorMesBotonActionPerformed(evt);
            }
        });

        jLabel10.setText("Presentación:");

        jLabel11.setText("Fecha vencimiento:");

        jLabel12.setText("Cantidad Disponible:");

        jButton3.setText("Prod mas vendido del mes");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(listaProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel7))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel6)
                                                .addGap(18, 18, 18)
                                                .addComponent(precioProducto))
                                            .addComponent(jButton1)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(tipoProducto)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel4)
                                                    .addGap(14, 14, 14)
                                                    .addComponent(nombreProducto))))
                                        .addGap(130, 130, 130)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel10)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(presentacion))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel11)
                                                    .addComponent(jLabel12))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(cantidad)
                                                    .addComponent(fechaVencimiento))))
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cantidadText, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(codigo)))
                                .addGap(125, 125, 125)
                                .addComponent(jLabel8)
                                .addGap(27, 27, 27)
                                .addComponent(precioTotal)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(199, 199, 199)
                        .addComponent(jButton2)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(productosVencidosBoton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(utilidadPorMesBoton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(valroInventarioBoton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cargarBoton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(inventarioBoton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cargarBoton)
                            .addComponent(productosVencidosBoton)
                            .addComponent(inventarioBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(valroInventarioBoton)
                            .addComponent(utilidadPorMesBoton)
                            .addComponent(jButton3))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel7)
                    .addComponent(cantidadText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(listaProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel8)
                    .addComponent(precioTotal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(nombreProducto)
                    .addComponent(jLabel10)
                    .addComponent(presentacion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tipoProducto)
                    .addComponent(jLabel11)
                    .addComponent(codigo)
                    .addComponent(fechaVencimiento))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(precioProducto)
                    .addComponent(jLabel12)
                    .addComponent(cantidad))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(54, 54, 54)
                .addComponent(jButton2)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Producto producto = null;
        
        String nombre = (String) listaProductos.getSelectedItem();
        for(int i = 0 ; i < modelo.getListaProductos().size() ; i++){
            if (nombre.equals(modelo.getListaProductos().get(i).getNombre())){
                producto = modelo.getListaProductos().get(i);
            }
        }
        System.out.println("Producto añadido");
        if(producto != null){
            factura.añadirProducto(producto, Integer.parseInt(cantidadText.getText()));
            estadoCompra.setText(factura.serializarFactura());
            precioTotal.setText(producto.getPrecioVenta()* Integer.parseInt(cantidadText.getText()) + "");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        factura.calcularPrecioTotal();
        JOptionPane.showMessageDialog(null, "Su factura de venta es: \n" + factura.serializarFactura() + "\n Y el costo total es: " + factura.getPrecioTotal());
        factura.escribirFactura();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void cantidadTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantidadTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cantidadTextActionPerformed

    private void listaProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaProductosActionPerformed
        // TODO add your handling code here:
        Producto producto = null;
        
        String nombre = (String) listaProductos.getSelectedItem();
        for(int i = 0 ; i < modelo.getListaProductos().size() ; i++){
            if (nombre.equals(modelo.getListaProductos().get(i).getNombre())){
                producto = modelo.getListaProductos().get(i);
                nombreProducto.setText(producto.getNombre());
                codigo.setText(producto.getCodigo());
                presentacion.setText(producto.getPresentacion());
                precioProducto.setText(producto.getPrecioVenta() + "");
                cantidad.setText(producto.getCantidad() + "");
                fechaVencimiento.setText(producto.getFechaVencimmiento().toLocaleString());
            }
        }
       
        
    }//GEN-LAST:event_listaProductosActionPerformed

    private void inventarioBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inventarioBotonActionPerformed
        // TODO add your handling code here:
        modelo.mostrarInventario();
    }//GEN-LAST:event_inventarioBotonActionPerformed

    private void cargarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargarBotonActionPerformed
        // TODO add your handling code here:
        modelo.guardarArchivo();
    }//GEN-LAST:event_cargarBotonActionPerformed

    private void valroInventarioBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valroInventarioBotonActionPerformed
        // TODO add your handling code here:
        modelo.valorTotalInventario();
    }//GEN-LAST:event_valroInventarioBotonActionPerformed

    private void utilidadPorMesBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_utilidadPorMesBotonActionPerformed
        // TODO add your handling code here:
        modelo.utilidadPorMes();
    }//GEN-LAST:event_utilidadPorMesBotonActionPerformed

    private void productosVencidosBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productosVencidosBotonActionPerformed
        // TODO add your handling code here:
        modelo.cargarProductosAVencer();
    }//GEN-LAST:event_productosVencidosBotonActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        modelo.productoMasVendido();
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new gui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cantidad;
    private javax.swing.JTextField cantidadText;
    private javax.swing.JButton cargarBoton;
    private javax.swing.JLabel codigo;
    private javax.swing.JTextArea estadoCompra;
    private javax.swing.JLabel fechaVencimiento;
    private javax.swing.JButton inventarioBoton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JComboBox<String> listaProductos;
    private javax.swing.JLabel nombreProducto;
    private javax.swing.JLabel precioProducto;
    private javax.swing.JLabel precioTotal;
    private javax.swing.JLabel presentacion;
    private javax.swing.JButton productosVencidosBoton;
    private javax.swing.JLabel tipoProducto;
    private javax.swing.JButton utilidadPorMesBoton;
    private javax.swing.JButton valroInventarioBoton;
    // End of variables declaration//GEN-END:variables
}
