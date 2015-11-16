
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author malcr1272
 */
public class A4Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //create scanner for user input
       Scanner in =  new Scanner(System.in);
       //ask user for name
        System.out.println("What is your name:");
        String name = in.nextLine();
       
        //ask the total and the mark of the tests
        System.out.println("What was the firt test out of?");
        double total1 = in.nextDouble();
        
        System.out.println("What was your mark?");
        double mark1 = in.nextDouble();
        
        System.out.println("What was the second test out of?");
        double total2 = in.nextDouble();
        
        System.out.println("What was your mark?");
        double mark2 = in.nextDouble();
                
        System.out.println("What was the third test out of?");
        double total3 = in.nextDouble();;
        
        System.out.println("What was your mark?");
        double mark3 = in.nextDouble();
        
        System.out.println("What was the fourth test out of?");
        double total4 = in.nextDouble();
        
        System.out.println("What was your mark?");
        double mark4 = in.nextDouble();
        
        System.out.println("What was the fifth test out of?");
        double total5 = in.nextDouble();
        
        System.out.println("What was your mark?");
        double mark5 = in.nextDouble();
        
        //write out test scores and average
        System.out.println("Test scores for " + name);
        System.out.println("Test 1: "+ mark1/total1*100 + "%");      
        System.out.println("Test 2: "+ mark2/total2*100 + "%");  
        System.out.println("Test 3: "+ mark3/total3*100 + "%");
        System.out.println("Test 4: "+ mark4/total4*100 + "%"); 
        System.out.println("Test 5: "+ mark5/total5*100 + "%");
        System.out.println("Average: "+(mark1+mark2+mark3+mark4+mark5)/(total1+total2+total3+total4+total5)*100 +"%" );
    }
}
