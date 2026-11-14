package dashboard;

import hospital.*;
import employee.*;
import doctor.*;
import medical.*;
import patient.*;
import login.*;
import panel.*;
import search.search;
import billing_and_invoice.*;
import System_user.*;
import appointment.appointment_dashboard;
import attendance.*;

import java.awt.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class DashBoard extends javax.swing.JFrame {

    String h = "";
    String name = "", jb = "", bg = "";
    DefaultTableModel model;
    Connection con;
    Statement st;
    ResultSet rs;
    String q;
    Date d;
    SimpleDateFormat currentdate, month, monthname, year;

    //billing deatlis
    int bill_no;
    String date = "";
    long total_amount = 0;
    String status = "";
    
    static String usrnme="";

    //patient detalis
    int pdid = 0;
    int pdage = 0;
    int pdroomnumber = 0;
    String pdname = "";
    String pdadmissiondate = "";
    String pdgender = "";
    String pdblood = "";
    String pdaddress = "";
    String pdphone = "";
    String ddname = "";

    public DashBoard() {
        initComponents();
        DefaultTableModel model = (DefaultTableModel) tb1.getModel();
        DefaultTableModel model1 = (DefaultTableModel) tb2.getModel();
        DefaultTableModel model2 = (DefaultTableModel) tb3.getModel();
        d=new Date();
        monthname=new SimpleDateFormat("MMMM");
        L1.setText(monthname.format(d));
        year=new  SimpleDateFormat("YYYY");
        month=new SimpleDateFormat("MM");
        currentdate=new SimpleDateFormat("DD");
        try {
                Class.forName("java.sql.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/health_care", "root", "");
                st = con.createStatement();
                q = "select * from billing_detalis;";
                rs = st.executeQuery(q);
                while (rs.next()) 
                {
                    bill_no = rs.getInt("bill_no");
                    date = rs.getString("bill_date");
                    pdid = rs.getInt("patient_id");
                    ddname = rs.getString("doctor_name");
                    total_amount = rs.getInt("total_amount");
                    status = rs.getString("status");
                    model.addRow(new Object[]{bill_no, date, pdid, ddname, total_amount, status}
                    );
                }
                q = "select * from billing_detalis where status='unpaid';";
                rs = st.executeQuery(q);
                while (rs.next()) 
                {
                    bill_no = rs.getInt("bill_no");
                    date = rs.getString("bill_date");
                    pdid = rs.getInt("patient_id");
                    ddname = rs.getString("doctor_name");
                    total_amount = rs.getInt("total_amount");
                    status = rs.getString("status");
                    model1.addRow(new Object[]{bill_no, date, pdid, ddname, total_amount, status}
                    );
                }
                q="Select * from patient_detalis";
                rs=st.executeQuery(q);
                int tp=0;
                while(rs.next())
                {
                    tp++;
                    pdid=rs.getInt("patient_id");
                    pdname=rs.getString("patient_name");
                    pdadmissiondate=rs.getString("addmission_date");
                    pdgender=rs.getString("gender");
                    pdroomnumber=rs.getInt("room_number");
                    pdblood=rs.getString("blood_group");
                    pdaddress=rs.getString("address");
                    pdage=rs.getInt("age");
                    pdphone=rs.getString("phone");
                    model2.addRow(new Object[]
                        {pdid,pdname,pdgender,pdroomnumber,pdage,pdphone}
                    );
                }
                l2.setText(""+tp);
                q="Select count(doctor_id) from doctor_detalis";
                rs=st.executeQuery(q);
                while(rs.next())
                {
                    l3.setText(""+rs.getString("count(doctor_id)"));
                }
                q="select count(employee_id) from employee;";
                rs=st.executeQuery(q);
                while(rs.next())
                {
                    l5.setText(""+rs.getString("count(employee_id)"));
                }
                q="select count(app_id) from appointment where date>='"+year.format(d)+"-"+month.format(d)+"-01' and date<='"+year.format(d)+"-"+month+"-04';";
                rs=st.executeQuery(q);
                while(rs.next())
                {
                    ta.setText(""+rs.getString("count(app_id)"));
                }
        } 
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(this, "error in mysql connection\n "+e);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb3 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        img1 = new javax.swing.JLabel();
        p12 = new p1();
        jLabel16 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        l1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        L8 = new javax.swing.JLabel();
        L9 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        p11 = new p1();
        l2 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel105 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        p14 = new p1();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        l3 = new javax.swing.JLabel();
        p13 = new p1();
        jLabel12 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        l5 = new javax.swing.JLabel();
        p16 = new p1();
        ta = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel106 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        L1 = new javax.swing.JLabel();
        p21 = new panel.p2();
        jLabel14 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tb1 = new javax.swing.JTable();
        p22 = new panel.p2();
        jLabel15 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        p23 = new panel.p2();
        jScrollPane5 = new javax.swing.JScrollPane();
        tb2 = new javax.swing.JTable();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        p24 = new panel.p2();
        jLabel18 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(204, 255, 255));
        jPanel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel3.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tb3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Patient_id", "Patient_name", "gender", "room_number", "Age", "phone"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tb3.setColumnSelectionAllowed(true);
        tb3.setIntercellSpacing(new java.awt.Dimension(0, 0));
        tb3.setRowHeight(25);
        tb3.setSelectionBackground(new java.awt.Color(102, 153, 255));
        tb3.setShowVerticalLines(false);
        jScrollPane1.setViewportView(tb3);
        tb3.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 480, 420, 130));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 118, 139));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(img1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 110));

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

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/copy1.png"))); // NOI18N
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 90));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 187));

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
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 400, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 23)); // NOI18N
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icon5.png"))); // NOI18N
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
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 438, -1, -1));

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
        jPanel1.add(L8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, -1, -1));

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
        jPanel1.add(L9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 520, -1, -1));

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 660));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setText("jLabel4");
        jPanel6.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 270, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel9.setText("DashBoard");
        jPanel6.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 14, 210, 50));

        jLabel2.setText("Welcome back");
        jPanel6.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 37, -1, -1));

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/close.png"))); // NOI18N
        jLabel30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel30MouseClicked(evt);
            }
        });
        jPanel6.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 5, -1, -1));

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/minimize.png"))); // NOI18N
        jLabel31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel31MouseClicked(evt);
            }
        });
        jPanel6.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 5, -1, -1));

        jPanel3.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 1030, 70));

        p11.setBackground(new java.awt.Color(255, 255, 255));
        p11.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        p11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        l2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        l2.setText("12200");
        p11.add(l2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, -1, -1));
        p11.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 20, -1, -1));

        jLabel105.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel105.setText("Total Patients");
        p11.add(jLabel105, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/d3.png"))); // NOI18N
        p11.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 2, -1, -1));

        jPanel3.add(p11, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 90, 230, 90));

        p14.setBackground(new java.awt.Color(255, 255, 255));
        p14.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        p14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 23)); // NOI18N
        jLabel21.setText("Total Doctors");
        p14.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, -1, 40));

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/d2.png"))); // NOI18N
        p14.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 3, 90, 80));
        p14.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        l3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        l3.setText("12200");
        p14.add(l3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, -1, -1));

        jPanel3.add(p14, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 90, 230, 90));

        p13.setBackground(new java.awt.Color(255, 255, 255));
        p13.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        p13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/d4.png"))); // NOI18N
        p13.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 2, 90, 80));

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel25.setText("Total Employee");
        p13.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, -1, -1));

        jLabel26.setText("100");
        p13.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 101, -1, -1));
        p13.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 2, -1, -1));

        l5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        l5.setText("12200");
        p13.add(l5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, -1, -1));

        jPanel3.add(p13, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 90, 232, 90));

        p16.setBackground(new java.awt.Color(255, 255, 255));
        p16.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        p16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ta.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        ta.setText("12200");
        p16.add(ta, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, -1, -1));
        p16.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 20, -1, -1));

        jLabel106.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel106.setText("Total Appointment");
        p16.add(jLabel106, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 8, -1, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/d1.png"))); // NOI18N
        p16.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -1, -1, 90));

        L1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        L1.setText("This Month");
        p16.add(L1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, -1, 40));

        jPanel3.add(p16, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, 250, 90));

        p21.setBackground(new java.awt.Color(255, 255, 255));
        p21.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(3, 24, 83));
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Screenshot 2026-10-05 212756.png"))); // NOI18N
        jLabel14.setText("Recent Bills");
        p21.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 4, -1, -1));

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(0, 0, 255));
        jLabel28.setText("View  All");
        jLabel28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel28MouseClicked(evt);
            }
        });
        p21.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 10, -1, -1));

        tb1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Bill_no", "Bill_date", "Patient_id", "Doctor_name", "Total_amount", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
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
        jScrollPane4.setViewportView(tb1);

        p21.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 600, 160));

        jPanel3.add(p21, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 200, 620, 220));

        p22.setBackground(new java.awt.Color(255, 255, 255));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Screenshot 2026-10-05 214540.png"))); // NOI18N
        jLabel15.setText("Quick Actions");

        jButton1.setBackground(new java.awt.Color(239, 245, 254));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jButton1.setForeground(new java.awt.Color(26, 73, 230));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/invoice.png"))); // NOI18N
        jButton1.setText("Create Invoice");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(242, 252, 247));
        jButton2.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jButton2.setForeground(new java.awt.Color(145, 213, 174));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/bills.png"))); // NOI18N
        jButton2.setText("View All Bills");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(239, 245, 254));
        jButton3.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jButton3.setForeground(new java.awt.Color(123, 64, 220));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/attendance.png"))); // NOI18N
        jButton3.setText("Attendance");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout p22Layout = new javax.swing.GroupLayout(p22);
        p22.setLayout(p22Layout);
        p22Layout.setHorizontalGroup(
            p22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p22Layout.createSequentialGroup()
                .addGroup(p22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(p22Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel15))
                    .addGroup(p22Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(p22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        p22Layout.setVerticalGroup(
            p22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p22Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanel3.add(p22, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 200, 320, 230));

        p23.setBackground(new java.awt.Color(255, 255, 255));
        p23.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tb2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Bill_no", "Bill_date", "Patient_id", "Doctor_name", "Total_amount", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tb2.setColumnSelectionAllowed(true);
        tb2.setIntercellSpacing(new java.awt.Dimension(0, 0));
        tb2.setRowHeight(25);
        tb2.setSelectionBackground(new java.awt.Color(102, 153, 255));
        tb2.setShowVerticalLines(false);
        jScrollPane5.setViewportView(tb2);

        p23.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 470, 120));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(3, 24, 83));
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Screenshot 2026-10-05 214928.png"))); // NOI18N
        jLabel17.setText("Pending Bills");
        p23.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 3, -1, -1));

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 255));
        jLabel19.setText("View  All");
        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel19MouseClicked(evt);
            }
        });
        p23.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 10, -1, -1));

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 0, 255));
        jLabel24.setText("View  All");
        jLabel24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel24MouseClicked(evt);
            }
        });
        p23.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 10, -1, -1));

        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(0, 0, 255));
        jLabel29.setText("View  All");
        jLabel29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel29MouseClicked(evt);
            }
        });
        p23.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 7, -1, -1));

        jPanel3.add(p23, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 440, 490, 180));

        p24.setBackground(new java.awt.Color(255, 255, 255));
        p24.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(3, 24, 83));
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Screenshot 2026-10-05 215650.png"))); // NOI18N
        jLabel18.setText("Patient Detalis");
        p24.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 3, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 255));
        jLabel10.setText("View  All");
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        p24.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 7, -1, -1));

        jPanel3.add(p24, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 440, 440, 180));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1270, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        // TODO add your handling code here:
        DashBoard db = new DashBoard();
        db.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel16MouseClicked

    private void jLabel16MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel16MouseEntered

    private void jLabel16MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel16MouseExited

    private void p12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p12MouseClicked
        // TODO add your handling code here:
        DashBoard db = new DashBoard();
        db.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_p12MouseClicked

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
        // TODO add your handling code here:
        jLabel1.setForeground(Color.red);
        jLabel1.setBackground(Color.yellow);
        jLabel1.setOpaque(true);
    }//GEN-LAST:event_jLabel1MouseEntered

    private void jLabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseExited
        // TODO add your handling code here:
        jLabel1.setForeground(Color.black);
        jLabel1.setOpaque(false);
    }//GEN-LAST:event_jLabel1MouseExited

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        employee_management em = new employee_management();
        em.setVisible(true);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseEntered
        // TODO add your handling code here:
        jLabel3.setForeground(Color.red);
        jLabel3.setBackground(Color.yellow);
        jLabel3.setOpaque(true);
    }//GEN-LAST:event_jLabel3MouseEntered

    private void jLabel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseExited
        // TODO add your handling code here:
        jLabel3.setForeground(Color.black);
        jLabel3.setOpaque(false);
    }//GEN-LAST:event_jLabel3MouseExited

    private void jLabel6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseEntered
        // TODO add your handling code here:
        jLabel6.setForeground(Color.red);
        jLabel6.setBackground(Color.yellow);
        jLabel6.setOpaque(true);
    }//GEN-LAST:event_jLabel6MouseEntered

    private void jLabel6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseExited
        // TODO add your handling code here:
        jLabel6.setForeground(Color.black);
        jLabel6.setOpaque(false);
    }//GEN-LAST:event_jLabel6MouseExited

    private void jLabel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseEntered
        // TODO add your handling code here:
        jLabel5.setForeground(Color.red);
        jLabel5.setBackground(Color.yellow);
        jLabel5.setOpaque(true);
    }//GEN-LAST:event_jLabel5MouseEntered

    private void jLabel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseExited
        // TODO add your handling code here:
        jLabel5.setForeground(Color.black);
        jLabel5.setOpaque(false);
    }//GEN-LAST:event_jLabel5MouseExited

    private void jLabel8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseEntered
        // TODO add your handling code here:
        jLabel8.setForeground(Color.red);
        jLabel8.setBackground(Color.yellow);
        jLabel8.setOpaque(true);
    }//GEN-LAST:event_jLabel8MouseEntered

    private void jLabel8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseExited
        // TODO add your handling code here:
        jLabel8.setForeground(Color.black);
        jLabel8.setOpaque(false);
    }//GEN-LAST:event_jLabel8MouseExited

    private void l1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l1MouseClicked
        // TODO add your handling code here:
        Patient_Mangement pm = new Patient_Mangement();
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

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        // TODO add your handling code here:
        medical_record mr = new medical_record();
        mr.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseEntered
        // TODO add your handling code here:
        jLabel7.setForeground(Color.red);
        jLabel7.setBackground(Color.yellow);
        jLabel7.setOpaque(true);
    }//GEN-LAST:event_jLabel7MouseEntered

    private void jLabel7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseExited
        // TODO add your handling code here:
        jLabel7.setForeground(Color.black);
        jLabel7.setOpaque(false);
    }//GEN-LAST:event_jLabel7MouseExited

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        Doctor_Mangement dc = new Doctor_Mangement();
        dc.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
        Bill_DashBoard bd = new Bill_DashBoard();
        bd.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
        String username = JOptionPane.showInputDialog("Enter Admin Id");
        String password = JOptionPane.showInputDialog("Enter Admin Password");
        if (username.equals("Admin@123") && password.equals("Admin123@123")) {
            Systemuser_dashboard sd = new Systemuser_dashboard();
            sd.setVisible(true);
            this.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(this, "Invalid username and password");
        }
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // TODO add your handling code here:
        appointment_dashboard ad = new appointment_dashboard();
        ad.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel8MouseClicked

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

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        // TODO add your handling code here:
        Patient_Mangement pm = new Patient_Mangement();
        pm.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel19MouseClicked

    private void jLabel24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel24MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel24MouseClicked

    private void jLabel28MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel28MouseClicked
        // TODO add your handling code here:
        Bill_DashBoard bd = new Bill_DashBoard();
        bd.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel28MouseClicked

    private void jLabel29MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel29MouseClicked
        // TODO add your handling code here:
        Bill_DashBoard bd = new Bill_DashBoard();
        bd.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel29MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        add_Billing ab=new add_Billing();
        ab.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Bill_DashBoard bd = new Bill_DashBoard();
        bd.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        attendance a=new attendance();
        a.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jLabel30MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel30MouseClicked
        // TODO add your handling code here:
        login l = new login();
        l.lst_logout();
        l.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel30MouseClicked

    private void jLabel31MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel31MouseClicked
        // TODO add your handling code here:
        this.setExtendedState(DashBoard.ICONIFIED);
    }//GEN-LAST:event_jLabel31MouseClicked

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
            java.util.logging.Logger.getLogger(DashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DashBoard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel L1;
    private javax.swing.JLabel L8;
    private javax.swing.JLabel L9;
    private javax.swing.JLabel img1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
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
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
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
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l2;
    private javax.swing.JLabel l3;
    private javax.swing.JLabel l5;
    private p1 p11;
    private p1 p12;
    private p1 p13;
    private p1 p14;
    private p1 p16;
    private panel.p2 p21;
    private panel.p2 p22;
    private panel.p2 p23;
    private panel.p2 p24;
    private javax.swing.JLabel ta;
    private javax.swing.JTable tb1;
    private javax.swing.JTable tb2;
    private javax.swing.JTable tb3;
    // End of variables declaration//GEN-END:variables
}
