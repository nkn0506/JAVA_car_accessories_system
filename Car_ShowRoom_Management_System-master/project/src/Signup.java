
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Himanshu jain
 */
public class Signup extends javax.swing.JFrame {
Var y=new Var();
static int uidflag;
    /**
     * Creates new form Signup_Page
     */
    public Signup() {
        initComponents();
    }

    
    void clear(){
    name.setText("");
      uid.setText("");
      l1.setText("");
    mno.setText("");
    email.setText("");
    pass.setText("");
    cpass.setText("");
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cpass = new javax.swing.JPasswordField();
        pass = new javax.swing.JPasswordField();
        email = new javax.swing.JTextField();
        mno = new javax.swing.JTextField();
        uid = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        add = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        l1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(112, 41, 99));
        jPanel2.setLayout(null);

        jLabel9.setFont(new java.awt.Font("Californian FB", 1, 24)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Enter Your Details");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(0, 70, 270, 28);
        jLabel9.setForeground(new java.awt.Color(250,235,215));

        jLabel10.setFont(new java.awt.Font("Algerian", 0, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(250,235,215));
        jLabel10.setText("Sign Up");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(230, 10, 140, 40);

        jLabel8.setFont(new java.awt.Font("Tekton Pro Ext", 1, 14)); // NOI18N
        jLabel8.setText("Address :");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(40, 380, 146, 23);
        jLabel8.setForeground(new java.awt.Color(250,235,215));

        jLabel7.setFont(new java.awt.Font("Tekton Pro Ext", 1, 14)); // NOI18N
        jLabel7.setText("Confirm Password :");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(40, 340, 146, 20);
        jLabel7.setForeground(new java.awt.Color(250,235,215));

        jLabel5.setFont(new java.awt.Font("Tekton Pro Ext", 1, 14)); // NOI18N
        jLabel5.setText("Password :");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(40, 300, 100, 23);
        jLabel5.setForeground(new java.awt.Color(250,235,215));
        
        jLabel6.setFont(new java.awt.Font("Tekton Pro Ext", 1, 14)); // NOI18N
        jLabel6.setText("Email :");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(40, 260, 146, 23);
        jLabel6.setForeground(new java.awt.Color(250,235,215));

        jLabel4.setFont(new java.awt.Font("Tekton Pro Ext", 1, 14)); // NOI18N
        jLabel4.setText("Mobile No. :");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(40, 220, 146, 23);
        jLabel4.setForeground(new java.awt.Color(250,235,215));

        jLabel3.setFont(new java.awt.Font("Tekton Pro Ext", 1, 14)); // NOI18N
        jLabel3.setText("UserId :");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(40, 160, 146, 23);
        jLabel3.setForeground(new java.awt.Color(250,235,215));

        jLabel2.setFont(new java.awt.Font("Tekton Pro Ext", 1, 14)); // NOI18N
        jLabel2.setText("Full Name :");
        jLabel2.setForeground(new java.awt.Color(250,235,215));
        jPanel2.add(jLabel2);
        jLabel2.setBounds(40, 120, 146, 23);
        jPanel2.add(cpass);
        cpass.setBounds(250, 340, 258, 30);
        jPanel2.add(pass);
        pass.setBounds(250, 300, 258, 30);
        jPanel2.add(email);
        email.setBounds(250, 260, 258, 30);
        jPanel2.add(mno);
        mno.setBounds(250, 220, 258, 30);

        uid.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                uidFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                uidFocusLost(evt);
            }
        });
        uid.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                uidMouseExited(evt);
            }
        });
        jPanel2.add(uid);
        uid.setBounds(250, 160, 258, 30);
        jPanel2.add(name);
        name.setBounds(250, 120, 258, 30);
        jPanel2.add(add);
        add.setBounds(250, 380, 258, 30);

        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(250, 450, 70, 35);

        jButton2.setText("Exit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);
        jButton2.setBounds(460, 450, 65, 35);

        jButton4.setText("Back");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4);
        jButton4.setBounds(360, 450, 65, 35);

        l1.setForeground(new java.awt.Color(0, 153, 0));
        jPanel2.add(l1);
        l1.setBounds(250, 194, 330, 20);
        jPanel2.add(jLabel1);
        jLabel1.setBounds(0, 0, 600, 480);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 518, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int x=JOptionPane.showConfirmDialog(rootPane,"Are you sure,You want to Exit");
        if(x==0)
        {
            System.exit(0);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        //Input for all
        String namev=name.getText();
        String uidv=uid.getText();
        String mnov=mno.getText();
        String emailv=email.getText();
        String passv=pass.getText();
        String cpassv=cpass.getText();
        String addv=add.getText();
       
     
        int index1 = emailv.indexOf('@');
        int index2 = emailv.indexOf('.');
        
        //Check uid is exist or not
        if(uidflag==1)
        {
            
        }
        
         //Check No details is empty
       else if(namev.equals("")||uidv.equals("")||mnov.equals("")||passv.equals("")||addv.equals("")||emailv.equals("")){
            JOptionPane.showMessageDialog(rootPane,"You can't leave any Field Empty","Alert",JOptionPane.WARNING_MESSAGE);
        }
        //check email is valid or not
        else if(index1==-1||index2==-1){
            JOptionPane.showMessageDialog(rootPane,"Invalid Email Id !!");
            email.setText("");
        }
            //check password and confirmed password
       else if(passv.equals(cpassv)==false){
            JOptionPane.showMessageDialog(rootPane, "Password and Confirmed Password are not matched !!");
            pass.setText("");
            cpass.setText("");
        }

        else
        //Connection With DATABASE
        try{
            Class.forName("java.sql.DriverManager");
            Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/cardb","root","123456");
            Statement stmt=(Statement) con.createStatement();
            
            
                String sql1="create table "+uidv+"ordertbl"   
                +"(CustomerName varchar(30),"
                +"email varchar(30),"
                +"mobileNo varchar(30),"
                +"adharCardNo varchar(18),"
                +"carModel varchar(30),"
                +"carColour varchar(15),"
                +"dateoforder date,"
                +"ECA varchar(3));";
            
                  stmt.executeUpdate(sql1);
            
            
            String sql2="insert into clientdb values('"+uidv+"','"+passv+"','"+namev+"','"+mnov+"','"+emailv+"','"+addv+"');";
            stmt.executeUpdate(sql2);
            JOptionPane.showMessageDialog(null,"You are successfully Signed up");
clear();
this.setVisible(false);
            new Login_page().setVisible(true);
            stmt.close();
            con.close();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
            System.exit(0);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
         int x=JOptionPane.showConfirmDialog(null,"Do you want to discard Signup","Select an Option",JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE);
        if(x==0){
            clear();
            this.setVisible(false);
            new Login_page().setVisible(true);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void uidMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_uidMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_uidMouseExited

    private void uidFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_uidFocusGained
        // TODO add your handling code here:
        
    }//GEN-LAST:event_uidFocusGained

    private void uidFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_uidFocusLost
        // TODO add your handling code here:
                uidflag=0;
          try{
            Class.forName("java.sql.DriverManager");
            Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/cardb","root","123456");
            Statement stmt=(Statement) con.createStatement();
            String sql="select userid from clientdb;";
            ResultSet rs1=stmt.executeQuery(sql);
            String uid1=uid.getText();
            while(rs1.next())
             {      
           String ss=rs1.getString(1);
          if(uid1.equals(ss))
          {
          uidflag=1;
          break;
          }
             }
            
            if(uidflag==1){
            l1.setForeground(new java.awt.Color(255, 51, 51));
            l1.setText(uid1+" is already taken");
            }
            else if(uid1.equals("")){
            l1.setForeground(new java.awt.Color(255, 51, 51));
            l1.setText("UserId can't be empty");
            }
            else{
                l1.setForeground(new java.awt.Color(0, 153, 0));
                l1.setText(uid1+"userID is avilable");
             }

            //Close statement
            stmt.close();
            con.close();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
            System.exit(0);
        }

    }//GEN-LAST:event_uidFocusLost

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
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Signup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField add;
    private javax.swing.JPasswordField cpass;
    private javax.swing.JTextField email;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel l1;
    private javax.swing.JTextField mno;
    private javax.swing.JTextField name;
    private javax.swing.JPasswordField pass;
    private javax.swing.JTextField uid;
    
    // End of variables declaration//GEN-END:variables
}
