package employee;

import System_user.Systemuser_dashboard;
import appointment.appointment_dashboard;
import billing_and_invoice.Bill_DashBoard;
import doctor.add_doctor;
import dashboard.DashBoard;
import employee.*;
import patient.*;
import panel.p1;
import medical.*;
import attendance.*;
import login.*;


import java.awt.*;
import java.sql.*;
import java.text.SimpleDateFormat;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.Date;
public class update_employee extends javax.swing.JFrame{
    Connection con;
    Statement st;
    ResultSet rs;
    String q;
    Date d;
    SimpleDateFormat sdf,sdf1,sdf2;
    DefaultTableModel model;
    String name="";
    public update_employee() {
        initComponents();
        tf3.setEditable(false);
        try
        {
            int id=0;
            Class.forName("java.sql.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/health_care", "root", "");
            st=con.createStatement();
            q="Select * from employee";
            rs=st.executeQuery(q);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"error in connection");
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel37 = new javax.swing.JPanel();
        jLabel137 = new javax.swing.JLabel();
        jLabel138 = new javax.swing.JLabel();
        jLabel139 = new javax.swing.JLabel();
        jLabel140 = new javax.swing.JLabel();
        jPanel38 = new javax.swing.JPanel();
        jLabel141 = new javax.swing.JLabel();
        jLabel142 = new javax.swing.JLabel();
        jLabel143 = new javax.swing.JLabel();
        jLabel144 = new javax.swing.JLabel();
        jPanel39 = new javax.swing.JPanel();
        jLabel145 = new javax.swing.JLabel();
        jLabel146 = new javax.swing.JLabel();
        jLabel147 = new javax.swing.JLabel();
        jLabel148 = new javax.swing.JLabel();
        jPanel40 = new javax.swing.JPanel();
        jLabel149 = new javax.swing.JLabel();
        jLabel150 = new javax.swing.JLabel();
        jLabel151 = new javax.swing.JLabel();
        jLabel152 = new javax.swing.JLabel();
        jPanel41 = new javax.swing.JPanel();
        jLabel153 = new javax.swing.JLabel();
        jLabel154 = new javax.swing.JLabel();
        jLabel155 = new javax.swing.JLabel();
        jLabel156 = new javax.swing.JLabel();
        jPanel42 = new javax.swing.JPanel();
        jLabel157 = new javax.swing.JLabel();
        jLabel158 = new javax.swing.JLabel();
        jLabel159 = new javax.swing.JLabel();
        jLabel160 = new javax.swing.JLabel();
        jPanel43 = new javax.swing.JPanel();
        jLabel161 = new javax.swing.JLabel();
        jLabel162 = new javax.swing.JLabel();
        jLabel163 = new javax.swing.JLabel();
        jLabel164 = new javax.swing.JLabel();
        jPanel44 = new javax.swing.JPanel();
        jLabel165 = new javax.swing.JLabel();
        jLabel166 = new javax.swing.JLabel();
        jLabel167 = new javax.swing.JLabel();
        jLabel168 = new javax.swing.JLabel();
        jPanel45 = new javax.swing.JPanel();
        jLabel169 = new javax.swing.JLabel();
        jLabel170 = new javax.swing.JLabel();
        jLabel171 = new javax.swing.JLabel();
        jLabel172 = new javax.swing.JLabel();
        jPanel46 = new javax.swing.JPanel();
        jLabel173 = new javax.swing.JLabel();
        jLabel174 = new javax.swing.JLabel();
        jLabel175 = new javax.swing.JLabel();
        jLabel176 = new javax.swing.JLabel();
        jPanel47 = new javax.swing.JPanel();
        jLabel177 = new javax.swing.JLabel();
        jLabel178 = new javax.swing.JLabel();
        jLabel179 = new javax.swing.JLabel();
        jLabel180 = new javax.swing.JLabel();
        jPanel48 = new javax.swing.JPanel();
        jLabel181 = new javax.swing.JLabel();
        jLabel182 = new javax.swing.JLabel();
        jLabel183 = new javax.swing.JLabel();
        jLabel184 = new javax.swing.JLabel();
        jPanel49 = new javax.swing.JPanel();
        jLabel185 = new javax.swing.JLabel();
        jLabel186 = new javax.swing.JLabel();
        jLabel187 = new javax.swing.JLabel();
        jLabel188 = new javax.swing.JLabel();
        jPanel50 = new javax.swing.JPanel();
        jLabel189 = new javax.swing.JLabel();
        jLabel190 = new javax.swing.JLabel();
        jLabel191 = new javax.swing.JLabel();
        jLabel192 = new javax.swing.JLabel();
        jPanel51 = new javax.swing.JPanel();
        jLabel193 = new javax.swing.JLabel();
        jLabel194 = new javax.swing.JLabel();
        jLabel195 = new javax.swing.JLabel();
        jLabel196 = new javax.swing.JLabel();
        jPanel52 = new javax.swing.JPanel();
        jLabel197 = new javax.swing.JLabel();
        jLabel198 = new javax.swing.JLabel();
        jLabel199 = new javax.swing.JLabel();
        jLabel200 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        buttonGroup1 = new javax.swing.ButtonGroup();
        p1 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        p11 = new p1();
        jLabel14 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        tf3 = new javax.swing.JTextField();
        tf2 = new javax.swing.JTextField();
        tf1 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        tf5 = new javax.swing.JTextField();
        tf4 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        tf8 = new javax.swing.JTextField();
        tf7 = new javax.swing.JTextField();
        tf9 = new javax.swing.JTextField();
        m = new javax.swing.JRadioButton();
        fm = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        p12 = new p1();
        jLabel16 = new javax.swing.JLabel();
        img1 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        l1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        L8 = new javax.swing.JLabel();
        L9 = new javax.swing.JLabel();

        jPanel37.setBackground(new java.awt.Color(255, 255, 255));
        jPanel37.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel37.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel137.setFont(new java.awt.Font("Tahoma", 0, 23)); // NOI18N
        jLabel137.setText("Total Patient");
        jPanel37.add(jLabel137, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 2, -1, -1));

        jLabel138.setText("100");
        jPanel37.add(jLabel138, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 101, -1, -1));
        jPanel37.add(jLabel139, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 2, -1, -1));

        jLabel140.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel140.setText("12200");
        jPanel37.add(jLabel140, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, -1, -1));

        jPanel38.setBackground(new java.awt.Color(255, 255, 255));
        jPanel38.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel38.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel141.setFont(new java.awt.Font("Tahoma", 0, 23)); // NOI18N
        jLabel141.setText("Total Patient");
        jPanel38.add(jLabel141, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 2, -1, -1));

        jLabel142.setText("100");
        jPanel38.add(jLabel142, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 101, -1, -1));
        jPanel38.add(jLabel143, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 2, -1, -1));

        jLabel144.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel144.setText("12200");
        jPanel38.add(jLabel144, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, -1, -1));

        jPanel37.add(jPanel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, 240, 90));

        jPanel39.setBackground(new java.awt.Color(255, 255, 255));
        jPanel39.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel39.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel145.setFont(new java.awt.Font("Tahoma", 0, 23)); // NOI18N
        jLabel145.setText("Total Patient");
        jPanel39.add(jLabel145, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 2, -1, -1));

        jLabel146.setText("100");
        jPanel39.add(jLabel146, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 101, -1, -1));
        jPanel39.add(jLabel147, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 2, -1, -1));

        jLabel148.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel148.setText("12200");
        jPanel39.add(jLabel148, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, -1, -1));

        jPanel40.setBackground(new java.awt.Color(255, 255, 255));
        jPanel40.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel40.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel149.setFont(new java.awt.Font("Tahoma", 0, 23)); // NOI18N
        jLabel149.setText("Total Patient");
        jPanel40.add(jLabel149, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 2, -1, -1));

        jLabel150.setText("100");
        jPanel40.add(jLabel150, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 101, -1, -1));
        jPanel40.add(jLabel151, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 2, -1, -1));

        jLabel152.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel152.setText("12200");
        jPanel40.add(jLabel152, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, -1, -1));

        jPanel39.add(jPanel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, 240, 90));

        jPanel37.add(jPanel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, 240, 90));

        jPanel41.setBackground(new java.awt.Color(255, 255, 255));
        jPanel41.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel41.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel153.setFont(new java.awt.Font("Tahoma", 0, 23)); // NOI18N
        jLabel153.setText("Total Patient");
        jPanel41.add(jLabel153, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 2, -1, -1));

        jLabel154.setText("100");
        jPanel41.add(jLabel154, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 101, -1, -1));
        jPanel41.add(jLabel155, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 2, -1, -1));

        jLabel156.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel156.setText("12200");
        jPanel41.add(jLabel156, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, -1, -1));

        jPanel42.setBackground(new java.awt.Color(255, 255, 255));
        jPanel42.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel42.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel157.setFont(new java.awt.Font("Tahoma", 0, 23)); // NOI18N
        jLabel157.setText("Total Patient");
        jPanel42.add(jLabel157, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 2, -1, -1));

        jLabel158.setText("100");
        jPanel42.add(jLabel158, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 101, -1, -1));
        jPanel42.add(jLabel159, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 2, -1, -1));

        jLabel160.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel160.setText("12200");
        jPanel42.add(jLabel160, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, -1, -1));

        jPanel41.add(jPanel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, 240, 90));

        jPanel43.setBackground(new java.awt.Color(255, 255, 255));
        jPanel43.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel43.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel161.setFont(new java.awt.Font("Tahoma", 0, 23)); // NOI18N
        jLabel161.setText("Total Patient");
        jPanel43.add(jLabel161, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 2, -1, -1));

        jLabel162.setText("100");
        jPanel43.add(jLabel162, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 101, -1, -1));
        jPanel43.add(jLabel163, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 2, -1, -1));

        jLabel164.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel164.setText("12200");
        jPanel43.add(jLabel164, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, -1, -1));

        jPanel44.setBackground(new java.awt.Color(255, 255, 255));
        jPanel44.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel44.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel165.setFont(new java.awt.Font("Tahoma", 0, 23)); // NOI18N
        jLabel165.setText("Total Patient");
        jPanel44.add(jLabel165, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 2, -1, -1));

        jLabel166.setText("100");
        jPanel44.add(jLabel166, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 101, -1, -1));
        jPanel44.add(jLabel167, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 2, -1, -1));

        jLabel168.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel168.setText("12200");
        jPanel44.add(jLabel168, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, -1, -1));

        jPanel43.add(jPanel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, 240, 90));

        jPanel41.add(jPanel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, 240, 90));

        jPanel37.add(jPanel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, 240, 90));

        jPanel45.setBackground(new java.awt.Color(255, 255, 255));
        jPanel45.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel45.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel169.setFont(new java.awt.Font("Tahoma", 0, 23)); // NOI18N
        jLabel169.setText("Total Patient");
        jPanel45.add(jLabel169, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 2, -1, -1));

        jLabel170.setText("100");
        jPanel45.add(jLabel170, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 101, -1, -1));
        jPanel45.add(jLabel171, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 2, -1, -1));

        jLabel172.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel172.setText("12200");
        jPanel45.add(jLabel172, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, -1, -1));

        jPanel46.setBackground(new java.awt.Color(255, 255, 255));
        jPanel46.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel46.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel173.setFont(new java.awt.Font("Tahoma", 0, 23)); // NOI18N
        jLabel173.setText("Total Patient");
        jPanel46.add(jLabel173, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 2, -1, -1));

        jLabel174.setText("100");
        jPanel46.add(jLabel174, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 101, -1, -1));
        jPanel46.add(jLabel175, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 2, -1, -1));

        jLabel176.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel176.setText("12200");
        jPanel46.add(jLabel176, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, -1, -1));

        jPanel45.add(jPanel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, 240, 90));

        jPanel47.setBackground(new java.awt.Color(255, 255, 255));
        jPanel47.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel47.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel177.setFont(new java.awt.Font("Tahoma", 0, 23)); // NOI18N
        jLabel177.setText("Total Patient");
        jPanel47.add(jLabel177, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 2, -1, -1));

        jLabel178.setText("100");
        jPanel47.add(jLabel178, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 101, -1, -1));
        jPanel47.add(jLabel179, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 2, -1, -1));

        jLabel180.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel180.setText("12200");
        jPanel47.add(jLabel180, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, -1, -1));

        jPanel48.setBackground(new java.awt.Color(255, 255, 255));
        jPanel48.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel48.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel181.setFont(new java.awt.Font("Tahoma", 0, 23)); // NOI18N
        jLabel181.setText("Total Patient");
        jPanel48.add(jLabel181, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 2, -1, -1));

        jLabel182.setText("100");
        jPanel48.add(jLabel182, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 101, -1, -1));
        jPanel48.add(jLabel183, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 2, -1, -1));

        jLabel184.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel184.setText("12200");
        jPanel48.add(jLabel184, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, -1, -1));

        jPanel47.add(jPanel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, 240, 90));

        jPanel45.add(jPanel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, 240, 90));

        jPanel49.setBackground(new java.awt.Color(255, 255, 255));
        jPanel49.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel49.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel185.setFont(new java.awt.Font("Tahoma", 0, 23)); // NOI18N
        jLabel185.setText("Total Patient");
        jPanel49.add(jLabel185, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 2, -1, -1));

        jLabel186.setText("100");
        jPanel49.add(jLabel186, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 101, -1, -1));
        jPanel49.add(jLabel187, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 2, -1, -1));

        jLabel188.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel188.setText("12200");
        jPanel49.add(jLabel188, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, -1, -1));

        jPanel50.setBackground(new java.awt.Color(255, 255, 255));
        jPanel50.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel50.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel189.setFont(new java.awt.Font("Tahoma", 0, 23)); // NOI18N
        jLabel189.setText("Total Patient");
        jPanel50.add(jLabel189, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 2, -1, -1));

        jLabel190.setText("100");
        jPanel50.add(jLabel190, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 101, -1, -1));
        jPanel50.add(jLabel191, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 2, -1, -1));

        jLabel192.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel192.setText("12200");
        jPanel50.add(jLabel192, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, -1, -1));

        jPanel49.add(jPanel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, 240, 90));

        jPanel51.setBackground(new java.awt.Color(255, 255, 255));
        jPanel51.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel51.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel193.setFont(new java.awt.Font("Tahoma", 0, 23)); // NOI18N
        jLabel193.setText("Total Patient");
        jPanel51.add(jLabel193, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 2, -1, -1));

        jLabel194.setText("100");
        jPanel51.add(jLabel194, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 101, -1, -1));
        jPanel51.add(jLabel195, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 2, -1, -1));

        jLabel196.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel196.setText("12200");
        jPanel51.add(jLabel196, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, -1, -1));

        jPanel52.setBackground(new java.awt.Color(255, 255, 255));
        jPanel52.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel52.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel197.setFont(new java.awt.Font("Tahoma", 0, 23)); // NOI18N
        jLabel197.setText("Total Patient");
        jPanel52.add(jLabel197, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 2, -1, -1));

        jLabel198.setText("100");
        jPanel52.add(jLabel198, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 101, -1, -1));
        jPanel52.add(jLabel199, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 2, -1, -1));

        jLabel200.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel200.setText("12200");
        jPanel52.add(jLabel200, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, -1, -1));

        jPanel51.add(jPanel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, 240, 90));

        jPanel49.add(jPanel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, 240, 90));

        jPanel45.add(jPanel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, 240, 90));

        jPanel37.add(jPanel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, 240, 90));

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        p1.setBackground(new java.awt.Color(204, 255, 255));
        p1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        p1.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        p1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setText("jLabel4");
        jPanel6.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 270, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel9.setText("Update Employee Detalis");
        jPanel6.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 14, 470, 50));

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

        p1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 1030, 70));

        p11.setBackground(new java.awt.Color(255, 255, 255));
        p11.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        p11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel14.setText("Employee_ID");
        p11.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 21, -1, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel17.setText("Employee_Name");
        p11.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 70, -1, -1));

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel22.setText("Hiredate");
        p11.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 121, -1, -1));
        p11.add(tf3, new org.netbeans.lib.awtextra.AbsoluteConstraints(214, 118, 254, 42));
        p11.add(tf2, new org.netbeans.lib.awtextra.AbsoluteConstraints(214, 67, 254, 42));

        tf1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tf1KeyPressed(evt);
            }
        });
        p11.add(tf1, new org.netbeans.lib.awtextra.AbsoluteConstraints(214, 18, 254, 42));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel15.setText("Gender");
        p11.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(514, 29, -1, -1));

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 23)); // NOI18N
        jLabel18.setText("Job");
        p11.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 180, -1, -1));

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel21.setText("Blood_Group");
        p11.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 237, -1, -1));
        p11.add(tf5, new org.netbeans.lib.awtextra.AbsoluteConstraints(214, 234, 254, 42));
        p11.add(tf4, new org.netbeans.lib.awtextra.AbsoluteConstraints(214, 176, 254, 42));
        p11.add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1123, 161, 254, 42));
        p11.add(jTextField14, new org.netbeans.lib.awtextra.AbsoluteConstraints(1123, 223, 254, 42));
        p11.add(jTextField15, new org.netbeans.lib.awtextra.AbsoluteConstraints(1123, 274, 254, 42));

        jButton5.setBackground(new java.awt.Color(102, 255, 255));
        jButton5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton5.setText("Save");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        p11.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(638, 260, -1, -1));

        jButton6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton6.setText("Clear");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        p11.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(739, 260, -1, -1));

        jButton8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton8.setText("Back");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        p11.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(835, 260, -1, -1));

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel19.setText("Address");
        p11.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(514, 193, -1, -1));

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel20.setText("Age");
        p11.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(514, 74, -1, -1));

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel23.setText("Phone");
        p11.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(514, 133, -1, -1));
        p11.add(tf8, new org.netbeans.lib.awtextra.AbsoluteConstraints(664, 130, 254, 42));
        p11.add(tf7, new org.netbeans.lib.awtextra.AbsoluteConstraints(664, 74, 254, 42));
        p11.add(tf9, new org.netbeans.lib.awtextra.AbsoluteConstraints(664, 190, 254, 42));

        buttonGroup1.add(m);
        m.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        m.setText("Male");
        m.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                mStateChanged(evt);
            }
        });
        p11.add(m, new org.netbeans.lib.awtextra.AbsoluteConstraints(672, 31, -1, -1));

        buttonGroup1.add(fm);
        fm.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        fm.setText("Female");
        fm.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                fmStateChanged(evt);
            }
        });
        p11.add(fm, new org.netbeans.lib.awtextra.AbsoluteConstraints(759, 29, -1, -1));

        p1.add(p11, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 170, 960, 330));

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

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/copy1.png"))); // NOI18N
        jPanel2.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 90));

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
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 280, -1, -1));

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
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 320, -1, -1));

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
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 360, -1, -1));

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
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, -1, -1));

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
        jPanel1.add(L8, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 480, -1, -1));

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
        jPanel1.add(L9, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 520, -1, -1));

        p1.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 660));

        getContentPane().add(p1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1270, 650));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        this .setVisible(false);
        employee_management em=new employee_management();
        em.setVisible(true);
    }//GEN-LAST:event_jButton8ActionPerformed
int gen=0;
String gender="";
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        String nme=tf2.getText();
        String bloodg=tf5.getText();
        
        String phone=tf8.getText();
        String address=tf9.getText();
        int count=0;
        boolean valid=true;
        if(tf2.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"enter Employee Name");
            valid=false;
        }
        if(tf4.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"enter employee Job");
            valid=false;
        }
         if(tf8.getText().length()>=1 && tf8.getText().length()<=9)
        {
            JOptionPane.showMessageDialog(null,"invalid employee Phone");
            valid=false;
        }
        if(tf5.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"enter employee Blood Group");
            valid=false;
        }
        if(gen==0)
        {
            JOptionPane.showMessageDialog(null,"enter employee Gender");
            valid=false;
        }
        if(tf7.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"enter employee age");
            valid=false;
        }
        if(tf8.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"enter employee Phone");
            valid=false;
        }
        if(tf9.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"enter employee address");
            valid=false;
        }
        // date valid start
        
        String checkdate=tf3.getText();
        String Checkdate[]=checkdate.split("-");
        if(checkdate.indexOf("-")==-1)
        {
            JOptionPane.showMessageDialog(null,"invalid date");
            valid=false;
        }
        if(Checkdate[0].length()<=3 || Checkdate[0].length()>=5)
        {
            JOptionPane.showMessageDialog(null,"invalid date");
            valid=false;
        }
        int Checkmonth=Integer.parseInt(Checkdate[1]);
        if(Checkmonth>=13)
        {
            JOptionPane.showMessageDialog(null,"invalid date");
            valid=false;
        }
        // valid end
        if(valid==true)
        {
            try
            {
                q="update employee set employee_name='"+nme+"', hiredate='"+tf3.getText()+"', gender='"+gender+"', job='"+tf4.getText()+"', blood_group='"+bloodg+"', address='"+address+"', age="+tf7.getText()+", phone='"+phone+"' where employee_id="+tf1.getText()+";";
                st.executeUpdate(q);
                JOptionPane.showMessageDialog(null,"data update");
                int id=Integer.parseInt(tf1.getText());
                tf1.setText("");
                tf2.setText("");
                tf3.setText("");
                tf4.setText("");
                tf5.setText("");
                tf7.setText("");
                tf8.setText("");
                tf9.setText("");
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null,"error in connection");
            }
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void mStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_mStateChanged
        // TODO add your handling code here:
        if(m.isSelected())
            {
                gender="male";
                gen=1;
            }
    }//GEN-LAST:event_mStateChanged

    private void fmStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_fmStateChanged
        // TODO add your handling code here:
            if(fm.isSelected())
            {
                gender="female";
                gen=1;
            }
    }//GEN-LAST:event_fmStateChanged

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
       tf1.setText("");
                tf2.setText("");
                tf3.setText("");
                tf4.setText("");
                tf5.setText("");
                tf7.setText("");
                tf8.setText("");
                tf9.setText("");
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        // TODO add your handling code here:
        DashBoard db=new DashBoard();
        db.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel16MouseClicked

    private void jLabel16MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseEntered
        // TODO add your handling code here:
        jLabel16.setForeground(Color.BLUE);
    }//GEN-LAST:event_jLabel16MouseEntered

    private void jLabel16MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseExited
        // TODO add your handling code here:
        jLabel16.setForeground(Color.white);
    }//GEN-LAST:event_jLabel16MouseExited

    private void p12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p12MouseClicked
        // TODO add your handling code here:
        DashBoard db=new DashBoard();
        db.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_p12MouseClicked

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

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        this .setVisible(false);
        employee_management em=new employee_management();
        em.setVisible(true);
    }//GEN-LAST:event_jLabel3MouseClicked

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
        add_doctor dm=new add_doctor();
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

    private void l1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l1MouseClicked
        // TODO add your handling code here:
        Patient_Mangement pm=new Patient_Mangement();
        pm.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_l1MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
        Bill_DashBoard bd=new Bill_DashBoard();
        bd.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // TODO add your handling code here:
        appointment_dashboard ad=new appointment_dashboard();
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

    private void tf1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf1KeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==10)
        {
            try
            {
                q="Select * from employee where employee_id="+tf1.getText()+";";
                rs=st.executeQuery(q);
                while(rs.next())
                {
                    tf2.setText(rs.getString("employee_name"));
                    tf3.setText(rs.getString("hiredate"));
                    if(rs.getString("gender").equals("Male") || rs.getString("gender").equals("male"))
                    {
                        m.setSelected(true);
                        fm.setSelected(false);
                    }
                    if(rs.getString("gender").equals("Female")|| rs.getString("gender").equals("female"))
                    {
                        fm.setSelected(true);
                        m.setSelected(false);
                    }
                    tf4.setText(""+rs.getString("job"));
                    tf5.setText(rs.getString("blood_group"));
                    tf7.setText(""+rs.getInt("age"));
                    tf8.setText(rs.getString("phone"));
                    tf9.setText(rs.getString("address"));
                }
            }
            catch(Exception e)
            {

            }
        }
    }//GEN-LAST:event_tf1KeyPressed

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
            java.util.logging.Logger.getLogger(Patient_Mangement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Patient_Mangement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Patient_Mangement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Patient_Mangement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new update_employee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel L8;
    private javax.swing.JLabel L9;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton fm;
    private javax.swing.JLabel img1;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel137;
    private javax.swing.JLabel jLabel138;
    private javax.swing.JLabel jLabel139;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel140;
    private javax.swing.JLabel jLabel141;
    private javax.swing.JLabel jLabel142;
    private javax.swing.JLabel jLabel143;
    private javax.swing.JLabel jLabel144;
    private javax.swing.JLabel jLabel145;
    private javax.swing.JLabel jLabel146;
    private javax.swing.JLabel jLabel147;
    private javax.swing.JLabel jLabel148;
    private javax.swing.JLabel jLabel149;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel150;
    private javax.swing.JLabel jLabel151;
    private javax.swing.JLabel jLabel152;
    private javax.swing.JLabel jLabel153;
    private javax.swing.JLabel jLabel154;
    private javax.swing.JLabel jLabel155;
    private javax.swing.JLabel jLabel156;
    private javax.swing.JLabel jLabel157;
    private javax.swing.JLabel jLabel158;
    private javax.swing.JLabel jLabel159;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel160;
    private javax.swing.JLabel jLabel161;
    private javax.swing.JLabel jLabel162;
    private javax.swing.JLabel jLabel163;
    private javax.swing.JLabel jLabel164;
    private javax.swing.JLabel jLabel165;
    private javax.swing.JLabel jLabel166;
    private javax.swing.JLabel jLabel167;
    private javax.swing.JLabel jLabel168;
    private javax.swing.JLabel jLabel169;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel170;
    private javax.swing.JLabel jLabel171;
    private javax.swing.JLabel jLabel172;
    private javax.swing.JLabel jLabel173;
    private javax.swing.JLabel jLabel174;
    private javax.swing.JLabel jLabel175;
    private javax.swing.JLabel jLabel176;
    private javax.swing.JLabel jLabel177;
    private javax.swing.JLabel jLabel178;
    private javax.swing.JLabel jLabel179;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel180;
    private javax.swing.JLabel jLabel181;
    private javax.swing.JLabel jLabel182;
    private javax.swing.JLabel jLabel183;
    private javax.swing.JLabel jLabel184;
    private javax.swing.JLabel jLabel185;
    private javax.swing.JLabel jLabel186;
    private javax.swing.JLabel jLabel187;
    private javax.swing.JLabel jLabel188;
    private javax.swing.JLabel jLabel189;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel190;
    private javax.swing.JLabel jLabel191;
    private javax.swing.JLabel jLabel192;
    private javax.swing.JLabel jLabel193;
    private javax.swing.JLabel jLabel194;
    private javax.swing.JLabel jLabel195;
    private javax.swing.JLabel jLabel196;
    private javax.swing.JLabel jLabel197;
    private javax.swing.JLabel jLabel198;
    private javax.swing.JLabel jLabel199;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel200;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel40;
    private javax.swing.JPanel jPanel41;
    private javax.swing.JPanel jPanel42;
    private javax.swing.JPanel jPanel43;
    private javax.swing.JPanel jPanel44;
    private javax.swing.JPanel jPanel45;
    private javax.swing.JPanel jPanel46;
    private javax.swing.JPanel jPanel47;
    private javax.swing.JPanel jPanel48;
    private javax.swing.JPanel jPanel49;
    private javax.swing.JPanel jPanel50;
    private javax.swing.JPanel jPanel51;
    private javax.swing.JPanel jPanel52;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JLabel l1;
    private javax.swing.JRadioButton m;
    private javax.swing.JPanel p1;
    private p1 p11;
    private p1 p12;
    private javax.swing.JTextField tf1;
    private javax.swing.JTextField tf2;
    private javax.swing.JTextField tf3;
    private javax.swing.JTextField tf4;
    private javax.swing.JTextField tf5;
    private javax.swing.JTextField tf7;
    private javax.swing.JTextField tf8;
    private javax.swing.JTextField tf9;
    // End of variables declaration//GEN-END:variables
}
