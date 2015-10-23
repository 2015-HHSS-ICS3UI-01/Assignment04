
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mitrm7692
 */
public class Question5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a new Scanner
        Scanner input = new Scanner(System.in);
        
        // Make Scanner ask for name
        System.out.println("Please enter your name");
        
        // Type name into next line
        String name = input.nextLine();
        
        // Make Scanner ask how many marks test had
        System.out.println("What was the first test out of?");
        
        // Type how many marks first test was out of
        double t1Total = input.nextDouble();
        
        // Make Scanner ask how many marks were correct
        System.out.println("What mark did you get?");
        
        // Type how many marks were correct on the first test
        double t1TotalCorrect = input.nextDouble();
        
        //Calculate Average of first test
        double test1Avg = t1TotalCorrect/t1Total*100;
         
        // Make Scanner ask how many marks test had
        System.out.println("What was the second test out of?");
        
        // Type how many marks first test was out of
        double t2Total = input.nextDouble();
        
        // Make Scanner ask how many marks were correct
        System.out.println("What mark did you get?");
        
        // Type how many marks were correct on the first test
        double t2TotalCorrect = input.nextDouble();
        
        //Calculate Average of second test
        double test2Avg = t2TotalCorrect/t2Total*100;
        
         // Make Scanner ask how many marks test had
        System.out.println("What was the third test out of?");
        
        // Type how many marks first test was out of
        double t3Total = input.nextDouble();
        
        // Make Scanner ask how many marks were correct
        System.out.println("What mark did you get?");
        
        // Type how many marks were correct on the first test
        double t3TotalCorrect = input.nextDouble();
        
        //Calculate Average of third test
        double test3Avg = t3TotalCorrect/t3Total*100;
        
        // Make Scanner ask how many marks test had
        System.out.println("What was the fourth test out of?");
        
        // Type how many marks first test was out of
        double t4Total = input.nextDouble();
        
        // Make Scanner ask how many marks were correct
        System.out.println("What mark did you get?");
        
        // Type how many marks were correct on the first test
        double t4TotalCorrect = input.nextDouble();
        
        //Calculate Average of fourth test
        double test4Avg = t4TotalCorrect/t4Total*100;
        
        // Make Scanner ask how many marks test had
        System.out.println("What was the fifth test out of?");
        
        // Type how many marks first test was out of
        double t5Total = input.nextDouble();
        
        // Make Scanner ask how many marks were correct
        System.out.println("What mark did you get?");
        
        // Type how many marks were correct on the first test
        double t5TotalCorrect = input.nextDouble();
        
        //Calculate Average of fifth test
        double test5Avg = t5TotalCorrect/t5Total*100;
        
        //Create a space
        System.out.println(" ");
        
        //Make scanner say "Test Scores for usersname:"
        System.out.println("Test Scores for "+name+":");
        
        //Show average of first test
        System.out.println("Test 1 Average is: "+test1Avg+"%");
        
        //Show average of second test
        System.out.println("Test 2 Average is: "+test2Avg+"%");
        
        //Show average of third test
        System.out.println("Test 3 Average is: "+test3Avg+"%");
        
        //Show average of fourth test
        System.out.println("Test 4 Average is: "+test4Avg+"%");
        
        //Show average of fifth test
        System.out.println("Test 5 Average is: "+test5Avg+"%");
        
        //Calculate total average of all tests
        double totalTAvg=(test1Avg+test2Avg+test3Avg+test4Avg+test5Avg)/5;
        
        //Show total average of all test scores
        System.out.println("The total test average is: "+totalTAvg+"%");
        
        //Finish with the Scanner
        input.close();
    }
}
