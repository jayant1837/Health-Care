package attendance;

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
import appointment.*;

import java.awt.*;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.Date;
import java.text.SimpleDateFormat;

public class attendance extends javax.swing.JFrame {

     DefaultTableModel model;
    String name="",jb="",bg="";
    Connection con;
    Statement st;
    ResultSet rs;
    String q;
    Date d;
    String roll="";
    String status="";
    String usrstatus="";
    static String username="";
    static int s_no=0;
    SimpleDateFormat currentdate,month,monthname,year,time;
    public attendance() {
        initComponents();
        d=new Date();
        currentdate=new SimpleDateFormat("YYYY-MM-dd");
        time=new SimpleDateFormat("hh:mm:ss");
        tf7.setText(""+currentdate.format(d));
        tf8.setText(""+time.format(d));
        tf7.setEditable(false);
        tf5.setEditable(false);
        tf3.setEditable(false);
        tf8.setEditable(false);
        try
        {
            Class.forName("java.sql.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/health_care","root","");
            st=con.createStatement();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this,"error in mysql connection ");
        }
    }

    public void detalis(String usid, int id)
    {
        username=usid;
        s_no=id;
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
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
        p11 = new p1();
        jLabel14 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        tf3 = new javax.swing.JTextField();
        tf2 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        tf5 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        tf8 = new javax.swing.JTextField();
        tf7 = new javax.swing.JTextField();
        admin = new javax.swing.JRadioButton();
        Doctor = new javax.swing.JRadioButton();
        notavail = new javax.swing.JRadioButton();
        avail = new javax.swing.JRadioButton();
        employee1 = new javax.swing.JRadioButton();

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
        jPanel2.add(L8, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 480, -1, -1));

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
        jPanel2.add(L9, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 520, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 660));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel29.setText("jLabel4");
        jPanel6.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 270, -1, -1));

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel30.setText("Attendance");
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

        p11.setBackground(new java.awt.Color(255, 255, 255));
        p11.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        p11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel14.setText("Select");
        p11.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel17.setText("Enter ID");
        p11.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel22.setText("Name");
        p11.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));
        p11.add(tf3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 254, 42));

        tf2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tf2KeyPressed(evt);
            }
        });
        p11.add(tf2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, 254, 42));

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 23)); // NOI18N
        jLabel18.setText("Status");
        p11.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 130, -1, -1));

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel21.setText("Number");
        p11.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));
        p11.add(tf5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, 254, 42));
        p11.add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(981, 161, 254, 42));
        p11.add(jTextField14, new org.netbeans.lib.awtextra.AbsoluteConstraints(981, 223, 254, 42));
        p11.add(jTextField15, new org.netbeans.lib.awtextra.AbsoluteConstraints(981, 274, 254, 42));

        jButton5.setBackground(new java.awt.Color(102, 255, 255));
        jButton5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton5.setText("Save");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        p11.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 190, -1, -1));

        jButton6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton6.setText("Clear");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        p11.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 190, -1, -1));

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel23.setText("Date");
        p11.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 20, -1, -1));

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel24.setText("Time");
        p11.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 80, -1, -1));
        p11.add(tf8, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 70, 254, 42));
        p11.add(tf7, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 10, 254, 42));

        buttonGroup1.add(admin);
        admin.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        admin.setText("Admin");
        admin.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                adminStateChanged(evt);
            }
        });
        p11.add(admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 20, -1, -1));

        buttonGroup1.add(Doctor);
        Doctor.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        Doctor.setText("Doctor");
        Doctor.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                DoctorStateChanged(evt);
            }
        });
        p11.add(Doctor, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, -1, -1));

        buttonGroup2.add(notavail);
        notavail.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        notavail.setText("Not Available");
        notavail.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                notavailStateChanged(evt);
            }
        });
        p11.add(notavail, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 130, -1, -1));

        buttonGroup2.add(avail);
        avail.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        avail.setText("Available");
        avail.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                availStateChanged(evt);
            }
        });
        p11.add(avail, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 130, -1, -1));

        buttonGroup1.add(employee1);
        employee1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        employee1.setText("Employee");
        employee1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                employee1StateChanged(evt);
            }
        });
        p11.add(employee1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, -1, -1));

        jPanel1.add(p11, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 170, 930, 270));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1270, 650));

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

    private void l6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l6MouseClicked
        // TODO add your handling code here:
        Bill_DashBoard bd=new Bill_DashBoard();
        bd.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_l6MouseClicked

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

    private void l4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l4MouseClicked
        // TODO add your handling code here:
        medical_record mr=new medical_record();
        mr.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_l4MouseClicked

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

    private void l7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l7MouseClicked
        // TODO add your handling code here:
        appointment_dashboard ad=new appointment_dashboard();
        ad.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_l7MouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
            int count=0,count1=0;
            String msg="";
            if(Doctor.isSelected())
            {
                count=1;
                msg="Doctor";
            }
            if(employee1.isSelected())
            {
                count=1;
                msg="Admin";
            }
            if(admin.isSelected())
            {
                count=1;
                msg="Employee";
            }
            if(avail.isSelected())
            {
                count1=1;
            }
            if(notavail.isSelected())
            {
                count1=1;
            }
            if(count==1 && count1==1)
            {
                try
                {
                    q="insert into attendance values("+tf2.getText()+",'"+tf3.getText()+"',"+tf5.getText()+",'"+tf7.getText()+"','"+tf8.getText()+"','"+msg+"','"+status+"');";
                    st.executeUpdate(q);
                    q="update user_account set roll='"+roll+"', status='"+usrstatus+"' where s_no="+s_no+";";
                    st.executeUpdate(q);
                    JOptionPane.showMessageDialog(this,"data insert");
                    tf2.setText("");
                    tf3.setText("");
                    tf5.setText("");
                }
                catch(Exception e)
                {
                    JOptionPane.showMessageDialog(this,"error in save button connection");
                }
            }
            if(count==0)
            {
                JOptionPane.showMessageDialog(this,"select you are a doctor or employee");
            }
            if(count1==0)
            {
                JOptionPane.showMessageDialog(this,"select you are a Available or not ");
            }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        tf2.setText("");
        tf3.setText("");
        tf5.setText("");
    }//GEN-LAST:event_jButton6ActionPerformed

    private void tf2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf2KeyPressed
        // TODO add your handling code here:
        int count=0;
        if(evt.getKeyCode()==10)
        {
            if(Doctor.isSelected())
            {
                count=1;
                
            }
            if(employee1.isSelected())
            {
                count=1;
                
            }
            if(admin.isSelected())
            {
                count=1;
            }
            if(count==1)
            {
                if(Doctor.isSelected())
                {
                    try
                    {
                        q="select * from doctor_detalis where doctor_id="+tf2.getText()+";";
                        rs=st.executeQuery(q);
                        while(rs.next())
                        {
                            tf3.setText(rs.getString("doctor_name"));
                            tf5.setText(rs.getString("phone"));
                        }
                    }
                    catch(Exception e)
                    {
                        JOptionPane.showMessageDialog(this,"error in doctor id search connection");
                    }
                }
                if(admin.isSelected())
                {
                    try
                    {
                        q="select * from employee where employee_id="+tf2.getText()+";";
                        rs=st.executeQuery(q);
                        while(rs.next())
                        {
                            tf3.setText(rs.getString("employee_name"));
                            tf5.setText(rs.getString("phone"));
                        }
                    }
                    catch(Exception e)
                    {
                        JOptionPane.showMessageDialog(this,"error in doctor id search connection");
                    }
                }
                if(employee1.isSelected())
                {
                    try
                    {
                        q="select * from employee where employee_id="+tf2.getText()+";";
                        rs=st.executeQuery(q);
                        while(rs.next())
                        {
                            tf3.setText(rs.getString("employee_name"));
                            tf5.setText(rs.getString("phone"));
                        }
                    }
                    catch(Exception e)
                    {
                        JOptionPane.showMessageDialog(this,"error in doctor id search connection");
                    }
                }
            }
            if(count==0)
            {
                JOptionPane.showMessageDialog(this,"select you are a doctor or employee or admin");
            }
        }
    }//GEN-LAST:event_tf2KeyPressed

    private void availStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_availStateChanged
        // TODO add your handling code here:
        status="Available";
        usrstatus="Active";
    }//GEN-LAST:event_availStateChanged

    private void notavailStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_notavailStateChanged
        // TODO add your handling code here:
        status="Not Available";
        usrstatus="Inactive";
    }//GEN-LAST:event_notavailStateChanged

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

    private void DoctorStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_DoctorStateChanged
        // TODO add your handling code here:
        roll="Doctor";
    }//GEN-LAST:event_DoctorStateChanged

    private void adminStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_adminStateChanged
        // TODO add your handling code here:
        roll="Employee";
    }//GEN-LAST:event_adminStateChanged

    private void employee1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_employee1StateChanged
        // TODO add your handling code here:
        roll="Admin";
    }//GEN-LAST:event_employee1StateChanged

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
            java.util.logging.Logger.getLogger(attendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(attendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(attendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(attendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new attendance().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Doctor;
    private javax.swing.JLabel L8;
    private javax.swing.JLabel L9;
    private javax.swing.JRadioButton admin;
    private javax.swing.JRadioButton avail;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JRadioButton employee1;
    private javax.swing.JLabel img1;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel14;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l2;
    private javax.swing.JLabel l3;
    private javax.swing.JLabel l4;
    private javax.swing.JLabel l5;
    private javax.swing.JLabel l6;
    private javax.swing.JLabel l7;
    private javax.swing.JLabel l8;
    private javax.swing.JRadioButton notavail;
    private p1 p11;
    private p1 p12;
    private javax.swing.JTextField tf2;
    private javax.swing.JTextField tf3;
    private javax.swing.JTextField tf5;
    private javax.swing.JTextField tf7;
    private javax.swing.JTextField tf8;
    // End of variables declaration//GEN-END:variables
}
