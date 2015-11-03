
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author preej0747
 */
public class Question5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create scanner
        Scanner input = new Scanner(System.in);
        
        //Get users name and test marks
        System.out.println("Please enter your name.");
        String name = input.nextLine();
        System.out.println("What was the first test out of?");
        double firstTest = input.nextDouble();
        System.out.println("What mark did you get?");
        double firstTestMark = input.nextDouble();
        System.out.println("What was the second test out of?");
        double secondTest = input.nextDouble();
        System.out.println("What mark did you get?");
        double secondTestMark = input.nextDouble();
        System.out.println("What was the third test out of?");
        double thirdTest = input.nextDouble();
        System.out.println("What mark did you get?");
        double thirdTestMark = input.nextDouble();
        System.out.println("What was the fourth test out of?");
        double fourthTest = input.nextDouble();
        System.out.println("What mark did you get?");
        double fourthTestMark = input.nextDouble();
        System.out.println("What was the fifth test out of?");
        double fifthTest = input.nextDouble();
        System.out.println("What mark did you get?");
        double fifthTestMark = input.nextDouble();
        
        //Calculate marks
        double firstTestPercentage = firstTestMark / firstTest*100;
        double secondTestPercentage = secondTestMark / secondTest*100;
        double thirdTestPercentage = thirdTestMark / thirdTest*100;
        double fourthTestPercentage = fourthTestMark / fourthTest*100;
        double fifthTestPercentage = fifthTestMark / fifthTest*100;
        double average = firstTestPercentage + secondTestPercentage + thirdTestPercentage + fourthTestPercentage + fifthTestPercentage /  5;
        
        //Show users marks
        System.out.println("Test scores for " + name);
        System.out.println("Test 1:" + firstTestPercentage + "%");
        System.out.println("Test 2:" + secondTestPercentage + "%");
        System.out.println("Test 3:" + thirdTestPercentage + "%");
        System.out.println("Test 4:" + fourthTestPercentage + "%");
        System.out.println("Test 5:" + fifthTestPercentage + "%");
        System.out.println("Average:" + average + "%");    
           
        
        
    }
}
