import java.sql.*;
import javax.swing.JOptionPane;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * question.java
 *
 * Created on Nov 18, 2010, 2:17:20 PM
 */

/**
 *
 * @author user
 */
public class question extends javax.swing.JFrame {
String sub;
String question ;
int marks;
int qno;
int counter=0;
String answer;
String ans="";



    /** Creates new form question */
    public question() {
        initComponents();
    }
     public question(String subject,int no,int mark) {
        initComponents();
        sub = subject;
        qno=no;
        marks=mark;
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scorefrm = new javax.swing.JFrame();
        scorelbl = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        r99 = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        o1 = new javax.swing.JRadioButton();
        o2 = new javax.swing.JRadioButton();
        o3 = new javax.swing.JRadioButton();
        o4 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        next = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ques = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        scorefrm.setMinimumSize(new java.awt.Dimension(500, 500));
        scorefrm.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        scorelbl.setFont(new java.awt.Font("Comic Sans MS", 1, 72));
        scorelbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        scorelbl.setText("0");
        scorefrm.getContentPane().add(scorelbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 370, 140));

        jButton4.setBackground(new java.awt.Color(0, 0, 102));
        jButton4.setFont(new java.awt.Font("Comic Sans MS", 1, 18));
        jButton4.setForeground(new java.awt.Color(204, 0, 51));
        jButton4.setIcon(new javax.swing.ImageIcon("C:\\Documents and Settings\\DPS23\\My Documents\\Downloads\\exitbaby.jpg")); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        scorefrm.getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 430, 90, 20));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Documents and Settings\\DPS23\\My Documents\\Downloads\\The-Final-Score-Logo.png")); // NOI18N
        scorefrm.getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 210, 160));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Documents and Settings\\DPS23\\My Documents\\Downloads\\4.jpg")); // NOI18N
        jLabel8.setMaximumSize(new java.awt.Dimension(500, 500));
        jLabel8.setMinimumSize(new java.awt.Dimension(500, 500));
        jLabel8.setOpaque(true);
        scorefrm.getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, 590));

        buttonGroup1.add(r99);
        r99.setText("jRadioButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setForeground(new java.awt.Color(51, 0, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        o1.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(o1);
        o1.setFont(new java.awt.Font("Comic Sans MS", 1, 10));
        o1.setForeground(new java.awt.Color(255, 255, 255));
        o1.setText("Option 1");
        o1.setAutoscrolls(true);
        o1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                o1FocusLost(evt);
            }
        });
        jPanel1.add(o1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 170, 20));

        o2.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(o2);
        o2.setFont(new java.awt.Font("Comic Sans MS", 1, 10));
        o2.setForeground(new java.awt.Color(255, 255, 255));
        o2.setText("Option 2");
        o2.setAutoscrolls(true);
        o2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                o2FocusLost(evt);
            }
        });
        jPanel1.add(o2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 240, 170, 20));

        o3.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(o3);
        o3.setFont(new java.awt.Font("Comic Sans MS", 1, 10));
        o3.setForeground(new java.awt.Color(255, 255, 255));
        o3.setText("Option 3");
        o3.setAutoscrolls(true);
        o3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                o3FocusLost(evt);
            }
        });
        jPanel1.add(o3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 170, 20));

        o4.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(o4);
        o4.setFont(new java.awt.Font("Comic Sans MS", 1, 10));
        o4.setForeground(new java.awt.Color(255, 255, 255));
        o4.setText("Option 4");
        o4.setAutoscrolls(true);
        o4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                o4FocusLost(evt);
            }
        });
        jPanel1.add(o4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 280, 190, 20));

        jButton1.setBackground(new java.awt.Color(102, 0, 0));
        jButton1.setFont(new java.awt.Font("Bradley Hand ITC", 3, 18));
        jButton1.setForeground(new java.awt.Color(51, 51, 255));
        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Documents and Settings\\DPS23\\My Documents\\Downloads\\exitbaby.jpg")); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 380, 100, 20));

        next.setBackground(new java.awt.Color(0, 0, 102));
        next.setIcon(new javax.swing.ImageIcon("C:\\Program Files\\Microsoft Office\\CLIPART\\PUB60COR\\AG00092_.GIF")); // NOI18N
        next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextActionPerformed(evt);
            }
        });
        jPanel1.add(next, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 320, -1, 50));

        jLabel10.setFont(new java.awt.Font("Comic Sans MS", 1, 18));
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Click On Next(--->) To Start");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, -1, -1));

        ques.setBackground(new java.awt.Color(0, 0, 0));
        ques.setColumns(8);
        ques.setEditable(false);
        ques.setFont(new java.awt.Font("Comic Sans MS", 1, 18));
        ques.setForeground(new java.awt.Color(255, 255, 255));
        ques.setLineWrap(true);
        ques.setRows(8);
        ques.setText("sample question");
        ques.setWrapStyleWord(true);
        jScrollPane1.setViewportView(ques);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 360, 50));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Documents and Settings\\DPS23\\My Documents\\Downloads\\who-wants-to-be-a-millionaire-2.jpg")); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 500, 170));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Documents and Settings\\DPS23\\My Documents\\Downloads\\Who_Wants_To_Be_A_Millionaire-logo-4481E0FBAA-seeklogo.com.gif")); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 110, 110));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 569, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 405, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextActionPerformed
if(ans.equals(answer))      //code to check for the answer and increment marks.
        {
            marks=++marks;
     }
        try                  // connectivity code for getting question and answers
{
    Class.forName("java.sql.DriverManager");
    Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","DPS");
    Statement stmt = (Statement) con.createStatement();
    String query = "select * from question where type = '"+sub+"' and qno ="+qno+";";
    ResultSet rs = stmt.executeQuery(query);
    while(rs.next())
    {
      
        ques.setText(rs.getString(3));
      o1.setText(rs.getString(4));
      o2.setText(rs.getString(5));
      o3.setText(rs.getString(6));
      o4.setText(rs.getString(7));
      r99.setSelected(true);
      
      
      
      question=rs.getString(3);
     answer=rs.getString("ans");
           ++qno;
                
    }
 }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this,e.getMessage());
        }
    counter++; //code for the counter action
    if(counter == 6)
    {
        int more = JOptionPane.showConfirmDialog(this,"Do You want To Continue","Choose An Option",JOptionPane.YES_NO_OPTION);
        if(more==JOptionPane.NO_OPTION)
        {scorefrm.setVisible(true);
        this.setVisible(false);
        scorelbl.setText(""+marks);
        }
        else if(more==JOptionPane.YES_OPTION)
        {
             List l = new List(marks);
         l.setVisible(true);
         this.setVisible(false);
        }

    }

   
                // TODO add your handling code here:
}//GEN-LAST:event_nextActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
int more = JOptionPane.showConfirmDialog(this,"Do You Want TO Save To Database","Choose An Option", JOptionPane.YES_NO_OPTION);
if(more==JOptionPane.YES_OPTION)
{
    int no = Integer.parseInt(JOptionPane.showInputDialog(this,"Enter your Reg No."));
    try{
        Class.forName("java.sql.DriverManager");
        Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","DPS");
    Statement stmt = (Statement) con.createStatement();
    String query = "update user set highscore = "+marks+" where no ="+no+";";
    stmt.executeUpdate(query);
    JOptionPane.showMessageDialog(this,"Marks Saved To "+no);
    }
    catch(Exception e)
    {
        JOptionPane.showMessageDialog(this,e.getMessage());
    }
    System.exit(0);
}
else if(more==JOptionPane.NO_OPTION)
{
    System.exit(0);
}

                // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void o1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_o1FocusLost
if(o1.isSelected())
{
    ans=o1.getText();
    o1.setSelected(false);
    
}

// TODO add your handling code here:
    }//GEN-LAST:event_o1FocusLost

    private void o2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_o2FocusLost
if(o2.isSelected())
{
    ans=o2.getText();
    o2.setSelected(false);
    
}
// TODO add your handling code here:
    }//GEN-LAST:event_o2FocusLost

    private void o3FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_o3FocusLost
if(o3.isSelected())
{
    ans=o3.getText();
    o3.setSelected(false);
    
}        // TODO add your handling code here:
    }//GEN-LAST:event_o3FocusLost

    private void o4FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_o4FocusLost
if(o4.isSelected())
{
        ans=o4.getText();
    o4.setSelected(false);

}        // TODO add your handling code here:
    }//GEN-LAST:event_o4FocusLost

    /**
    * @param args the command line arguments
    */

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new question().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton next;
    private javax.swing.JRadioButton o1;
    private javax.swing.JRadioButton o2;
    private javax.swing.JRadioButton o3;
    private javax.swing.JRadioButton o4;
    private javax.swing.JTextArea ques;
    private javax.swing.JRadioButton r99;
    private javax.swing.JFrame scorefrm;
    private javax.swing.JLabel scorelbl;
    // End of variables declaration//GEN-END:variables

}
