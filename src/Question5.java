
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author howen2217
 */
public class Question5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        //create scanner to fetch inputs
        System.out.println("Please enter your name:");
        //ask user for name
        String name = input.nextLine();
        System.out.println("What was the first test out of?");
        double test1 = input.nextInt();
        System.out.println("What was your mark on the first test?");
        double mark1 = input.nextInt();
        System.out.println("What was the second test out of?");
        double test2 = input.nextInt();
        System.out.println("What was your mark on the second test?");
        double mark2 = input.nextInt();
        System.out.println("What was the third test out of?");
        double test3 = input.nextInt();
        System.out.println("What was your mark on the third test?");
        double mark3 = input.nextInt();
        System.out.println("What was the fourth test out of?");
        double test4 = input.nextInt();
        System.out.println("What was your mark on the fourth test?");
        double mark4 = input.nextInt();
        System.out.println("What was the fifth test out of?");
        double test5 = input.nextInt();
        System.out.println("What was your mark on the fifth test?");
        double mark5 = input.nextInt();
        //gather and store test scores and what the test is out of
        double perc1 = (mark1 / test1) * (100.000);
        double perc2 = (mark2 / test2) * (100.000);
        double perc3 = (mark3 / test3) * (100.000);
        double perc4 = (mark4 / test4) * (100.000);
        double perc5 = (mark5 / test5) * (100.000);
        double average = (perc1 + perc2 + perc3 + perc4 + perc5) / (5.000);
        System.out.println("Test scores for " + name);
        System.out.println("Test 1: " + perc1);
        System.out.println("Test 2: " + perc2);
        System.out.println("Test 3: " + perc3);
        System.out.println("Test 4: " + perc4);
        System.out.println("Test 5: " + perc5);
        System.out.println("");
        System.out.println("Average: " + average);

    }
}
