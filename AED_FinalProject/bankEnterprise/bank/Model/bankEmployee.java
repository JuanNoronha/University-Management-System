/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bankEnterprise.bank.Model;

import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Team AAJ
 */
public class bankEmployee {
    
     String name ;
        String gender ;
        int age ;
        int phone ;

        String username ;
        String password ;
        
        public bankEmployee(String name,String gender,int age, int phone,String username, String password){
            this.setName(name);
            this.setPhone(phone);
            this.setAge(age);
            this.setGender(gender);
            this.setUsername(username);
            this.setPassword(password);
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
    
    public void addEmployee(){
         try{
                java.sql.Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/universitysystem", "root", "user@1234");
            
            System.out.println("connection open");
            java.sql.Statement statement = connection.createStatement();
                        System.out.println("connection open");

            String query = "INSERT INTO universitysystem.bankemployee (Name,Gender,Age,Phone,username,password) values(?,?,?,?,?,?)";
                        System.out.println("connection insert");

           // java.sql.PreparedStatement preparedStmt = connection.prepareStatement(query);
            java.sql.PreparedStatement preparedStmt = connection.prepareStatement(query);
            preparedStmt.setString(1,name);
            preparedStmt.setString(2,gender);
            
            System.out.println("connection insert");
            
            preparedStmt.setInt(3,age);
            preparedStmt.setInt(4,phone);
           
            preparedStmt.setString(5,username);
            preparedStmt.setString(6,password);

            System.out.println("connection insert");

            preparedStmt.execute();
             System.out.println("connection run");
             JOptionPane.showMessageDialog(null,"Details Added");

             connection.close();
        }
        catch(Exception e){
            System.out.println(e);
            JOptionPane.showMessageDialog(null,"please add data in correct format!");
        }  
    
    }
}
