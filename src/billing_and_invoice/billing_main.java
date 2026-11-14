
package billing_and_invoice;

import hospital.*;
import employee.*;
import doctor.*;
import medical.*;
import patient.*;
import panel.*;
import search.search;
import dashboard.*;

import java.awt.*;
import java.awt.print.*;
import java.util.ArrayList;
import javax.swing.*;
import java.util.Date;
import javax.swing.table.DefaultTableModel;
import java.text.SimpleDateFormat;


public class billing_main extends javax.swing.JFrame implements Printable{

    int sum;
    double discount;
    double tax;
    double total_amount;
    DefaultTableModel model;
    Date d;
    SimpleDateFormat sdf;
    public billing_main() {
        initComponents();
        Icon i=img3.getIcon();
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        jScrollPane2.setPreferredSize(new Dimension(screen.width,screen.height-50));
        jScrollPane2.setHorizontalScrollBarPolicy(jScrollPane2.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        jScrollPane2.setVerticalScrollBarPolicy(jScrollPane2.VERTICAL_SCROLLBAR_AS_NEEDED);
        setSize(screen.width, screen.height-50);
        ImageIcon ic=(ImageIcon)i;
        Image image=ic.getImage().getScaledInstance(img3.getWidth(),img3.getHeight(), Image.SCALE_SMOOTH);
        img3.setIcon(new ImageIcon(image));
        data(sum, discount, tax, total_amount);
        d=new Date();
        sdf=new SimpleDateFormat("YYYY-MM-dd");
        date.setText("Date            : "+sdf.format(d));
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
    public void sp()
    {
       PrinterJob job = PrinterJob.getPrinterJob();
       job.setJobName("Print Data");
       job.setPrintable(new Printable()
       {
           public int print(Graphics pg,PageFormat pf, int pageNum)
           {
               pf.setOrientation(PageFormat.LANDSCAPE);
               if(pageNum > 0)
               {
                   return Printable.NO_SUCH_PAGE;
               }
               Graphics2D g2 = (Graphics2D)pg;
               g2.translate(pf.getImageableX(), pf.getImageableY());
               g2.scale(0.49,0.75);
               p1.print(g2);
               return Printable.PAGE_EXISTS;
            }
        });
        boolean ok = job.printDialog();
        if(ok)
        {
            try
            {
                job.print();
                JOptionPane.showMessageDialog(this,"Print Generate");
            }
            catch (PrinterException ex)
            {
                ex.printStackTrace();
            }
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        p1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        bill = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        img3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        p11 = new panel.p1();
        jLabel8 = new javax.swing.JLabel();
        l1 = new javax.swing.JLabel();
        l2 = new javax.swing.JLabel();
        l3 = new javax.swing.JLabel();
        l4 = new javax.swing.JLabel();
        l5 = new javax.swing.JLabel();
        l6 = new javax.swing.JLabel();
        l7 = new javax.swing.JLabel();
        l8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        l9 = new javax.swing.JLabel();
        l10 = new javax.swing.JLabel();
        l11 = new javax.swing.JLabel();
        l12 = new javax.swing.JLabel();
        l13 = new javax.swing.JLabel();
        p12 = new panel.p1();
        jLabel24 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        upi_id = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        city_care = new javax.swing.JLabel();
        ac_no = new javax.swing.JLabel();
        ifsc = new javax.swing.JLabel();
        BANK = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        p13 = new panel.p1();
        jLabel33 = new javax.swing.JLabel();
        d1 = new javax.swing.JLabel();
        d2 = new javax.swing.JLabel();
        d3 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel38 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        img1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        p1.setBackground(new java.awt.Color(255, 255, 255));
        p1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("CITY CARE HOSIPTAL");
        p1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 51, 153));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Bill / Invoice");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 9, -1, -1));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 256, 50));

        date.setText("Date            :");
        jPanel2.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        bill.setText("Bill No         :");
        jPanel2.add(bill, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        p1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 10, -1, 120));
        p1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 55, 10));

        img3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/download.png"))); // NOI18N
        p1.add(img3, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 16, 102, 82));

        jLabel7.setText("Compassionate Care, Better Health");
        p1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, -1, -1));
        p1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(465, 70, 55, 10));
        p1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 1240, 20));

        p11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel8.setText("Patient Detalis");
        p11.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        p1.add(p11, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 170, 170, 50));

        l1.setText("Patient ID");
        p1.add(l1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, -1, -1));

        l2.setText("Patient Name");
        p1.add(l2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, -1, -1));

        l3.setText("Age / gender");
        p1.add(l3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, -1, -1));

        l4.setText("Address");
        p1.add(l4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, -1, -1));

        l5.setText("Phone");
        p1.add(l5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 240, -1, -1));

        l6.setText("Blood Group");
        p1.add(l6, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 270, -1, -1));

        l7.setText("Room Number");
        p1.add(l7, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 300, -1, -1));

        l8.setText("Addmission Date");
        p1.add(l8, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 330, -1, -1));

        jLabel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        p1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 640, 190));

        tb1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Description", "Amount"
            }
        ));
        jScrollPane1.setViewportView(tb1);

        p1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, 1170, 160));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        l9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        l9.setText("SUBTOTAL                                             15,530");
        l9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(l9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 1, 518, 51));

        l10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        l10.setText("Discount                                                15,530");
        l10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(l10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 52, 518, 51));

        l11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        l11.setText("SGST                                                    14,850");
        l11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(l11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 103, 518, 51));

        l12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        l12.setText("CGST                                                    371.25");
        l12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(l12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 154, 518, 51));

        l13.setBackground(new java.awt.Color(204, 204, 204));
        l13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        l13.setText("Total Amount                                          15,592");
        l13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        l13.setOpaque(true);
        jPanel1.add(l13, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 203, 518, 51));

        p1.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 590, 520, 255));

        p12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel24.setText("Payment Information");
        p12.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        p1.add(p12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 570, 250, 50));

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel26.setText("Notes:");
        p1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 930, -1, -1));
        p1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 680, 420, 20));

        upi_id.setText("UPI ID: healthcare@ybl");
        p1.add(upi_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 650, -1, -1));

        jLabel27.setText("* In case of any query, contact billing department");
        p1.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 1020, -1, -1));

        city_care.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        city_care.setText("City Care Hospital");
        p1.add(city_care, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 720, -1, -1));

        ac_no.setText("A/C No: 900111456784561");
        p1.add(ac_no, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 750, -1, -1));

        ifsc.setText("IFSC Code: HDFC0003022");
        p1.add(ifsc, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 780, -1, -1));

        BANK.setText("Bank: HDFC");
        p1.add(BANK, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 810, -1, -1));

        jLabel25.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        p1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 590, 640, 270));

        p13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel33.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel33.setText("Doctor Detalis");
        p13.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        p1.add(p13, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 170, 180, 50));

        d1.setText("Doctor Name");
        p1.add(d1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 240, -1, -1));

        d2.setText("Specailist");
        p1.add(d2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 270, -1, -1));

        d3.setText("Phone");
        p1.add(d3, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 300, -1, -1));

        jLabel32.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        p1.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 180, 520, 190));
        p1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 915, 1240, 10));

        jLabel38.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel38.setText("Bank Deatlis");
        p1.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 690, -1, -1));

        jLabel40.setText("* Please retain this bill for futrue reference");
        p1.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 960, -1, -1));

        jLabel41.setText("* No refund once payament is made");
        p1.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 990, -1, -1));

        img1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/file_000000004a8882088f9e3b19515f3ea0.png"))); // NOI18N
        p1.add(img1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 930, 850, -1));

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jButton2.setText("Close Page");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        p1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 1070, 1220, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/l.png"))); // NOI18N
        p1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 20, -1));

        jLabel12.setText("123, Health Care Road, Ajmer,");
        p1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, -1, -1));

        jLabel13.setText("Rajasthan 305001");
        p1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/p.png"))); // NOI18N
        p1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 105, 50, -1));

        jLabel6.setText("0145-1234567");
        p1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 100, -1, -1));

        jLabel5.setText("98765 43210");
        p1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 123, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/e.png"))); // NOI18N
        jLabel11.setText("info@citycarehospital.com");
        p1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 95, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/w.png"))); // NOI18N
        jLabel10.setText("www.citycarehospital.com");
        p1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(677, 120, -1, -1));

        jScrollPane2.setViewportView(p1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
       this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed
public void data(int sum,double discount,double tax,double total_amount)
{
    l9.setText("SUBTOTAL                                              "+sum);
    l10.setText("Discount                                                 "+discount);
    l13.setText("Total AMOUNT                                         "+total_amount);
    l11.setText("SGST                                                     "+tax/2);
    l12.setText("CGST                                                     "+tax/2);
}
public void patient_data(int id,String name,String age_gender,String address,String phone,String Blood_g,int room_number,String addmission)
{
    l1.setText("Patient ID: "+id);
    l2.setText("Patient Name: "+name);
    l3.setText("Age / gender: "+age_gender);
    l4.setText("Address: "+address);
    l5.setText("Phone: "+phone);
    l6.setText("Blood Group: "+Blood_g);
    l7.setText("Romm NUmber: "+room_number);
    l8.setText("Addmission Date: "+addmission);
   
}
public void doctor_detalis(String dname,String dsp,String dphone)
{
    d1.setText("Doctor Name: "+dname);
    d2.setText("Specailist: "+dsp);
    d3.setText("Phone: "+dphone);
}
public void table_detalis(ArrayList<String> row,ArrayList<String> column)
{
    model=(DefaultTableModel) tb1.getModel();
    String msg=row.toString();
    msg=msg.substring(1,msg.length()-1);
    String msg1=column.toString();
    msg1=msg1.substring(1,msg1.length()-1);
    String row_data[]=msg.split(",");
    String column_data[]=msg1.split(",");
    for(int i=0;i<row_data.length;i++)
    {
         model.addRow(new Object[]
                            {row_data[i].trim(),column_data[i].trim()}
                        );
    }
}
public void bill_no(int i)
{
    bill.setText("Bill No         : "+i);
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
            java.util.logging.Logger.getLogger(billing_main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(billing_main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(billing_main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(billing_main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new billing_main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BANK;
    private javax.swing.JLabel ac_no;
    private javax.swing.JLabel bill;
    private javax.swing.JLabel city_care;
    private javax.swing.JLabel d1;
    private javax.swing.JLabel d2;
    private javax.swing.JLabel d3;
    private javax.swing.JLabel date;
    private javax.swing.JLabel ifsc;
    private javax.swing.JLabel img1;
    private javax.swing.JLabel img3;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l10;
    private javax.swing.JLabel l11;
    private javax.swing.JLabel l12;
    private javax.swing.JLabel l13;
    private javax.swing.JLabel l2;
    private javax.swing.JLabel l3;
    private javax.swing.JLabel l4;
    private javax.swing.JLabel l5;
    private javax.swing.JLabel l6;
    private javax.swing.JLabel l7;
    private javax.swing.JLabel l8;
    private javax.swing.JLabel l9;
    private javax.swing.JPanel p1;
    private panel.p1 p11;
    private panel.p1 p12;
    private panel.p1 p13;
    private javax.swing.JTable tb1;
    private javax.swing.JLabel upi_id;
    // End of variables declaration//GEN-END:variables
}
