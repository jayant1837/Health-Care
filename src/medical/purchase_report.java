package medical;

import System_user.Systemuser_dashboard;
import appointment.appointment_dashboard;
import billing_and_invoice.*;
import dashboard.DashBoard;
import doctor.*;
import panel.*;
import search.search;
import medical.*;
import employee.*;
import attendance.*;
import login.*;

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

public class purchase_report extends javax.swing.JFrame implements Printable{

    DefaultTableModel model;
    String name="",jb="",bg="";
    Connection con;
    Statement st;
    ResultSet rs;
    String q;
    Date d;
    SimpleDateFormat currentdate,month,monthname,year;
    
    long md_id=0;
    String mdname="";
    String expiry_date="";
    long quantity=0;
    String purchase_quantity="";
    long sales_price=0;
    String purchase_date="";
    String sales_date="";
    
    public purchase_report() {
        initComponents();
        DefaultTableModel model=(DefaultTableModel) tb1.getModel();
        try
        {
            Class.forName("java.sql.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/health_care", "root", "");
            st=con.createStatement();
            q="select * from purchase_report;";
            rs=st.executeQuery(q);
            while(rs.next())
            {
                md_id=rs.getLong("md_id");
                mdname=rs.getString("md_name");
                purchase_date=rs.getString("purcahse_date");
                purchase_quantity=rs.getString("purchase_quantity");
                model.addRow(new Object[]
                    {md_id,mdname,purchase_date,purchase_quantity}
                    );
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this,"error in mysql connection \n"+e);
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
    public void print()
    {
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
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tb1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tb1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Purchase_Date", "Purchase_Quantity"
            }
        ));
        jScrollPane1.setViewportView(tb1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1267, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 731, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(purchase_report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(purchase_report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(purchase_report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(purchase_report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new purchase_report().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tb1;
    // End of variables declaration//GEN-END:variables
}
