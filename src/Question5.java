
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author rahmf8586
 */
public class Question5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String name;
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your name:");
        name = input.nextLine();

        System.out.println("What was the first test out of?");
        double test1 = input.nextDouble();
        System.out.println("What mark did you get?");
        double mark1 = input.nextDouble();

        System.out.println("What was the second test out of?");
        double test2 = input.nextDouble();
        System.out.println("What mark did you get?");
        double mark2 = input.nextDouble();

        System.out.println("What was the third test out of?");
        double test3 = input.nextDouble();
        System.out.println("What mark did you get?");
        double mark3 = input.nextDouble();

        System.out.println("What was the fourth test out of?");
        double test4 = input.nextDouble();
        System.out.println("What mark did you get?");
        double mark4 = input.nextDouble();

        System.out.println("What was the fifth test out of?");
        double test5 = input.nextDouble();
        System.out.println("What mark did you get?");
        double mark5 = input.nextDouble();

        System.out.println("Test scores for " + name);

        double score1 = (mark1 / test1) * 100;
        System.out.println("Test 1: " + score1 + "%");

        double score2 = (mark2 / test2) * 100;
        System.out.println("Test 2: " + score2 + "%");

        double score3 = (mark3 / test3) * 100;
        System.out.println("Test 3: " + score3 + "%");

        double score4 = (mark4 / test4) * 100;
        System.out.println("Test 4: " + score4 + "%");

        double score5 = (mark5 / test5) * 100;
        System.out.println("Test 5: " + score5 + "%");

        double av = (score1 + score2 + score3 + score4 + score5) / 5;
        System.out.println("Average: " + av + "%");

        input.close();
    }
}
