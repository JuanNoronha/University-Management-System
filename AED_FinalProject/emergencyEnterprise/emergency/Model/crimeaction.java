/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package emergencyEnterprise.emergency.Model;

import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Team AAJ
 */
public class crimeaction {
     String name ;
        
        int phone ;
        String address ;
        String cd ;
        String officer ;
        String action ;
        
        
        public crimeaction(String name, int phone, String address, String cd, String officer, String action){
        
            this.setName(name);
            this.setPhone(phone);
            this.setAddress(address);
            this.setCd(cd);
            this.setOfficer(officer);
            this.setAction(action);
        }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCd() {
        return cd;
    }

    public void setCd(String cd) {
        this.cd = cd;
    }

    public String getOfficer() {
        return officer;
    }

    public void setOfficer(String officer) {
        this.officer = officer;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    
    public void addaction(){
    
         try{
            java.sql.Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/universitysystem", "root", "user@1234");
            
            System.out.println("connection open");
            java.sql.Statement statement = connection.createStatement();
                        System.out.println("connection open");

            String query = "INSERT INTO universitysystem.crimedetails (name,phone,address,crimeDetails,officer,action) values(?,?,?,?,?,?)";
                        System.out.println("connection insert");

           // java.sql.PreparedStatement preparedStmt = connection.prepareStatement(query);
            java.sql.PreparedStatement preparedStmt = connection.prepareStatement(query);
            preparedStmt.setString(1,name);
            
            System.out.println("connection insert");
            
            preparedStmt.setInt(2,phone);
            preparedStmt.setString(3,address);
            preparedStmt.setString(4,cd);
            preparedStmt.setString(5,officer);
            preparedStmt.setString(6,action);



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
