import java.util.AbstractCollection;

public class AdminGUI extends javax.swing.JFrame {

   String input;
   String input2;
   public AdminGUI() {
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

      createUser = new javax.swing.JButton();
      createGroup = new javax.swing.JButton();
      addTextField = new javax.swing.JTextField();
      groupTextField = new javax.swing.JTextField();
      userViewButton = new javax.swing.JButton();
      userTotalButton = new javax.swing.JButton();
      groupTotalButton = new javax.swing.JButton();
      messageTotalButton = new javax.swing.JButton();
      percentageButton = new javax.swing.JButton();
      jScrollPane2 = new javax.swing.JScrollPane();
      list2 = new java.awt.List();

      setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

      createUser.setText("Add User");
      createUser.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            createUserActionPerformed(evt);
         }
      });

      createGroup.setText("Add Group");

      addTextField.setText("jTextField1");

      groupTextField.setText("jTextField2");

      userViewButton.setText("Open User View");
      userViewButton.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            userViewButtonActionPerformed(evt);
         }
      });

      userTotalButton.setText("Show User Total");
      userTotalButton.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            userTotalButtonActionPerformed(evt);
         }
      });

      groupTotalButton.setText("Show Group Total");
      groupTotalButton.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            groupTotalButtonActionPerformed(evt);
         }
      });

      messageTotalButton.setText("Show Message Total");
      messageTotalButton.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            messageTotalButtonActionPerformed(evt);
         }
      });

      percentageButton.setText("Show Positive %");
      percentageButton.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            percentageButtonActionPerformed(evt);
         }
      });

      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
      getContentPane().setLayout(layout);
      layout.setHorizontalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                  .addComponent(userViewButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                  .addGroup(layout.createSequentialGroup()
                     .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(userTotalButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(messageTotalButton, javax.swing.GroupLayout.Alignment.TRAILING))
                     .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                     .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(percentageButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(groupTotalButton, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE))))
               .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                  .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                     .addComponent(addTextField)
                     .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                     .addComponent(createUser, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                  .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                     .addComponent(groupTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                     .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                     .addComponent(createGroup))))
            .addContainerGap())
      );
      layout.setVerticalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(layout.createSequentialGroup()
                  .addGap(19, 19, 19)
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                     .addComponent(addTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                     .addComponent(createUser, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                     .addComponent(groupTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                     .addComponent(createGroup, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                  .addGap(20, 20, 20)
                  .addComponent(userViewButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                     .addComponent(groupTotalButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                     .addComponent(userTotalButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                     .addComponent(percentageButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                     .addComponent(messageTotalButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
               .addGroup(layout.createSequentialGroup()
                  .addContainerGap()
                  .addComponent(jScrollPane2)))
            .addContainerGap())
      );

      pack();
   }// </editor-fold>//GEN-END:initComponents

   private void createUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createUserActionPerformed
      // TODO add your handling code here:
      
   }//GEN-LAST:event_createUserActionPerformed

   private void userViewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userViewButtonActionPerformed
      // TODO add your handling code here:
      UserViewGUI holder = new UserViewGUI();
      holder.setVisible(true);
   }//GEN-LAST:event_userViewButtonActionPerformed

   private void groupTotalButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_groupTotalButtonActionPerformed
      // TODO add your handling code here:
   }//GEN-LAST:event_groupTotalButtonActionPerformed

   private void messageTotalButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_messageTotalButtonActionPerformed
      // TODO add your handling code here:
   }//GEN-LAST:event_messageTotalButtonActionPerformed

   private void percentageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_percentageButtonActionPerformed
      // TODO add your handling code here:
   }//GEN-LAST:event_percentageButtonActionPerformed

   private void userTotalButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userTotalButtonActionPerformed
      // TODO add your handling code here:
   }//GEN-LAST:event_userTotalButtonActionPerformed

   /**
    * @param args the command line arguments
    */
   public static void main(String args[]) {

      java.awt.EventQueue.invokeLater(new Runnable() {
         public void run() {
            new AdminGUI().setVisible(true);
         }
      });
   }

   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JTextField addTextField;
   private javax.swing.JButton createGroup;
   private javax.swing.JButton createUser;
   private javax.swing.JTextField groupTextField;
   private javax.swing.JButton groupTotalButton;
   private javax.swing.JScrollPane jScrollPane2;
   private java.awt.List list2;
   private javax.swing.JButton messageTotalButton;
   private javax.swing.JButton percentageButton;
   private javax.swing.JButton userTotalButton;
   private javax.swing.JButton userViewButton;
   // End of variables declaration//GEN-END:variables
}
