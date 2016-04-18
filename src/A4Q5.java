/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author dhalt0019
 */
public class A4Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner input = new Scanner(System.in);

        System.out.println("Please Enter Your Name");
        String name = input.nextLine();

        System.out.println("What was the first test out of?");
        double Test1 = input.nextDouble();

        System.out.println("What mark did you get?");
        double Mark1 = input.nextDouble();

        System.out.println("What was the second test out of?");
        double Test2 = input.nextDouble();

        System.out.println("What mark did you get?");
        double Mark2 = input.nextDouble();

        System.out.println("What was the third test out of?");
        double Test3 = input.nextDouble();

        System.out.println("What mark did you get?");
        double Mark3 = input.nextDouble();

        System.out.println("What was the fourth test out of?");
        double Test4 = input.nextDouble();

        System.out.println("What mark did you get?");
        double Mark4 = input.nextDouble();

        System.out.println("What was the fifth test out of?");
        double Test5 = input.nextDouble();

        System.out.println("What mark did you get?");
        double Mark5 = input.nextDouble();

        double total1 = (Mark1 / Test1) * 100;

        double total2 = (Mark2 / Test2) * 100;

        double total3 = (Mark3 / Test3) * 100;

        double total4 = (Mark4 / Test4) * 100;

        double total5 = (Mark5 / Test5) * 100;

        double average = (total1 + total2 + total3 + total4 + total5) / (5);

        System.out.println("Test scores for" + name + "are");

        System.out.println("First Test:" + total1 + "%");

        System.out.println("Second Test:" + total2 + "%");

        System.out.println("Third Test:" + total3 + "%");

        System.out.println("Fourth Test:" + total4 + "%");

        System.out.println("Fifth Test:" + total5 + "%");

        System.out.println("Average:" + average + "%");

    }
}
