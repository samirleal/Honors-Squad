/*
 * Team Name: Andrew's Honor Squad 2: High Honors
 * Team Members: Justin Jiang, Samir Leal, Phi Nguyen, Eric Sullivan
 * Date: 04-30-15
 *
 * Purpose: You and your team members will simulate to develop the software called
 * "Medical Doctor".  The software will be used in hospital for managing and updating
 * not only the patient information but also prescription, and other physical test.
 * The software should be developed with well-designed Graphical User Interface (GUI)
 * so that medical doctors can easily access and manage the patient information.
 *
 * Program Contents: The "Medical Doctor" software should have following contents on GUI:
 * 1. Registration
 * 2. Doctor General Practice
 * 3. Nursing
 */
package Gui;

import javax.swing.JOptionPane;
import java.sql.*;

/**
 *
 * @author Samir
 */
public class EditUser extends javax.swing.JFrame {
    
    // Reference to the screen that opened this screen
    private ManageUsers manage;

    /**
     * Creates new form EditUser
     */
    public EditUser(ManageUsers m, String username) {
        
        // Initializes the components
        initComponents();
        
        // Set visible
        setVisible(true);
        
        // Center
        setLocationRelativeTo(null);
        
        // Reference to the previous screen
        manage = m;
        
        // Sets the first text field to not editable
        oldusernameTextField.setEditable(false);
        
        // Sets the text of the first text field
        oldusernameTextField.setText(username);
        
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        oldusernameTextField = new javax.swing.JTextField();
        usernameTextField = new javax.swing.JTextField();
        saveButton = new javax.swing.JButton();
        sectionComboBox = new javax.swing.JComboBox();
        passwordField1 = new javax.swing.JPasswordField();
        passwordField2 = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Edit User");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 50)); // NOI18N
        jLabel1.setText("Edit User");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Username:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("New Username:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("Password:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setText("Re-enter Password:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setText("Section:");

        oldusernameTextField.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        usernameTextField.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        saveButton.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        sectionComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Administrator", "Registration", "Doctor", "Nursing" }));

        passwordField1.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N

        passwordField2.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        passwordField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordField2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(187, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(175, 175, 175))
            .addGroup(layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(saveButton)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(oldusernameTextField)
                            .addComponent(usernameTextField)
                            .addComponent(sectionComboBox, 0, 224, Short.MAX_VALUE)
                            .addComponent(passwordField1)
                            .addComponent(passwordField2))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(oldusernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(usernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(passwordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(passwordField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(sectionComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(saveButton)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /*
    * This is the save buttons action performed method.
    * This method updates the table entry for the selected user with
    * the new information entered on this screen.
    */
    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        
        // Variables for the data
        String oldUsername = "";
        String username = "";
        char[] pass1;
        char[] pass2;
        String password1 = "";
        String password2 = "";
        String section = "";
        
        // Gets the data from the text fields, pasword field, and combo box
        oldUsername = oldusernameTextField.getText();
        username = usernameTextField.getText();
        pass1 = passwordField1.getPassword();
        pass2 = passwordField2.getPassword();
        section = (String)sectionComboBox.getSelectedItem();
        
        // Converts the first password from a char[] to a string
        for(int i = 0; i < pass1.length; i++) {
              password1 +=pass1[i];              
        }
        
        // Converts the second password from achar[] to a string
        for (int i = 0; i < pass2.length; i++) {
              password2 +=pass2[i];              
        }
        
        boolean usernameInvalid = false;
        
        // If one of the fields are blank
        if (username.equals("") || password1.equals("") || password2.equals("")) {
            
            // Show an error message
            JOptionPane.showMessageDialog(null, "All of the fields must be filled out.", "Error", JOptionPane.INFORMATION_MESSAGE);
            
        } else {
            
            /*
            * Check if the username already exists
            * Selects all the users from the database and compares the entered username
            * If the username matches one in the database then the variable
            * usernameInvalid is set to true, which means the user will be prompted
            * to enter another username or to click cancel.
            */
            try {

                // Connects to the database
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost/honorsmedicaldoctor", "HonorsAdmin", "h0n3r5a2m1n");

                // Selects all of the users from the database
                String sql = "SELECT * FROM users";
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery(sql);

                // Loops through all of the users from the database
                while (rs.next()) {

                    // If the username matches any of the users in the database
                    if (rs.getString(1).equals(username) && !rs.getString(1).equals(oldUsername)) {

                        // Set the varaible to true (means the username is invalid)
                        usernameInvalid = true;

                        // Display a message
                        JOptionPane.showMessageDialog(null, "Username already exists.", "Username", JOptionPane.INFORMATION_MESSAGE);

                        // Sets the username to null
                        username = null;

                    }

                }

                // Closes the connection to the database
                con.close();
                stmt.close();
                rs.close();

            } catch (ClassNotFoundException e) {

                // Prints the exception
                System.out.println(e.getMessage());

            } catch (SQLException e) {

                // Prints the exception
                System.out.println(e.getMessage());

            }
            
            // If the new username is not invalid
            if (!usernameInvalid) {

                // Check if the passwords match
                if (!password1.equals(password2)) {
                    
                    // Display a message
                    JOptionPane.showMessageDialog(null, "Passwords must match", "Error", JOptionPane.INFORMATION_MESSAGE);
                    
                } else {
                    
                    // If the passwords match, then update the users record in the db
                    try {
                        
                        // Connects to the db
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/honorsmedicaldoctor", "HonorsAdmin", "h0n3r5a2m1n");
                        String sql = "UPDATE users SET Username="
                                + "'" + username + "', Password="
                                + "'" + password1 + "', Section="
                                + "'" + section + "' WHERE Username="
                                + "'" + oldUsername + "'";
                        Statement stmt = con.createStatement();
                        stmt.executeUpdate(sql);
                        
                        // Closes the connection to the db
                        stmt.close();
                        con.close();
                        
                        // Displays a success message
                        JOptionPane.showMessageDialog(null, "Update successful", "Update Successful", JOptionPane.INFORMATION_MESSAGE);
                        
                        // Closes this screen
                        this.dispose();
                        
                        // Refreshes the results on the screen
                        manage.update();
                        
                    } catch (ClassNotFoundException e) {
                        
                        // Prints the exception
                        System.out.println(e.getMessage());
                        
                    } catch (SQLException e) {
                        
                        // Prints the exception
                        System.out.println(e.getMessage());
                        
                    }
                    
                }

            }
            
        }
        
    }//GEN-LAST:event_saveButtonActionPerformed

    private void passwordField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordField2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField oldusernameTextField;
    private javax.swing.JPasswordField passwordField1;
    private javax.swing.JPasswordField passwordField2;
    private javax.swing.JButton saveButton;
    private javax.swing.JComboBox sectionComboBox;
    private javax.swing.JTextField usernameTextField;
    // End of variables declaration//GEN-END:variables
}