/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TicToePag;

import javax.swing.JOptionPane;

/**
 *
 * @author ExproVic
 */
public class TicToe extends javax.swing.JFrame {

    public int checkWinner(){
   int winner = 0;
 int block=0;
   if(jButton1.getText().equals("X")&&jButton2.getText().equals("X")&&jButton3.getText().equals("X")){
                   JOptionPane.showMessageDialog(this, "Congratulation Player X is WIN");
                   block=1;
   }else if(jButton4.getText().equals("X")&&jButton5.getText().equals("X")&&jButton6.getText().equals("X")){
                   JOptionPane.showMessageDialog(this, "Congratulation Player X is WIN");
                   block=1;
    }else if(jButton7.getText().equals("X")&&jButton8.getText().equals("X")&&jButton9.getText().equals("X")){
                   JOptionPane.showMessageDialog(this, "Congratulation Player X is WIN");
                   block=1;
    }else if(jButton1.getText().equals("X")&&jButton4.getText().equals("X")&&jButton7.getText().equals("X")){
                   JOptionPane.showMessageDialog(this, "Congratulation Player X is WIN");
                   block=1;
    }
   else if(jButton2.getText().equals("X")&&jButton5.getText().equals("X")&&jButton8.getText().equals("X")){
                   JOptionPane.showMessageDialog(this, "Congratulation Player X is WIN");
                   block=1;
    }
   else if(jButton3.getText().equals("X")&&jButton6.getText().equals("X")&&jButton9.getText().equals("X")){
                   JOptionPane.showMessageDialog(this, "Congratulation Player X is WIN");
                   block=1;
    }
   else if(jButton1.getText().equals("X")&&jButton5.getText().equals("X")&&jButton9.getText().equals("X")){
                   JOptionPane.showMessageDialog(this, "Congratulation Player X is WIN");
                   block=1;
    }
   else if(jButton3.getText().equals("X")&&jButton5.getText().equals("X")&&jButton7.getText().equals("X")){
                   JOptionPane.showMessageDialog(this, "Congratulation Player X is WIN");
                   block=1;
    }
   else if (jButton1.getText().equals("O")&&jButton2.getText().equals("O")&&jButton3.getText().equals("O")){
                   JOptionPane.showMessageDialog(this, "Congratulation Player O is WIN");
                   block=1;
   }else if(jButton4.getText().equals("O")&&jButton5.getText().equals("O")&&jButton6.getText().equals("O")){
                   JOptionPane.showMessageDialog(this, "Congratulation Player O is WIN");
                   block=1;
    }else if(jButton7.getText().equals("O")&&jButton8.getText().equals("O")&&jButton9.getText().equals("O")){
                   JOptionPane.showMessageDialog(this, "Congratulation Player O is WIN");
                   block=1;
    }else if(jButton1.getText().equals("O")&&jButton4.getText().equals("O")&&jButton7.getText().equals("O")){
                   JOptionPane.showMessageDialog(this, "Congratulation Player O is WIN");
                   block=1;
    }
   else if(jButton2.getText().equals("O")&&jButton5.getText().equals("O")&&jButton8.getText().equals("O")){
                   JOptionPane.showMessageDialog(this, "Congratulation Player O is WIN");
                   block=1;
    }
   else if(jButton3.getText().equals("O")&&jButton6.getText().equals("O")&&jButton9.getText().equals("O")){
                   JOptionPane.showMessageDialog(this, "Congratulation Player O is WIN");
                   block=1;
    }
   else if(jButton1.getText().equals("O")&&jButton5.getText().equals("O")&&jButton9.getText().equals("O")){
                   JOptionPane.showMessageDialog(this, "Congratulation Player O is WIN");
                   block=1;
    }
   else if(jButton3.getText().equals("O")&&jButton5.getText().equals("O")&&jButton7.getText().equals("O")){
                   JOptionPane.showMessageDialog(this, "Congratulation Player O is WIN");
                   block=1;
    }
   if (!jButton1.getText().isEmpty()&&
           !jButton2.getText().isEmpty()&&
           !jButton3.getText().isEmpty()&&
           !jButton4.getText().isEmpty()&&
           !jButton5.getText().isEmpty()&&
           !jButton6.getText().isEmpty()&&
           !jButton7.getText().isEmpty()&&
           !jButton8.getText().isEmpty()&&
           !jButton9.getText().isEmpty()){JOptionPane.showMessageDialog(this, "Draw try again");
                            block=1;
}
   
   if(block==1){
       jButton1.setEnabled(false);
       jButton2.setEnabled(false);
       jButton3.setEnabled(false);
       jButton4.setEnabled(false);
       jButton5.setEnabled(false);
       jButton6.setEnabled(false);
       jButton7.setEnabled(false);
       jButton8.setEnabled(false);
       jButton9.setEnabled(false);
       jTextField2.setEnabled(false);
   }
   if(cout==1){
            jTextField2.setText("the X player's move");       
        }else if(cout==0){
            jTextField2.setText("the O player's move"); 
        }
             
             
   
    return winner;
    };
    public TicToe() {
        initComponents();
        jTextField1.setEditable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        btnReset = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText(" Tic-Tac-Toe ");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        btnReset.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jButton6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(56, 56, 56)
                        .addComponent(btnReset)))
                .addGap(0, 295, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                    .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReset))
                .addGap(67, 67, 67))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    int cout=1;
    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
         if(jButton5.getText().equals("")){
             if(cout==1){
        jButton5.setText("X");
        cout=0;
        }   else{
           jButton5.setText("O");
            cout=1;}
        }else{
            JOptionPane.showMessageDialog(this, "This field is already taken! Please choose another", "Error", JOptionPane.ERROR_MESSAGE);
        }
         checkWinner();

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
          if(jButton8.getText().equals("")){
             if(cout==1){
        jButton8.setText("X");
        cout=0;
        }   else{
           jButton8.setText("O");
            cout=1;}
        }else{
            JOptionPane.showMessageDialog(this, "This field is already taken! Please choose another", "Error", JOptionPane.ERROR_MESSAGE);
        }
          checkWinner();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
          if(jButton9.getText().equals("")){
             if(cout==1){
        jButton9.setText("X");
        cout=0;
        }   else{
           jButton9.setText("O");
            cout=1;}
        }else{
            JOptionPane.showMessageDialog(this, "This field is already taken! Please choose another", "Error", JOptionPane.ERROR_MESSAGE);
        }
          checkWinner();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        if(jButton6.getText().equals("")){
             if(cout==1){
        jButton6.setText("X");
        cout=0;
        }   else{
           jButton6.setText("O");
            cout=1;}
        }else{
            JOptionPane.showMessageDialog(this, "This field is already taken! Please choose another", "Error", JOptionPane.ERROR_MESSAGE);
        }
        checkWinner();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
          if(jButton1.getText().equals("")){
             if(cout==1){
        jButton1.setText("X");
        cout=0;
        }   else{
           jButton1.setText("O");
            cout=1;}
        }else{
            JOptionPane.showMessageDialog(this, "This field is already taken! Please choose another", "Error", JOptionPane.ERROR_MESSAGE);
        }
          checkWinner();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
          if(jButton2.getText().equals("")){
             if(cout==1){
        jButton2.setText("X");
        cout=0;
        }   else{
           jButton2.setText("O");
            cout=1;}
        }else{
            JOptionPane.showMessageDialog(this, "This field is already taken! Please choose another", "Error", JOptionPane.ERROR_MESSAGE);
        }
          checkWinner();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
          if(jButton3.getText().equals("")){
             if(cout==1){
        jButton3.setText("X");
        cout=0;
        }   else{
           jButton3.setText("O");
            cout=1;}
        }else{
            JOptionPane.showMessageDialog(this, "This field is already taken! Please choose another", "Error", JOptionPane.ERROR_MESSAGE);
        }
          checkWinner();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
          if(jButton4.getText().equals("")){
             if(cout==1){
        jButton4.setText("X");
        cout=0;
        }   else{
           jButton4.setText("O");
            cout=1;}
        }else{
            JOptionPane.showMessageDialog(this, "This field is already taken! Please choose another", "Error", JOptionPane.ERROR_MESSAGE);
        }
          checkWinner();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
         // TODO add your handling code here:
           if(jButton7.getText().equals("")){
             if(cout==1){
        jButton7.setText("X");
        cout=0;
        }   else{
           jButton7.setText("O");
            cout=1;}
        }else{
            JOptionPane.showMessageDialog(this, "This field is already taken! Please choose another", "Error", JOptionPane.ERROR_MESSAGE);
        }
           checkWinner();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
        
        

    }//GEN-LAST:event_jTextField2ActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
       jButton1.setEnabled(true);
       jButton2.setEnabled(true);
       jButton3.setEnabled(true);
       jButton4.setEnabled(true);
       jButton5.setEnabled(true);
       jButton6.setEnabled(true);
       jButton7.setEnabled(true);
       jButton8.setEnabled(true);
       jButton9.setEnabled(true);
       jTextField2.setEnabled(true);
       jButton1.setText("");
       jButton2.setText("");
       jButton3.setText("");
       jButton4.setText("");
       jButton5.setText("");
       jButton6.setText("");
       jButton7.setText("");
       jButton8.setText("");
       jButton9.setText("");
       jTextField2.setText("");
       
        
    }//GEN-LAST:event_btnResetActionPerformed

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
            java.util.logging.Logger.getLogger(TicToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TicToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TicToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TicToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TicToe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReset;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
