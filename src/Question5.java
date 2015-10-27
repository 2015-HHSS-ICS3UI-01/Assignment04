
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author kulla6503
 */
public class Question5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a new Scanner to read in values
        Scanner in = new Scanner(System.in);

        // create an integer to store a number
        int FirstTestoutof;
        int FirstMark;
        int SecondTestoutof;
        int SecondMark;
        int ThirdTestoutof;
        int ThirdMark;
        int FourthTestoutof;
        int FourthMark;
        int FifthTestoutof;
        int FifthMark;

        // create a String to store a word for later
        String name;

        // User Enter's Name
        System.out.println("Please enter your name:");
        name = in.next();

        // First Test out of
        System.out.println("What was the first test out of?");
        int firstTestoutof = in.nextInt();

        // First Test Mark
        System.out.println("What mark did you get?");
        double firstMark = in.nextInt();

        // Second Test out of
        System.out.println("What was the second test out of?");
        int secondTestoutof = in.nextInt();

        // Second Mark
        System.out.println("What mark did you get?");
        double secondMark = in.nextInt();

        // Third Test out of
        System.out.println("What was the third test out of?");
        int thirdTestoutof = in.nextInt();

        // Third Mark
        System.out.println("What mark did you get?");
        double thirdMark = in.nextInt();

        // Fourth Test out of
        System.out.println("What was the fourth test out of?");
        int fourthTestoutof = in.nextInt();

        // Fourth Mark
        System.out.println("What mark did you get?");
        double fourthMark = in.nextInt();

        // Fifth Test out of 
        System.out.println("What was the fifth test out of?");
        int fifthTestoutof = in.nextInt();

        // Fifth Mark
        System.out.println("What mark did you get?");
        double fifthMark = in.nextInt();

        // Output our sentence to the user letting them know what they entered
        System.out.println("Test Scores for Doug");

        // Output our sentence to the user letting them know what they entered
        System.out.println("Test Scores for: " + name + "\nTest 1: " + Math.ceil(firstMark / firstTestoutof * 100) + "% \nTest 2: " + Math.ceil(secondMark / secondTestoutof * 100) + "% \nTest 3: "
                + Math.ceil(thirdMark / thirdTestoutof * 100) + "% \nTest 4:" + Math.ceil(fourthMark / fourthTestoutof * 100) + "% \nTest 5:" + Math.ceil(fifthMark / fifthTestoutof * 100));

        // Output our sentence to the user letting them know what they entered
        System.out.println("Average: " + Math.ceil((firstMark / firstTestoutof * 100) + (secondMark / secondTestoutof * 100)
                + (thirdMark / thirdTestoutof * 100) + (fourthMark / fourthTestoutof * 100) + (fifthMark / fifthTestoutof * 100)) / 5 + "%");


    }
}
