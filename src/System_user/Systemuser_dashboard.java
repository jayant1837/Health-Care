package System_user;

import System_user.Systemuser_dashboard;
import appointment.appointment_dashboard;
import billing_and_invoice.*;
import dashboard.DashBoard;
import doctor.*;
import panel.*;
import patient.*;
import search.search5;
import search.search1;
import search.search2;
import search.search3;
import search.search4;

import medical.*;
import employee.*;
import attendance.*;
import login.*;
import patient.*;

import java.awt.*;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import static java.awt.print.Printable.NO_SUCH_PAGE;
import static java.awt.print.Printable.PAGE_EXISTS;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.sql.*;
import java.text.SimpleDateFormat;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.Date;

public class Systemuser_dashboard extends javax.swing.JFrame implements Printable{

    DefaultTableModel model;
    Connection con;
    Statement st;
    ResultSet rs;
    String q;
    String username="",fullname="",lastlogin="",lastlogout="",status="Null",roll="Null";
    long phone=0,sno=0;
    String jlbel="";
    public Systemuser_dashboard() {
        initComponents();
        try {
                Class.forName("java.sql.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/health_care", "root", "");
                st = con.createStatement();
                model = (DefaultTableModel) tb1.getModel();
                model.setRowCount(0);
                q = "select * from user_account;";
                rs = st.executeQuery(q);
                while (rs.next()) 
                {
                    username = rs.getString("username");
                    fullname = rs.getString("full_name");
                    phone = rs.getLong("phone");
                    lastlogin = rs.getString("last_login");
                    lastlogout = rs.getString("last_logout");
                    status = rs.getString("status");
                    roll=rs.getString("roll");
                    sno=rs.getLong("s_no");
                    model.addRow(new Object[]{sno,username,fullname,phone,lastlogin,lastlogout,status,roll}
                    );
                }
                q="select count(username) from user_account;";
                rs=st.executeQuery(q);
                while(rs.next())
                {
                    l2.setText(""+rs.getInt("count(username)"));
                }
                q="select count(username) from user_account where status='Active';";
                rs=st.executeQuery(q);
                while(rs.next())
                {
                    l3.setText(""+rs.getInt("count(username)"));
                }
                q="select count(username) from user_account where roll='Admin';";
                rs=st.executeQuery(q);
                while(rs.next())
                {
                    l4.setText(""+rs.getInt("count(username)"));
                }
                q="select count(username) from user_account where status='Inactive';";
                rs=st.executeQuery(q);
                while(rs.next())
                {
                    l5.setText(""+rs.getInt("count(username)"));
                }
        } 
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(this, "error in mysql connection\n "+e);
        }
    }
        public int print(Graphics g, PageFormat pf, int pageIndex) throws PrinterException
        {
            PrinterJob job = PrinterJob.getPrinterJob();
            this.printAll(g);
            if (pageIndex > 0) 
            {
                return NO_SUCH_PAGE;
            }
            Graphics2D g2 = (Graphics2D) g;
            g2.translate(pf.getImageableX(), pf.getImageableY());
            this.getContentPane().printAll(g2);
            return PAGE_EXISTS;
        }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        p12 = new p1();
        jLabel16 = new javax.swing.JLabel();
        img1 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        l1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        L8 = new javax.swing.JLabel();
        L10 = new javax.swing.JLabel();
        L9 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb1 = new javax.swing.JTable();
        jLabel17 = new javax.swing.JLabel();
        p11 = new p1();
        l2 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel105 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cb1 = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        p21 = new panel.p2();
        jLabel18 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        l6 = new javax.swing.JLabel();
        l3 = new javax.swing.JLabel();
        p22 = new panel.p2();
        jLabel19 = new javax.swing.JLabel();
        l4 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        p23 = new panel.p2();
        jLabel12 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        l5 = new javax.swing.JLabel();
        tf1 = new search.search5();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(204, 255, 255));
        jPanel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel3.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 118, 139));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        p12.setBackground(new java.awt.Color(4, 146, 160));
        p12.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        p12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p12MouseClicked(evt);
            }
        });
        p12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText(" DashBoard");
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel16MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel16MouseExited(evt);
            }
        });
        p12.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 7, -1, -1));

        jPanel2.add(p12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 240, 50));
        jPanel2.add(img1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 110));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/copy1.png"))); // NOI18N
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 90));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 187));

        l1.setFont(new java.awt.Font("Tahoma", 0, 23)); // NOI18N
        l1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icon1.png"))); // NOI18N
        l1.setText("Patient Mangement");
        l1.setAlignmentX(6.0F);
        l1.setAlignmentY(6.0F);
        l1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                l1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                l1MouseExited(evt);
            }
        });
        jPanel1.add(l1, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 200, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 23)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icon2.png"))); // NOI18N
        jLabel1.setText("Doctor Mangement");
        jLabel1.setAlignmentX(4.0F);
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel1MouseExited(evt);
            }
        });
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 240, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 23)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icon4.png"))); // NOI18N
        jLabel3.setText("Employee Mangement");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel3MouseExited(evt);
            }
        });
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 23)); // NOI18N
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icon6.png"))); // NOI18N
        jLabel7.setText("Medical Record");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel7MouseExited(evt);
            }
        });
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 23)); // NOI18N
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icon7.png"))); // NOI18N
        jLabel6.setText("System User");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel6MouseExited(evt);
            }
        });
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 23)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icon8.png"))); // NOI18N
        jLabel5.setText("Billing and Invoice");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel5MouseExited(evt);
            }
        });
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 400, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 23)); // NOI18N
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icon6.png"))); // NOI18N
        jLabel8.setText("Appointment");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel8MouseExited(evt);
            }
        });
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 440, -1, -1));

        L8.setFont(new java.awt.Font("Tahoma", 0, 23)); // NOI18N
        L8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icon5.png"))); // NOI18N
        L8.setText("Attendance");
        L8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                L8MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                L8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                L8MouseExited(evt);
            }
        });
        jPanel1.add(L8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, -1, -1));

        L10.setFont(new java.awt.Font("Tahoma", 0, 23)); // NOI18N
        L10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/at1.png"))); // NOI18N
        L10.setText("Attendance");
        L10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                L10MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                L10MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                L10MouseExited(evt);
            }
        });
        jPanel1.add(L10, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 510, -1, -1));

        L9.setFont(new java.awt.Font("Tahoma", 0, 23)); // NOI18N
        L9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/logout.png"))); // NOI18N
        L9.setText("Logout");
        L9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                L9MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                L9MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                L9MouseExited(evt);
            }
        });
        jPanel1.add(L9, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 550, -1, -1));

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 660));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setText("jLabel4");
        jPanel6.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 270, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel9.setText("System User");
        jPanel6.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 14, 370, 50));

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/minimize.png"))); // NOI18N
        jLabel31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel31MouseClicked(evt);
            }
        });
        jPanel6.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 5, -1, -1));

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/close.png"))); // NOI18N
        jLabel30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel30MouseClicked(evt);
            }
        });
        jPanel6.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 5, -1, -1));

        jPanel3.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 1030, 70));

        jButton1.setBackground(new java.awt.Color(0, 118, 139));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Print Deatlis");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 200, -1, -1));

        tb1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "S_no", "Username", "Full name", "Phone", "Last_login", "Last_logout", "status", "Roll"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tb1.setColumnSelectionAllowed(true);
        tb1.setIntercellSpacing(new java.awt.Dimension(0, 0));
        tb1.setRowHeight(25);
        tb1.setSelectionBackground(new java.awt.Color(102, 153, 255));
        tb1.setShowVerticalLines(false);
        jScrollPane1.setViewportView(tb1);
        tb1.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 280, 970, 340));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel17.setText("User List");
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 240, -1, 40));

        p11.setBackground(new java.awt.Color(255, 255, 255));
        p11.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        p11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        l2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        l2.setText("12200");
        p11.add(l2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, -1, -1));
        p11.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 13, -1, -1));

        jLabel105.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel105.setText("Total User");
        p11.add(jLabel105, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/s1.png"))); // NOI18N
        p11.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-3, -7, -1, -1));

        jPanel3.add(p11, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, 230, 90));

        cb1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cb1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Default", "Name", "Status", "Roll" }));
        cb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb1ActionPerformed(evt);
            }
        });
        jPanel3.add(cb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 200, 110, 40));

        jButton2.setBackground(new java.awt.Color(0, 118, 139));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("+ Add ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 200, -1, -1));

        jButton3.setBackground(new java.awt.Color(0, 118, 139));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Update");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 200, -1, -1));

        p21.setBackground(new java.awt.Color(255, 255, 255));
        p21.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/s2.png"))); // NOI18N
        p21.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(-3, 3, 90, 80));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 23)); // NOI18N
        jLabel10.setText("Active Login");
        p21.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, -1, 40));

        l6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        l6.setText("This Month");
        p21.add(l6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, -1, 40));

        l3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        l3.setText("12200");
        p21.add(l3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, -1, -1));

        jPanel3.add(p21, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 90, 230, 90));

        p22.setBackground(new java.awt.Color(255, 255, 255));
        p22.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/s3.png"))); // NOI18N
        p22.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(-3, 3, 90, 80));

        l4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        l4.setText("12200");
        p22.add(l4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 23)); // NOI18N
        jLabel13.setText("Admin User");
        p22.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, -1, -1));

        jPanel3.add(p22, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 90, 230, 90));

        p23.setBackground(new java.awt.Color(255, 255, 255));
        p23.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/s4.png"))); // NOI18N
        p23.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(-3, 3, 90, 80));

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel25.setText("Inactive user");
        p23.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, -1, -1));

        l5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        l5.setText("12200");
        p23.add(l5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, -1, -1));

        jPanel3.add(p23, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 90, 230, 90));

        tf1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tf1KeyPressed(evt);
            }
        });
        jPanel3.add(tf1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 200, 290, 40));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1270, 650));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
String jb="",bg="";
    private void cb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb1ActionPerformed
        // TODO add your handling code here:
        jb=(String)cb1.getSelectedItem();
        int count=0;
        if(jb.equals("Name"))
        {
            bg=JOptionPane.showInputDialog("enter Name");
            if(bg==null)
            {
                JOptionPane.showMessageDialog(this,"invalid Name plz enter valid Name");
                try
                {
                    model=(DefaultTableModel) tb1.getModel();
                    model.setRowCount(0);
                    q = "select * from user_account;";
                    rs = st.executeQuery(q);
                    while (rs.next()) 
                    {
                        username = rs.getString("username");
                        fullname = rs.getString("full_name");
                        phone = rs.getLong("phone");
                        lastlogin = rs.getString("last_login");
                        lastlogout = rs.getString("last_logout");
                        status = rs.getString("status");
                        roll=rs.getString("roll");
                        sno=rs.getLong("s_no");
                        model.addRow(new Object[]{sno,username,fullname,phone,lastlogin,lastlogout,status,roll}
                        );
                    }
                }
                catch(Exception e)
                {
                    JOptionPane.showMessageDialog(this,"error in this connection");
                }
            }
            else
            {
                model=(DefaultTableModel) tb1.getModel();
                model.setRowCount(0);
                try
                {
                    q = "select * from user_account where full_name='"+bg+"';";
                    rs = st.executeQuery(q);
                    while (rs.next()) 
                    {
                        username = rs.getString("username");
                        fullname = rs.getString("full_name");
                        phone = rs.getLong("phone");
                        lastlogin = rs.getString("last_login");
                        lastlogout = rs.getString("last_logout");
                        status = rs.getString("status");
                        roll=rs.getString("roll");
                        sno=rs.getLong("s_no");
                        model.addRow(new Object[]{sno,username,fullname,phone,lastlogin,lastlogout,status,roll}
                        );
                    }
                }
                catch(Exception e)
                {
                    JOptionPane.showMessageDialog(this,"error in name\n"+e);
                }
            }
        }
        if(jb.equals("Roll"))
        {
            bg=JOptionPane.showInputDialog("enter Roll");
            if(bg==null)
            {
                JOptionPane.showMessageDialog(this,"invalid Roll plz enter valid Roll");
                try
                {
                    model=(DefaultTableModel) tb1.getModel();
                    model.setRowCount(0);
                    q = "select * from user_account;";
                    rs = st.executeQuery(q);
                    while (rs.next()) 
                    {
                        username = rs.getString("username");
                        fullname = rs.getString("full_name");
                        phone = rs.getLong("phone");
                        lastlogin = rs.getString("last_login");
                        lastlogout = rs.getString("last_logout");
                        status = rs.getString("status");
                        roll=rs.getString("roll");
                        sno=rs.getLong("s_no");
                        model.addRow(new Object[]{sno,username,fullname,phone,lastlogin,lastlogout,status,roll}
                        );
                    }
                }
                catch(Exception e)
                {
                    JOptionPane.showMessageDialog(this,"error in this connection");
                }
            }
            else
            {
                model=(DefaultTableModel) tb1.getModel();
                model.setRowCount(0);
                try
                {
                    q = "select * from user_account where roll='"+bg+"';";
                    rs = st.executeQuery(q);
                    while (rs.next()) 
                    {
                        username = rs.getString("username");
                        fullname = rs.getString("full_name");
                        phone = rs.getLong("phone");
                        lastlogin = rs.getString("last_login");
                        lastlogout = rs.getString("last_logout");
                        status = rs.getString("status");
                        roll=rs.getString("roll");
                        sno=rs.getLong("s_no");
                        model.addRow(new Object[]{sno,username,fullname,phone,lastlogin,lastlogout,status,roll}
                        );
                    }
                }
                catch(Exception e)
                {

                }
            }
        }
        if(jb.equals("blood_group"))
        {
            bg=JOptionPane.showInputDialog("enter Name");
            if(bg==null)
            {
                JOptionPane.showMessageDialog(this,"invalid Name plz enter valid Name");
                try
                {
                    model=(DefaultTableModel) tb1.getModel();
                    model.setRowCount(0);
                    q = "select * from user_account;";
                    rs = st.executeQuery(q);
                    while (rs.next()) 
                    {
                        username = rs.getString("username");
                        fullname = rs.getString("full_name");
                        phone = rs.getLong("phone");
                        lastlogin = rs.getString("last_login");
                        lastlogout = rs.getString("last_logout");
                        status = rs.getString("status");
                        roll=rs.getString("roll");
                        sno=rs.getLong("s_no");
                        model.addRow(new Object[]{sno,username,fullname,phone,lastlogin,lastlogout,status,roll}
                        );
                    }
                }
                catch(Exception e)
                {
                    JOptionPane.showMessageDialog(this,"error in this connection");
                }
            }
            else
            {
                model=(DefaultTableModel) tb1.getModel();
                model.setRowCount(0);
                try
                {
                    q = "select * from user_account where fullname='"+bg+"';";
                    rs = st.executeQuery(q);
                    while (rs.next()) 
                    {
                        username = rs.getString("username");
                        fullname = rs.getString("full_name");
                        phone = rs.getLong("phone");
                        lastlogin = rs.getString("last_login");
                        lastlogout = rs.getString("last_logout");
                        status = rs.getString("status");
                        roll=rs.getString("roll");
                        sno=rs.getLong("s_no");
                        model.addRow(new Object[]{sno,username,fullname,phone,lastlogin,lastlogout,status,roll}
                        );
                    }
                }
                catch(Exception e)
                {
                    JOptionPane.showMessageDialog(this,"");
                }
            }
        }
        if(jb.equals("Status"))
        {
            bg=JOptionPane.showInputDialog("enter Status");
            if(bg==null)
            {
                JOptionPane.showMessageDialog(this,"invalid Status plz enter valid Status");
                try
                {
                    model=(DefaultTableModel) tb1.getModel();
                    model.setRowCount(0);
                    q = "select * from user_account;";
                    rs = st.executeQuery(q);
                    while (rs.next()) 
                    {
                        username = rs.getString("username");
                        fullname = rs.getString("full_name");
                        phone = rs.getLong("phone");
                        lastlogin = rs.getString("last_login");
                        lastlogout = rs.getString("last_logout");
                        status = rs.getString("status");
                        roll=rs.getString("roll");
                        sno=rs.getLong("s_no");
                        model.addRow(new Object[]{sno,username,fullname,phone,lastlogin,lastlogout,status,roll}
                        );
                    }
                }
                catch(Exception e)
                {
                    JOptionPane.showMessageDialog(this,"error in this connection");
                }
            }
            else
            {
                model=(DefaultTableModel) tb1.getModel();
                model.setRowCount(0);
                try
                {
                    q = "select * from user_account where status='"+bg+"';";
                    rs = st.executeQuery(q);
                    while (rs.next()) 
                    {
                        username = rs.getString("username");
                        fullname = rs.getString("full_name");
                        phone = rs.getLong("phone");
                        lastlogin = rs.getString("last_login");
                        lastlogout = rs.getString("last_logout");
                        status = rs.getString("status");
                        roll=rs.getString("roll");
                        sno=rs.getLong("s_no");
                        model.addRow(new Object[]{sno,username,fullname,phone,lastlogin,lastlogout,status,roll}
                        );
                    }
                }
                catch(Exception e)
                {

                }
            }
        }
        if(jb.equals("Default"))
        {
            model=(DefaultTableModel) tb1.getModel();
            model.setRowCount(0);
            try
            {
                q = "select * from user_account;";
                rs = st.executeQuery(q);
                while (rs.next()) 
                {
                    username = rs.getString("username");
                    fullname = rs.getString("full_name");
                    phone = rs.getLong("phone");
                    lastlogin = rs.getString("last_login");
                    lastlogout = rs.getString("last_logout");
                    status = rs.getString("status");
                    roll=rs.getString("roll");
                    sno=rs.getLong("s_no");
                    model.addRow(new Object[]{sno,username,fullname,phone,lastlogin,lastlogout,status,roll}
                    );
                }
            }
            catch(Exception e)
            {

            }
        }
    }//GEN-LAST:event_cb1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try
        {
            PrinterJob job = PrinterJob.getPrinterJob();
            boolean doPrint = tb1.print();
            if(doPrint) 
            {
                job.print();  
                JOptionPane.showMessageDialog(null,"Printing successful!");
            } 
        }
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null,"print error");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void L9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_L9MouseExited
        // TODO add your handling code here:
        L9.setForeground(Color.black);
        L9.setOpaque(false);
    }//GEN-LAST:event_L9MouseExited

    private void L9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_L9MouseEntered
        // TODO add your handling code here:
        L9.setForeground(Color.red);
        L9.setBackground(Color.yellow);
        L9.setOpaque(true);
    }//GEN-LAST:event_L9MouseEntered

    private void L9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_L9MouseClicked
        // TODO add your handling code here:
        login l = new login();
        l.lst_logout();
        l.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_L9MouseClicked

    private void L10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_L10MouseExited
        // TODO add your handling code here:
        L8.setForeground(Color.black);
        L8.setOpaque(false);
    }//GEN-LAST:event_L10MouseExited

    private void L10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_L10MouseEntered
        // TODO add your handling code here:
        L8.setForeground(Color.red);
        L8.setBackground(Color.yellow);
        L8.setOpaque(true);
    }//GEN-LAST:event_L10MouseEntered

    private void L10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_L10MouseClicked
        // TODO add your handling code here:
        attendance a=new attendance();
        a.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_L10MouseClicked

    private void L8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_L8MouseExited
        // TODO add your handling code here:
        L8.setForeground(Color.black);
        L8.setOpaque(false);
    }//GEN-LAST:event_L8MouseExited

    private void L8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_L8MouseEntered
        // TODO add your handling code here:
        L8.setForeground(Color.red);
        L8.setBackground(Color.yellow);
        L8.setOpaque(true);
    }//GEN-LAST:event_L8MouseEntered

    private void L8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_L8MouseClicked
        // TODO add your handling code here:
        appointment_dashboard ad=new appointment_dashboard();
        ad.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_L8MouseClicked

    private void jLabel8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseExited
        // TODO add your handling code here:
        jLabel8.setForeground(Color.black);
        jLabel8.setOpaque(false);
    }//GEN-LAST:event_jLabel8MouseExited

    private void jLabel8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseEntered
        // TODO add your handling code here:
        jLabel8.setForeground(Color.red);
        jLabel8.setBackground(Color.yellow);
        jLabel8.setOpaque(true);
    }//GEN-LAST:event_jLabel8MouseEntered

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // TODO add your handling code here:
        appointment_dashboard ad=new appointment_dashboard();
        ad.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseExited
        // TODO add your handling code here:
        jLabel5.setForeground(Color.black);
        jLabel5.setOpaque(false);
    }//GEN-LAST:event_jLabel5MouseExited

    private void jLabel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseEntered
        // TODO add your handling code here:
        jLabel5.setForeground(Color.red);
        jLabel5.setBackground(Color.yellow);
        jLabel5.setOpaque(true);
    }//GEN-LAST:event_jLabel5MouseEntered

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
        Bill_DashBoard bd=new Bill_DashBoard();
        bd.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseExited
        // TODO add your handling code here:
        jLabel6.setForeground(Color.black);
        jLabel6.setOpaque(false);
    }//GEN-LAST:event_jLabel6MouseExited

    private void jLabel6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseEntered
        // TODO add your handling code here:
        jLabel6.setForeground(Color.red);
        jLabel6.setBackground(Color.yellow);
        jLabel6.setOpaque(true);
    }//GEN-LAST:event_jLabel6MouseEntered

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseExited
        // TODO add your handling code here:
        jLabel7.setForeground(Color.black);
        jLabel7.setOpaque(false);
    }//GEN-LAST:event_jLabel7MouseExited

    private void jLabel7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseEntered
        // TODO add your handling code here:
        jLabel7.setForeground(Color.red);
        jLabel7.setBackground(Color.yellow);
        jLabel7.setOpaque(true);
    }//GEN-LAST:event_jLabel7MouseEntered

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        // TODO add your handling code here:
        medical_record mr=new medical_record();
        mr.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseExited
        // TODO add your handling code here:
        jLabel3.setForeground(Color.black);
        jLabel3.setOpaque(false);
    }//GEN-LAST:event_jLabel3MouseExited

    private void jLabel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseEntered
        // TODO add your handling code here:
        jLabel3.setForeground(Color.red);
        jLabel3.setBackground(Color.yellow);
        jLabel3.setOpaque(true);
    }//GEN-LAST:event_jLabel3MouseEntered

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        this .setVisible(false);
        employee_management em=new employee_management();
        em.setVisible(true);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseExited
        // TODO add your handling code here:
        jLabel1.setForeground(Color.black);
        jLabel1.setOpaque(false);
    }//GEN-LAST:event_jLabel1MouseExited

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
        // TODO add your handling code here:
        jLabel1.setForeground(Color.red);
        jLabel1.setBackground(Color.yellow);
        jLabel1.setOpaque(true);
    }//GEN-LAST:event_jLabel1MouseEntered

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        Doctor_Mangement dm=new Doctor_Mangement();
        dm.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void l1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l1MouseExited
        // TODO add your handling code here:
        l1.setForeground(Color.black);
        l1.setOpaque(false);
    }//GEN-LAST:event_l1MouseExited

    private void l1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l1MouseEntered
        // TODO add your handling code here:
        l1.setForeground(Color.red);
        l1.setBackground(Color.yellow);
        l1.setOpaque(true);
    }//GEN-LAST:event_l1MouseEntered

    private void p12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p12MouseClicked
        // TODO add your handling code here:
        DashBoard db=new DashBoard();
        db.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_p12MouseClicked

    private void jLabel16MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseExited
        // TODO add your handling code here:
        jLabel16.setForeground(Color.white);
    }//GEN-LAST:event_jLabel16MouseExited

    private void jLabel16MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseEntered
        // TODO add your handling code here:
        jLabel16.setForeground(Color.BLUE);
    }//GEN-LAST:event_jLabel16MouseEntered

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        // TODO add your handling code here:
        DashBoard db=new DashBoard();
        db.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel16MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Add_user au=new Add_user();
        au.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        Update_user uu=new Update_user();
        uu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void tf1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf1KeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()>=65 && evt.getKeyCode()<=90 || evt.getKeyCode()==32)
        {
            model=(DefaultTableModel) tb1.getModel();
            model.setRowCount(0);
            jlbel=jlbel+evt.getKeyChar();
            try
            {
                q="select * from user_account where username like '"+jlbel+"%';";
                rs = st.executeQuery(q);
                while (rs.next()) 
                {
                    username = rs.getString("username");
                    fullname = rs.getString("full_name");
                    phone = rs.getLong("phone");
                    lastlogin = rs.getString("last_login");
                    lastlogout = rs.getString("last_logout");
                    status = rs.getString("status");
                    roll=rs.getString("roll");
                    sno=rs.getLong("s_no");
                    model.addRow(new Object[]{sno,username,fullname,phone,lastlogin,lastlogout,status,roll}
                    );
                }
            }
            catch(Exception e)
            {

            }
        }
        if(evt.getKeyCode()==8)
        {
            int c=0;
            if(tf1.getText().equals(""))
            {
                c=1;
            }
            if(c==0)
            {
                model=(DefaultTableModel) tb1.getModel();
                model.setRowCount(0);
                jlbel=jlbel.substring(0,jlbel.length()-1);
                try
                {
                    q="select * from user_account where username like '"+jlbel+"%';";
                    rs=st.executeQuery(q);
                    while (rs.next()) 
                    {
                        username = rs.getString("username");
                        fullname = rs.getString("full_name");
                        phone = rs.getLong("phone");
                        lastlogin = rs.getString("last_login");
                        lastlogout = rs.getString("last_logout");
                        status = rs.getString("status");
                        roll=rs.getString("roll");
                        sno=rs.getLong("s_no");
                        model.addRow(new Object[]{sno,username,fullname,phone,lastlogin,lastlogout,status,roll}
                        );
                    }
                }
                catch(Exception e)
                {

                }
            }
        }
    }//GEN-LAST:event_tf1KeyPressed

    private void l1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l1MouseClicked
        // TODO add your handling code here:
        Patient_Mangement pm=new Patient_Mangement();
        pm.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_l1MouseClicked

    private void jLabel31MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel31MouseClicked
        // TODO add your handling code here:
        this.setExtendedState(DashBoard.ICONIFIED);
    }//GEN-LAST:event_jLabel31MouseClicked

    private void jLabel30MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel30MouseClicked
        // TODO add your handling code here:
        login l = new login();
        l.lst_logout();
        l.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel30MouseClicked

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
            java.util.logging.Logger.getLogger(Systemuser_dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Systemuser_dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Systemuser_dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Systemuser_dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Systemuser_dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel L10;
    private javax.swing.JLabel L8;
    private javax.swing.JLabel L9;
    private javax.swing.JComboBox<String> cb1;
    private javax.swing.JLabel img1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l2;
    private javax.swing.JLabel l3;
    private javax.swing.JLabel l4;
    private javax.swing.JLabel l5;
    private javax.swing.JLabel l6;
    private p1 p11;
    private p1 p12;
    private panel.p2 p21;
    private panel.p2 p22;
    private panel.p2 p23;
    private javax.swing.JTable tb1;
    private search.search5 tf1;
    // End of variables declaration//GEN-END:variables
}
