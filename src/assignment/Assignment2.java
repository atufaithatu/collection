/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;
 import java.util.HashMap;
  
public class Assignment2 {   


   
    public static void main(String[] args) {
           HashMap <Integer, String > imp=new HashMap <Integer, String>();
           //Mapping values

           imp.put (10,"temi");
           imp.put(20,"faith");
           // displaying
           
           System.out.println("Initial Mappings are:"+ imp);
           ///size
           System.out.println("Size of HashMap is:"+ imp.size());  
           
           
    }
    
}
