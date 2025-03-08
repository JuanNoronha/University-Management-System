/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package university.Model;

import javax.swing.JOptionPane;

/**
 *
 * @author Team AAJ
 */
public class Professor {
    String profName;
    String subjectTeach;
    String Email;
    int Age;
    String username;
    String password;
    
    public Professor(String profName, String subjectTeach, String Email, int Age, String username, String password){
        this.setprofName(profName);
        this.setEmail(Email);
        this.setAge(Age);
        this.setUsername(username);
        this.setSubjectTeach(subjectTeach);
        this.setPassword(password);
    }

    public String getprofName() {
        return profName;
    }

    public void setprofName(String profName) {
        this.profName = profName;
    }

    public String getSubjectTeach() {
        return subjectTeach;
    }

    public void setSubjectTeach(String subjectTeach) {
        this.subjectTeach = subjectTeach;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
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
    
    public void addProfessor(){
        try{
                java.sql.Statement statement = connection.JDBCconnection.Connect().createStatement();
                statement.executeUpdate("insert into universitysystem.professors" + "(Name, subjectTeach, Email, Age, username, password)" + "values ('"+this.profName+"','"+this.subjectTeach+"', '"+this.Email+"', '"+this.Age+"' , '"+this.username+"', '"+this.password+"')");
                JOptionPane.showMessageDialog(null, "Professors successfully added!");
            }catch(Exception e){
                 JOptionPane.showMessageDialog(null,e);
            }
    }
}
