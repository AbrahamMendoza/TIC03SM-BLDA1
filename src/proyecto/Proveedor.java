/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.awt.GraphicsConfiguration;
import javax.swing.DefaultListModel;
import javax.swing.JList;

/**
 *
 * @author Daniel
 */
public class Proveedor extends javax.swing.JFrame {
    
    public Proveedor() {
        
        
        initComponents();
        
        bloquear();
        limpiar();
        
    }
void limpiar(){
txtcodproducto.setText("");
txtnomproducto.setText("");
txtnumproducto.setText("");
txtprecproducto.setText("");
txtprectotal.setText("");
}
void bloquear(){
txtcodproducto.setEnabled(false);
txtnomproducto.setEnabled(false);
txtnumproducto.setEnabled(false);
txtprecproducto.setEnabled(false);
txtprectotal.setEnabled(false);
jButton2.setEnabled(true);
jButton3.setEnabled(false);

}
void desbloquear(){
txtcodproducto.setEnabled(true);
txtnomproducto.setEnabled(true);
txtnumproducto.setEnabled(true);
txtprecproducto.setEnabled(true);
txtprectotal.setEnabled(true);
jButton2.setEnabled(false);
jButton3.setEnabled(true);
}
void habilitar(){
      txtcodproducto.setEnabled(true);
      txtnomproducto.setEnabled(true);
      txtnumproducto.setEnabled(true);
      txtprecproducto.setEnabled(true);
      txtprectotal.setEnabled(true);
}
void deshabilitar(){
      txtcodproducto.setEnabled(false);
      txtnomproducto.setEnabled(false);
      txtnumproducto.setEnabled(false);
      txtprecproducto.setEnabled(false);
      txtprectotal.setEnabled(false);
}

private DefaultListModel modelList(){
DefaultListModel<String> model =new DefaultListModel<>();
model.addElement("Alumno 1");
model.addElement("Alumno 2");
model.addElement("Alumno 3");


return model;

    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtnumproducto = new javax.swing.JTextField();
        txtcodproducto = new javax.swing.JTextField();
        txtprecproducto = new javax.swing.JTextField();
        txtprectotal = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtnomproducto = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("Menu Principal");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 320, -1, -1));

        jLabel3.setText("Numero de producto adquiridos:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        jLabel1.setText("codigo del producto:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 120, 20));

        jLabel5.setText("Precio:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        jLabel4.setText("Productos:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 70, -1, -1));

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 90, 70, -1));

        jButton2.setText("Nuevo");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, -1, -1));

        jLabel6.setText("precio total de los productos:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 240, -1, -1));
        jPanel1.add(txtnumproducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, 120, -1));
        jPanel1.add(txtcodproducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 110, -1));
        jPanel1.add(txtprecproducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 110, -1));

        txtprectotal.setForeground(new java.awt.Color(255, 255, 255));
        txtprectotal.setBorder(null);
        jPanel1.add(txtprectotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 240, 70, -1));

        jLabel7.setText("Nmobre del Producto:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        txtnomproducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnomproductoActionPerformed(evt);
            }
        });
        jPanel1.add(txtnomproducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 170, -1));

        jButton3.setText("Pedir Producto");
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 320, -1, -1));

        jButton4.setText("Añadir");
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, -1, 30));

        jButton5.setText("Eliminar");
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, -1, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 566, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 372, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Principal obj=new Principal();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        txtcodproducto.setText("");
txtnomproducto.setText("");
txtnumproducto.setText("");
txtprecproducto.setText("");
txtprectotal.setText("");
desbloquear();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtnomproductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnomproductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnomproductoActionPerformed

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
            java.util.logging.Logger.getLogger(Proveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Proveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Proveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Proveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Proveedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtcodproducto;
    private javax.swing.JTextField txtnomproducto;
    private javax.swing.JTextField txtnumproducto;
    private javax.swing.JTextField txtprecproducto;
    private javax.swing.JTextField txtprectotal;
    // End of variables declaration//GEN-END:variables
}
