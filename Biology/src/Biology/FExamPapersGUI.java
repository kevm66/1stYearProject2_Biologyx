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
 * @author x13481152
 */
public class FExamPapersGUI extends javax.swing.JFrame {

    /**
     * Creates new form exampapersGUI
     */
    public FExamPapersGUI() {
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
        exampapersreturnbutton = new javax.swing.JButton();
        exampaper2014button = new javax.swing.JButton();
        exampaper2011button = new javax.swing.JButton();
        exampaper2010button = new javax.swing.JButton();
        exampaper2013button = new javax.swing.JButton();
        exampaper2009button = new javax.swing.JButton();
        exampaper2012button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Exam Papers");

        exampapersreturnbutton.setText("Back");
        exampapersreturnbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exampapersreturnbuttonActionPerformed(evt);
            }
        });

        exampaper2014button.setBackground(new java.awt.Color(51, 153, 255));
        exampaper2014button.setText("2014");
        exampaper2014button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exampaper2014buttonActionPerformed(evt);
            }
        });

        exampaper2011button.setBackground(new java.awt.Color(51, 153, 255));
        exampaper2011button.setText("2011");
        exampaper2011button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exampaper2011buttonActionPerformed(evt);
            }
        });

        exampaper2010button.setBackground(new java.awt.Color(51, 153, 255));
        exampaper2010button.setText("2010");
        exampaper2010button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exampaper2010buttonActionPerformed(evt);
            }
        });

        exampaper2013button.setBackground(new java.awt.Color(51, 153, 255));
        exampaper2013button.setText("2013");
        exampaper2013button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exampaper2013buttonActionPerformed(evt);
            }
        });

        exampaper2009button.setBackground(new java.awt.Color(51, 153, 255));
        exampaper2009button.setText("2009");
        exampaper2009button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exampaper2009buttonActionPerformed(evt);
            }
        });

        exampaper2012button.setBackground(new java.awt.Color(51, 153, 255));
        exampaper2012button.setText("2012");
        exampaper2012button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exampaper2012buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(70, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(exampapersreturnbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(206, 206, 206))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(exampaper2011button, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                            .addComponent(exampaper2014button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(exampaper2010button, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(exampaper2013button, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(exampaper2009button, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(exampaper2012button, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(78, 78, 78))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(exampapersreturnbutton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(exampaper2012button, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(exampaper2009button, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(exampaper2014button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(exampaper2013button, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(exampaper2010button, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(exampaper2011button, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(91, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//declare buttons
    //2014 exam papers button
    private void exampaper2014buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exampaper2014buttonActionPerformed
        try 
        {
            Desktop.getDesktop().browse(new URL("http://www.examinations.ie/archive/exampapers/2014/LC025ALP000EV.pdf").toURI());
        }           
        catch (URISyntaxException | IOException e) {
        }
    

    }//GEN-LAST:event_exampaper2014buttonActionPerformed
    //return button
    private void exampapersreturnbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exampapersreturnbuttonActionPerformed

        FfieldstudyGUI fs = new FfieldstudyGUI();
        fs.setVisible(true);      
        dispose();// TODO add your handling code here:
    }//GEN-LAST:event_exampapersreturnbuttonActionPerformed
    
    //2011 exam papers button
    private void exampaper2011buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exampaper2011buttonActionPerformed
 try 
        {
            Desktop.getDesktop().browse(new URL("http://www.examinations.ie/archive/exampapers/2011/LC025ALP000EV.pdf").toURI());
        }           
        catch (URISyntaxException | IOException e) {
        }        // TODO add your handling code here:
    }//GEN-LAST:event_exampaper2011buttonActionPerformed

     //2010 exam papers button  
    private void exampaper2010buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exampaper2010buttonActionPerformed
 try 
        {
            Desktop.getDesktop().browse(new URL("http://www.examinations.ie/archive/exampapers/2010/LC025ALP000EV.pdf").toURI());
        }           
        catch (URISyntaxException | IOException e) {
        }        // TODO add your handling code here:
    }//GEN-LAST:event_exampaper2010buttonActionPerformed
    //2013 exam papers button
    private void exampaper2013buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exampaper2013buttonActionPerformed
 try 
        {
            Desktop.getDesktop().browse(new URL("http://www.examinations.ie/archive/exampapers/2013/LC025ALP000EV.pdf").toURI());
        }           
        catch (URISyntaxException | IOException e) {
        }        // TODO add your handling code here:
    }//GEN-LAST:event_exampaper2013buttonActionPerformed
    
    //2009 exam papers button
    private void exampaper2009buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exampaper2009buttonActionPerformed
 try 
        {
            Desktop.getDesktop().browse(new URL("http://www.examinations.ie/archive/exampapers/2009/LC025ALP000EV.pdf").toURI());
        }           
        catch (URISyntaxException | IOException e) {
        }        // TODO add your handling code here:
    }//GEN-LAST:event_exampaper2009buttonActionPerformed
    
    //2012 exam papers button
    private void exampaper2012buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exampaper2012buttonActionPerformed
 try 
        {
            Desktop.getDesktop().browse(new URL("http://www.examinations.ie/archive/exampapers/2012/LC025ALP000EV.pdf").toURI());
        }           
        catch (URISyntaxException | IOException e) {
        }        // TODO add your handling code here:
    }//GEN-LAST:event_exampaper2012buttonActionPerformed

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
            java.util.logging.Logger.getLogger(FExamPapersGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FExamPapersGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FExamPapersGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FExamPapersGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exampaper2009button;
    private javax.swing.JButton exampaper2010button;
    private javax.swing.JButton exampaper2011button;
    private javax.swing.JButton exampaper2012button;
    private javax.swing.JButton exampaper2013button;
    private javax.swing.JButton exampaper2014button;
    private javax.swing.JButton exampapersreturnbutton;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
