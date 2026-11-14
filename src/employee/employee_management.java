package employee;

import System_user.Systemuser_dashboard;
import appointment.appointment_dashboard;
import billing_and_invoice.Bill_DashBoard;
import billing_and_invoice.add_Billing;
import dashboard.DashBoard;
import doctor.Doctor_Mangement;
import patient.Patient_Mangement;
import panel.*;
import search.search.*;
import medical.*;
import attendance.*;
import login.*;

import java.awt.*;
import java.awt.print.PrinterJob;
import java.sql.*;
import java.text.*;
import javax.swing.*;
import javax.swing.table.*;
import java.util.Date;
public class employee_management extends javax.swing.JFrame {
    Connection con;
    Statement st;
    ResultSet rs;
    String q;
    Date d;
    SimpleDateFormat currentdate,month,monthname,year;
    DefaultTableModel model;
    String name="",jb="";
    public employee_management() {
        initComponents();
        //l1.setForeground(Color.BLUE);
        setLocationRelativeTo(null);
        Date d=new Date();
        monthname=new SimpleDateFormat("MMMM");
        month=new SimpleDateFormat("MM");
        currentdate=new SimpleDateFormat("YYYY-MM-dd");
        year=new SimpleDateFormat("YYYY");
        l6.setText("This "+monthname.format(d));
        DefaultTableModel model=(DefaultTableModel) tb1.getModel();
        model.setRowCount(0);
        try
        {
            Class.forName("java.sql.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/health_care", "root", "");
            st=con.createStatement();
            q="select * from employee";
            rs=st.executeQuery(q);
                int emid=0;
                int emage=0;
                String emjob;
                String emname="";
                String emhiredate="";
                String emgender="";
                String emblood="";
                String emaddress="";
                String emphone="";
                int tp=0;
                while(rs.next())
                {
                    tp++;
                    emid=rs.getInt("employee_id");
                    emname=rs.getString("employee_name");
                    emhiredate=rs.getString("hiredate");
                    emgender=rs.getString("gender");
                    emjob=rs.getString("job");
                    emblood=rs.getString("blood_group");
                    emaddress=rs.getString("address");
                    emage=rs.getInt("age");
                    emphone=rs.getString("phone");
                    model.addRow(new Object[]
                        {emid,emname,emhiredate,emgender,emjob,emblood,emaddress,emage,emphone}
                    );
                }
                l2.setText(""+tp);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"error in connection");
        }
        try
        {
            int m=0;
            q="select * from employee where gender='male';";
            rs=st.executeQuery(q);
            while(rs.next())
            {
                m++;
            }
            l4.setText(""+m);
        }
        catch(Exception e)
        {
            
        }
        try
        {
            int fm=0;
            q="select * from employee where gender='female';";
            rs=st.executeQuery(q);
            while(rs.next())
            {
                fm++;
            }
            l5.setText(""+fm);
        }
        catch(Exception e)
        {
            
        }
        try
        {
            int np=0;
            q="select * from employee where hiredate>='"+year.format(d)+"-"+month.format(d)+"-01' and hiredate<='"+currentdate.format(d)+"';";
            rs=st.executeQuery(q);
            while(rs.next())
            {
                np++;
            }
            l3.setText(""+np);
        }
        catch(Exception e)
        {
            
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
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        img1 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        p21 = new panel.p2();
        l16 = new javax.swing.JLabel();
        l1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        L8 = new javax.swing.JLabel();
        L9 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        cb1 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb1 = new javax.swing.JTable();
        jLabel17 = new javax.swing.JLabel();
        p11 = new p1();
        l2 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel105 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tf1 = new search.search2();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        p22 = new panel.p2();
        jLabel18 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        l6 = new javax.swing.JLabel();
        l3 = new javax.swing.JLabel();
        p23 = new panel.p2();
        jLabel19 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        l4 = new javax.swing.JLabel();
        p24 = new panel.p2();
        jLabel12 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        l5 = new javax.swing.JLabel();

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

        jPanel3.setBackground(new java.awt.Color(204, 255, 255));
        jPanel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel3.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 118, 139));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(img1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 110));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/copy1.png"))); // NOI18N
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 80));

        p21.setBackground(new java.awt.Color(4, 146, 160));
        p21.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        l16.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        l16.setForeground(new java.awt.Color(255, 255, 255));
        l16.setText("DashBoard");
        l16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l16MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                l16MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                l16MouseExited(evt);
            }
        });
        p21.add(l16, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 16, -1, -1));

        jPanel2.add(p21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 260, 60));

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
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, -1, -1));

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

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 660));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setText("jLabel4");
        jPanel6.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 270, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel9.setText("Employee Mangement");
        jPanel6.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 14, 420, 50));

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
        jButton1.setText("Print Detalis");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 200, -1, 40));

        cb1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cb1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Default", "blood_group", "Gender", "hiredate", "age", "job" }));
        cb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb1ActionPerformed(evt);
            }
        });
        jPanel3.add(cb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 200, 110, 40));

        tb1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Employee_id", "Employee_name", "hiredate", "gender", "jobs", "blood_group", "address", "age", "phone"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
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
        tb1.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        if (tb1.getColumnModel().getColumnCount() > 0) {
            tb1.getColumnModel().getColumn(6).setPreferredWidth(150);
        }

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 270, 970, 350));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel17.setText("Employee List");
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 230, -1, 40));

        p11.setBackground(new java.awt.Color(255, 255, 255));
        p11.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        p11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        l2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        l2.setText("12200");
        p11.add(l2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, -1, -1));
        p11.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 20, -1, -1));

        jLabel105.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel105.setText("Total Employee");
        p11.add(jLabel105, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 10, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icon9.png"))); // NOI18N
        p11.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jPanel3.add(p11, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, 230, 90));

        tf1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tf1KeyPressed(evt);
            }
        });
        jPanel3.add(tf1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 200, 230, 40));

        jButton2.setBackground(new java.awt.Color(0, 118, 139));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("+ Add");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 200, -1, 40));

        jButton3.setBackground(new java.awt.Color(0, 118, 139));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Update");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 200, -1, 40));

        p22.setBackground(new java.awt.Color(255, 255, 255));
        p22.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icon10.png"))); // NOI18N
        p22.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 2, 90, 80));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel10.setText("New Employee");
        p22.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, -1, 40));

        l6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        l6.setText("This Month");
        p22.add(l6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, -1, 40));

        l3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        l3.setText("12200");
        p22.add(l3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, -1, -1));

        jPanel3.add(p22, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 90, 230, 90));

        p23.setBackground(new java.awt.Color(255, 255, 255));
        p23.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icon11.png"))); // NOI18N
        p23.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 3, 90, 80));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel13.setText("Male Employee");
        p23.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, -1, -1));

        l4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        l4.setText("12200");
        p23.add(l4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, -1, -1));

        jPanel3.add(p23, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 90, 240, 90));

        p24.setBackground(new java.awt.Color(255, 255, 255));
        p24.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icon12.png"))); // NOI18N
        p24.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 3, 90, 80));

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel25.setText("Female Employee");
        p24.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, -1));

        l5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        l5.setText("12200");
        p24.add(l5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, -1, -1));

        jPanel3.add(p24, new org.netbeans.lib.awtextra.AbsoluteConstraints(1015, 90, 250, 90));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1270, 650));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
String bg="";
    private void cb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb1ActionPerformed
        // TODO add your handling code here:
        jb=(String)cb1.getSelectedItem();
        int count=0;
        if(jb.equals("job"))
        {
            bg=JOptionPane.showInputDialog("enter job");
            if(bg==null)
            {
                JOptionPane.showMessageDialog(this,"invalid job plz enter valid job");
                try
                {
                    model=(DefaultTableModel) tb1.getModel();
                    model.setRowCount(0);
                    q="select * from employee;";
                    rs=st.executeQuery(q);
                    int emid=0;
                    int emage=0;
                    String emjob;
                    String emname="";
                    String emhiredate="";
                    String emgender="";
                    String emblood="";
                    String emaddress="";
                    String emphone="";
                    while(rs.next())
                    {
                        emid=rs.getInt("employee_id");
                        emname=rs.getString("employee_name");
                        emhiredate=rs.getString("hiredate");
                        emgender=rs.getString("gender");
                        emjob=rs.getString("job");
                        emblood=rs.getString("blood_group");
                        emaddress=rs.getString("address");
                        emage=rs.getInt("age");
                        emphone=rs.getString("phone");
                        model.addRow(new Object[]
                            {emid,emname,emhiredate,emgender,emjob,emblood,emaddress,emage,emphone}
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
                    q="select * from employee where job='"+bg+"';";
                    rs=st.executeQuery(q);
                    int emid=0;
                    int emage=0;
                    String emjob;
                    String emname="";
                    String emhiredate="";
                    String emgender="";
                    String emblood="";
                    String emaddress="";
                    String emphone="";
                    while(rs.next())
                    {
                        emid=rs.getInt("employee_id");
                        emname=rs.getString("employee_name");
                        emhiredate=rs.getString("hiredate");
                        emgender=rs.getString("gender");
                        emjob=rs.getString("job");
                        emblood=rs.getString("blood_group");
                        emaddress=rs.getString("address");
                        emage=rs.getInt("age");
                        emphone=rs.getString("phone");
                        model.addRow(new Object[]
                            {emid,emname,emhiredate,emgender,emjob,emblood,emaddress,emage,emphone}
                        );
                    }
                }
                catch(Exception e)
                {
                    JOptionPane.showMessageDialog(this,"");
                }
            }
        }
        if(jb.equals("blood_group"))
        {
            bg=JOptionPane.showInputDialog("enter Blood Group");
            if(bg==null)
            {
                JOptionPane.showMessageDialog(this,"invalid blood_group plz enter valid blood_group");
                try
                {
                    model=(DefaultTableModel) tb1.getModel();
                    model.setRowCount(0);
                    q="select * from employee;";
                    rs=st.executeQuery(q);
                    int emid=0;
                    int emage=0;
                    String emjob;
                    String emname="";
                    String emhiredate="";
                    String emgender="";
                    String emblood="";
                    String emaddress="";
                    String emphone="";
                    while(rs.next())
                    {
                        emid=rs.getInt("employee_id");
                        emname=rs.getString("employee_name");
                        emhiredate=rs.getString("hiredate");
                        emgender=rs.getString("gender");
                        emjob=rs.getString("job");
                        emblood=rs.getString("blood_group");
                        emaddress=rs.getString("address");
                        emage=rs.getInt("age");
                        emphone=rs.getString("phone");
                        model.addRow(new Object[]
                            {emid,emname,emhiredate,emgender,emjob,emblood,emaddress,emage,emphone}
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
                    q="select * from employee where blood_group='"+bg+"';";
                    rs=st.executeQuery(q);
                    int emid=0;
                    int emage=0;
                    String emjob;
                    String emname="";
                    String emhiredate="";
                    String emgender="";
                    String emblood="";
                    String emaddress="";
                    String emphone="";
                    while(rs.next())
                    {
                        emid=rs.getInt("employee_id");
                        emname=rs.getString("employee_name");
                        emhiredate=rs.getString("hiredate");
                        emgender=rs.getString("gender");
                        emjob=rs.getString("job");
                        emblood=rs.getString("blood_group");
                        emaddress=rs.getString("address");
                        emage=rs.getInt("age");
                        emphone=rs.getString("phone");
                        model.addRow(new Object[]
                            {emid,emname,emhiredate,emgender,emjob,emblood,emaddress,emage,emphone}
                        );
                    }
                }
                catch(Exception e)
                {
                    JOptionPane.showMessageDialog(this,"");
                }
            }
        }
        if(jb.equals("Gender"))
        {
            bg=JOptionPane.showInputDialog("enter Gender");
            if(bg==null)
            {
                JOptionPane.showMessageDialog(this,"invalid gender plz enter valid gender");
                try
                {
                    model=(DefaultTableModel) tb1.getModel();
                    model.setRowCount(0);
                    q="select * from employee;";
                    rs=st.executeQuery(q);
                    int emid=0;
                    int emage=0;
                    String emjob;
                    String emname="";
                    String emhiredate="";
                    String emgender="";
                    String emblood="";
                    String emaddress="";
                    String emphone="";
                    while(rs.next())
                    {
                        emid=rs.getInt("employee_id");
                        emname=rs.getString("employee_name");
                        emhiredate=rs.getString("hiredate");
                        emgender=rs.getString("gender");
                        emjob=rs.getString("job");
                        emblood=rs.getString("blood_group");
                        emaddress=rs.getString("address");
                        emage=rs.getInt("age");
                        emphone=rs.getString("phone");
                        model.addRow(new Object[]
                            {emid,emname,emhiredate,emgender,emjob,emblood,emaddress,emage,emphone}
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
                    q="select * from employee where gender='"+bg+"';";
                    rs=st.executeQuery(q);
                    int emid=0;
                    int emage=0;
                    String emjob;
                    String emname="";
                    String emhiredate="";
                    String emgender="";
                    String emblood="";
                    String emaddress="";
                    String emphone="";
                    while(rs.next())
                    {
                        emid=rs.getInt("employee_id");
                        emname=rs.getString("employee_name");
                        emhiredate=rs.getString("hiredate");
                        emgender=rs.getString("gender");
                        emjob=rs.getString("job");
                        emblood=rs.getString("blood_group");
                        emaddress=rs.getString("address");
                        emage=rs.getInt("age");
                        emphone=rs.getString("phone");
                        model.addRow(new Object[]
                            {emid,emname,emhiredate,emgender,emjob,emblood,emaddress,emage,emphone}
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
                q="select * from employee;";
                rs=st.executeQuery(q);
                int emid=0;
                int emage=0;
                String emjob;
                String emname="";
                String emhiredate="";
                String emgender="";
                String emblood="";
                String emaddress="";
                String emphone="";
                while(rs.next())
                {
                    emid=rs.getInt("employee_id");
                    emname=rs.getString("employee_name");
                    emhiredate=rs.getString("hiredate");
                    emgender=rs.getString("gender");
                    emjob=rs.getString("job");
                    emblood=rs.getString("blood_group");
                    emaddress=rs.getString("address");
                    emage=rs.getInt("age");
                    emphone=rs.getString("phone");
                    model.addRow(new Object[]
                        {emid,emname,emhiredate,emgender,emjob,emblood,emaddress,emage,emphone}
                    );
                }
            }
            catch(Exception e)
            {

            }
        }
        if(jb.equals("age"))
        {
            String a=JOptionPane.showInputDialog("enter age");
            if(a==null)
            {
                JOptionPane.showMessageDialog(this,"invalid age plz enter valid age");
                try
                {
                    model=(DefaultTableModel) tb1.getModel();
                    model.setRowCount(0);
                    q="select * from employee;";
                    rs=st.executeQuery(q);
                    int emid=0;
                    int emage=0;
                    String emjob;
                    String emname="";
                    String emhiredate="";
                    String emgender="";
                    String emblood="";
                    String emaddress="";
                    String emphone="";
                    while(rs.next())
                    {
                        emid=rs.getInt("employee_id");
                        emname=rs.getString("employee_name");
                        emhiredate=rs.getString("hiredate");
                        emgender=rs.getString("gender");
                        emjob=rs.getString("job");
                        emblood=rs.getString("blood_group");
                        emaddress=rs.getString("address");
                        emage=rs.getInt("age");
                        emphone=rs.getString("phone");
                        model.addRow(new Object[]
                            {emid,emname,emhiredate,emgender,emjob,emblood,emaddress,emage,emphone}
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
                    q="select * from employee where age="+a+";";
                    rs=st.executeQuery(q);
                    int emid=0;
                    int emage=0;
                    String emjob;
                    String emname="";
                    String emhiredate="";
                    String emgender="";
                    String emblood="";
                    String emaddress="";
                    String emphone="";
                    while(rs.next())
                    {
                        emid=rs.getInt("employee_id");
                        emname=rs.getString("employee_name");
                        emhiredate=rs.getString("hiredate");
                        emgender=rs.getString("gender");
                        emjob=rs.getString("job");
                        emblood=rs.getString("blood_group");
                        emaddress=rs.getString("address");
                        emage=rs.getInt("age");
                        emphone=rs.getString("phone");
                        model.addRow(new Object[]
                            {emid,emname,emhiredate,emgender,emjob,emblood,emaddress,emage,emphone}
                        );
                    }
                }
                catch(Exception e)
                {
                    JOptionPane.showMessageDialog(this,"error in connection");
                }
            }
        }
        if(jb.equals("hiredate"))
        {
            try
            {
                bg=JOptionPane.showInputDialog("enter Addmission date for eg 2026-07-11");
                int pos=bg.indexOf("-");
                boolean valid=true;
                if(pos==-1)
                {
                    JOptionPane.showMessageDialog(null,"invalid date");
                    valid=false;
                }
                if(valid==true)
                {
                    int ct=0;
                    try
                    {    
                        model=(DefaultTableModel) tb1.getModel();
                        model.setRowCount(0);
                        q="select * from employee where hiredate='"+bg+"';";
                        rs=st.executeQuery(q);
                        int emid=0;
                        int emage=0;
                        String emjob;
                        String emname="";
                        String emhiredate="";
                        String emgender="";
                        String emblood="";
                        String emaddress="";
                        String emphone="";
                        while(rs.next())
                        {
                            ct=1;
                            emid=rs.getInt("employee_id");
                            emname=rs.getString("employee_name");
                            emhiredate=rs.getString("hiredate");
                            emgender=rs.getString("gender");
                            emjob=rs.getString("job");
                            emblood=rs.getString("blood_group");
                            emaddress=rs.getString("address");
                            emage=rs.getInt("age");
                            emphone=rs.getString("phone");
                            model.addRow(new Object[]
                                {emid,emname,emhiredate,emgender,emjob,emblood,emaddress,emage,emphone}
                            );
                        }
                        if(ct==0)
                        {
                            JOptionPane.showMessageDialog(null,"addmission date invalid");
                        }
                    }   
                    catch(Exception e)
                    {
                        
                    }
                }
            }
            catch(NullPointerException npe)
            {
                JOptionPane.showMessageDialog(this,"invalid hiredateplz enter valid date");
                try
                {
                    model=(DefaultTableModel) tb1.getModel();
                    model.setRowCount(0);
                    q="select * from employee;";
                    rs=st.executeQuery(q);
                    int emid=0;
                    int emage=0;
                    String emjob;
                    String emname="";
                    String emhiredate="";
                    String emgender="";
                    String emblood="";
                    String emaddress="";
                    String emphone="";
                    while(rs.next())
                    {
                        emid=rs.getInt("employee_id");
                        emname=rs.getString("employee_name");
                        emhiredate=rs.getString("hiredate");
                        emgender=rs.getString("gender");
                        emjob=rs.getString("job");
                        emblood=rs.getString("blood_group");
                        emaddress=rs.getString("address");
                        emage=rs.getInt("age");
                        emphone=rs.getString("phone");
                        model.addRow(new Object[]
                            {emid,emname,emhiredate,emgender,emjob,emblood,emaddress,emage,emphone}
                        );
                    }
                }
                catch(Exception e)
                {
                    JOptionPane.showMessageDialog(this,"error in this connection");
                }
            }
        }
    }//GEN-LAST:event_cb1ActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        Doctor_Mangement dm=new Doctor_Mangement();
        dm.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel1MouseClicked

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

    private void tf1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf1ActionPerformed

    private void l16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l16MouseClicked
        // TODO add your handling code here:
        DashBoard DB=new DashBoard();
        DB.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_l16MouseClicked

    private void l16MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l16MouseEntered
        // TODO add your handling code here:
        l16.setForeground(Color.BLUE);
    }//GEN-LAST:event_l16MouseEntered

    private void l16MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l16MouseExited
        // TODO add your handling code here:
         l16.setForeground(Color.white);
    }//GEN-LAST:event_l16MouseExited

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

    private void tf1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf1KeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()>=65 && evt.getKeyCode()<=90 || evt.getKeyCode()==32)
        {
            model=(DefaultTableModel) tb1.getModel();
            model.setRowCount(0);
            name=name+evt.getKeyChar();
            try
            {
                q="select * from employee where employee_name like '"+name+"%';";
                rs=st.executeQuery(q);
                int emid=0;
                int emage=0;
                String emjob;
                String emname="";
                String emhiredate="";
                String emgender="";
                String emblood="";
                String emaddress="";
                String emphone="";
                while(rs.next())
                {
                    emid=rs.getInt("employee_id");
                    emname=rs.getString("employee_name");
                    emhiredate=rs.getString("hiredate");
                    emgender=rs.getString("gender");
                    emjob=rs.getString("job");
                    emblood=rs.getString("blood_group");
                    emaddress=rs.getString("address");
                    emage=rs.getInt("age");
                    emphone=rs.getString("phone");
                    model.addRow(new Object[]
                        {emid,emname,emhiredate,emgender,emjob,emblood,emaddress,emage,emphone}
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
                name=name.substring(0,name.length()-1);
                try
                {
                    q="select * from employee where employee_name like '"+name+"%';";
                    rs=st.executeQuery(q);
                    int emid=0;
                    int emage=0;
                    String emjob;
                    String emname="";
                    String emhiredate="";
                    String emgender="";
                    String emblood="";
                    String emaddress="";
                    String emphone="";
                    while(rs.next())
                    {
                        emid=rs.getInt("employee_id");
                        emname=rs.getString("employee_name");
                        emhiredate=rs.getString("hiredate");
                        emgender=rs.getString("gender");
                        emjob=rs.getString("job");
                        emblood=rs.getString("blood_group");
                        emaddress=rs.getString("address");
                        emage=rs.getInt("age");
                        emphone=rs.getString("phone");
                        model.addRow(new Object[]
                            {emid,emname,emhiredate,emgender,emjob,emblood,emaddress,emage,emphone}
                        );
                    }
                }
                catch(Exception e)
                {

                }
            }
        }
    }//GEN-LAST:event_tf1KeyPressed

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
        Bill_DashBoard bd=new Bill_DashBoard();
        bd.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
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
    }//GEN-LAST:event_jLabel3MouseClicked

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

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        add_employee pm=new add_employee();
        pm.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        update_employee ue=new update_employee();
        ue.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

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
                new employee_management().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private javax.swing.JLabel jLabel137;
    private javax.swing.JLabel jLabel138;
    private javax.swing.JLabel jLabel139;
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel200;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l16;
    private javax.swing.JLabel l2;
    private javax.swing.JLabel l3;
    private javax.swing.JLabel l4;
    private javax.swing.JLabel l5;
    private javax.swing.JLabel l6;
    private p1 p11;
    private panel.p2 p21;
    private panel.p2 p22;
    private panel.p2 p23;
    private panel.p2 p24;
    private javax.swing.JTable tb1;
    private search.search2 tf1;
    // End of variables declaration//GEN-END:variables
}
