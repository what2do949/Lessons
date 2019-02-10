/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;

/**
 *
 * @author air
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        //Hashtable 
        Hashtable<String,Course> hashCourses = new Hashtable();
        hashCourses.put("Math",new Course( "4:00pm", 'c', "Make"));
        hashCourses.put("English", new Course( "1:00pm", 'a', "Larry"));
        hashCourses.put("History",new Course( "3:00pm", 'b', "Alan"));
        Enumeration<String> enumeration = hashCourses.keys();
	// iterate using enumeration object
        System.out.println("\n print hashtable \n");
        while(enumeration.hasMoreElements()) {
            String key = enumeration.nextElement();
            System.out.println("Name : "  + key  + " " + 
					 hashCourses.get(key).Time);
            
        }
        if(hashCourses.containsKey("Math")){
           System.out.println( "Contain Math " + " " +
					 hashCourses.get("Math").Time);       
        }
        
                
        //ArrayList
        System.out.println("\n print ArrayList \n");
        ArrayList<Course> arrayListCourses = new ArrayList();
        arrayListCourses.add(new Course("Math", "4:00pm", 'c', "Make"));
        arrayListCourses.add(new Course("English", "1:00pm", 'a', "Larry"));
        arrayListCourses.add(new Course("History", "3:00pm", 'b', "Alan"));
        for(int i = 0; i < arrayListCourses.size(); i++){
           System.out.println (arrayListCourses.get(i).Name + " " +  arrayListCourses.get(i).Time);
        }
        
          for(int i = 0; i < arrayListCourses.size(); i++){
              if(arrayListCourses.get(i).Name.equals("Math")){
                  System.out.println ("Contain "  +  arrayListCourses.get(i).Name + " " +  arrayListCourses.get(i).Time);
              }
           
          }

    }

}
