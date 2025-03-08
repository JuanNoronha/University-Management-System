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
public class Student {
    String name;
    String subjectTaken;
    String Email;
    int Age;
    String username;
    String password;
    
    
    
    public Student(String name, String subjectTaken, String Email, int Age, String username, String password){
        this.setName(name);
        this.setSubjectTaken(subjectTaken);
        this.setAge(Age);
        this.setEmail(Email);
        this.setPassword(password);
        this.setUsername(username);
        
        
    }

    public String getName() {
        return name;
    }

    

    public void setName(String name) {
        this.name = name;
    }

    public String getSubjectTaken() {
        return subjectTaken;
    }

    public void setSubjectTaken(String subjectTaken) {
        this.subjectTaken = subjectTaken;
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
    
    public void addStudent(){
        
       

    }
}
