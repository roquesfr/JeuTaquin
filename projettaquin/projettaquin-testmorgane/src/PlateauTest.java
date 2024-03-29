
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JButton;

/**
 *
 * @author David, Fred et Morgane la team Licorne
 */

public class PlateauTest extends javax.swing.JFrame {

    /**
     * Creates new form Plateau
     */
    ArrayList<String> labels = new ArrayList<>();
    JButton[] buttons = new JButton[9];

    
    public PlateauTest() {
        
        initComponents();
        jButton9.setVisible(false);
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
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridLayout(3, 3));

        jButton1.setBackground(new java.awt.Color(200, 200, 200));
        jButton1.setForeground(new java.awt.Color(0, 0, 222));
        jButton1.setText("1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);

        jButton2.setBackground(new java.awt.Color(200, 200, 200));
        jButton2.setForeground(new java.awt.Color(0, 0, 222));
        jButton2.setText("2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);

        jButton3.setBackground(new java.awt.Color(200, 200, 200));
        jButton3.setForeground(new java.awt.Color(0, 0, 222));
        jButton3.setText("3");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);

        jButton4.setBackground(new java.awt.Color(200, 200, 200));
        jButton4.setForeground(new java.awt.Color(0, 0, 222));
        jButton4.setText("4");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);

        jButton5.setBackground(new java.awt.Color(200, 200, 200));
        jButton5.setForeground(new java.awt.Color(0, 0, 222));
        jButton5.setText("5");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);

        jButton6.setBackground(new java.awt.Color(200, 200, 200));
        jButton6.setForeground(new java.awt.Color(0, 0, 222));
        jButton6.setText("6");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);

        jButton7.setBackground(new java.awt.Color(200, 200, 200));
        jButton7.setForeground(new java.awt.Color(0, 0, 222));
        jButton7.setText("7");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7);

        jButton8.setBackground(new java.awt.Color(200, 200, 200));
        jButton8.setForeground(new java.awt.Color(0, 0, 222));
        jButton8.setText("8");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8);

        jButton9.setBackground(new java.awt.Color(200, 200, 200));
        jButton9.setForeground(new java.awt.Color(0, 0, 222));
        jButton9.setText("invisible");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
/*
    if (!jButtonB.isVisible()) {

            jButtonA.setVisible(false);
            jButtonB.setVisible(true);
            jButtonB.setText(jButtonA.getLabel());
        }

        else if (!jButtonC.isVisible()) {
            jButtonA.setVisible(false);
            jButtonC.setVisible(true);
            jButtonC.setText(jButtonA.getLabel());
        }
    
    
    if (!jButton2.isVisible()) {

            jButton5.setVisible(false);
            jButton2.setVisible(true);
            jButton2.setText(jButton5.getLabel());
        }

        else if (!jButton8.isVisible()) {

            jButton5.setVisible(false);
            jButton8.setVisible(true);
            jButton8.setText(jButton5.getLabel());
        }

        else if (!jButton4.isVisible()) {

            jButton5.setVisible(false);
            jButton4.setVisible(true);
            jButton4.setText(jButton5.getLabel());
        }

        else if (!jButton6.isVisible()) {

            jButton5.setVisible(false);
            jButton6.setVisible(true);
            jButton6.setText(jButton5.getLabel());
        }
    
    */
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (!jButton2.isVisible()) {

            jButton1.setVisible(false);
            jButton2.setVisible(true);
            jButton2.setText(jButton1.getLabel());
        }

        else if (!jButton4.isVisible()) {
            jButton1.setVisible(false);
            jButton4.setVisible(true);
            jButton4.setText(jButton1.getLabel());
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (!jButton2.isVisible()) {

            jButton3.setVisible(false);
            jButton2.setVisible(true);
            jButton2.setText(jButton3.getLabel());
        }

        else if (!jButton6.isVisible()) {

            jButton3.setVisible(false);
            jButton6.setVisible(true);
            jButton6.setText(jButton3.getLabel());
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if (!jButton1.isVisible()) {

            jButton4.setVisible(false);
            jButton1.setVisible(true);
            jButton1.setText(jButton4.getLabel());
        }

        else if (!jButton7.isVisible()) {

            jButton4.setVisible(false);
            jButton7.setVisible(true);
            jButton7.setText(jButton4.getLabel());
        }

        else if (!jButton5.isVisible()) {

            jButton4.setVisible(false);
            jButton5.setVisible(true);
            jButton5.setText(jButton4.getLabel());
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (!jButton1.isVisible()) {

            jButton2.setVisible(false);
            jButton1.setVisible(true);
            jButton1.setText(jButton2.getLabel());
        }

        else if (!jButton3.isVisible()) {

            jButton2.setVisible(false);
            jButton3.setVisible(true);
            jButton3.setText(jButton2.getLabel());
        }

        else if (!jButton5.isVisible()) {

            jButton2.setVisible(false);
            jButton5.setVisible(true);
            jButton5.setText(jButton2.getLabel());
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        if (!jButton2.isVisible()) {

            jButton5.setVisible(false);
            jButton2.setVisible(true);
            jButton2.setText(jButton5.getLabel());
        }

        else if (!jButton8.isVisible()) {

            jButton5.setVisible(false);
            jButton8.setVisible(true);
            jButton8.setText(jButton5.getLabel());
        }

        else if (!jButton4.isVisible()) {

            jButton5.setVisible(false);
            jButton4.setVisible(true);
            jButton4.setText(jButton5.getLabel());
        }

        else if (!jButton6.isVisible()) {

            jButton5.setVisible(false);
            jButton6.setVisible(true);
            jButton6.setText(jButton5.getLabel());
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
       if (!jButton9.isVisible()) {

            jButton8.setVisible(false);
            jButton9.setVisible(true);
            jButton9.setText(jButton8.getLabel());
        }

        else if (!jButton7.isVisible()) {

            jButton8.setVisible(false);
            jButton7.setVisible(true);
            jButton7.setText(jButton8.getLabel());
        }

        else if (!jButton5.isVisible()) {

            jButton8.setVisible(false);
            jButton5.setVisible(true);
            jButton5.setText(jButton8.getLabel());
        }

    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        if (!jButton3.isVisible()) {

            jButton6.setVisible(false);
            jButton3.setVisible(true);
            jButton3.setText(jButton6.getLabel());
        }

        else if (!jButton9.isVisible()) {

            jButton6.setVisible(false);
            jButton9.setVisible(true);
            jButton9.setText(jButton6.getLabel());
        }

        else if (!jButton5.isVisible()) {

            jButton6.setVisible(false);
            jButton5.setVisible(true);
            jButton5.setText(jButton6.getLabel());
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        if (!jButton4.isVisible()) {

            jButton7.setVisible(false);
            jButton4.setVisible(true);
            jButton4.setText(jButton7.getLabel());
        }

        else if (!jButton8.isVisible()) {

            jButton7.setVisible(false);
            jButton8.setVisible(true);
            jButton8.setText(jButton7.getLabel());
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        if (!jButton8.isVisible()) {

            jButton9.setVisible(false);
            jButton8.setVisible(true);
            jButton8.setText(jButton9.getLabel());
        }

        else if (!jButton6.isVisible()) {

            jButton9.setVisible(false);
            jButton6.setVisible(true);
            jButton6.setText(jButton9.getLabel());
        }
    }//GEN-LAST:event_jButton9ActionPerformed
    
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
            java.util.logging.Logger.getLogger(PlateauTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PlateauTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PlateauTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PlateauTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PlateauTest().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
