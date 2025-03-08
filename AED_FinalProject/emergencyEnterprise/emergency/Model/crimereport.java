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
public class crimereport {
     String name ;
        
        int phone ;
        String address ;
        String cd ;
        
         public crimereport(String name, int phone,String address, String cd){
            this.setName(name);
            this.setPhone(phone);
            this.setAddress(address);
            this.setCd(cd);
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
        
    public void addCrime(){
    
         try{
            java.sql.Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/universitysystem", "root", "user@1234");
            
            System.out.println("connection open");
            java.sql.Statement statement = connection.createStatement();
                        System.out.println("connection open");

           String query = "INSERT INTO universitysystem.crimeReport (name,phone,address,crimeDetails) values(?,?,?,?)";

            //String query = "INSERT INTO universitysystem.crimeReport (name,phone,address,crimeDetails) values('"+this.name+"','"+this.phone+"', '"+this.address+"', '"+this.cd+"')";
                        System.out.println("connection insert");

           // java.sql.PreparedStatement preparedStmt = connection.prepareStatement(query);
            java.sql.PreparedStatement preparedStmt = connection.prepareStatement(query);
            preparedStmt.setString(1,name);
            
            System.out.println("connection insert");
            
            preparedStmt.setInt(2,phone);
            preparedStmt.setString(3,address);
            preparedStmt.setString(4,cd);


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
