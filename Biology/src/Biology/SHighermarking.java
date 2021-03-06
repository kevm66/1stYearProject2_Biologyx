/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Biology;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;

/**
 *
 * @author Laura Nesbitt
 */
public class SHighermarking extends javax.swing.JFrame {

    /**
     * Creates new form Highermarking
     */
    public SHighermarking() {
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

        jLabel1 = new javax.swing.JLabel();
        Backtn = new javax.swing.JButton();
        Marking14btn = new javax.swing.JButton();
        marking12btn = new javax.swing.JButton();
        marking13btn = new javax.swing.JButton();
        marking11btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Higher level Marking");

        Backtn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Backtn.setText("Back");
        Backtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BacktnActionPerformed(evt);
            }
        });

        Marking14btn.setBackground(new java.awt.Color(255, 153, 0));
        Marking14btn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Marking14btn.setText("2014");
        Marking14btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Marking14btnActionPerformed(evt);
            }
        });

        marking12btn.setBackground(new java.awt.Color(255, 153, 0));
        marking12btn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        marking12btn.setText("2012");
        marking12btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marking12btnActionPerformed(evt);
            }
        });

        marking13btn.setBackground(new java.awt.Color(255, 153, 0));
        marking13btn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        marking13btn.setText("2013");
        marking13btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marking13btnActionPerformed(evt);
            }
        });

        marking11btn.setBackground(new java.awt.Color(255, 153, 0));
        marking11btn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        marking11btn.setText("2011");
        marking11btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marking11btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Backtn)
                .addGap(70, 70, 70)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Marking14btn, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 106, Short.MAX_VALUE)
                        .addComponent(marking13btn, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(marking12btn, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(marking11btn, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Backtn))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Marking14btn, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(marking13btn, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(marking12btn, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(marking11btn, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(95, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BacktnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BacktnActionPerformed
        // return to previous section
        SMarking myMarking = new SMarking();
        myMarking.setVisible(true);
        dispose();
    }//GEN-LAST:event_BacktnActionPerformed

    private void Marking14btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Marking14btnActionPerformed
        // opens the 2014 higher marking scheme in default browser 
        try {
            Desktop.getDesktop().browse(new URL("http://examinations.ie/archive/markingschemes/2014/LC025ALP000EV.pdf").toURI());
        } catch (URISyntaxException | IOException e) {
        }

    }//GEN-LAST:event_Marking14btnActionPerformed

    private void marking13btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_marking13btnActionPerformed
        // opens the 2013 higher marking scheme in default browser
        try {
            Desktop.getDesktop().browse(new URL("http://examinations.ie/archive/markingschemes/2013/LC025ALP000EV.pdf").toURI());
        } catch (URISyntaxException | IOException e) {
        }
    }//GEN-LAST:event_marking13btnActionPerformed

    private void marking12btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_marking12btnActionPerformed
        // opens the 2012 higher marking scheme in default browser
        try {
            Desktop.getDesktop().browse(new URL("http://examinations.ie/archive/markingschemes/2012/LC025ALP000EV.pdf").toURI());
        } catch (URISyntaxException | IOException e) {
        }
    }//GEN-LAST:event_marking12btnActionPerformed

    private void marking11btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_marking11btnActionPerformed
        // opens the 2011 higher marking scheme in default browser
        try {
            Desktop.getDesktop().browse(new URL("http://examinations.ie/archive/markingschemes/2011/LC025ALP000EV.pdf").toURI());
        } catch (URISyntaxException | IOException e) {
        }
    }//GEN-LAST:event_marking11btnActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SHighermarking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SHighermarking().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Backtn;
    private javax.swing.JButton Marking14btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton marking11btn;
    private javax.swing.JButton marking12btn;
    private javax.swing.JButton marking13btn;
    // End of variables declaration//GEN-END:variables
}
