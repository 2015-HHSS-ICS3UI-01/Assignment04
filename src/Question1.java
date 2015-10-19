
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lalim9800
 */
public class Question1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        
        //create new scanner 
        Scanner input = new Scanner(System.in);
        
        //output name 
        
        System.out.println("Please enter your name");
        
      
        //create varible for name 
        String name = input.nextLine();
       
       
       //out put greeting message as well as name
       System.out.println("Hello how are you today " + name + " ?");
        
        

      
    }
}      
