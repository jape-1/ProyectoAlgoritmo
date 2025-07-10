/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.algoproyect.arreglo.Vistas;

import com.mycompany.algoproyect.arreglo.Arreglos.cProducto;
import com.mycompany.algoproyect.arreglo.Colas.Cola;
import com.mycompany.algoproyect.arreglo.Colas.cProceso;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Omega
 */
public class VIEWCOLA extends javax.swing.JFrame {
    private Cola colaProductos = new Cola(20); 
    private cProceso tienda = new cProceso(20);
    
private void mostrarEnTabla() {
    DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
    modelo.setRowCount(0); // limpiar tabla

    cProducto[] productos = tienda.getArreglo();
    for (int i = 0; i < productos.length; i++) {
        if (productos[i] != null) {
            Object[] fila = {
                productos[i].getCodpro(),
                productos[i].getNombre(),
                productos[i].getUnipre(),
                productos[i].getCantcomp(),
                productos[i].getUnipre() * productos[i].getCantcomp()
            };
            modelo.addRow(fila);
        }
    }
}
    /**
     * Creates new form Pantalla
     */
    public VIEWCOLA() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtcodigo = new javax.swing.JTextField();
        txtprecio = new javax.swing.JTextField();
        txtcantidad = new javax.swing.JTextField();
        btnbuscar = new javax.swing.JButton();
        btninsertar = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        btnactualizar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        txtProducto = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        btnTotal = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtcodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcodigoActionPerformed(evt);
            }
        });

        btnbuscar.setText("BUSCAR");
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });

        btninsertar.setText("INSERTAR");
        btninsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btninsertarActionPerformed(evt);
            }
        });

        btneliminar.setText("ELIMINAR");
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });

        btnactualizar.setText("ACTUALIZAR");
        btnactualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnactualizarActionPerformed(evt);
            }
        });

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "CODIGO", "PRODUCTO", "PRECIO", "CANTIDAD", "IMPORTE"
            }
        ));
        jScrollPane1.setViewportView(tabla);

        txtProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProductoActionPerformed(evt);
            }
        });

        jLabel1.setText("Codigo");

        jLabel2.setText("Producto");

        jLabel3.setText("Precio");

        jLabel4.setText("Cantidad");

        jButton1.setText("Volver al Menu");

        jLabel5.setText("TOTAL:");

        btnTotal.setText("TOTAL");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtprecio, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                            .addComponent(txtcantidad)
                            .addComponent(txtcodigo)
                            .addComponent(txtProducto))
                        .addGap(62, 62, 62)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btninsertar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnbuscar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnactualizar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btneliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(56, 56, 56)
                        .addComponent(btnTotal))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 105, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnbuscar)
                            .addComponent(jLabel1)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(btnTotal)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btninsertar)
                    .addComponent(txtProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtprecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btneliminar)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnactualizar)
                    .addComponent(jLabel4))
                .addGap(52, 52, 52)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jLabel5)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtcodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcodigoActionPerformed

    private void btninsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btninsertarActionPerformed
    
    int cod = Integer.parseInt(txtcodigo.getText());
    String nombre = (String) txtProducto.getText();
    double precio = Double.parseDouble(txtprecio.getText());
    int cantidad = Integer.parseInt(txtcantidad.getText());

    cProducto nuevo = new cProducto(cod, nombre, precio, cantidad);

    tienda.agregar(nuevo);         // Guarda en arreglo
    colaProductos.insertaElemento(nuevo); // También en la cola

    mostrarEnTabla();
    }//GEN-LAST:event_btninsertarActionPerformed

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed
    String nombreBuscado = (String) txtProducto.getText();
    cProducto encontrado = tienda.buscarxNombre(nombreBuscado);

    if (encontrado != null) {
        txtcodigo.setText(String.valueOf(encontrado.getCodpro()));
        txtprecio.setText(String.valueOf(encontrado.getUnipre()));
        txtcantidad.setText(String.valueOf(encontrado.getCantcomp()));
    } else {
        JOptionPane.showMessageDialog(this, "Producto no encontrado.");
    }    }//GEN-LAST:event_btnbuscarActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
    int codigo = Integer.parseInt(txtcodigo.getText());
    tienda.eliminar(codigo);
    mostrarEnTabla();
    }//GEN-LAST:event_btneliminarActionPerformed

    private void btnactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnactualizarActionPerformed
    
    int cod = Integer.parseInt(txtcodigo.getText());
    String nombre = (String) txtProducto.getText();
    double precio = Double.parseDouble(txtprecio.getText());
    int cantidad = Integer.parseInt(txtcantidad.getText());

    cProducto actualizado = tienda.buscarxCod(cod);
    if (actualizado != null) {
        actualizado.setNombre(nombre);
        actualizado.setUnipre(precio);
        actualizado.setCantcomp(cantidad);
        mostrarEnTabla();
    } else {
        JOptionPane.showMessageDialog(this, "Producto no encontrado.");
    }    }//GEN-LAST:event_btnactualizarActionPerformed

    private void txtProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProductoActionPerformed

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
            java.util.logging.Logger.getLogger(VIEWCOLA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VIEWCOLA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VIEWCOLA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VIEWCOLA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VIEWCOLA().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTotal;
    private javax.swing.JButton btnactualizar;
    private javax.swing.JButton btnbuscar;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btninsertar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtProducto;
    private javax.swing.JTextField txtTotal;
    private javax.swing.JTextField txtcantidad;
    private javax.swing.JTextField txtcodigo;
    private javax.swing.JTextField txtprecio;
    // End of variables declaration//GEN-END:variables
}
