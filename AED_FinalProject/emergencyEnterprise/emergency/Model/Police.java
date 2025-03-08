/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package emergencyEnterprise.emergency.Model;

import javax.swing.JOptionPane;

/**
 *
 * @author Team AAJ
 */
public class Police {
        int id ;

        String name ;
        String gender ;
        int age ;
        int phone ;
        String username ;
        String password ;


        int salary ;
        String designation;
        
         public Police(String name, String gender,  int phone,int age,String username, String password, int salary,String designation){
            this.setId(id);
            this.setName(name);
            this.setGender(gender);
            this.setAge(age);
            this.setPhone(phone);
            this.setUsername(username);
            this.setPassword(password);
            this.setSalary(salary);
            this.setDesignation(designation);
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
       
        
        
        
    public void addPolice(){
        try{
                java.sql.Statement statement = connection.JDBCconnection.Connect().createStatement();
                statement.executeUpdate("insert into universitysystem.police" + "(name, gender, phone, age,salary,designation, username, password)" + "values ('"+this.name+"', '"+this.gender+"', '"+this.phone+"' ,'"+this.age+"' ,'"+this.salary+"' ,'"+this.designation+"' , '"+this.username+"', '"+this.password+"')");
                JOptionPane.showMessageDialog(null, "Police successfully added!");
            }catch(Exception e){
                 JOptionPane.showMessageDialog(null,e);
            }
    }
        

        
        
}
