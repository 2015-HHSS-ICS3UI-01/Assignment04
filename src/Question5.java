
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
        
        // ask what the usuer's name is and store the users name
        System.out.print("Please enter your name: ");
        String name = input.nextLine();
        
        // ask what the first test was out of and collect the information
        System.out.print("What was the first test out of?: ");
        double testOneOutOf = input.nextDouble();
        // ask what the mark the user got and collect the information
        System.out.print("What mark did you get?: ");
        double testOneMark = input.nextDouble();
        
        // ask what the second test was out of
        System.out.print("What was the second test out of?: ");
        double testTwoOutOf = input.nextDouble();
        // ask what the mark the user got and collect the information
        System.out.print("What mark did you get?: ");
        double testTwoMark = input.nextDouble();
        
        // ask what the third test was out of and collect the information
        System.out.print("What was the third test out of?: ");
        double testThreeOutOf = input.nextDouble();
        // ask what the mark the user got and collect the information
        System.out.print("What mark did you get?: ");
        double testThreeMark = input.nextDouble();
        
        // ask what the fourth test was out of and collect the information
        System.out.print("What was the fourth test out of?: ");
        double testFourOutOf = input.nextDouble();
        // ask what the mark the user got and collect the information
        System.out.print("What mark did you get?: ");
        double testFourMark = input.nextDouble();
        
        // ask what the fifth test was out of and collect the information
        System.out.print("What was the fifth test out of?: ");
        double testFiveOutOf = input.nextDouble();
        // ask what the mark the user got and collect the information
        System.out.print("What mark did you get?: ");
        double testFiveMark = input.nextDouble();
        
        // display the subtitle of the test scores and the name of the user
        System.out.println("Test Scores for " + name);
        
        // determine the percentage on the first test and display
        double testOneTotal = testOneMark / testOneOutOf * 100.0;
        System.out.println("Test 1: " + testOneTotal + " %");
        
        // determine the percentage on the second test and display
        double testTwoTotal = testTwoMark / testTwoOutOf * 100.0;
        System.out.println("Test 2: " + testTwoTotal + " %");
        
        // determine the percentage on the third test and display
        double testThreeTotal = testThreeMark / testThreeOutOf * 100.0;
        System.out.println("Test 3: " + testThreeTotal + " %");
        
        // determine the percentage on the fourth test and display
        double testFourTotal = testFourMark / testFourOutOf * 100.0;
        System.out.println("Test 4: " + testFourTotal + " %");
        
        // determine the percentage on the fifth test and display
        double testFiveTotal = testFiveMark / testFiveOutOf * 100.0;
        System.out.println("Test 5: " + testFiveTotal + " %");
        
        // determine the average of the user and display
        double average = (testOneTotal + testTwoTotal + testThreeTotal + testFourTotal + testFiveTotal) / 5.0;
        System.out.println("Average: " + average + " %");
        
        // close input scanner
        input.close();
    }
    
}
