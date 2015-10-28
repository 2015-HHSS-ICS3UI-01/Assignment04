
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author dawsr2694
 */
public class Question5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create Scanner for input
        Scanner input = new Scanner(System.in);

        //Ask user for name
        System.out.println("Please enter your name");
        String name = input.nextLine();

        //Ask user for test marks
        System.out.print("What was the first test out of?: ");
        double test1 = input.nextInt();

        System.out.print("What mark did you get? ");
        double score1 = input.nextInt();

        System.out.print("What was the second test out of?: ");
        double test2 = input.nextInt();

        System.out.print("What mark did you get? ");
        double score2 = input.nextInt();

        System.out.print("What was the third test out of?: ");
        double test3 = input.nextInt();

        System.out.print("What mark did you get? ");
        double score3 = input.nextInt();

        System.out.print("What was the fourth test out of?: ");
        double test4 = input.nextInt();

        System.out.print("What mark did you get? ");
        double score4 = input.nextInt();

        System.out.print("What was the fifth test out of?: ");
        double test5 = input.nextInt();

        System.out.print("What mark did you get? ");
        double score5 = input.nextInt();

        //Show user the test scores as percents
        System.out.println("Test scores for " + name);

        double total1 = (score1 / test1 * 100);
        System.out.println("Test 1: " + total1 + "%");

        double total2 = (score2 / test2 * 100);
        System.out.println("Test 2: " + total2 + "%");

        double total3 = (score3 / test3 * 100);
        System.out.println("Test 3: " + total3 + "%");

        double total4 = (score4 / test4 * 100);
        System.out.println("Test 4: " + total4 + "%");

        double total5 = (score5 / test5 * 100);
        System.out.println("Test 5: " + total5 + "%");

        //Find average of test scores
        double average = ((total1 + total2 + total3 + total4 + total5) / 5);
        System.out.println("Average: " + average);
    }
}
