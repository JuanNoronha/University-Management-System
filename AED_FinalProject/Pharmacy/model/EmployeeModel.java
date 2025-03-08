/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pharmacy.model;

import javax.swing.JOptionPane;

/**
 *
 * @author Team AAJ
 */
public class EmployeeModel {

   
    int id;
    String name; 
    String age;
    String password;
    String phone;
    String reason; 
    
    public EmployeeModel (int id, String name, String age, String password, String phone, String reason) {
        this.setId(id);
        this.setName(name);
        this.setAge(age);
        this.setPassword(password);
        this.setPhone(phone);
        this.setReason(reason);
    }
   
            
     public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
    
    public void insertEmployees() {
        try{
                java.sql.Statement statement = connection.JDBCconnection.Connect().createStatement();

                statement.executeUpdate("insert into universitysystem.employee" + "(id, name, age, password, phone, reason)" + "values ('"+this.getId()+"','"+this.getName()+"','"+this.getAge()+"','"+this.getPassword()+"','"+this.getPhone()+"','"+this.getReason()+" ')");
                JOptionPane.showMessageDialog(null, "User successfully added!");
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null,e.getLocalizedMessage());

            }
    }
    public void updateEmployees(){
        try{
                java.sql.Statement statement = connection.JDBCconnection.Connect().createStatement();
                String sql = "UPDATE universitysystem.employee SET id = '"+this.getId()+"',name = '"+this.getName()+"', phone = '"+this.getPhone()+"' WHERE id ='" +this.getId()+"'";
                statement.executeUpdate(sql);

            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null,e.getLocalizedMessage());

            }
    }
    
    public void deleteEmployees(){
        try{
                java.sql.Statement statement = connection.JDBCconnection.Connect().createStatement();
                String sql = "DELETE FROM universitysystem.employee WHERE id ='" +this.getId()+"'";
                statement.executeUpdate(sql);
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null,e.getLocalizedMessage());

            }
    }
    
}
