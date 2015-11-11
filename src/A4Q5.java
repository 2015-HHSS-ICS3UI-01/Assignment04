
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author moraj0721
 */
public class A4Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // make a scanner
        Scanner input = new Scanner (System.in);
        
        System.out.println("Please enter your name.");
        
        //Ask what each test was out of
        System.out.println("What was the first test out of?");
        double first =input.nextDouble();
        System.out.println("What mark did you get?");
        double first2 =input.nextDouble();
        
        System.out.println("What was the second test out of?");
        double second =input.nextDouble();
        System.out.println("What mark did you get?");
        double second2 =input.nextDouble();
        
        System.out.println("What was the third test out of?");
        double third =input.nextDouble();
        System.out.println("What mark did you get?");
        double third2 =input.nextDouble();
        
        System.out.println("What was the fourth test out of?");
        double fourth =input.nextDouble();
        System.out.println("What mark did you get?");
        double fourth2 =input.nextDouble();
        
        System.out.println("What was the fifth test out of?");
        double fifth =input.nextDouble();
        System.out.println("What mark did you get?");
        double fifth2 =input.nextDouble();
         
        //Calculate the test percentages
        double test1Result = (first2/first*100);
        double test2Result = (second2/second*100);
        double test3Result = (third2/third*100);
        double test4Result = (fourth2/fourth*100);
        double test5Result = (fifth2/fifth*100);
        
        System.out.println("Test 1: " + test1Result + "%");
        System.out.println("Test 2: " + test2Result + "%");
        System.out.println("Test 3: " + test3Result + "%");
        System.out.println("Test 4: " + test4Result + "%");
        System.out.println("Test 5: " + test5Result + "%");
        
        //Calculate the overall average
        double avg = (test1Result + test2Result + test3Result + test4Result + test5Result )/5;
        System.out.println("Your average is " + avg + "%");
        
        
        
        
        
    }
}
