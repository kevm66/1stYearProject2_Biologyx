/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Biology;

/**
 *
 * @author Laura Nesbitt
 */
public class SGUI extends javax.swing.JFrame {

    /**
     * Creates new form GUI
     */
    public SGUI() {
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

        studyLabel = new javax.swing.JLabel();
        PapersButton = new javax.swing.JButton();
        NotesButton = new javax.swing.JButton();
        QuizzesButton = new javax.swing.JButton();
        MarkingButton = new javax.swing.JButton();
        backbtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        studyLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        studyLabel.setText("Study of life");

        PapersButton.setBackground(new java.awt.Color(255, 153, 0));
        PapersButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        PapersButton.setText("Papers");
        PapersButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PapersButtonActionPerformed(evt);
            }
        });

        NotesButton.setBackground(new java.awt.Color(255, 153, 0));
        NotesButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        NotesButton.setText("Notes");
        NotesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NotesButtonActionPerformed(evt);
            }
        });

        QuizzesButton.setBackground(new java.awt.Color(255, 153, 0));
        QuizzesButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        QuizzesButton.setText("Quizzes");
        QuizzesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuizzesButtonActionPerformed(evt);
            }
        });

        MarkingButton.setBackground(new java.awt.Color(255, 153, 0));
        MarkingButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        MarkingButton.setText("Marking");
        MarkingButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MarkingButtonActionPerformed(evt);
            }
        });

        backbtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        backbtn.setText("Back");
        backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backbtn)
                .addGap(83, 83, 83)
                .addComponent(studyLabel)
                .addContainerGap(164, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PapersButton, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(NotesButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(MarkingButton, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                    .addComponent(QuizzesButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(50, 50, 50))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(studyLabel)
                    .addComponent(backbtn))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PapersButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(QuizzesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NotesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MarkingButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PapersButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PapersButtonActionPerformed
        // opens the papers section
        SFrame2 frame = new SFrame2();
        frame.setVisible(true);
        dispose();
        // Main Form to show after the Login Form..


    }//GEN-LAST:event_PapersButtonActionPerformed

    private void QuizzesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuizzesButtonActionPerformed
        // Opens the quizzes section

        SQuizzes frame = new SQuizzes();
        frame.setVisible(true); // Main Form to show after the Login Form..

    }//GEN-LAST:event_QuizzesButtonActionPerformed

    private void NotesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NotesButtonActionPerformed
        // opens notes section
        SNotes frame = new SNotes();
        frame.setVisible(true);
    }//GEN-LAST:event_NotesButtonActionPerformed

    private void MarkingButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MarkingButtonActionPerformed
        // Opens the SMarking scheme section
        SMarking frame = new SMarking();
        frame.setVisible(true);
        // Main Form to show after the Login Form..
    }//GEN-LAST:event_MarkingButtonActionPerformed

    private void backbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtnActionPerformed
        // return to the start page 
        MainMenu myMainMenu = new MainMenu();
        myMainMenu.setVisible(true);
        dispose();
    }//GEN-LAST:event_backbtnActionPerformed

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
            java.util.logging.Logger.getLogger(SGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton MarkingButton;
    private javax.swing.JButton NotesButton;
    private javax.swing.JButton PapersButton;
    private javax.swing.JButton QuizzesButton;
    private javax.swing.JButton backbtn;
    private javax.swing.JLabel studyLabel;
    // End of variables declaration//GEN-END:variables

    private static class newframe {

        public newframe() {
        }

        private newframe(SGUI aThis) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private void NewFrame() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
}
