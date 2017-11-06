/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Biology;

import java.io.File;

/**
 *
 * @author karry
 */
public class OOrgPapers extends javax.swing.JFrame {

    /**
     * Creates new form OrganismPapers
     */
    public OOrgPapers() {
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

        textlabel = new javax.swing.JLabel();
        hlBtn = new javax.swing.JButton();
        olBtn = new javax.swing.JButton();
        bckBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        textlabel.setBackground(new java.awt.Color(255, 255, 255));
        textlabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        textlabel.setText("     Papers");
        textlabel.setOpaque(true);

        hlBtn.setBackground(new java.awt.Color(102, 204, 0));
        hlBtn.setText("Higher Level");
        hlBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hlBtnActionPerformed(evt);
            }
        });

        olBtn.setBackground(new java.awt.Color(102, 204, 0));
        olBtn.setText("Ordinary Level");
        olBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                olBtnActionPerformed(evt);
            }
        });

        bckBtn.setText("Back");
        bckBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bckBtnActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(21, Short.MAX_VALUE)
                        .addComponent(hlBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(olBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bckBtn)
                        .addGap(27, 27, 27)
                        .addComponent(textlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bckBtn))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hlBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(olBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void hlBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hlBtnActionPerformed
        // TODO add your handling code here:

        /* try {
 
         if ((new File("..\\mainapp\\HLC.pdf")).exists()) {
 
         Process p = Runtime
         .getRuntime()
         .exec("rundll32 url.dll,FileProtocolHandler ..\\mainapp\\HLC.pdf");
         p.waitFor();
 
         } else {
 
         System.out.println("FILE is not exists");
 
         }
 
         System.out.println("Done");
 
         } catch (Exception ex) {
         ex.printStackTrace();
         }
 
         */
        jTextArea1.setText("Section A. Answer any five questions .Write your answers in the spaces provided  \n"
                + "\n 1. Answer any five of the following.\n"
                + "(a) State a function of the cell membrane ………………………………………………………… \n"
                + "(b) State one feature that would allow you to identify an eukaryotic cell"
                + "…………………………………………………………………………………….…………… \n"
                + "(c) Name a human cell that is haploid …………………………………………………………… \n "
                + "(d) What term is used to describe a cellular reaction in which large molecules are broken down\n"
                + "to smaller ones? ………………………………………………………………………………..\n"
                + "(e) What term is used to describe an individual’s genetic make up? …………………………… \n"
                + "(f) Name a scientist responsible for the Theory of Natural Selection\n"
                + "…………………………………………….……………………………………………………\n "
                + "2.State two features of the artery that can be seen in the diagram which allowed you to identify it.\n"
                + "1 …………………………………………………………………………………………………\n"
                + "2 …………………………………………………………………………………………………\n"
                + "Name two tissues that are present in the walls of arteries and veins and give a function of each of \n"
                + "these tissues.\n"
                + "Tissue ………………………….….. Function …………………………………\n"
                + "Tissue ………….………………….. Function …………………………………\n"
                + "Veins contain valves whereas arteries do not. What is the function of the valves?"
                + "…………..…….……………………………………………………………………………………\n"
                + "3. Answer the following in relation to the scientific method.\n"
                + "What is an hypothesis? ………………………..………………… …………………………\n"
                + ".….……………………………..…………………………………………………………………\n"
                + "What might an hypothesis develop into? ……………………………………………………\n"
                + "Why is a control important in an experiment? ……………………………………………n"
                + "……………………………………………………………………………………………………\n"
                + "Give an example of a control in a named experiment. …………………………………………\n"
                + "……………………………………………………………………………………………………\n"
                + "State two ways in which the results of an experiment may be presented.\n"
                + "1 ………………………………………………………………………………………………\n"
                + "2 …………………………\n"
                + "4(a) To which group of molecules do enzymes belong?……………………………………………\n"
                + "What is a denatured enzyme? ………………………………………………………………\n"
                + "(b) Answer the following by reference to an experiment that you carried out to investigate the\n"
                + "effect of pH on the rate of enzyme action.\n"
                + "Name the enzyme and substrate that you used.\n"
                + "…………………………………………………………………………………………………\n"
                + "Draw a labelled diagram of the apparatus that you used.\n"
                + "Explain how you varied the pH. ………………………………………………………………\n"
                + "………..………………………………………………………………………………………\n"
                + "State one factor that you kept constant in this experiment. …………………………………"
                + "……….…………………………………………………………………………………………\n"
                + "How did you ensure that this factor was kept constant? ………………………………………"
                + "………………………………………………………………………………………… \n"
                + "State one way in which yeast is beneficial to humans. ………………………………………\n"
                + "5. Answer the following by reference to an experiment that you have carried out to investigate"
                + "the growth of leaf yeast.\n"
                + "Name the nutrient medium on which you grew the yeast……………………………………\n"
                + "Why was a nutrient medium necessary? …………………………………….………………\n"
                + "……………..…………………………………………………………………………………\n"
                + "From what plant did you obtain the yeast. ……………………………………………\n"
                + "Describe how you transferred the yeast to the nutrient mediumn\n"
                + "…………………………………………………………………………………….……………\n"
                + "………………………………………………………………………………………………….\n"
                + "…………………………………………………………………………………………………."
                + "………………………………………………………………………………………………….\n"
                + "Outline the procedures that you followed after you transferred the yeast to the nutrientn"
                + "medium."
                + "………………………………………………………………………………………………….\n"
                + "…………………………………………………………………………………………………\n."
                + "………………………………………………………………………………………………….\n "
                + "    10. (a) (i) The same elements are found in carbohydrates and fats. Name these elements.\n"
                + "(ii) State one way in which carbohydrates differ from fats.\n"
                + "(iii) How do phospholipids differ from other lipids? (9)\n"
                + "(b) Carbohydrates are classified as monosaccharides, disaccharides and polysaccharides.\n"
                + "(i) Name a monosaccharide and state a role for it in living organisms.\n"
                + "(ii) What is a disaccharide?\n"
                + "(iii) Cellulose is a polysaccharide. What is it formed from? State a role for cellulose in\n"
                + "living organisms."
                + "(iv) Name a polysaccharide that has a different role to cellulose. What is the role of the\n"
                + "polysaccharide that you have named?\n"
                + "(v) Describe a test for a named polysaccharide. (27)\n"
                + "(c) Answer the following in relation to a test for\n"
                + " 1. a reducing sugar 2. a protein.\n"
                + "(i) Name the reagent(s) used.\n"
                + "(ii) State the initial colour of the reagent.\n"
                + "(iii) State whether the test requires heat.\n"
                + "(iv) What colour indicates a positive result? (24)\n"
                + ". 11. (a) (i) What is meant by the term segregation as used in genetics?\n"
                + " (ii) State the products of segregation when an organism is heterozygous in respect of the\n"
                + "dominant allele A. (9)\n"
                + "(b) (i) State the Law of Independent Assortment.\n"
                + " (ii) In cattle the allele for red coat (R) is dominant to the allele for black coat (r) and the\n"
                + "allele for straight coat (S) is dominant to the allele for curly coat (s). When a bull\n"
                + "with a red, straight coat was mated with cows with curly, black coats it was found\n"
                + "that calves with four different phenotypes resulted. These four phenotypes occurred\n"
                + "in equal numbers.\n"
                + "1. State the genotypes of the bull and of the cows.\n"
                + "2. State the phenotypes of the calves.\n"
                + "3. Which phenotypes of the calves suggest that independent assortment has taken"
                + " place?\n"
                + "4. Would you expect different phenotypes if the genes for coat colour and coat"
                + "type were located on the same chromosome? Explain your answer."
                + "(27)\n"
                + " (c) Answer the following in relation to protein synthesis.\n"
                + "(i) Outline the main events of transcription.\n"
                + "(ii) What is a triplet? State the role of a triplet.\n"
                + "(iii) Describe the role of tRNA. (24)\n"
                + "12. (a) (i) Write a balanced equation to summarise the process of photosynthesis.\n"
                + "(ii) Name the organelle (component) of the cell in which photosynthesis takes place."
                + "(9)\n"
                + "(b) Two stages are recognised in photosynthesis, the light stage and the dark stage.\n"
                + "(i) Give a brief explanation of the division of photosynthesis into these two stages.\n"
                + "(ii) What do the letters ATP stand for? In which of the stages of photosynthesis does"
                + "ATP form?\n"
                + "(iii) Energised electrons play a central role in ATP formation during photosynthesis."
                + "What is an energised electron?\n"
                + "(iv) Explain the part played by NADP-"
                + "in photosynthesis.\n"
                + "(v) In which stage of photosynthesis does carbon dioxide provide carbon for"
                + "carbohydrate formation? (27)");


    }//GEN-LAST:event_hlBtnActionPerformed

    private void olBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_olBtnActionPerformed
        // TODO add your handling code here:
      /*  try {
 
         if ((new File("..\\mainapp\\OLC.pdf")).exists()) {
 
         Process p = Runtime
         .getRuntime()
         .exec("rundll32 url.dll,FileProtocolHandler ..\\mainapp\\OLC.pdf");
         p.waitFor();
 
         } else {
 
         System.out.println("FILE is not exists");
 
         }
 
         System.out.println("Done");
 
         } catch (Exception ex) {
         ex.printStackTrace();
         }*/
        jTextArea1.setText("Q1:(a) The living world may be divided into five kingdoms: Monera; Protista; Fungi; Plantae; Animalia.\n"
                + " In the case of each of the following pairs of kingdoms give any structural feature of members of the\n"
                + " first-named kingdom not found in members of the second kingdom.\n"
                + " (i) Fungi and Animalia. ___________________________________________________________\n"
                + " (ii) Plantae and Fungi. ____________________________________________________________\n"
                + " (iii) Animalia and Monera. _________________________________________________________\n"
                + " (iv) Protista and Animalia. _________________________________________________________\n"
                + " (b) In each of the following cases, name an organism that fits the description.\n"
                + " (i) A multicellular fungus. _________________________________________________________\n"
                + " (ii) A member of the Protista that catches and consumes smaller organisms.\n"
                + " ____________________________________________________________________________\n"
                + " (iii) A harmful member of the Monera. ________________________________________________ \n"
                + "\n"
                + "\n"
                + "Q2:(a)(i) To which kingdom do yeasts belong? …………………………………………………………\n"
                + "(ii)State one way in which yeast is beneficial to humans. ……………………………………….\n"
                + "(b)(i) Answer the following by reference to an experiment that you have carried out to investigate\n"
                + "the growth of leaf yeast.\n"
                + " Name the nutrient medium on which you grew the yeast……………………………………..\n"
                + " (ii)Why was a nutrient medium necessary? …………………………………….………………..\n"
                + " ……………..…………………………………………………………………………………..\n"
                + "(iii)From what plant did you obtain the yeast. ……………………………………………..\n"
                + "(iv)Describe how you transferred the yeast to the nutrient medium\n"
                + "…………………………………………………………………………………….……………\n"
                + "………………………………………………………………………………………………….\n"
                + "………………………………………………………………………………………………….\n"
                + "………………………………………………………………………………………………….\n"
                + "(v)Outline the procedures that you followed after you transferred the yeast to the nutrient\n"
                + "medium.\n "
                + "Q3:(a) (i) Name the structures found in stems, equivalent to stomata in leaves,"
                + " which are involved in gaseous exchange in plants.\n"
                + "(ii) Name two compounds that leave the plant through the structures referred to in part (i). (9marks)\n"
                + "(b) (i) Draw a large labelled diagram of the human breathing tract.\n"
                + "(ii) Outline the details of the process of inhalation. (27marks)\n"
                + "(c) Answer the following questions in relation to carbon dioxide.\n"
                + "(i) Name a structure found in cells in which carbon dioxide is produced.\n"
                + "(ii) Give a feature of a capillary which allows the rapid uptake of carbon dioxide.\n"
                + "(iii) Carbon dioxide levels are usually higher in venous blood than in arterial blood.\n"
                + "Why is this the case?\n"
                + "(iv) Name a blood vessel which is an exception to the situation outlined in (iii) above.\n"
                + "Give a reason for the exception.\n"
                + "(v) Briefly outline the role of carbon dioxide in the control of the human breathing rate. (24marks)");


    }//GEN-LAST:event_olBtnActionPerformed

    private void bckBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bckBtnActionPerformed
        // TODO add your handling code here:
        OGUI myOGUI = new OGUI();
        myOGUI.setVisible(true);
        dispose();
    }//GEN-LAST:event_bckBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bckBtn;
    private javax.swing.JButton hlBtn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton olBtn;
    private javax.swing.JLabel textlabel;
    // End of variables declaration//GEN-END:variables

}
