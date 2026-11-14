
package billing_and_invoice;

import System_user.Systemuser_dashboard;
import appointment.appointment_dashboard;
import hospital.*;
import employee.*;
import doctor.*;
import medical.*;
import patient.*;
import panel.*;
import search.search;
import dashboard.*;
import attendance.*;
import login.*;
import appointment.*;

import java.awt.*;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.Date;
import java.text.SimpleDateFormat;

public class add_Billing extends javax.swing.JFrame {

    Connection con;
    Statement st;
    ResultSet rs;
    String q;
    int sum;
    double discount;
    double tax;
    double total_amount;
    //patient detalis
    
    int pdid=0;
    int pdage=0;
    int pdroomnumber=0;
    String pdname="";
    String pdadmissiondate="";
    String pdgender="";
    String pdblood="";
    String pdaddress="";
    String pdphone="";
    
    //doctor detalis
    
    String ddname="";
    String ddphone="";
    String dspec="";
    Date d;
    SimpleDateFormat sdf;
    public add_Billing() {
        initComponents();
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        jScrollPane1.setPreferredSize(new Dimension(screen.width,screen.height-50));
        jScrollPane1.setHorizontalScrollBarPolicy(jScrollPane1.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        jScrollPane1.setVerticalScrollBarPolicy(jScrollPane1.VERTICAL_SCROLLBAR_AS_NEEDED);
        setSize(screen.width, screen.height-50);
        d=new Date();
        sdf=new SimpleDateFormat("YYYY-MM-dd");
        tf2.setText(""+sdf.format(d));
        tf1.setEditable(false);
        tf2.setEditable(false);
        try
        {
            int id=0;
            Class.forName("java.sql.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/health_care", "root", "");
            st=con.createStatement();
            q="select * from billing_detalis;";
            rs=st.executeQuery(q);
            while(rs.next())
            {
                id=rs.getInt("bill_no");
            }
            tf1.setText(""+(id+1));
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this,"error in connection");
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel21 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        img1 = new javax.swing.JLabel();
        p12 = new p1();
        l8 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        l2 = new javax.swing.JLabel();
        l3 = new javax.swing.JLabel();
        l5 = new javax.swing.JLabel();
        l6 = new javax.swing.JLabel();
        l7 = new javax.swing.JLabel();
        l1 = new javax.swing.JLabel();
        l4 = new javax.swing.JLabel();
        L8 = new javax.swing.JLabel();
        L9 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tf4 = new javax.swing.JTextField();
        tf3 = new javax.swing.JTextField();
        tf5 = new javax.swing.JTextField();
        tf6 = new javax.swing.JTextField();
        tf7 = new javax.swing.JTextField();
        tf8 = new javax.swing.JTextField();
        tf9 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        tf10 = new javax.swing.JTextField();
        tf11 = new javax.swing.JTextField();
        tf12 = new javax.swing.JTextField();
        tf13 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        tf1 = new javax.swing.JTextField();
        tf2 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        tf15 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tb1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        ll1 = new javax.swing.JLabel();
        ll2 = new javax.swing.JLabel();
        ll3 = new javax.swing.JLabel();
        ll4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        print = new javax.swing.JButton();
        remove = new javax.swing.JButton();
        tg1 = new javax.swing.JToggleButton();
        tf14 = new javax.swing.JComboBox<>();

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel21.setText("SUBTOTAL                                             15,530");
        jLabel21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jPanel2.setBackground(new java.awt.Color(153, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(0, 118, 139));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel5.add(img1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 110));

        p12.setBackground(new java.awt.Color(4, 146, 160));
        p12.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        p12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p12MouseClicked(evt);
            }
        });
        p12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        l8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        l8.setForeground(new java.awt.Color(255, 255, 255));
        l8.setText(" DashBoard");
        l8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l8MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                l8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                l8MouseExited(evt);
            }
        });
        p12.add(l8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 7, -1, -1));

        jPanel5.add(p12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 240, 50));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/copy1.png"))); // NOI18N
        jPanel5.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 90));

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 187));

        l2.setFont(new java.awt.Font("Tahoma", 0, 23)); // NOI18N
        l2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icon2.png"))); // NOI18N
        l2.setText("Doctor Mangement");
        l2.setAlignmentX(4.0F);
        l2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                l2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                l2MouseExited(evt);
            }
        });
        jPanel3.add(l2, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 240, -1, -1));

        l3.setFont(new java.awt.Font("Tahoma", 0, 23)); // NOI18N
        l3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icon4.png"))); // NOI18N
        l3.setText("Employee Mangement");
        l3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                l3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                l3MouseExited(evt);
            }
        });
        jPanel3.add(l3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, -1, -1));

        l5.setFont(new java.awt.Font("Tahoma", 0, 23)); // NOI18N
        l5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icon7.png"))); // NOI18N
        l5.setText("System User");
        l5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                l5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                l5MouseExited(evt);
            }
        });
        jPanel3.add(l5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, -1, -1));

        l6.setFont(new java.awt.Font("Tahoma", 0, 23)); // NOI18N
        l6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icon8.png"))); // NOI18N
        l6.setText("Billing and Invoice");
        l6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                l6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                l6MouseExited(evt);
            }
        });
        jPanel3.add(l6, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 400, -1, -1));

        l7.setFont(new java.awt.Font("Tahoma", 0, 23)); // NOI18N
        l7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icon5.png"))); // NOI18N
        l7.setText("Appointment");
        l7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l7MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                l7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                l7MouseExited(evt);
            }
        });
        jPanel3.add(l7, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 440, -1, -1));

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
        jPanel3.add(l1, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 200, -1, -1));

        l4.setFont(new java.awt.Font("Tahoma", 0, 23)); // NOI18N
        l4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icon6.png"))); // NOI18N
        l4.setText("Medical Record");
        l4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                l4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                l4MouseExited(evt);
            }
        });
        jPanel3.add(l4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, -1, -1));

        L8.setFont(new java.awt.Font("Tahoma", 0, 23)); // NOI18N
        L8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/at1.png"))); // NOI18N
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
        jPanel3.add(L8, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 480, -1, -1));

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
        jPanel3.add(L9, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 520, -1, -1));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 760));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel29.setText("jLabel4");
        jPanel6.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 270, -1, -1));

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel30.setText("Create Invoice");
        jPanel6.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 14, 280, 50));

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/minimize.png"))); // NOI18N
        jLabel31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel31MouseClicked(evt);
            }
        });
        jPanel6.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 5, -1, -1));

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/close.png"))); // NOI18N
        jLabel32.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel32MouseClicked(evt);
            }
        });
        jPanel6.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 5, -1, -1));

        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 1030, 70));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel1.setText("Phone No");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 220, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Doctor Detalis");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 90, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel3.setText("Doctor Name");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 140, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel5.setText("Specailist");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 180, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("Patient Detalis");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 230, -1, -1));

        jSeparator2.setForeground(new java.awt.Color(51, 51, 51));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 265, 970, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel6.setText("Address");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 390, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel7.setText("Patient Name");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 310, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel8.setText("Patient ID");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 270, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel9.setText("Age / Gender");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 350, -1, -1));
        jPanel2.add(tf4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 180, 210, -1));

        tf3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tf3KeyPressed(evt);
            }
        });
        jPanel2.add(tf3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 140, 210, -1));
        jPanel2.add(tf5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 220, 210, -1));

        tf6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tf6KeyPressed(evt);
            }
        });
        jPanel2.add(tf6, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 270, 210, -1));

        tf7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tf7KeyPressed(evt);
            }
        });
        jPanel2.add(tf7, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 310, 210, -1));
        jPanel2.add(tf8, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 350, 210, -1));
        jPanel2.add(tf9, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 390, 210, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel10.setText("Phone");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 270, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel11.setText("Blood Group");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 310, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel12.setText("Room Number");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 350, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel13.setText("Addmission Date");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 390, -1, -1));
        jPanel2.add(tf10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 270, 210, -1));
        jPanel2.add(tf11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 310, 210, -1));
        jPanel2.add(tf12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 350, 210, -1));
        jPanel2.add(tf13, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 390, 210, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel14.setText("Invoice Detalis");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, -1, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel16.setText("Date");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 180, -1, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel17.setText("Bill No");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, -1, -1));
        jPanel2.add(tf1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 140, 210, -1));
        jPanel2.add(tf2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 180, 210, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel15.setText("Add Service / Item");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 430, -1, -1));

        jSeparator3.setForeground(new java.awt.Color(51, 51, 51));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 462, 970, -1));

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel18.setText("Service / Item");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 480, -1, -1));

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel19.setText("Amount");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 480, -1, -1));

        tf15.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tf15KeyPressed(evt);
            }
        });
        jPanel2.add(tf15, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 480, 160, -1));

        tb1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Description", "Amount"
            }
        ));
        jScrollPane2.setViewportView(tb1);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 530, 420, 200));

        jPanel1.setBackground(new java.awt.Color(153, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ll1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ll1.setText("SUBTOTAL                                             0");
        ll1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(ll1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 1, 518, 51));

        ll2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ll2.setText("Discount                                                 0");
        ll2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(ll2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 50, 518, 51));

        ll3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ll3.setText("TAXABLE AMOUNT                                   0");
        ll3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(ll3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 100, 518, 51));

        ll4.setBackground(new java.awt.Color(204, 204, 204));
        ll4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ll4.setText("Total AMOUNT                                         0");
        ll4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(ll4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 150, 518, 51));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 530, 480, 200));

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton2.setText("Preview");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 480, 100, -1));

        print.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        print.setText("Print");
        print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printActionPerformed(evt);
            }
        });
        jPanel2.add(print, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 480, -1, -1));

        remove.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        remove.setText("Remove");
        remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeActionPerformed(evt);
            }
        });
        jPanel2.add(remove, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 480, -1, -1));

        tg1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tg1.setText("Paid");
        tg1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tg1ActionPerformed(evt);
            }
        });
        jPanel2.add(tg1, new org.netbeans.lib.awtextra.AbsoluteConstraints(897, 480, -1, -1));

        tf14.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Consultation Charges", "Room Charges", "Nursing Charges", "Investigation charges", "medicine Charges", "Injection & Consumables", "Procedure Charges", "Diet Charges", "MRI Charges" }));
        jPanel2.add(tf14, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 480, 190, -1));

        jScrollPane1.setViewportView(jPanel2);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 650));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void l8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l8MouseClicked
        // TODO add your handling code here:
        DashBoard db=new DashBoard();
        db.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_l8MouseClicked

    private void l8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l8MouseEntered
        // TODO add your handling code here:
        l8.setForeground(Color.BLUE);
    }//GEN-LAST:event_l8MouseEntered

    private void l8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l8MouseExited
        // TODO add your handling code here:
        l8.setForeground(Color.white);
    }//GEN-LAST:event_l8MouseExited

    private void p12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p12MouseClicked
        // TODO add your handling code here:
        DashBoard db=new DashBoard();
        db.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_p12MouseClicked

    private void l2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l2MouseClicked
        // TODO add your handling code here:
        Doctor_Mangement dc=new Doctor_Mangement();
        dc.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_l2MouseClicked

    private void l2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l2MouseEntered
        // TODO add your handling code here:
        l2.setForeground(Color.red);
        l2.setBackground(Color.yellow);
        l2.setOpaque(true);
    }//GEN-LAST:event_l2MouseEntered

    private void l2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l2MouseExited
        // TODO add your handling code here:
        l2.setForeground(Color.black);
        l2.setOpaque(false);
    }//GEN-LAST:event_l2MouseExited

    private void l3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l3MouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        employee_management em=new employee_management();
        em.setVisible(true);
    }//GEN-LAST:event_l3MouseClicked

    private void l3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l3MouseEntered
        // TODO add your handling code here:
        l3.setForeground(Color.red);
        l3.setBackground(Color.yellow);
        l3.setOpaque(true);
    }//GEN-LAST:event_l3MouseEntered

    private void l3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l3MouseExited
        // TODO add your handling code here:
        l3.setForeground(Color.black);
        l3.setOpaque(false);
    }//GEN-LAST:event_l3MouseExited

    private void l5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l5MouseEntered
        // TODO add your handling code here:
        l5.setForeground(Color.red);
        l5.setBackground(Color.yellow);
        l5.setOpaque(true);
    }//GEN-LAST:event_l5MouseEntered

    private void l5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l5MouseExited
        // TODO add your handling code here:
        l5.setForeground(Color.black);
        l5.setOpaque(false);
    }//GEN-LAST:event_l5MouseExited

    private void l6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l6MouseEntered
        // TODO add your handling code here:
        l6.setForeground(Color.red);
        l6.setBackground(Color.yellow);
        l6.setOpaque(true);
    }//GEN-LAST:event_l6MouseEntered

    private void l6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l6MouseExited
        // TODO add your handling code here:
        l6.setForeground(Color.black);
        l6.setOpaque(false);
    }//GEN-LAST:event_l6MouseExited

    private void l7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l7MouseEntered
        // TODO add your handling code here:
        l7.setForeground(Color.red);
        l7.setBackground(Color.yellow);
        l7.setOpaque(true);
    }//GEN-LAST:event_l7MouseEntered

    private void l7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l7MouseExited
        // TODO add your handling code here:
        l7.setForeground(Color.black);
        l7.setOpaque(false);
    }//GEN-LAST:event_l7MouseExited

    private void l1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l1MouseClicked
        // TODO add your handling code here:
        Patient_Mangement pm=new Patient_Mangement();
        pm.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_l1MouseClicked

    private void l1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l1MouseEntered
        // TODO add your handling code here:
        l1.setForeground(Color.red);
        l1.setBackground(Color.yellow);
        l1.setOpaque(true);
    }//GEN-LAST:event_l1MouseEntered

    private void l1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l1MouseExited
        // TODO add your handling code here:
        l1.setForeground(Color.black);
        l1.setOpaque(false);
    }//GEN-LAST:event_l1MouseExited

    private void l4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l4MouseEntered
        // TODO add your handling code here:
        l4.setForeground(Color.red);
        l4.setBackground(Color.yellow);
        l4.setOpaque(true);
    }//GEN-LAST:event_l4MouseEntered

    private void l4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l4MouseExited
        // TODO add your handling code here:
        l4.setForeground(Color.black);
        l4.setOpaque(false);
    }//GEN-LAST:event_l4MouseExited

    private void l4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l4MouseClicked
        // TODO add your handling code here:
        medical_record mr=new medical_record();
        mr.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_l4MouseClicked

    private void tf7KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf7KeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==10)
        {
            String name=tf7.getText();
            try
            {
                Class.forName("java.sql.Driver");
                con=DriverManager.getConnection("jdbc:mysql://localhost:3306/health_care", "root", "");
                st=con.createStatement();
                q="select * from patient_detalis where patient_name='"+name+"';";
                rs=st.executeQuery(q);
                while(rs.next())
                {
                    pdid=rs.getInt("patient_id");
                    pdname=rs.getString("patient_name");
                    pdadmissiondate=rs.getString("addmission_date");
                    pdgender=rs.getString("gender");
                    pdroomnumber=rs.getInt("room_number");
                    pdblood=rs.getString("blood_group");
                    pdaddress=rs.getString("address");
                    pdage=rs.getInt("age");
                    pdphone=rs.getString("phone");
                }
                tf6.setText(""+pdid);
                tf8.setText(""+pdage+" / "+pdgender);
                tf9.setText(pdaddress);
                tf10.setText(pdphone);
                tf11.setText(pdblood);
                tf12.setText(""+pdroomnumber);
                tf13.setText(pdadmissiondate);
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(this,"error in connection");
            }
        }
    }//GEN-LAST:event_tf7KeyPressed

    private void tf6KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf6KeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==10)
        {
            int id=Integer.parseInt(tf6.getText());
            try
            {
                Class.forName("java.sql.Driver");
                con=DriverManager.getConnection("jdbc:mysql://localhost:3306/health_care", "root", "");
                st=con.createStatement();
                q="select * from patient_detalis where patient_id='"+id+"';";
                rs=st.executeQuery(q);
                while(rs.next())
                {
                    pdid=rs.getInt("patient_id");
                    pdname=rs.getString("patient_name");
                    pdadmissiondate=rs.getString("addmission_date");
                    pdgender=rs.getString("gender");
                    pdroomnumber=rs.getInt("room_number");
                    pdblood=rs.getString("blood_group");
                    pdaddress=rs.getString("address");
                    pdage=rs.getInt("age");
                    pdphone=rs.getString("phone");
                }
                tf7.setText(""+pdname);
                tf8.setText(""+pdage+" / "+pdgender);
                tf9.setText(pdaddress);
                tf10.setText(pdphone);
                tf11.setText(pdblood);
                tf12.setText(""+pdroomnumber);
                tf13.setText(pdadmissiondate);
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(this,"error in connection");
            }
        }
    }//GEN-LAST:event_tf6KeyPressed

    private void tf3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf3KeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==10)
        {
            String name=tf3.getText();
            try
            {
                Class.forName("java.sql.Driver");
                con=DriverManager.getConnection("jdbc:mysql://localhost:3306/health_care", "root", "");
                st=con.createStatement();
                q="select * from doctor_detalis where doctor_name='"+name+"';";
                rs=st.executeQuery(q);
                while(rs.next())
                {
                    ddname=rs.getString("doctor_name");
                    ddphone=rs.getString("phone");
                    dspec=rs.getString("specialist");
                }
                tf4.setText(dspec);
                tf5.setText(ddphone);
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(this,"error in connection");
            }
        }
    }//GEN-LAST:event_tf3KeyPressed

    private void removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model=(DefaultTableModel) tb1.getModel();
        int index=tb1.getSelectedRow();
        if(index>=0)
        {
            sum=sum-Integer.parseInt(tb1.getValueAt(index,1).toString());
            ll1.setText("SUBTOTAL                                             "+sum);
            discount=(sum*5)/100;
            ll2.setText("Discount                                                 "+discount);
            tax=sum-discount;
            tax=(tax*5)/100;
            ll3.setText("TAXABLE AMOUNT                                   "+tax);
            total_amount=(sum-discount)+tax;
            ll4.setText("Total AMOUNT                                         "+total_amount);
            model.removeRow(index);
        }
        else
        {
            JOptionPane.showMessageDialog(this,"No record is selected");
        }
    }//GEN-LAST:event_removeActionPerformed

    private void printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printActionPerformed
        // TODO add your handling code here: code of print button
        boolean valid=true;
        if(tb1.getRowCount()==0)
        {
            JOptionPane.showMessageDialog(this,"plz insert record");
            valid=false;
        }
        if(tf4.getText().equals(""))
        {
            JOptionPane.showMessageDialog(this,"insert doctor detalis");
            valid=false;
        }
        if(tf7.getText().equals(""))
        {
            JOptionPane.showMessageDialog(this,"insert patient_detalis");
            valid=false;
        }
        if(valid==true)
        {
            if(tg1.getText().equals("Paid"))
            {
                ArrayList<String> row=new ArrayList<String>();
                for(int i=0;i<tb1.getRowCount();i++)
                {
                    row.add(tb1.getValueAt(i,0).toString());
                }
                ArrayList<String> column=new ArrayList<String>();
                for(int i=0;i<tb1.getRowCount();i++)
                {
                    column.add(tb1.getValueAt(i,1).toString());
                }
                String msg=row.toString();
                msg=msg.substring(1,msg.length()-1);
                String msg1=column.toString();
                msg1=msg1.substring(1,msg1.length()-1);
                String status=tg1.getText();
                int billno=Integer.parseInt(tf1.getText());
                String date=tf2.getText();
                try
                {
                    q="insert into billing_detalis values("+billno+",'"+date+"',"+pdid+",'"+msg+"','"+msg1+"','"+ddname+"',"+total_amount+",'"+status+"');";
                    st.executeUpdate(q);
                }
                catch(Exception e)
                {
                    JOptionPane.showMessageDialog(this,"error in connection");
                }
                billing_main bm=new billing_main();
                bm.data(sum,discount,tax,total_amount);
                bm.patient_data(pdid,pdname,tf8.getText(),pdaddress,pdphone,pdblood,pdroomnumber,pdadmissiondate);
                bm.doctor_detalis(ddname,dspec,ddphone);
                bm.table_detalis(row, column);
                bm.bill_no(Integer.parseInt(tf1.getText()));
                bm.sp();
                    tf3.setText("");
                    tf4.setText("");
                    tf5.setText("");
                    tf6.setText("");
                    tf7.setText("");
                    tf8.setText("");
                    tf9.setText("");
                    tf10.setText("");
                    tf11.setText("");
                    tf12.setText("");
                    tf13.setText("");
                    DefaultTableModel model=(DefaultTableModel) tb1.getModel();
                    model.setRowCount(0);
                    ll1.setText("SUBTOTAL                                             "+0);
                    ll2.setText("Discount                                                 "+0);
                    ll3.setText("TAXABLE AMOUNT                                   "+0);
                    ll4.setText("Total AMOUNT                                         "+0);
                
            }
            if(tg1.getText().equals("Unpaid"))
            {
                try
                {
                    ArrayList<String> row=new ArrayList<String>();
                    for(int i=0;i<tb1.getRowCount();i++)
                    {
                        row.add(tb1.getValueAt(i,0).toString());
                    }
                    ArrayList<String> column=new ArrayList<String>();
                    for(int i=0;i<tb1.getRowCount();i++)
                    {
                        column.add(tb1.getValueAt(i,1).toString());
                    }
                    String msg=row.toString();
                    msg=msg.substring(1,msg.length()-1);
                    
                    String msg1=column.toString();
                    msg1=msg1.substring(1,msg1.length()-1);
                    
                    String status=tg1.getText();
                    int billno=Integer.parseInt(tf1.getText());
                    String date=tf2.getText();
                    
                    q="insert into billing_detalis values("+billno+",'"+date+"',"+pdid+",'"+msg+"','"+msg1+"','"+ddname+"',"+total_amount+",'"+status+"');";
                    st.executeUpdate(q);
                    
                    JOptionPane.showMessageDialog(this,"this bill was unpaid so bill was not generate");
                    tf3.setText("");
                    tf4.setText("");
                    tf5.setText("");
                    tf6.setText("");
                    tf7.setText("");
                    tf8.setText("");
                    tf9.setText("");
                    tf10.setText("");
                    tf11.setText("");
                    tf12.setText("");
                    tf13.setText("");
                    DefaultTableModel model=(DefaultTableModel) tb1.getModel();
                    model.setRowCount(0);
                    ll1.setText("SUBTOTAL                                             "+0);
                    ll2.setText("Discount                                                 "+0);
                    ll3.setText("TAXABLE AMOUNT                                   "+0);
                    ll4.setText("Total AMOUNT                                         "+0);
                    
                }
                catch(Exception e)
                {
                    JOptionPane.showMessageDialog(this,"error in mysql connection");
                }
            }
        }
    }//GEN-LAST:event_printActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        ArrayList<String> row=new ArrayList<String>();
        for(int i=0;i<tb1.getRowCount();i++)
        {
            row.add(tb1.getValueAt(i,0).toString());
        }
        ArrayList<String> column=new ArrayList<String>();
        for(int i=0;i<tb1.getRowCount();i++)
        {
            column.add(tb1.getValueAt(i,1).toString());
        }
        billing_main bm=new billing_main();
        bm.setVisible(true);
        bm.data(sum,discount,tax,total_amount);
        bm.patient_data(pdid,pdname,tf8.getText(),pdaddress,pdphone,pdblood,pdroomnumber,pdadmissiondate);
        bm.doctor_detalis(ddname,dspec,ddphone);
        bm.table_detalis(row, column);
        bm.bill_no(Integer.parseInt(tf1.getText()));
    }//GEN-LAST:event_jButton2ActionPerformed

    private void l6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l6MouseClicked
        // TODO add your handling code here:
        Bill_DashBoard bd=new Bill_DashBoard();
        bd.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_l6MouseClicked

    private void tf15KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf15KeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==10)
        {
            boolean valid=true;
            if(tf15.getText().equals(""))
            {
                JOptionPane.showMessageDialog(this,"Enter Amount");
                valid=false;
            }
            if(valid==true)
            {
                DefaultTableModel model=(DefaultTableModel) tb1.getModel();
                String item=(String)tf14.getSelectedItem();
                int Amount=Integer.parseInt(tf15.getText());
                model.addRow(new Object[]
                                {item,Amount}
                            );

                sum=sum+Amount;
                ll1.setText("SUBTOTAL                                             "+sum);
                discount=(sum*5)/100;
                ll2.setText("Discount                                                 "+discount);
                tax=sum-discount;
                tax=(tax*5)/100;
                ll3.setText("TAXABLE AMOUNT                                   "+tax);
                total_amount=(sum-discount)+tax;
                ll4.setText("Total AMOUNT                                         "+total_amount);
                tf15.setText("");
            }
        }
    }//GEN-LAST:event_tf15KeyPressed

    private void tg1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tg1ActionPerformed
        // TODO add your handling code here:
        if(tg1.isSelected())
        {
            tg1.setText("Unpaid");
        }
        else
        {
            tg1.setText("Paid");
        }
    }//GEN-LAST:event_tg1ActionPerformed

    private void l5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l5MouseClicked
        // TODO add your handling code here:
        String username=JOptionPane.showInputDialog("Enter Admin Id");
        String password=JOptionPane.showInputDialog("Enter Admin Password");
        if(username.equals("Admin@123") && password.equals("Admin123@123"))
        {
            Systemuser_dashboard sd =new Systemuser_dashboard();
            sd.setVisible(true);
            this.setVisible(false);
        }
        else
        {
            JOptionPane.showMessageDialog(this,"Invalid username and password");
        }
    }//GEN-LAST:event_l5MouseClicked

    private void l7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l7MouseClicked
        // TODO add your handling code here:
        appointment_dashboard ad=new appointment_dashboard();
        ad.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_l7MouseClicked

    private void L8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_L8MouseClicked
        // TODO add your handling code here:
        attendance a=new attendance();
        a.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_L8MouseClicked

    private void L8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_L8MouseEntered
        // TODO add your handling code here:
        L8.setForeground(Color.red);
        L8.setBackground(Color.yellow);
        L8.setOpaque(true);
    }//GEN-LAST:event_L8MouseEntered

    private void L8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_L8MouseExited
        // TODO add your handling code here:
        L8.setForeground(Color.black);
        L8.setOpaque(false);
    }//GEN-LAST:event_L8MouseExited

    private void L9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_L9MouseClicked
        // TODO add your handling code here:
        login l = new login();
        l.lst_logout();
        l.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_L9MouseClicked

    private void L9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_L9MouseEntered
        // TODO add your handling code here:
        L9.setForeground(Color.red);
        L9.setBackground(Color.yellow);
        L9.setOpaque(true);
    }//GEN-LAST:event_L9MouseEntered

    private void L9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_L9MouseExited
        // TODO add your handling code here:
        L9.setForeground(Color.black);
        L9.setOpaque(false);
    }//GEN-LAST:event_L9MouseExited

    private void jLabel31MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel31MouseClicked
        // TODO add your handling code here:
        this.setExtendedState(DashBoard.ICONIFIED);
    }//GEN-LAST:event_jLabel31MouseClicked

    private void jLabel32MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel32MouseClicked
        // TODO add your handling code here:
        login l = new login();
        l.lst_logout();
        l.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel32MouseClicked

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
            java.util.logging.Logger.getLogger(add_Billing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(add_Billing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(add_Billing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(add_Billing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new add_Billing().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel L8;
    private javax.swing.JLabel L9;
    private javax.swing.JLabel img1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l2;
    private javax.swing.JLabel l3;
    private javax.swing.JLabel l4;
    private javax.swing.JLabel l5;
    private javax.swing.JLabel l6;
    private javax.swing.JLabel l7;
    private javax.swing.JLabel l8;
    private javax.swing.JLabel ll1;
    private javax.swing.JLabel ll2;
    private javax.swing.JLabel ll3;
    private javax.swing.JLabel ll4;
    private p1 p12;
    private javax.swing.JButton print;
    private javax.swing.JButton remove;
    private javax.swing.JTable tb1;
    private javax.swing.JTextField tf1;
    private javax.swing.JTextField tf10;
    private javax.swing.JTextField tf11;
    private javax.swing.JTextField tf12;
    private javax.swing.JTextField tf13;
    private javax.swing.JComboBox<String> tf14;
    private javax.swing.JTextField tf15;
    private javax.swing.JTextField tf2;
    private javax.swing.JTextField tf3;
    private javax.swing.JTextField tf4;
    private javax.swing.JTextField tf5;
    private javax.swing.JTextField tf6;
    private javax.swing.JTextField tf7;
    private javax.swing.JTextField tf8;
    private javax.swing.JTextField tf9;
    private javax.swing.JToggleButton tg1;
    // End of variables declaration//GEN-END:variables
}
