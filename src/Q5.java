
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author watsk8668
 */
public class Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //input scanner
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your name: ");
        String name = input.nextLine();

        System.out.println("What was the first test out of?: ");
        Double test1 = input.nextDouble();

        System.out.println("What mark did you get?: ");
        Double mark1 = input.nextDouble();

        System.out.println("What was the second test out of?: ");
        Double test2 = input.nextDouble();

        System.out.println("What mark did you get?: ");
        Double mark2 = input.nextDouble();

        System.out.println("What was the third test out of?: ");
        Double test3 = input.nextDouble();

        System.out.println("What mark did you get?: ");
        Double mark3 = input.nextDouble();

        System.out.println("What was the fourth test out of?: ");
        Double test4 = input.nextDouble();

        System.out.println("What mark did you get?: ");
        Double mark4 = input.nextDouble();

        System.out.println("What was the fifth test out of?: ");
        Double test5 = input.nextDouble();

        System.out.println("What mark did you get?: ");
        Double mark5 = input.nextDouble();

        System.out.println("Test scores for " + name);

        double total1 = mark1 / test1 * 100;
        System.out.println("Test 1: " + total1 + "%");

        double total2 = mark2 / test2 * 100;
        System.out.println("Test 2: " + total2 + "%");

        double total3 = mark3 / test3 * 100;
        System.out.println("Test 3: " + total3 + "%");

        double total4 = mark4 / test4 * 100;
        System.out.println("Test 4: " + total4 + "%");

        double total5 = mark5 / test5 * 100;
        System.out.println("Test 5: " + total5 + "%");

        double average = total1 / 5 + total2 / 5 + total3 / 5 + total4 / 5 + total5 / 5;
        System.out.println("Average: " + average + "%");
    }
}
