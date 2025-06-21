
package com.mycompany.algoproyect.arreglo;

public class VIEW extends javax.swing.JFrame {
    
    
    

    public VIEW() {
        initComponents();
        cProducto a = new cProducto( 1, "a",2,5);
        cProducto g = new cProducto( 2, "ab",2,5);
        cProducto t = new cProducto( 3, "abb",2,5);
        cProducto o = new cProducto( 4, "abbb",2,5);
        
        cTienda b = new cTienda(6);
        
        b.agregar(a);
        b.agregar(g);
        b.agregar(t);
        b.agregar(o);
        cbxproducto.addItem(a.getNombre());
        cbxproducto.addItem(g.getNombre());
        cbxproducto.addItem(t.getNombre());
        cbxproducto.addItem(o.getNombre());
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtcodigo = new javax.swing.JTextField();
        txtprecio = new javax.swing.JTextField();
        txtcant = new javax.swing.JTextField();
        cbxproducto = new javax.swing.JComboBox<>();
        btnInsertar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnup = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(246, 225, 254));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("CODIGO:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(57, 81, 80, 16);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("PRODUCTO:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(57, 121, 80, 16);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("PRECIO:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(57, 162, 80, 16);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("CANTIDAD:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(57, 205, 80, 16);

        txtcodigo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtcodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcodigoActionPerformed(evt);
            }
        });
        jPanel1.add(txtcodigo);
        txtcodigo.setBounds(183, 78, 110, 28);

        txtprecio.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jPanel1.add(txtprecio);
        txtprecio.setBounds(183, 159, 110, 28);

        txtcant.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jPanel1.add(txtcant);
        txtcant.setBounds(183, 202, 110, 28);

        cbxproducto.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cbxproducto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE" }));
        jPanel1.add(cbxproducto);
        cbxproducto.setBounds(183, 118, 110, 26);

        btnInsertar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnInsertar.setText("INSERTAR");
        btnInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarActionPerformed(evt);
            }
        });
        jPanel1.add(btnInsertar);
        btnInsertar.setBounds(370, 120, 130, 28);

        btnEliminar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEliminar.setText("ELIMINAR");
        jPanel1.add(btnEliminar);
        btnEliminar.setBounds(370, 160, 130, 28);

        btnup.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnup.setText("ACTUALIZAR");
        jPanel1.add(btnup);
        btnup.setBounds(370, 200, 130, 28);

        btnBuscar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscar);
        btnBuscar.setBounds(370, 80, 130, 28);

        jTable1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(50, 260, 470, 160);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 574, 477));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtcodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcodigoActionPerformed

    private void btnInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarActionPerformed
        
        int codpro = Integer.parseInt(txtcodigo.getText());
//        String 
//        cProducto producto = new cProducto(codpro,);       
        
        
        
        
    }//GEN-LAST:event_btnInsertarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarActionPerformed

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
            java.util.logging.Logger.getLogger(VIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VIEW().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnInsertar;
    private javax.swing.JButton btnup;
    private javax.swing.JComboBox<String> cbxproducto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtcant;
    private javax.swing.JTextField txtcodigo;
    private javax.swing.JTextField txtprecio;
    // End of variables declaration//GEN-END:variables
}
