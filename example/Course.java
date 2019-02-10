/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author air
 */
public class Course {
   
    String Time;
    char   Grade;
    String Teacher;
    String Name;
    
   
    public Course( String Time, char Grade, String Teacher){
       
        this.Time = Time;
        this.Grade = Grade;
        this.Teacher = Teacher;
                
    }
    
    public Course( String Name, String Time, char Grade, String Teacher){
       
        this.Time = Time;
        this.Name = Name;
        this.Grade = Grade;
        this.Teacher = Teacher;
                
    }
    
    public String getTime(){
        return Time;
    }
   
}
