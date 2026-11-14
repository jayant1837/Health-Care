package appointment;

import System_user.Systemuser_dashboard;
import dashboard.*;
import patient.*;
import doctor.*;
import employee.*;
import panel.*;
import search.search1;
import search.search3;
import search.search4;
import billing_and_invoice.*;
import employee.add_employee;
import medical.*;
import login.*;
import attendance.*;

import java.awt.*;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import static java.awt.print.Printable.NO_SUCH_PAGE;
import static java.awt.print.Printable.PAGE_EXISTS;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;

public class appointment_dashboard extends javax.swing.JFrame implements Printable{

    DefaultTableModel model;
    String name="",jb="",bg="";
    Connection con;
    Statement st;
    ResultSet rs;
    String q;
    Date d;
    SimpleDateFormat currentdate,month,monthname,year;
    
    long app_id=0;
    String pdname="";
    long pdnumber=0;
    String doctor_name="";
    String date="";
    String time="";
    String status="";
    
    public appointment_dashboard() {
        initComponents();
        d=new Date();
        monthname=new SimpleDateFormat("MMMM");
        year=new  SimpleDateFormat("YYYY");
        month=new SimpleDateFormat("MM");
        currentdate=new SimpleDateFormat("DD");
        L1.setText(monthname.format(d));
        L2.setText(monthname.format(d));
        L3.setText(monthname.format(d));
        L4.setText(monthname.format(d));
        DefaultTableModel model=(DefaultTableModel) tb1.getModel();
        try
        {
            Class.forName("java.sql.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/health_care", "root", "");
            st=con.createStatement();
            q="select * from appointment;";
            rs=st.executeQuery(q);
            while(rs.next())
            {
                app_id=rs.getLong("app_id");
                pdname=rs.getString("patient_name");
                pdnumber=rs.getLong("patient_number");
                doctor_name=rs.getString("doctor_name");
                date=rs.getString("date");
                time=rs.getString("time");
                status=rs.getString("status");
                model.addRow(new Object[]
                    {app_id,pdname,pdnumber,doctor_name,date,time,status}
                    );
            }
            q="select count(app_id) from appointment where date>='"+year.format(d)+"-"+month.format(d)+"-01' and date<='"+year.format(d)+"-"+month+"-04';";
            rs=st.executeQuery(q);
            while(rs.next())
            {
                tp.setText(""+rs.getString("count(app_id)"));
            }
            q="select count(app_id) from appointment where status='pending';";
            rs=st.executeQuery(q);
            while(rs.next())
            {
                me.setText(""+rs.getString("count(app_id)"));
            }
            q="select count(app_id) from appointment where status='cancel';";
            rs=st.executeQuery(q);
            while(rs.next())
            {
                ts.setText(""+rs.getString("count(app_id)"));
            }
            q="select count(app_id) from appointment where status='complete';";
            rs=st.executeQuery(q);
            while(rs.next())
            {
                tst.setText(""+rs.getString("count(app_id)"));
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this,"error in mysql connection ");
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tb1 = new javax.swing.JTable();
        jLabel17 = new javax.swing.JLabel();
        cb1 = new javax.swing.JComboBox<>();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        p13 = new p1();
        jLabel12 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        ts = new javax.swing.JLabel();
        L4 = new javax.swing.JLabel();
        p15 = new p1();
        jLabel24 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        tst = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        L3 = new javax.swing.JLabel();
        p14 = new p1();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        me = new javax.swing.JLabel();
        L2 = new javax.swing.JLabel();
        p11 = new p1();
        tp = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel105 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        L1 = new javax.swing.JLabel();
        tf1 = new search.search();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 187));

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
        jPanel2.add(l2, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 240, -1, -1));

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
        jPanel2.add(l3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, -1, -1));

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
        jPanel2.add(l5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, -1, -1));

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
        jPanel2.add(l6, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 400, -1, -1));

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
        jPanel2.add(l7, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 440, -1, -1));

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
        jPanel2.add(l1, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 200, -1, -1));

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
        jPanel2.add(l4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, -1, -1));

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
        jPanel2.add(L8, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 480, -1, -1));

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
        jPanel2.add(L9, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 520, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 660));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel29.setText("jLabel4");
        jPanel6.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 270, -1, -1));

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel30.setText("Appointment");
        jPanel6.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 14, 290, 50));

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

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 1030, 70));

        tb1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Appointment Id", "Patient Name", "Patient Number", "Doctor Name", "Date", "Time", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 310, 970, 330));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel17.setText("Appointment List");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 270, -1, 40));

        cb1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cb1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Default", "Doctor Name", "Date", "Complete", "Pending", "Cancel" }));
        cb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb1ActionPerformed(evt);
            }
        });
        jPanel1.add(cb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 210, 110, 40));

        jButton5.setBackground(new java.awt.Color(0, 118, 139));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Update");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 210, -1, 40));

        jButton6.setBackground(new java.awt.Color(0, 118, 139));
        jButton6.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Add Appointment");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 210, -1, 40));

        p13.setBackground(new java.awt.Color(255, 255, 255));
        p13.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        p13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/p4.png"))); // NOI18N
        p13.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, -10, 130, 110));

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 23)); // NOI18N
        jLabel25.setText("Cancel");
        p13.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 7, -1, -1));

        jLabel26.setText("100");
        p13.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 101, -1, -1));
        p13.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 2, -1, -1));

        ts.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        ts.setText("12200");
        p13.add(ts, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, -1, -1));

        L4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        L4.setText("This Month");
        p13.add(L4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, -1, 40));

        jPanel1.add(p13, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 90, 210, 90));

        p15.setBackground(new java.awt.Color(255, 255, 255));
        p15.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        p15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 23)); // NOI18N
        jLabel24.setText("Complete");
        p15.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 8, -1, -1));

        jLabel28.setText("100");
        p15.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 101, -1, -1));
        p15.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 2, -1, -1));

        tst.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        tst.setText("12200");
        p15.add(tst, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, -1, -1));

        jLabel42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/p3.png"))); // NOI18N
        p15.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 3, 90, 80));

        L3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        L3.setText("This Month");
        p15.add(L3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, -1, 40));

        jPanel1.add(p15, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 90, 220, 90));

        p14.setBackground(new java.awt.Color(255, 255, 255));
        p14.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        p14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel21.setText("Pending");
        p14.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, -1, 40));

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/p2.png"))); // NOI18N
        p14.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 4, 90, 80));
        p14.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        me.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        me.setText("12200");
        p14.add(me, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, -1, -1));

        L2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        L2.setText("This Month");
        p14.add(L2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, -1, 40));

        jPanel1.add(p14, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 90, 210, 90));

        p11.setBackground(new java.awt.Color(255, 255, 255));
        p11.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        p11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tp.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        tp.setText("12200");
        p11.add(tp, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, -1, -1));
        p11.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 20, -1, -1));

        jLabel105.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel105.setText("Total Appointment");
        p11.add(jLabel105, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 8, -1, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/d1.png"))); // NOI18N
        p11.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1, -4, -1, -1));

        L1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        L1.setText("This Month");
        p11.add(L1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, -1, 40));

        jPanel1.add(p11, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, 270, 90));

        tf1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tf1KeyPressed(evt);
            }
        });
        jPanel1.add(tf1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 210, 230, 40));

        jButton1.setBackground(new java.awt.Color(0, 118, 139));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Print User Data");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 210, -1, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1270, 650));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb1ActionPerformed
        // TODO add your handling code here:
        jb=(String)cb1.getSelectedItem();
        int count=0;
        if(jb.equals("Cancel"))
        {
            model=(DefaultTableModel)tb1.getModel();
            model.setRowCount(0);
            try
            {
                q="select * from appointment where status='Cancel';";
                rs=st.executeQuery(q);
                while(rs.next())
                {

                    app_id=rs.getLong("app_id");
                    pdname=rs.getString("patient_name");
                    pdnumber=rs.getLong("patient_number");
                    doctor_name=rs.getString("doctor_name");
                    date=rs.getString("date");
                    time=rs.getString("time");
                    status=rs.getString("status");
                    model.addRow(new Object[]
                        {app_id,pdname,pdnumber,doctor_name,date,time,status}
                        );
                }
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(this,"error in mysql connection");
            }

        }
        if(jb.equals("Complete"))
        {
            model=(DefaultTableModel)tb1.getModel();
            model.setRowCount(0);
            try
            {
                q="select * from appointment where status='Complete';";
                rs=st.executeQuery(q);
                while(rs.next())
                {

                    app_id=rs.getLong("app_id");
                    pdname=rs.getString("patient_name");
                    pdnumber=rs.getLong("patient_number");
                    doctor_name=rs.getString("doctor_name");
                    date=rs.getString("date");
                    time=rs.getString("time");
                    status=rs.getString("status");
                    model.addRow(new Object[]
                        {app_id,pdname,pdnumber,doctor_name,date,time,status}
                        );
                }
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(this,"error in mysql connection");
            }

        }
        if(jb.equals("Pending"))
        {
            model=(DefaultTableModel)tb1.getModel();
            model.setRowCount(0);
            try
            {
                q="select * from appointment where status='pending';";
                rs=st.executeQuery(q);
                while(rs.next())
                {

                    app_id=rs.getLong("app_id");
                    pdname=rs.getString("patient_name");
                    pdnumber=rs.getLong("patient_number");
                    doctor_name=rs.getString("doctor_name");
                    date=rs.getString("date");
                    time=rs.getString("time");
                    status=rs.getString("status");
                    model.addRow(new Object[]
                        {app_id,pdname,pdnumber,doctor_name,date,time,status}
                        );
                }
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(this,"error in mysql connection");
            }

        }
        if(jb.equals("Doctor Name"))
        {
            bg=JOptionPane.showInputDialog("enter Doctor name");
            if(bg==null)
            {
                JOptionPane.showMessageDialog(this,"invalid Doctor name plz enter valid Doctor name");
                try
                {
                    model=(DefaultTableModel)tb1.getModel();
                    model.setRowCount(0);
                    q="select * from appointment;";
                    rs=st.executeQuery(q);
                    while(rs.next())
                    {
                        app_id=rs.getLong("app_id");
                        pdname=rs.getString("patient_name");
                        pdnumber=rs.getLong("patient_number");
                        doctor_name=rs.getString("doctor_name");
                        date=rs.getString("date");
                        time=rs.getString("time");
                        status=rs.getString("status");
                        model.addRow(new Object[]
                            {app_id,pdname,pdnumber,doctor_name,date,time,status}
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
                    q="select * from appointment where doctor_name='"+bg+"';";
                    rs=st.executeQuery(q);
                    int found=0;
                    while(rs.next())
                    {
                        found=1;
                        app_id=rs.getLong("app_id");
                        pdname=rs.getString("patient_name");
                        pdnumber=rs.getLong("patient_number");
                        doctor_name=rs.getString("doctor_name");
                        date=rs.getString("date");
                        time=rs.getString("time");
                        status=rs.getString("status");
                        model.addRow(new Object[]
                            {app_id,pdname,pdnumber,doctor_name,date,time,status}
                            );
                    }
                    if(found==0)
                    {
                        JOptionPane.showMessageDialog(this,"record not found");
                        try
                        {
                            model=(DefaultTableModel) tb1.getModel();
                            model.setRowCount(0);
                            q="select * from appointment;";
                            rs=st.executeQuery(q);
                            while(rs.next())
                            {
                                app_id=rs.getLong("app_id");
                                pdname=rs.getString("patient_name");
                                pdnumber=rs.getLong("patient_number");
                                doctor_name=rs.getString("doctor_name");
                                date=rs.getString("date");
                                time=rs.getString("time");
                                status=rs.getString("status");
                                model.addRow(new Object[]
                                    {app_id,pdname,pdnumber,doctor_name,date,time,status}
                                    );
                            }
                        }
                        catch(Exception e)
                        {
                            JOptionPane.showMessageDialog(this,"error in this connection");
                        }
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
                q="select * from appointment;";
                rs=st.executeQuery(q);
                while(rs.next())
                {
                    app_id=rs.getLong("app_id");
                    pdname=rs.getString("patient_name");
                    pdnumber=rs.getLong("patient_number");
                    doctor_name=rs.getString("doctor_name");
                    date=rs.getString("date");
                    time=rs.getString("time");
                    status=rs.getString("status");
                    model.addRow(new Object[]
                        {app_id,pdname,pdnumber,doctor_name,date,time,status}
                        );
                }
            }
            catch(Exception e)
            {

            }
        }
        if(jb.equals("Date"))
        {
            try
            {
                bg=JOptionPane.showInputDialog("enter Appointment date for eg 2026-07-11");
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
                        q="select * from appointment where date='"+bg+"';";
                        rs=st.executeQuery(q);
                        int found=0;
                        while(rs.next())
                        {
                            found=1;
                            app_id=rs.getLong("app_id");
                            pdname=rs.getString("patient_name");
                            pdnumber=rs.getLong("patient_number");
                            doctor_name=rs.getString("doctor_name");
                            date=rs.getString("date");
                            time=rs.getString("time");
                            status=rs.getString("status");
                            model.addRow(new Object[]
                                {app_id,pdname,pdnumber,doctor_name,date,time,status}
                                );
                        }
                        if(found==0)
                        {
                            JOptionPane.showMessageDialog(this,"record not found");
                            try
                            {
                                model=(DefaultTableModel) tb1.getModel();
                                model.setRowCount(0);
                                q="select * from appointment;";
                                rs=st.executeQuery(q);
                                while(rs.next())
                                {
                                    app_id=rs.getLong("app_id");
                                    pdname=rs.getString("patient_name");
                                    pdnumber=rs.getLong("patient_number");
                                    doctor_name=rs.getString("doctor_name");
                                    date=rs.getString("date");
                                    time=rs.getString("time");
                                    status=rs.getString("status");
                                    model.addRow(new Object[]
                                        {app_id,pdname,pdnumber,doctor_name,date,time,status}
                                        );
                                }
                            }
                            catch(Exception e)
                            {
                                JOptionPane.showMessageDialog(this,"error in this connection");
                            }
                        }
                    }
                    catch(Exception e)
                    {

                    }
                }
            }
            catch(NullPointerException npe)
            {
                JOptionPane.showMessageDialog(this,"invalid Appointment date plz enter valid date");
                try
                {
                    model=(DefaultTableModel) tb1.getModel();
                    model.setRowCount(0);
                    q="select * from appointment;";
                    rs=st.executeQuery(q);
                    while(rs.next())
                    {
                        app_id=rs.getLong("app_id");
                        pdname=rs.getString("patient_name");
                        pdnumber=rs.getLong("patient_number");
                        doctor_name=rs.getString("doctor_name");
                        date=rs.getString("date");
                        time=rs.getString("time");
                        status=rs.getString("status");
                        model.addRow(new Object[]
                            {app_id,pdname,pdnumber,doctor_name,date,time,status}
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

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        update_appointment up=new update_appointment();
        up.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        add_appointment ap=new add_appointment();
        ap.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void tf1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf1KeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()>=65 && evt.getKeyCode()<=90 || evt.getKeyCode()==32)
        {
            model=(DefaultTableModel) tb1.getModel();
            model.setRowCount(0);
            name=name+evt.getKeyChar();
            try
            {
                q="select * from appointment where patient_name like '"+name+"%';";
                rs=st.executeQuery(q);
                while(rs.next())
                {
                    app_id=rs.getLong("app_id");
                    pdname=rs.getString("patient_name");
                    pdnumber=rs.getLong("patient_number");
                    doctor_name=rs.getString("doctor_name");
                    date=rs.getString("date");
                    time=rs.getString("time");
                    status=rs.getString("status");
                    model.addRow(new Object[]
                        {app_id,pdname,pdnumber,doctor_name,date,time,status}
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
                    q="select * from appointment where patient_name like '"+name+"%';";
                    rs=st.executeQuery(q);
                    while(rs.next())
                    {
                        app_id=rs.getLong("app_id");
                        pdname=rs.getString("patient_name");
                        pdnumber=rs.getLong("patient_number");
                        doctor_name=rs.getString("doctor_name");
                        date=rs.getString("date");
                        time=rs.getString("time");
                        status=rs.getString("status");
                        model.addRow(new Object[]
                            {app_id,pdname,pdnumber,doctor_name,date,time,status}
                            );
                    }
                }
                catch(Exception e)
                {

                }
            }
        }
    }//GEN-LAST:event_tf1KeyPressed

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
            java.util.logging.Logger.getLogger(appointment_dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(appointment_dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(appointment_dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(appointment_dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new appointment_dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel L1;
    private javax.swing.JLabel L2;
    private javax.swing.JLabel L3;
    private javax.swing.JLabel L4;
    private javax.swing.JLabel L8;
    private javax.swing.JLabel L9;
    private javax.swing.JComboBox<String> cb1;
    private javax.swing.JLabel img1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel17;
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
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l2;
    private javax.swing.JLabel l3;
    private javax.swing.JLabel l4;
    private javax.swing.JLabel l5;
    private javax.swing.JLabel l6;
    private javax.swing.JLabel l7;
    private javax.swing.JLabel l8;
    private javax.swing.JLabel me;
    private p1 p11;
    private p1 p12;
    private p1 p13;
    private p1 p14;
    private p1 p15;
    private javax.swing.JTable tb1;
    private search.search tf1;
    private javax.swing.JLabel tp;
    private javax.swing.JLabel ts;
    private javax.swing.JLabel tst;
    // End of variables declaration//GEN-END:variables
}
