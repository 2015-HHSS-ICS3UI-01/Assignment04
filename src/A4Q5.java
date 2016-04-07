
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author guanv6321
 */
public class A4Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name:");
        String name = input.nextLine();
        System.out.println("What was the first test out of?");
        int t1 = input.nextInt();
        System.out.println("What mark did you get?");
        double m1 = input.nextDouble();
        System.out.println("What was the second test out of?");
        int t2 = input.nextInt();
        System.out.println("What mark did you get?");
        double m2 = input.nextDouble();
        System.out.println("What was the third test out of?");
        int t3 = input.nextInt();
        System.out.println("What mark did you get?");
        double m3 = input.nextDouble();
        System.out.println("What was the fourth test out of?");
        int t4 = input.nextInt();
        System.out.println("What mark did you get?");
        double m4 = input.nextDouble();
        System.out.println("What was the fifth test out of?");
        int t5 = input.nextInt();
        System.out.println("What mark did you get?");
        double m5 = input.nextDouble();
        
        double a1 = m1/t1*100;
        double a2 = m2/t2*100;
        double a3 = m3/t3*100;
        double a4 = m4/t4*100;
        double a5 = m5/t5*100;
        double average = (a1 + a2 + a3 + a4 + a5)/5;
        
        System.out.println("Test scores for " + name);
        System.out.println("Test 1: " + a1 + "%");
        System.out.println("Test 2: " + a2 + "%");
        System.out.println("Test 3: " + a3 + "%");
        System.out.println("Test 4: " + a4 + "%");
        System.out.println("Test 5: " + a5 + "%");
        
        System.out.println("Average: " + average + "%");
    }
}
