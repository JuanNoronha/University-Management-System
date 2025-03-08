/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pharmacy.model;


import java.sql.DriverManager;
import javax.swing.JOptionPane;
/**
 *
 * @author Team AAJ
 */
public class AgentModel {
    
    int id;
    String name;
    String age;
    String phone;
    String password;
    String gender;
    
    public AgentModel(int id, String name, String age, String phone, String password, String gender) {
        this.setId(id);
        this.setName(name);
        this.setAge(age);
        this.setPhone(phone);
        this.setPassword(password);
        this.setGender(gender);
        
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
        public void insertAgents(){
        try{
                java.sql.Statement statement = connection.JDBCconnection.Connect().createStatement();

                statement.executeUpdate("insert into universitysystem.agent" + "(id, name, age, phone, password, gender)" + "values ('"+this.getId()+"','"+this.getName()+"','"+this.getAge()+"','"+this.getPhone()+"','"+this.getPassword()+"','"+this.getGender()+" ')");
                JOptionPane.showMessageDialog(null, "User successfully added!");
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null,e.getLocalizedMessage());

            }
    }
        
        public void updateAgents(){
        try{
                java.sql.Statement statement = connection.JDBCconnection.Connect().createStatement();
                String sql = "UPDATE universitysystem.agent SET id = '"+this.getId()+"',name = '"+this.getName()+"',age = '"+this.getAge()+"', phone = '"+this.getPhone()+"', password = '"+this.getPassword()+"', gender = '"+this.getGender()+"' WHERE id ='" +this.getId()+"'";
                statement.executeUpdate(sql);

            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null,e.getLocalizedMessage());

            }
    }
        
        public void deleteAgents(){
        try{
                java.sql.Statement statement = connection.JDBCconnection.Connect().createStatement();
                String sql = "DELETE FROM universitysystem.agent WHERE id ='" +this.getId()+"'";
                statement.executeUpdate(sql);
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null,e.getLocalizedMessage());
            }
    }
}