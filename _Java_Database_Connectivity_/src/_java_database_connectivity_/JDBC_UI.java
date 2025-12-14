/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package _java_database_connectivity_;

import java.sql.*;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class JDBC_UI extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(JDBC_UI.class.getName());
    private static final String dbUrl = "jdbc:mysql://localhost:3306/user_database";
    private static final String user = "root";
    private static final String password = "";
    private static final String dbDriver = "com.mysql.cj.jdbc.Driver";

    public JDBC_UI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton5 = new javax.swing.JButton();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        uid = new javax.swing.JTextField();
        uname = new javax.swing.JTextField();
        uemail = new javax.swing.JTextField();
        uphone = new javax.swing.JTextField();
        insert = new javax.swing.JButton();
        update = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        view = new javax.swing.JButton();
        exit = new javax.swing.JButton();

        jButton5.setText("jButton5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLayeredPane1.setBackground(new java.awt.Color(255, 255, 255));
        jLayeredPane1.setOpaque(true);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("User ID");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Name");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Email");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Phone");

        uphone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uphoneActionPerformed(evt);
            }
        });

        insert.setText("Insert");
        insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertActionPerformed(evt);
            }
        });

        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        view.setText("View");
        view.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewActionPerformed(evt);
            }
        });

        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        jLayeredPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(uid, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(uname, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(uemail, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(uphone, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(insert, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(update, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(delete, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(view, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(exit, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(189, 189, 189)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(insert)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(update)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(delete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(view)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(exit))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(32, 32, 32)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(uphone, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
                                .addComponent(uemail)
                                .addComponent(uid))
                            .addComponent(uname, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(174, Short.MAX_VALUE))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(jLabel1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(uid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(uname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(uemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(uphone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(insert)
                    .addComponent(update)
                    .addComponent(delete)
                    .addComponent(view)
                    .addComponent(exit))
                .addContainerGap(196, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void uphoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uphoneActionPerformed

    }//GEN-LAST:event_uphoneActionPerformed

    private void insertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertActionPerformed

        String userid;
        String name;
        String email;
        String phone;
        String SQL;

        try {
            Class.forName(dbDriver);
            Connection conn = DriverManager.getConnection(dbUrl, user, password);
            Statement stmt = conn.createStatement();

            if ("".equals(uid.getText())) {
                JOptionPane.showMessageDialog(new JFrame(), "User ID Can't Be Blank", "ERROR", JOptionPane.ERROR_MESSAGE);
            } else if ("".equals(uname.getText())) {
                JOptionPane.showMessageDialog(new JFrame(), "User Name Can't Be Blank", "ERROR", JOptionPane.ERROR_MESSAGE);
            } else if ("".equals(uemail.getText())) {
                JOptionPane.showMessageDialog(new JFrame(), "User Email Can't Be Blank", "ERROR", JOptionPane.ERROR_MESSAGE);
            } else if ("".equals(uphone.getText())) {
                JOptionPane.showMessageDialog(new JFrame(), "User Phone Number Can't Be Blank", "ERROR", JOptionPane.ERROR_MESSAGE);
            } else {
                userid = uid.getText();
                name = uname.getText();
                email = uemail.getText();
                phone = uphone.getText();
                SQL = "INSERT INTO userinfo VALUES('" + userid + "', '" + name + "', '" + email + "', '" + phone + "')";
                stmt.executeUpdate(SQL);
                JOptionPane.showMessageDialog(new JFrame(), "User " + userid + " Added", "Happy Client", JOptionPane.INFORMATION_MESSAGE);
                conn.close();
                stmt.close();
                uid.setText("");
                uname.setText("");
                uemail.setText("");
                uphone.setText("");
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Database Error: " + e.getMessage());
        }
    }//GEN-LAST:event_insertActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        String userid = uid.getText();
        String name = uname.getText();
        String email = uemail.getText();
        String phone = uphone.getText();

        if ("".equals(userid)) {
            JOptionPane.showMessageDialog(new JFrame(), "User ID Can't Be Blank", "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if ("".equals(name) && "".equals(email) && "".equals(phone)) {
            JOptionPane.showMessageDialog(new JFrame(), "Please fill at least one field to update (Name, Email, or Phone).", "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            Class.forName(dbDriver);
            Connection conn = DriverManager.getConnection(dbUrl, user, password);
            Statement stmt = conn.createStatement();

            ArrayList<String> columnsToUpdate = new ArrayList<>();

            if (!"".equals(name)) {
                columnsToUpdate.add("name = '" + name + "'");
            }
            if (!"".equals(email)) {
                columnsToUpdate.add("email = '" + email + "'");
            }
            if (!"".equals(phone)) {
                columnsToUpdate.add("phone = '" + phone + "'");
            }

            String setClause = String.join(", ", columnsToUpdate);

            String SQL = "UPDATE userinfo SET " + setClause + " WHERE userid = '" + userid + "'";

            System.out.println("Executing Query: " + SQL);

            stmt.executeUpdate(SQL);
            JOptionPane.showMessageDialog(new JFrame(), "User " + userid + " Updated Successfully", "Happy Client", JOptionPane.INFORMATION_MESSAGE);

            conn.close();
            stmt.close();

            uid.setText("");
            uname.setText("");
            uemail.setText("");
            uphone.setText("");

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Database Error: " + e.getMessage());
        }

    }//GEN-LAST:event_updateActionPerformed

    private void viewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewActionPerformed

        String userid;
        String SQL;

        try {
            Class.forName(dbDriver);
            Connection conn = DriverManager.getConnection(dbUrl, user, password);
            Statement stmt = conn.createStatement();

            if ("".equals(uid.getText())) {
                JOptionPane.showMessageDialog(new JFrame(), "User ID Can't Be Blank", "Dialog", JOptionPane.ERROR_MESSAGE);
            } else {
                userid = uid.getText();

                SQL = "SELECT*FROM userinfo WHERE userid = '" + userid + "' ";
                ResultSet r = stmt.executeQuery(SQL);

                if (r.next()) {
                    String uid = r.getString("userid");
                    String name = r.getString("name");
                    String email = r.getString("email");
                    String phone = r.getString("phone");

                    String msg = String.format("\n\nName :%s\nEmail :%s\nPhone :%s", name, email, phone);
                    JOptionPane.showMessageDialog(new JFrame(), "You Are Viewing The Information Of User ID  " + userid + " : " + msg + " ", "User Found", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Sorry No User Found With User ID : " + userid, "Invalid Input", JOptionPane.WARNING_MESSAGE);
                }
                r.close();
                conn.close();
                stmt.close();
                uid.setText("");

            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Please Enter a Valid User ID : " + e.getMessage());
        }

    }//GEN-LAST:event_viewActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed

        String userid;
        String SQL;

        if ("".equals(uid.getText())) {
            JOptionPane.showMessageDialog(new JFrame(), "User ID Can't Be Blank", "Dialog", JOptionPane.ERROR_MESSAGE);
        } else {

            int yn = JOptionPane.showConfirmDialog(null, "Are You Sure ?", "Confirm Deletion", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

            if (yn == JOptionPane.YES_OPTION) {

                try {
                    userid = uid.getText();

                    Class.forName(dbDriver);
                    Connection conn = DriverManager.getConnection(dbUrl, user, password);
                    Statement stmt = conn.createStatement();

                    SQL = "DELETE FROM userinfo WHERE userid = '" + userid + "' ";
                    stmt.executeUpdate(SQL);

                    JOptionPane.showMessageDialog(null, "User " + userid + " Deleted", "Happy Clint", JOptionPane.INFORMATION_MESSAGE);

                    stmt.close();
                    conn.close();

                    uid.setText("");

                } catch (Exception e) {
                    e.printStackTrace();
                    JOptionPane.showMessageDialog(null, "Error during deletion: " + e.getMessage());
                }

            } else {

                uid.setText("");
            }
        }
    }//GEN-LAST:event_deleteActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new JDBC_UI().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton delete;
    private javax.swing.JButton exit;
    private javax.swing.JButton insert;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JTextField uemail;
    private javax.swing.JTextField uid;
    private javax.swing.JTextField uname;
    private javax.swing.JButton update;
    private javax.swing.JTextField uphone;
    private javax.swing.JButton view;
    // End of variables declaration//GEN-END:variables
}
