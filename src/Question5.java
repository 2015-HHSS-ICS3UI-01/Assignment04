
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author agott2059
 */
public class Question5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        
        Scanner Input = new Scanner(System.in);
        //get username
        System.out.println("Please enter your name:");
        String name = Input.nextLine();
        //aquire test info
        System.out.println("What was your first test out of?");
        double first = Input.nextDouble();
        System.out.println("What mark did you get?");
        double firstResult = Input.nextDouble();
        
        System.out.println("What was your second test out of?");
        double second = Input.nextDouble();
        System.out.println("What mark did you get?");
        double secondResult = Input.nextDouble();
        
        System.out.println("What was your third test out of?");
        double third = Input.nextDouble();
        System.out.println("What mark did you get?");
        double thirdResult = Input.nextDouble();
        
        System.out.println("What was your fourth test out of?");
        double fourth = Input.nextDouble();
        System.out.println("What mark did you get?");
        double fourthResult = Input.nextDouble();
        
        System.out.println("What was your fifth test out of?");
        double fifth = Input.nextDouble();
        System.out.println("What mark did you get?");
        double fifthResult = Input.nextDouble();
        //calculate percentage score of each test useing data from user 
        double firstPerc = (firstResult / first *100);
        double secondPerc = (secondResult / second *100);
        double thirdPerc = (thirdResult / third *100);
        double fourthPerc = (fourthResult / fourth *100);
        double fifthPerc = (fifthResult / fifth *100);
        //find average
        double avg = ((firstPerc + secondPerc + thirdPerc + fourthPerc + fifthPerc)/5);
        //tell user individual test scores
        System.out.println("Test scores for " + name + ":");
        
        System.out.println("Test 1: " + firstPerc + "%");
        System.out.println("Test 2: " + secondPerc + "%");
        System.out.println("Test 3: " + thirdPerc + "%");
        System.out.println("Test 4: " + fourthPerc + "%");
        System.out.println("Test 5: " + fifthPerc + "%");
        //tell user average
        System.out.println("Your average test score is: " + avg + "%");
        
    }
}
