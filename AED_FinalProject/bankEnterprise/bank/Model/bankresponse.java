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
public class bankresponse {
    
     String name;
        
        String accountType ;
        String operation ;
        int amount ;
        String employee ;
        String action ;
        String currRole;
        public bankresponse(String name, String accountType,String operation, int amount, String employee,String action, String currRole){
            this.setName(name);
            this.setAccountType(accountType);
            this.setOperation(operation);
            this.setEmployee(employee);
            this.setAmount(amount);
            this.setAction(action);
            this.setCurrRole(currRole);
        }

    public String getCurrRole() {
        return currRole;
    }

    public void setCurrRole(String currRole) {
        this.currRole = currRole;
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

    public String getEmployee() {
        return employee;
    }

    public void setEmployee(String employee) {
        this.employee = employee;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

   public void addResponse(){
       try{
            java.sql.Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/universitysystem", "root", "user@1234");
            
            System.out.println("connection open");
            java.sql.Statement statement = connection.createStatement();
                        System.out.println("connection open");

            String query = "INSERT INTO universitysystem.bankresponse (Name,AccountType,Operation,Amount,Employee,ActionTaken) values(?,?,?,?,?,?)";
            System.out.println("connection insert");
            if(currRole=="student"){
                String studentQuery = "UPDATE universitysystem.students SET LoanAmount = '"+amount+"' WHERE username = '"+name+"'";
            statement.executeUpdate(studentQuery);
                
            
            }
            String policeQuery = "UPDATE universitysystem.police SET salary = salary + '"+amount+"' WHERE username = '"+name+"'";
            statement.executeUpdate(policeQuery);
            
            String studentQuery = "UPDATE universitysystem.students SET loan_taken = '"+amount+"' WHERE username = '"+name+"'";
            statement.executeUpdate(studentQuery);



           // java.sql.PreparedStatement preparedStmt = connection.prepareStatement(query);
            java.sql.PreparedStatement preparedStmt = connection.prepareStatement(query);
            preparedStmt.setString(1,name);
            
            System.out.println("connection insert");
            
            preparedStmt.setString(2,accountType);
            preparedStmt.setString(3,operation);
            preparedStmt.setInt(4,amount);
            preparedStmt.setString(5,employee);
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
