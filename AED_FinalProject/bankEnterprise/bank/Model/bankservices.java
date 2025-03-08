/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bankEnterprise.bank.Model;

import bankEnterprise.bankServices;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Team AAJ
 */
public class bankservices {
    
        String name ;
        String accountType ;
        String operation ;
        int amount ;
        
        public bankservices(String name, String accountType, String operation, int amount){
        
            this.setName(name);
            this.setOperation(operation);
            this.setAccountType(accountType);
            this.setAmount(amount);
        } 
        

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
    
    public void addServices(){
        try{
            
            java.sql.Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/universitysystem", "root", "user@1234");
            java.sql.Statement statement = connection.createStatement();

            String query = "INSERT INTO universitysystem.bankservices (Name,AccountType,Operation,Amount) values(?,?,?,?)";
            //statement.executeUpdate("insert into universitysystem.login" + "(role, username, password)" + "values ('Police','"+username+"', '"+password+"')");

           // java.sql.PreparedStatement preparedStmt = connection.prepareStatement(query);
            java.sql.PreparedStatement preparedStmt = connection.prepareStatement(query);
            preparedStmt.setString(1,name);
            preparedStmt.setString(2,accountType);
            
            preparedStmt.setString(3,operation);
            preparedStmt.setInt(4,amount);
            preparedStmt.execute();
            JOptionPane.showMessageDialog(null,"Your Request has been sent. Thank You!!!");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Please add data in correct format!");
        }      
    }
}
