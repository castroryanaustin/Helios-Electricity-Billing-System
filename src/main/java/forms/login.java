/**
 *
 * @author mangostynn
 */
package forms;
import static forms.Database.*;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import java.awt.*;

public class login extends javax.swing.JFrame {
    public login() {
        try {
            this.setContentPane(new javax.swing.JLabel(new javax.swing.ImageIcon(getClass().getResource("/splash-bg.jpg"))));
            initComponents();
            RobotoText = Font.createFont(Font.TRUETYPE_FONT, getClass().getResource("/Roboto/Roboto-Regular.ttf").openStream());
            ge.registerFont(RobotoText);
            RobotoTitle = Font.createFont(Font.TRUETYPE_FONT, getClass().getResource("/Roboto/Roboto-Bold.ttf").openStream());
            ge.registerFont(RobotoTitle);
        } catch (Exception e ) {
            e.printStackTrace();
        }
    }
        GraphicsEnvironment ge = 
        GraphicsEnvironment.getLocalGraphicsEnvironment();
        Font RobotoText, RobotoTitle;   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlMain = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        ptxtPassword = new javax.swing.JPasswordField();
        btnCancel = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnSignUp = new javax.swing.JButton();
        btnLogIn1 = new javax.swing.JButton();
        chkToggleVisibility = new javax.swing.JCheckBox();
        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.JFrame.DISPOSE_ON_CLOSE);
        setTitle("Log in");
        setPreferredSize(new java.awt.Dimension(1280, 720));
        setResizable(false);
        setSize(new java.awt.Dimension(1280, 720));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlMain.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Open Sans", 1, 18)); // NOI18N
        jLabel1.setText("Log in");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Copyright© 2021 Helios Systems. All Rights Reserved.");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(193, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setText("Username");

        txtUsername.setFont(new java.awt.Font("Open Sans", 0, 11)); // NOI18N

        jLabel3.setText("Password");

        btnCancel.setBackground(new java.awt.Color(60, 63, 66));
        btnCancel.setFont(new java.awt.Font("Open Sans", 0, 11)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(255, 255, 255));
        btnCancel.setText("Cancel");
        btnCancel.setPreferredSize(new java.awt.Dimension(71, 25));
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        jLabel4.setText("New to Helios online?");

        btnSignUp.setBackground(new java.awt.Color(108, 108, 117));
        btnSignUp.setForeground(new java.awt.Color(255, 255, 255));
        btnSignUp.setText("Sign Up");
        btnSignUp.setBorderPainted(false);
        btnSignUp.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        btnSignUp.setFocusPainted(false);
        btnSignUp.setPreferredSize(new java.awt.Dimension(71, 25));
        btnSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignUpActionPerformed(evt);
            }
        });

        btnLogIn1.setBackground(new java.awt.Color(242, 100, 25));
        btnLogIn1.setFont(new java.awt.Font("Open Sans", 0, 11)); // NOI18N
        btnLogIn1.setForeground(new java.awt.Color(255, 255, 255));
        btnLogIn1.setText("Login");
        btnLogIn1.setPreferredSize(new java.awt.Dimension(71, 25));
        btnLogIn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogIn1ActionPerformed(evt);
            }
        });

        chkToggleVisibility.setText("Show Password");
        chkToggleVisibility.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkToggleVisibilityActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtUsername)
            .addComponent(ptxtPassword)
            .addComponent(btnCancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(btnLogIn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 106, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(chkToggleVisibility, javax.swing.GroupLayout.Alignment.TRAILING)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ptxtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chkToggleVisibility)
                .addGap(12, 12, 12)
                .addComponent(btnLogIn1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addContainerGap())
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("please keep the aspect ratio provided by the programmers.");
        jPanel5.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 25, 384, -1));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("To ensure access and for best viewing experience, ");
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, -1));

        javax.swing.GroupLayout pnlMainLayout = new javax.swing.GroupLayout(pnlMain);
        pnlMain.setLayout(pnlMainLayout);
        pnlMainLayout.setHorizontalGroup(
            pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMainLayout.createSequentialGroup()
                .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlMainLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlMainLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(pnlMainLayout.createSequentialGroup()
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(33, 33, 33))
        );
        pnlMainLayout.setVerticalGroup(
            pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMainLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        getContentPane().add(pnlMain, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 20, -1, 670));

        jLabel8.setFont(new java.awt.Font("RobotoTitle", Font.BOLD, 36));
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("HELIOS SYSTEM INC.");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 598, -1));

        jLabel9.setFont(new java.awt.Font("Open Sans SemiBold", 2, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("| View & Pay Bills | Report Outages |");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 598, -1));

        jLabel10.setFont(new java.awt.Font("Open Sans SemiBold", 2, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("| Apply for a Service | News & Advisories |");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 598, -1));

        jLabel11.setFont(new java.awt.Font("Open Sans SemiBold", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Log-in with your account and start paying your bills with ease!");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, 598, -1));

        jLabel12.setFont(new java.awt.Font("Open Sans", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("We’re #SwitchingTheLightsOn ");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, 598, -1));

        jLabel13.setFont(new java.awt.Font("Open Sans", 2, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("for your brighter tomorrow Service Application made safer adapting to the New Normal Era.");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, 600, 20));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignUpActionPerformed
        new signup().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSignUpActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        new mainmen().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void chkToggleVisibilityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkToggleVisibilityActionPerformed
        if (chkToggleVisibility.isSelected()){
            ptxtPassword.setEchoChar((char)0);
        }else{
            ptxtPassword.setEchoChar('*');
        }
    }//GEN-LAST:event_chkToggleVisibilityActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        this.dispose();
    }//GEN-LAST:event_formWindowClosing

    private void btnLogIn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogIn1ActionPerformed
        String un = txtUsername.getText();
        String pw = new String(ptxtPassword.getPassword());
        if (un.equals("") || pw.equals("")){
            showMessageDialog(null, "One or more field/s is/are empty.",
                "Try again.", JOptionPane.INFORMATION_MESSAGE);
        } else{
            if (logIn(un, pw) == true){
            mainmen.loggedIn = true;
            
            if (mainmen.username.equals("admin")){
                new company().setVisible(true);
            } else{
                new mainmen().setVisible(true);}
            
            this.dispose();
            } else{
                showMessageDialog(null, "Incorrect credentials, please try again.",
                    "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnLogIn1ActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnLogIn1;
    private javax.swing.JButton btnSignUp;
    private javax.swing.JCheckBox chkToggleVisibility;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel pnlMain;
    private javax.swing.JPasswordField ptxtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
