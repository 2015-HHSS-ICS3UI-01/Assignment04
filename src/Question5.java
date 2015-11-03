
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author prevw5940
 */
public class Question5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //asks to put in your name
        System.out.println("Please enter your name: ");
        String name = input.nextLine();
        //asks what your 1st test is out of
        System.out.println("What was the first test out of?: ");
        double test1 = input.nextInt();
        //asks what you had out of the test
        System.out.println("What mark did you get?: ");
        double testScore1 = input.nextInt();
        //asks what your 2nd test is out of
        System.out.println("What was the second test out of?: ");
        double test2 = input.nextInt();
        //asks what you had out of the test
        System.out.println("What mark did you get?: ");
        double testScore2 = input.nextInt();
        //asks what your 3rd test is out of
        System.out.println("What was the third test out of?: ");
        double test3 = input.nextInt();
        //asks what you had out of the test
        System.out.println("What mark did you get?: ");
        double testScore3 = input.nextInt();
        //asks what your 4th test is out of
        System.out.println("What was the forth test out of?: ");
        double test4 = input.nextInt();
        //asks what you had out of the test
        System.out.println("What mark did you get?: ");
        double testScore4 = input.nextInt();
        //asks what your 5th test is out of
        System.out.println("What was the fifth test out of?: ");
        double test5 = input.nextInt();
        //asks what you had out of the test
        System.out.println("What mark did you get?: ");
        double testScore5 = input.nextInt();
        //Displays name
        System.out.println("Test Scores for " + name);
        double Test1 = testScore1/test1;
        //Displays the % of your first test
        System.out.println("Test 1: " + Test1 + "%");
        double Test2 = testScore2/test2;
        //Displays the % of your second test
        System.out.println("Test 2: " + Test2 + "%");
        double Test3 = testScore3/test3;
        //Displays the % of your third test
        System.out.println("Test 3: " + Test3 + "%");
        double Test4 = testScore4/test4;
        //Displays the % of your forth test
        System.out.println("Test 4: " + Test4 + "%");
        double Test5 = testScore5/test5;
        //Displays the % of your fifth test
        System.out.println("Test 5: " + Test5 + "%");
        double Average = (Test1 + Test2 + Test3 + Test4 + Test5)/5;
        //Displays average % of all 5 tests
        System.out.println("Average: " + Average + "%");
    }
}
