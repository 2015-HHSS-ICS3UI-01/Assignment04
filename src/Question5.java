
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jon
 */
public class Question5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a program that will first collect you name of th user
        // then collects information on what the user recieved on five tests
        // then displayes the percent on each test and the average
        
        // create a scanner for input
        Scanner input = new Scanner(System.in);
        
        // ask what the usuer's name is
        System.out.print("Please enter your name:");
        // enter the name of the user
        String name = input.nextLine();
        
        // ask what the first test was out of
        System.out.print("What was the first test out of?:");
        // collect what the test was out of
        double testOneOutOf = input.nextDouble();
        // ask what the mark the user got
        System.out.print("What mark did you get?:");
        // collect what the user got on the test
        double testOneMark = input.nextDouble();
        
        // ask what the second test was out of
        System.out.print("What was the second test out of?:");
        // colect what the test was out of
        double testTwoOutOf = input.nextDouble();
        // ask what the mark the user got
        System.out.print("What mark did you get?:");
        // collect what the user got on the test
        double testTwoMark = input.nextDouble();
        
        // ask what the third test was out of
        System.out.print("What was the third test out of?:");
        // collect what the test was out of
        double testThreeOutOf = input.nextDouble();
        // ask what the mark the user got
        System.out.print("What mark did you get?:");
        // collect what the user got on the test
        double testThreeMark = input.nextDouble();
        
        // ask what the fourth test was out of
        System.out.print("What was the fourth test out of?:");
        // colect what the test was out of
        double testFourOutOf = input.nextDouble();
        // ask what the mark the user got
        System.out.print("What mark did you get?:");
        // collect what the user got on the test
        double testFourMark = input.nextDouble();
        
        // ask what the fifth test was out of
        System.out.print("What was the fifth test out of?:");
        // collect what the test was out of
        double testFiveOutOf = input.nextDouble();
        // ask what the mark the user got
        System.out.print("What mark did you get?:");
        // collect what the user got on the test
        double testFiveMark = input.nextDouble();
        
        // display the subtitle of the test scores and the name of the user
        System.out.println("Test Scores for " + name);
        
        // determine the percentage on the first test
        double testOneTotal = testOneMark / testOneOutOf * 100.0;
        // display the percentage of test 1
        System.out.println("Test 1: " + testOneTotal + "%");
        
        // determine the percentage on the second test
        double testTwoTotal = testTwoMark / testTwoOutOf * 100.0;
        // display the percentage of test 2
        System.out.println("Test 2: " + testTwoTotal + "%");
        
        // determine the percentage on the third test
        double testThreeTotal = testThreeMark / testThreeOutOf * 100.0;
        // display the percentage of test 3
        System.out.println("Test 3: " + testThreeTotal + "%");
        
        // determine the percentage on the fourth test
        double testFourTotal = testFourMark / testFourOutOf * 100.0;
        // display the percentage of test 4
        System.out.println("Test 4: " + testFourTotal + "%");
        
        // determine the percentage on the fifth test
        double testFiveTotal = testFiveMark / testFiveOutOf * 100.0;
        // display the percentage of test 5
        System.out.println("Test 5: " + testFiveTotal + "%");
        
        // determine the average of the user
        double average = (testOneTotal + testTwoTotal + testThreeTotal + testFourTotal + testFiveTotal) / 5.0;
        // display the average of the user
        System.out.println("Average: " + average + "%");
        
        // close input scanner
        input.close();
    }
    
}
