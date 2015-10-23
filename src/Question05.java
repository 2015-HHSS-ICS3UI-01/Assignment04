
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author iorgs3184
 */
public class Question05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //make a scanner
        Scanner input = new Scanner(System.in);

        String userName;

        //make string for words
        System.out.print("Please enter your name: ");
        userName = input.next();
        System.out.println();
        
        //ask user for what test is out of and marks
        System.out.print("What was the first test out of?: ");
        double firstTest = input.nextInt();
        System.out.print("What mark did you get?: ");
        double firstMark = input.nextInt();
        System.out.println();

        System.out.print("What was the second test out of?: ");
        double secondTest = input.nextInt();
        System.out.print("What mark did you get?: ");
        double secondMark = input.nextInt();
        System.out.println();

        System.out.print("What was the third test out of?: ");
        double thirdTest = input.nextInt();
        System.out.print("What mark did you get?: ");
        double thirdMark = input.nextInt();
        System.out.println();

        System.out.print("What was the fourth test out of?: ");
        double fourthTest = input.nextInt();
        System.out.print("What mark did you get?: ");
        double fourthMark = input.nextInt();
        System.out.println();

        System.out.print("What was the fifth test out of?: ");
        double fifthTest = input.nextInt();
        System.out.print("What mark did you get?: ");
        double fifthMark = input.nextInt();
        System.out.println();

        //shows test results
        System.out.println("Test scores for " + userName + ":");
        System.out.println();

        //calculates percentage of each test and rounds to nearest whole number
        double firstPercent = firstMark / firstTest * 100;
        firstPercent = Math.round(firstPercent * 10)/10;
        double secondPercent = secondMark / secondTest * 100;
        secondPercent = Math.round(secondPercent * 10)/10;
        double thirdPercent = thirdMark / thirdTest * 100;
        thirdPercent = Math.round(thirdPercent * 10)/10;
        double fourthPercent = fourthMark / fourthTest * 100;
        fourthPercent = Math.round(fourthPercent * 10)/10;
        double fifthPercent = fifthMark / fifthTest * 100;
        fifthPercent = Math.round(fifthPercent * 10)/10;
        
        //shows user test percentage
        System.out.println("Test 1: " + firstPercent + "%");
        System.out.println("Test 2: " + secondPercent + "%");
        System.out.println("Test 3: " + thirdPercent + "%");
        System.out.println("Test 4: " + fourthPercent + "%");
        System.out.println("Test 5: " + fifthPercent + "%");
        System.out.println();

        //calculates average
        double total = firstPercent + secondPercent + thirdPercent + fourthPercent + fifthPercent;
        double average = total / 5;

        //tells user their average
        System.out.println("Average: " + average + "%");
    }
}
