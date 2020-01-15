/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.sql.*;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
/**
 *
 * @author kkn-elective
 */
public class MailScreen extends javax.swing.JFrame {

    /**
     * Creates new form MailScreen
     */
    public MailScreen() {
        initComponents();
        newmail.setVisible(false);
        jScrollPane1.setOpaque(false);
        jScrollPane1.getViewport().setOpaque(false);
        setSize(560,535);
        setResizable(false);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        l1.setText("Welcome "+Login.uid);
        Loader();
        NewMail();
        Refresher();
        //check for refresher working.
        
    }
    public void close(){
        WindowEvent winClosingEvent = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        l1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        compose = new javax.swing.JLabel();
        newmail = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        box = new javax.swing.JLabel();
        viewmail = new javax.swing.JLabel();
        sync = new javax.swing.JLabel();
        delete = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Mail Box");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(null);

        l1.setFont(new java.awt.Font("Shruti", 1, 18)); // NOI18N
        l1.setForeground(new java.awt.Color(255, 255, 255));
        l1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        getContentPane().add(l1);
        l1.setBounds(20, 120, 260, 44);

        jTable1.setBackground(new java.awt.Color(0, 0, 0));
        jTable1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        jTable1.setForeground(new java.awt.Color(51, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "S.No", "Sender ID", "Message", "Date Received"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setOpaque(false);
        jTable1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        jTable1.getColumnModel().getColumn(0).setMinWidth(40);
        jTable1.getColumnModel().getColumn(0).setPreferredWidth(40);
        jTable1.getColumnModel().getColumn(0).setMaxWidth(40);
        jTable1.getColumnModel().getColumn(1).setMinWidth(120);
        jTable1.getColumnModel().getColumn(1).setPreferredWidth(120);
        jTable1.getColumnModel().getColumn(1).setMaxWidth(120);
        jTable1.getColumnModel().getColumn(3).setMinWidth(135);
        jTable1.getColumnModel().getColumn(3).setPreferredWidth(135);
        jTable1.getColumnModel().getColumn(3).setMaxWidth(135);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 180, 540, 210);

        jLabel3.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 65)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("LabMa!l.");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(160, 10, 290, 80);

        compose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newcompose.png"))); // NOI18N
        compose.setText("jLabel2");
        compose.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        compose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                composeMouseClicked(evt);
            }
        });
        getContentPane().add(compose);
        compose.setBounds(460, 90, 90, 80);

        newmail.setFont(new java.awt.Font("Tw Cen MT", 1, 12)); // NOI18N
        newmail.setForeground(new java.awt.Color(255, 255, 255));
        newmail.setIcon(new javax.swing.ImageIcon(getClass().getResource("/YouGotMail.png"))); // NOI18N
        getContentPane().add(newmail);
        newmail.setBounds(10, 400, 310, 110);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mailbox-t.png"))); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(70, 20, 80, 60);

        box.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inbox.png"))); // NOI18N
        box.setText("jLabel2");
        box.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boxMouseClicked(evt);
            }
        });
        getContentPane().add(box);
        box.setBounds(470, 20, 70, 60);

        viewmail.setIcon(new javax.swing.ImageIcon(getClass().getResource("/openmail.png"))); // NOI18N
        viewmail.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        viewmail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewmailMouseClicked(evt);
            }
        });
        getContentPane().add(viewmail);
        viewmail.setBounds(360, 90, 90, 80);

        sync.setForeground(new java.awt.Color(255, 255, 255));
        sync.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ref-1.png"))); // NOI18N
        sync.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        sync.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                syncMouseClicked(evt);
            }
        });
        getContentPane().add(sync);
        sync.setBounds(340, 410, 100, 90);

        delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/delete.png"))); // NOI18N
        delete.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        delete.setEnabled(false);
        delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteMouseClicked(evt);
            }
        });
        getContentPane().add(delete);
        delete.setBounds(460, 410, 90, 90);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wp-4 - Copy.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 560, 520);
        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(0, 150, 560, 270);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // to manage messages:
        recno=-1;
        rowno=jTable1.getSelectedRow();
        Object o1=jTable1.getValueAt(rowno, 0);
        rowc=o1.toString();
        recno=Integer.parseInt(rowc);
        delete.setEnabled(true);
    }//GEN-LAST:event_jTable1MouseClicked

    private void deleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseClicked
        // to delete message:
       
  try{
            Class.forName("java.sql.DriverManager");
            conn= DriverManager.getConnection("jdbc:mysql://192.168.10.184/labmail","root","psbb");
            String q="delete from "+Login.uid+" where S_No="+rowc+"";
            Statement stmt=conn.createStatement();
            stmt.executeUpdate(q);
            RecUpdater();
            delete.setEnabled(false);
            oldc=0;
            newc=0;
        }
        catch(Exception e){
             JOptionPane.showMessageDialog(this,"Select a message to delete.");
        }
        
        
    }//GEN-LAST:event_deleteMouseClicked

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:

    }//GEN-LAST:event_formWindowClosed

    private void syncMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_syncMouseClicked
        // to check for newly arrived mail:
        Loader();
        NewMail();
        oldc=0;
        newc=0;
    }//GEN-LAST:event_syncMouseClicked

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        //to go back to the first frame: 
        IntroFrame i=new IntroFrame();
        i.setVisible(true);
        
    }//GEN-LAST:event_formWindowClosing

    private void viewmailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewmailMouseClicked
        // to open a message:
        if(recno>=0){
            MsgScr m=new MsgScr();
            m.setVisible(true);
            newmail.setVisible(false);
        }
        else
            JOptionPane.showMessageDialog(this,"Select a message to open");
          
        
    }//GEN-LAST:event_viewmailMouseClicked

    private void composeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_composeMouseClicked
        // to write a message:
        WriteScreen w=new WriteScreen();
        w.setVisible(true);
        newmail.setVisible(false);
    }//GEN-LAST:event_composeMouseClicked

    private void boxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boxMouseClicked
        // TODO add your handling code here:
         if(flag==false){
           ImageIcon im=new ImageIcon("outbox.png");
           box.setIcon(im);
            Sent_Mail();
            TableUpdater("Receiver ID","Date Sent");
        }
        else if(flag==true){
            ImageIcon im=new ImageIcon("inbox.png");
            box.setIcon(im);
            Loader();
            TableUpdater("Sender ID","Date Received");
        }
    }//GEN-LAST:event_boxMouseClicked

    /**
     * @param args the command line arguments
     */
    public static boolean flag=false;
    public int rowno;
    public String rowc="";
    public static int recno=0;
    public static String send_id;
    int count=0;
    public static boolean clicker;
    Connection conn,c;
    Statement stmt2,stmt1,stmt;  
    ResultSet rs1,rs2,rs3;
    public int oldc=0,newc=0;    
    public void Loader(){  
        try{
            DefaultTableModel tm=(DefaultTableModel)jTable1.getModel();
            tm.setNumRows(0);
            Class.forName("java.sql.DriverManager");
             c=DriverManager.getConnection("jdbc:mysql://192.168.10.184/labmail","root","psbb");
             stmt1=c.createStatement();
             String q1="Select s_no,r_date,sender,message from "+Login.uid;
             rs1=stmt1.executeQuery(q1);
            while(rs1.next()){
                int s_no=rs1.getInt("S_No");
                String r_date=rs1.getString("R_Date");
                String sender=rs1.getString("Sender");
                String message=rs1.getString("Message");
                Object row[]={s_no,sender,message,r_date};
                tm.addRow(row);
                oldc++;
                }
            flag=false;
            sync.setVisible(true);
            delete.setVisible(true);
              }
        catch(Exception e){
            
                 JOptionPane.showMessageDialog(this,"An unexpected error has occured."
                        + "\nWe shall rectify the problem soon."
                        + "\nSorry for the inconvenience.");
                
            }
    }
    public void NewMail(){
         try{
             Class.forName("java.sql.DriverManager");
             c=DriverManager.getConnection("jdbc:mysql://192.168.10.184/labmail","root","psbb");
             stmt2=c.createStatement();
             String q2="Select count(*) from "+Login.uid;
             rs2=stmt2.executeQuery(q2);
             while(rs2.next()){
                 newc=rs2.getInt("count(*)");
             }
                if((newc!=oldc))
                    newmail.setVisible(true);
                else if(oldc==0||newc==oldc)
                     newmail.setVisible(false);
                
                if(oldc>=1)
                   clicker=true;
                else
                    clicker=false;
               
                
         }
        catch(Exception e){
             JOptionPane.showMessageDialog(this,"An unexpected error has occured."
                        + "\nWe shall rectify the problem soon."
                        + "\nSorry for the inconvenience.");
        }
    }
    public void Refresher(){
        int delay = 5000; //milliseconds
        ActionListener taskPerformer = new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
         Loader();
         NewMail();
         //delete all old databases. create new databases for all including joshiee.
      }
  };
  new javax.swing.Timer(delay, taskPerformer).start();
     
    }
    public void RecUpdater(){
        try{
            Class.forName("java.sql.DriverManager");
            conn=DriverManager.getConnection("jdbc:mysql://192.168.10.184/labmail","root","psbb");
            stmt=conn.createStatement();
            stmt1=conn.createStatement();
            stmt.execute("set @r:=0");
            stmt.executeUpdate("update "+Login.uid+" set s_no=@r:=@r+1");
            Loader();
            NewMail();
            newmail.setVisible(false);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this,"An unexpected error has occured."
                        + "\nWe shall rectify the problem soon."
                        + "\nSorry for the inconvenience.");
        }
        
    }
    public void Sent_Mail(){
        try{
            DefaultTableModel tm=(DefaultTableModel)jTable1.getModel();
            tm.setNumRows(0);
            Class.forName("java.sql.DriverManager");
             c=DriverManager.getConnection("jdbc:mysql://192.168.10.184/labmail_sent","root","psbb");
             stmt1=c.createStatement();
             String q1="Select s_no,s_date,receiver,message from "+Login.uid;
             rs1=stmt1.executeQuery(q1);
            while(rs1.next()){
                int s_no=rs1.getInt("S_No");
                String s_date=rs1.getString("S_Date");
                String receiver=rs1.getString("Receiver");
                String message=rs1.getString("Message");
                Object row[]={s_no,receiver,message,s_date};
                tm.addRow(row);
                oldc++;
                }
            delete.setVisible(false);
            sync.setVisible(false);
            
                    flag=true;
              }
        catch(Exception e){
            
                 JOptionPane.showMessageDialog(this,"An unexpected error has occured."
                        + "\nWe shall rectify the problem soon."
                        + "\nSorry for the inconvenience.");
                
            }
        
    }
    public void TableUpdater(String s,String d){
        JTableHeader th=jTable1.getTableHeader();
        TableColumnModel tcm=th.getColumnModel();
        TableColumn tc1=tcm.getColumn(1);
        tc1.setHeaderValue(s);
        TableColumn tc2=tcm.getColumn(3);
        tc2.setHeaderValue(d);
    }
    
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
            java.util.logging.Logger.getLogger(MailScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MailScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MailScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MailScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MailScreen().setVisible(true);
                
            }  
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel box;
    private javax.swing.JLabel compose;
    private javax.swing.JLabel delete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel newmail;
    private javax.swing.JLabel sync;
    private javax.swing.JLabel viewmail;
    // End of variables declaration//GEN-END:variables
}
