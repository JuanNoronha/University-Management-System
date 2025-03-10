/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Pharmacy;

/**
 *
 * @author Team AAJ
 */

import Pharmacy.model.MedicineModel;
import com.mysql.cj.xdevapi.Statement;
import com.sun.jdi.connect.spi.Connection;
//import java.sql.Connection;
//import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import connection.JDBCconnection;
//import hospital.LoginFrame;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Medicines extends javax.swing.JFrame {

    /**
     * Creates new form Medicines
     */
    public Medicines() {
        initComponents();
        try{
            java.sql.Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/universitysystem", "root", "user@1234");
            System.out.println("connection open");
            java.sql.Statement statement = connection.createStatement();
            String sql = "SELECT * FROM universitysystem.medicine";
            java.sql.ResultSet rs = statement.executeQuery(sql);
            while(rs.next()){
                String id = Integer.toString(rs.getInt("ID"));
                String medicine = rs.getString("MEDICINE_NAME");
                String price = rs.getString("PRICE");
                String quantity = rs.getString("QUANTITY");
                String company = rs.getString("COMPANY");
                
                String tbData[] = {id,medicine,price,quantity,company};
                DefaultTableModel tb1Model = (DefaultTableModel)tableMedicine.getModel();
                
                 tb1Model.addRow(tbData);
                
            }


        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e.getLocalizedMessage());

        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tfMedicine = new javax.swing.JTextField();
        tfPrice = new javax.swing.JTextField();
        tfQuantity = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cbCompany = new javax.swing.JComboBox<>();
        buttonAdd = new javax.swing.JButton();
        buttonUpdate = new javax.swing.JButton();
        buttonDelete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableMedicine = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        buttonSearch = new javax.swing.JButton();
        buttonCancel = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MANAGE MEDICINES");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 160, 520, 50));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        jLabel2.setText("ID:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 230, 48, -1));

        tfID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfIDActionPerformed(evt);
            }
        });
        getContentPane().add(tfID, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 230, 210, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        jLabel3.setText("MEDICINE NAME:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 270, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        jLabel4.setText("PRICE:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 310, 50, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        jLabel5.setText("QUANTITY:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 350, 75, -1));

        tfMedicine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfMedicineActionPerformed(evt);
            }
        });
        getContentPane().add(tfMedicine, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 270, 210, -1));

        tfPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPriceActionPerformed(evt);
            }
        });
        getContentPane().add(tfPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 310, 210, -1));
        getContentPane().add(tfQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 350, 210, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        jLabel8.setText("COMPANY:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 390, 79, -1));

        cbCompany.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cipla", "Vertex", "Pfizer", "Roche", "Merck" }));
        getContentPane().add(cbCompany, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 390, 210, -1));

        buttonAdd.setBackground(new java.awt.Color(0, 0, 0));
        buttonAdd.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        buttonAdd.setForeground(new java.awt.Color(255, 0, 0));
        buttonAdd.setText("ADD");
        buttonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddActionPerformed(evt);
            }
        });
        getContentPane().add(buttonAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 770, -1, -1));

        buttonUpdate.setBackground(new java.awt.Color(0, 0, 0));
        buttonUpdate.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        buttonUpdate.setForeground(new java.awt.Color(255, 0, 0));
        buttonUpdate.setText("UPDATE");
        buttonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(buttonUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 770, -1, -1));

        buttonDelete.setBackground(new java.awt.Color(0, 0, 0));
        buttonDelete.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        buttonDelete.setForeground(new java.awt.Color(255, 0, 0));
        buttonDelete.setText("DELETE");
        buttonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(buttonDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 770, -1, -1));

        tableMedicine.setBackground(new java.awt.Color(153, 153, 153));
        tableMedicine.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "MEDICINE_NAME", "PRICE", "QUANTITY", "COMPANY"
            }
        ));
        tableMedicine.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMedicineMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableMedicine);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 540, 773, 210));

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(0, 0, 0));
        jTextField1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 0, 0));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("MEDICINE TABLE");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 480, 230, 30));

        buttonSearch.setBackground(new java.awt.Color(0, 0, 0));
        buttonSearch.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        buttonSearch.setForeground(new java.awt.Color(255, 0, 0));
        buttonSearch.setText("VIEW");
        buttonSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSearchActionPerformed(evt);
            }
        });
        getContentPane().add(buttonSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 770, -1, -1));

        buttonCancel.setBackground(new java.awt.Color(0, 0, 0));
        buttonCancel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        buttonCancel.setForeground(new java.awt.Color(255, 0, 0));
        buttonCancel.setText("LOGOUT");
        buttonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelActionPerformed(evt);
            }
        });
        getContentPane().add(buttonCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 100, 30));

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setForeground(new java.awt.Color(255, 0, 0));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Medicine manage page.jpeg"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(-160, 0, 1650, 970));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void tfMedicineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfMedicineActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfMedicineActionPerformed

    private void tfIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfIDActionPerformed

    private void tfPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPriceActionPerformed

    private void buttonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonUpdateActionPerformed
        // TODO add your handling code here:
        
        DefaultTableModel tb1Model = (DefaultTableModel)tableMedicine.getModel();
        if(tableMedicine.getSelectedRowCount()==1){
            
        int id =Integer.parseInt(tfID.getText());
        String medicine = tfMedicine.getText();
        String price = tfPrice.getText();
        String quantity = tfQuantity.getText();
        String production = "";
        String expiry = "";
        String company = (String) cbCompany.getSelectedItem().toString();
        
        MedicineModel medicines = new MedicineModel(id, medicine, price, quantity, company);
        medicines.updateMedicines();  
        
        tb1Model.setValueAt(medicine,tableMedicine.getSelectedRow(), 1);
        tb1Model.setValueAt(price,tableMedicine.getSelectedRow(), 2);
        tb1Model.setValueAt(quantity,tableMedicine.getSelectedRow(), 3); 
        tb1Model.setValueAt(production,tableMedicine.getSelectedRow(), 4); 
        tb1Model.setValueAt(expiry,tableMedicine.getSelectedRow(), 5); 
        tb1Model.setValueAt(company,tableMedicine.getSelectedRow(), 6); 
  
        }
        else{
            if(tableMedicine.getRowCount()==0){
               JOptionPane.showMessageDialog(this, "Table is Empty"); 
            }
            else{
                JOptionPane.showMessageDialog(this, "Select a Row");
            } 
        }
    }//GEN-LAST:event_buttonUpdateActionPerformed

    private void buttonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddActionPerformed
        // TODO add your handling code here:

        int id = Integer.parseInt(tfID.getText());
        String medicine = tfMedicine.getText();
        String price = tfPrice.getText();
        String quantity = tfQuantity.getText();
        String company = (String) cbCompany.getSelectedItem().toString();
        if(medicine.isEmpty()||quantity.isEmpty()){
            JOptionPane.showMessageDialog(null, "Please Enter Details!");
        }
        else{
            MedicineModel medicines = new MedicineModel(id, medicine, price, quantity, company);
            medicines.insertMedicines();
        }
    }//GEN-LAST:event_buttonAddActionPerformed

    
    public void medicine_table(){
        try{
            java.sql.Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/universitysystem", "root", "user@1234");

            java.sql.Statement statement = connection.createStatement();
            String sql = "SELECT * FROM universitysystem.medicine;";
   
            java.sql.ResultSet rs = statement.executeQuery(sql);
            while(rs.next()){
                String id = rs.getString("Id");
                String medicine = rs.getString("MEDICINE_NAME");
                String price = rs.getString("PRICE");
                String quantity = rs.getString("QUANTITY");
                String company = rs.getString("COMPANY");
                
                String tbData[] = {id,medicine,price, quantity, company};
                DefaultTableModel tb1Model = (DefaultTableModel)tableMedicine.getModel();
                
                tb1Model.addRow(tbData);
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Please add data in correct format");

    
    }                                 
    }
    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void tableMedicineMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMedicineMouseClicked
        // TODO add your handling code here:
        
        DefaultTableModel tb1Model = (DefaultTableModel)tableMedicine.getModel();
        
        String tb1id = tb1Model.getValueAt(tableMedicine.getSelectedRow(),0).toString();
        String tb1medicine = tb1Model.getValueAt(tableMedicine.getSelectedRow(),1).toString();
        String tb1price = tb1Model.getValueAt(tableMedicine.getSelectedRow(),2).toString();
        String tb1quantity = tb1Model.getValueAt(tableMedicine.getSelectedRow(),3).toString();
//        String tb1production = tb1Model.getValueAt(tableMedicine.getSelectedRow(),4).toString();
//        String tb1expiry = tb1Model.getValueAt(tableMedicine.getSelectedRow(),5).toString();
        String tb1company = tb1Model.getValueAt(tableMedicine.getSelectedRow(),4).toString();
        
        tfID.setText(tb1id);
        tfMedicine.setText(tb1medicine);
        tfPrice.setText(tb1price);
        tfQuantity.setText(tb1quantity);
        cbCompany.setSelectedItem(tb1company);
        
    }//GEN-LAST:event_tableMedicineMouseClicked

    private void buttonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDeleteActionPerformed
        // TODO add your handling code here:
        
        DefaultTableModel tb1Model = (DefaultTableModel)tableMedicine.getModel();
        if(tableMedicine.getSelectedRowCount()==1){
        int id = Integer.parseInt(tfID.getText());
        String medicine = tfMedicine.getText();
        String price = tfPrice.getText();
        String quantity = tfQuantity.getText();
        String production = "";
        String expiry = "";
        String company = (String) cbCompany.getSelectedItem().toString();
        MedicineModel medicines = new MedicineModel(id, medicine, price, quantity, company);
        medicines.deleteMedicines();
        
        tb1Model.removeRow(tableMedicine.getSelectedRow());
        
        tfID.setText("");
        tfMedicine.setText("");
        tfPrice.setText("");
        tfQuantity.setText("");
        cbCompany.setSelectedItem("");
        
        }
        
        else{
            if(tableMedicine.getRowCount()==0){
               JOptionPane.showMessageDialog(this, "Table is Empty"); 
            }
            else{
                JOptionPane.showMessageDialog(this, "Select a Row");
            } 
        }
    }//GEN-LAST:event_buttonDeleteActionPerformed

    private void buttonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelActionPerformed
        // TODO add your handling code here:
         this.hide();
        InventoryEnterpriseLogin frm = new InventoryEnterpriseLogin();
        frm.setVisible(true);
    }//GEN-LAST:event_buttonCancelActionPerformed

    private void buttonSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSearchActionPerformed
        // TODO add your handling code here:
        DefaultTableModel medModel = (DefaultTableModel)tableMedicine.getModel();
        medModel.setRowCount(0);
        
        try{
            java.sql.Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/universitysystem", "root", "user@1234");
            java.sql.Statement statement = connection.createStatement();
            String getMedQuery = "SELECT * FROM universitysystem.medicine";
            java.sql.ResultSet medData = statement.executeQuery(getMedQuery);

            while(medData.next()){
                String Id = medData.getString("ID");
                String medName = medData.getString("MEDICINE_NAME");
                String price = medData.getString("PRICE");
                String quantity = medData.getString("QUANTITY");
                String company = medData.getString("COMPANY");
                
                String tbData[] = {Id,medName,price, quantity, company};
                
                medModel.addRow(tbData);
            }
            
         }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
         }
    }//GEN-LAST:event_buttonSearchActionPerformed

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
            java.util.logging.Logger.getLogger(Medicines.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Medicines.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Medicines.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Medicines.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Medicines().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdd;
    private javax.swing.JButton buttonCancel;
    private javax.swing.JButton buttonDelete;
    private javax.swing.JButton buttonSearch;
    private javax.swing.JButton buttonUpdate;
    private javax.swing.JComboBox<String> cbCompany;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable tableMedicine;
    private javax.swing.JTextField tfID;
    private javax.swing.JTextField tfMedicine;
    private javax.swing.JTextField tfPrice;
    private javax.swing.JTextField tfQuantity;
    // End of variables declaration//GEN-END:variables
}
