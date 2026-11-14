package medical;

import billing_and_invoice.*;
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
import javax.swing.JFrame; 

public class add_medical_bill extends javax.swing.JFrame {

    Connection con;
    Statement st;
    ResultSet rs;
    String q;
    int sum=0;
    double discount;
    double tax;
    double total_amount;
    int qutity=0;
    long md_id=0;
    String id="";
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
    public add_medical_bill() {
        initComponents();
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        //this.setSize(new Dimension(screen.width,screen.height-50));
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
            q="select * from medicine_bill;";
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
        jLabel4 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
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
        jScrollPane2 = new javax.swing.JScrollPane();
        tb1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        ll1 = new javax.swing.JLabel();
        ll2 = new javax.swing.JLabel();
        ll3 = new javax.swing.JLabel();
        ll4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        print = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        tf19 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        tf16 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        tf17 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        tf18 = new javax.swing.JTextField();

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
        jLabel30.setText("Create Medicine Bill");
        jPanel6.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 14, 380, 50));

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

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("Patient Detalis");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 170, -1, -1));

        jSeparator2.setForeground(new java.awt.Color(51, 51, 51));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 210, 970, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel6.setText("Address");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 330, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel7.setText("Patient Name");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 250, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel8.setText("Patient ID");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 210, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel9.setText("Age / Gender");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 290, -1, -1));

        tf6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tf6KeyPressed(evt);
            }
        });
        jPanel2.add(tf6, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 210, 210, -1));

        tf7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tf7KeyPressed(evt);
            }
        });
        jPanel2.add(tf7, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 250, 210, -1));
        jPanel2.add(tf8, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 290, 210, -1));
        jPanel2.add(tf9, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 330, 210, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel10.setText("Phone");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 210, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel11.setText("Blood Group");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 250, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel12.setText("Room Number");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 290, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel13.setText("Addmission Date");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 330, -1, -1));
        jPanel2.add(tf10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 210, 210, -1));
        jPanel2.add(tf11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 250, 210, -1));
        jPanel2.add(tf12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 290, 210, -1));
        jPanel2.add(tf13, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 330, 210, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel14.setText("Invoice Detalis");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, -1, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel16.setText("Date");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 140, -1, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel17.setText("Bill No");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, -1, -1));
        jPanel2.add(tf1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 140, 160, -1));
        jPanel2.add(tf2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 140, 210, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel15.setText("Add Service / Item");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 370, -1, -1));

        jSeparator3.setForeground(new java.awt.Color(51, 51, 51));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 400, 970, -1));

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel18.setText("Medicine Id");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 420, -1, -1));

        tb1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Medicine Name", "Quantity", "Amount"
            }
        ));
        jScrollPane2.setViewportView(tb1);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 470, 420, 200));

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

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 470, 480, 200));

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton2.setText("Preview");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 700, 100, -1));

        print.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        print.setText("Print");
        print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printActionPerformed(evt);
            }
        });
        jPanel2.add(print, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 700, -1, -1));

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton4.setText("Remove");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 700, -1, -1));

        tf19.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tf19KeyPressed(evt);
            }
        });
        jPanel2.add(tf19, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 420, 100, -1));

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel22.setText("Name");
        jPanel2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 420, -1, -1));
        jPanel2.add(tf16, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 420, 160, -1));

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel23.setText("Quantity");
        jPanel2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 420, -1, -1));

        tf17.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tf17KeyPressed(evt);
            }
        });
        jPanel2.add(tf17, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 420, 90, -1));

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel24.setText("Sale Price");
        jPanel2.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 420, -1, -1));
        jPanel2.add(tf18, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 420, 90, -1));

        jScrollPane1.setViewportView(jPanel2);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 650));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model=(DefaultTableModel) tb1.getModel();
        int index=tb1.getSelectedRow();
        if(index>=0)
        {
            sum=sum-Integer.parseInt(tb1.getValueAt(index,2).toString());
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
    }//GEN-LAST:event_jButton4ActionPerformed

    private void printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printActionPerformed
        // TODO add your handling code here: code of print button
        boolean valid=true;
        if(tb1.getRowCount()==0)
        {
            JOptionPane.showMessageDialog(this,"plz insert record");
            valid=false;
        }
        if(tf7.getText().equals(""))
        {
            JOptionPane.showMessageDialog(this,"insert patient_detalis");
            valid=false;
        }
        if(valid==true)
        {
                    ArrayList<String> row=new ArrayList<String>();
                    for(int i=0;i<tb1.getRowCount();i++)
                    {
                        row.add(tb1.getValueAt(i,0).toString());
                    }
                    ArrayList<String> column=new ArrayList<String>();
                    for(int i=0;i<tb1.getRowCount();i++)
                    {
                        column.add(tb1.getValueAt(i,2).toString());
                    }
                    ArrayList<String> quantity=new ArrayList<String>();
                    for(int i=0;i<tb1.getRowCount();i++)
                    {
                        quantity.add(tb1.getValueAt(i,1).toString());
                    }
                    String msg=row.toString();
                    msg=msg.substring(1,msg.length()-1).trim();
                    String desc[]=msg.split(",");
                    
                    String msg1=column.toString();
                    msg1=msg1.substring(1,msg1.length()-1).trim();
                    String amt[]=msg1.split(",");
                    
                    int billno=Integer.parseInt(tf1.getText());
                    String date=tf2.getText();
                    
                    String msg2=quantity.toString();
                    msg2=msg2.substring(1,msg2.length()-1).trim();
                    String qunt[]=msg2.split(",");
                    
                    String ID=id.substring(0,id.length()-1);
                    String Id[]=ID.split(",");
                    for(int i=0;i<desc.length;i++)
                    {
                        try
                        {
                            int old_stock=0,new_stock=0,curent_stock=0;
                            q="select stock from medical_record where md_name='"+desc[i].trim()+"';";
                            rs=st.executeQuery(q);
                            while(rs.next())
                            {
                                old_stock=rs.getInt("stock");
                            }
                            new_stock=Integer.parseInt(qunt[i].trim());
                            curent_stock=old_stock-new_stock;
                            if(curent_stock>=0)
                            {
                                q="update medical_record set stock="+curent_stock+" where md_name='"+desc[i].trim()+"';";
                                st.executeUpdate(q);
                                q="insert into sales_report values("+Id[i].trim()+",'"+desc[i].trim()+"','"+tf2.getText()+"',"+qunt[i].trim()+");";
                                st.executeUpdate(q);
                            }
                            
                        }
                        catch(Exception e)
                        {
                            JOptionPane.showMessageDialog(this,"error in connnection\n"+e);
                        }
                    }
                    try
                    {
                                q="insert into medicine_bill values("+Integer.parseInt(tf1.getText())+",'"+tf2.getText()+"','"+ID+"','"+msg+"','"+msg2+"','"+msg1+"',"+total_amount+");";
                                st.executeUpdate(q);
                                medicalbill mb=new medicalbill();
                                mb.table(row,quantity,column);
                                mb.data(sum,discount,tax,total_amount);
                                mb.patient_data(pdid,pdname,tf8.getText(),pdaddress,pdphone,pdblood,pdroomnumber,pdadmissiondate);
                                mb.bill_no(Integer.parseInt(tf1.getText()));
                                mb.sp();
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
                        JOptionPane.showMessageDialog(this,e);
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
            column.add(tb1.getValueAt(i,2).toString());
        }
        ArrayList<String> quantity=new ArrayList<String>();
        for(int i=0;i<tb1.getRowCount();i++)
        {
            quantity.add(tb1.getValueAt(i,1).toString());
        }
        medicalbill mb=new medicalbill();
        mb.table(row,quantity,column);
        mb.setVisible(true);
        mb.data(sum,discount,tax,total_amount);
        mb.patient_data(pdid,pdname,tf8.getText(),pdaddress,pdphone,pdblood,pdroomnumber,pdadmissiondate);
        mb.bill_no(Integer.parseInt(tf1.getText()));
    }//GEN-LAST:event_jButton2ActionPerformed

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
        attendance a=new attendance();
        a.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_L8MouseClicked

    private void l4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l4MouseExited
        // TODO add your handling code here:
        l4.setForeground(Color.black);
        l4.setOpaque(false);
    }//GEN-LAST:event_l4MouseExited

    private void l4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l4MouseEntered
        // TODO add your handling code here:
        l4.setForeground(Color.red);
        l4.setBackground(Color.yellow);
        l4.setOpaque(true);
    }//GEN-LAST:event_l4MouseEntered

    private void l4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l4MouseClicked
        // TODO add your handling code here:
        medical_record mr=new medical_record();
        mr.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_l4MouseClicked

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

    private void l1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l1MouseClicked
        // TODO add your handling code here:
        Patient_Mangement pm=new Patient_Mangement();
        pm.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_l1MouseClicked

    private void l7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l7MouseExited
        // TODO add your handling code here:
        l7.setForeground(Color.black);
        l7.setOpaque(false);
    }//GEN-LAST:event_l7MouseExited

    private void l7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l7MouseEntered
        // TODO add your handling code here:
        l7.setForeground(Color.red);
        l7.setBackground(Color.yellow);
        l7.setOpaque(true);
    }//GEN-LAST:event_l7MouseEntered

    private void l7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l7MouseClicked
        // TODO add your handling code here:
        appointment_dashboard ad=new appointment_dashboard();
        ad.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_l7MouseClicked

    private void l6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l6MouseExited
        // TODO add your handling code here:
        l6.setForeground(Color.black);
        l6.setOpaque(false);
    }//GEN-LAST:event_l6MouseExited

    private void l6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l6MouseEntered
        // TODO add your handling code here:
        l6.setForeground(Color.red);
        l6.setBackground(Color.yellow);
        l6.setOpaque(true);
    }//GEN-LAST:event_l6MouseEntered

    private void l6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l6MouseClicked
        // TODO add your handling code here:
        Bill_DashBoard bd=new Bill_DashBoard();
        bd.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_l6MouseClicked

    private void l5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l5MouseExited
        // TODO add your handling code here:
        l5.setForeground(Color.black);
        l5.setOpaque(false);
    }//GEN-LAST:event_l5MouseExited

    private void l5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l5MouseEntered
        // TODO add your handling code here:
        l5.setForeground(Color.red);
        l5.setBackground(Color.yellow);
        l5.setOpaque(true);
    }//GEN-LAST:event_l5MouseEntered

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

    private void l3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l3MouseExited
        // TODO add your handling code here:
        l3.setForeground(Color.black);
        l3.setOpaque(false);
    }//GEN-LAST:event_l3MouseExited

    private void l3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l3MouseEntered
        // TODO add your handling code here:
        l3.setForeground(Color.red);
        l3.setBackground(Color.yellow);
        l3.setOpaque(true);
    }//GEN-LAST:event_l3MouseEntered

    private void l3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l3MouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        employee_management em=new employee_management();
        em.setVisible(true);
    }//GEN-LAST:event_l3MouseClicked

    private void l2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l2MouseExited
        // TODO add your handling code here:
        l2.setForeground(Color.black);
        l2.setOpaque(false);
    }//GEN-LAST:event_l2MouseExited

    private void l2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l2MouseEntered
        // TODO add your handling code here:
        l2.setForeground(Color.red);
        l2.setBackground(Color.yellow);
        l2.setOpaque(true);
    }//GEN-LAST:event_l2MouseEntered

    private void l2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l2MouseClicked
        // TODO add your handling code here:
        Doctor_Mangement dc=new Doctor_Mangement();
        dc.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_l2MouseClicked

    private void p12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p12MouseClicked
        // TODO add your handling code here:
        DashBoard db=new DashBoard();
        db.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_p12MouseClicked

    private void l8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l8MouseExited
        // TODO add your handling code here:
        l8.setForeground(Color.white);
    }//GEN-LAST:event_l8MouseExited

    private void l8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l8MouseEntered
        // TODO add your handling code here:
        l8.setForeground(Color.BLUE);
    }//GEN-LAST:event_l8MouseEntered

    private void l8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l8MouseClicked
        // TODO add your handling code here:
        DashBoard db=new DashBoard();
        db.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_l8MouseClicked

    private void tf17KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf17KeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==10)
        {
            boolean valid=true;
            if(tf17.getText().equals(""))
            {
                JOptionPane.showMessageDialog(this,"Enter Quantity");
                valid=false;
            }
            if(valid==true)
            {
                try
                {
                    q="select count(md_id) from medical_record where expiry_date<curdate() and md_id="+Integer.parseInt(tf19.getText())+";";
                    rs=st.executeQuery(q);
                    int check=0,stock_check=0;
                    while(rs.next())
                    {
                        check=rs.getInt("count(md_id)");
                    }
                    if(check==1)
                    {
                        JOptionPane.showMessageDialog(this,"this medicine was expiry");
                    }
                    q="select stock from medical_record where md_id="+Integer.parseInt(tf19.getText())+";";
                    rs=st.executeQuery(q);
                    while(rs.next())
                    {
                        stock_check=rs.getInt("stock");
                    }
                    if(stock_check==0)
                    {
                        JOptionPane.showMessageDialog(this,"this medicine was out of stock");
                    }
                    int old_stock=0,current_stock=0,stock_total=0;
                    q="select stock from medical_record where md_id="+Integer.parseInt(tf19.getText())+";";
                    rs=st.executeQuery(q);
                    while(rs.next())
                    {
                        old_stock=rs.getInt("stock");
                    }
                    current_stock=Integer.parseInt(tf17.getText());
                    stock_total=old_stock-current_stock;
                    if(stock_total<0)
                    {
                        JOptionPane.showMessageDialog(this,tf16.getText()+" stock was "+old_stock+" decrease quantity");
                    }
                    
                    if(check==0 && stock_check>0 && stock_total>=0)
                    {
                        id=id+tf19.getText()+",";
                        DefaultTableModel model=(DefaultTableModel) tb1.getModel();
                        String item=(String)tf16.getText();
                        int quantity1=Integer.parseInt(tf17.getText());
                        int sales_price=Integer.parseInt(tf18.getText());
                        int cal=quantity1*sales_price;
                        sum=sum+cal;
                        ll1.setText("SUBTOTAL                                             "+sum);
                        discount=(sum*2)/100;
                        ll2.setText("Discount                                                 "+discount);
                        tax=sum-discount;
                        tax=(tax*5)/100;
                        ll3.setText("TAXABLE AMOUNT                                   "+tax);
                        total_amount=(sum-discount)+tax;
                        ll4.setText("Total AMOUNT                                         "+total_amount);
                        model.addRow(new Object[]
                                        {item,quantity1,cal}
                                    );
                        tf19.setText("");
                        tf16.setText("");
                        tf17.setText("");
                        tf18.setText("");
                    }
                }
                catch(Exception e)
                {
                    
                }
           }
        }
    }//GEN-LAST:event_tf17KeyPressed

    private void tf19KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf19KeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==10)
        {
            Long id=Long.parseLong(tf19.getText());
            try
            {
                Class.forName("java.sql.Driver");
                con=DriverManager.getConnection("jdbc:mysql://localhost:3306/health_care", "root", "");
                st=con.createStatement();
                q="select * from medical_record where md_id="+id+";";
                rs=st.executeQuery(q);
                while(rs.next())
                {
                    tf16.setText(rs.getString("md_name"));
                    tf18.setText(""+rs.getLong("sales_price"));
                }
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(this,"error in search connection");
            }
        }
    }//GEN-LAST:event_tf19KeyPressed

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
            java.util.logging.Logger.getLogger(add_medical_bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(add_medical_bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(add_medical_bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(add_medical_bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new add_medical_bill().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel L8;
    private javax.swing.JLabel L9;
    private javax.swing.JLabel img1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel4;
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
    private javax.swing.JTable tb1;
    private javax.swing.JTextField tf1;
    private javax.swing.JTextField tf10;
    private javax.swing.JTextField tf11;
    private javax.swing.JTextField tf12;
    private javax.swing.JTextField tf13;
    private javax.swing.JTextField tf16;
    private javax.swing.JTextField tf17;
    private javax.swing.JTextField tf18;
    private javax.swing.JTextField tf19;
    private javax.swing.JTextField tf2;
    private javax.swing.JTextField tf6;
    private javax.swing.JTextField tf7;
    private javax.swing.JTextField tf8;
    private javax.swing.JTextField tf9;
    // End of variables declaration//GEN-END:variables
}
