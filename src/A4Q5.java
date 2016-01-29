
import java.util.Scanner;



/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vickj2854
 */
public class A4Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in); 
       
  // get average percentages
          
        System.out.println("Please enter your name");
        
        String name = input.nextLine();
        
        System.out.println("What was the first test out of?");
        
        double first = input.nextDouble();
        
        System.out.println("What mark did you get?");
        
        double mark1 = input.nextDouble();
        
        System.out.println("What was the second test out of?");
        
        double second = input.nextDouble();
        
        System.out.println("What mark did you get?");
        
        double mark2 = input.nextDouble();
        
        System.out.println("What was the third test out of?");
        
        double third = input.nextDouble();
        
        System.out.println("What mark did you get?");
        
        double mark3 = input.nextDouble();
        
        System.out.println("What was the fourth test out of?");
        
        double fourth = input.nextDouble();
        
        System.out.println("What mark did you get?");
        
        double mark4 = input.nextDouble();
        
        System.out.println("What was the fifth test out of?");
        
        double fifth = input.nextDouble();
        
        System.out.println("What mark did you get?");
        
        double mark5 = input.nextDouble();
        
        double percentage1 = mark1/ first* 100;
        
        double percentage2 = mark2/ second* 100;
        
        double percentage3 = mark3/ third* 100;
        
        double percentage4 = mark4/ fourth* 100;
        
        double percentage5 = mark5/ fifth* 100;
        
        System.out.println("Test scores for " + name + "Test 1: " + percentage1 + "% Test 2: " + percentage2 + "% Test 3: " + percentage3 + "% Test 4: "
                + percentage4 + "% Test 5: " + percentage5 );
        
        double total = percentage1 + percentage2 + percentage3 + percentage4 + percentage5;
        
        System.out.println("Average:" + (total/ 5));
        
        
        
        
        
        
        
        
                
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     