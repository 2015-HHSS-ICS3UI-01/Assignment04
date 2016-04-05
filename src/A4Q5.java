
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author voigr4865
 */
public class A4Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String name;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("please enter your name");
        name = input.nextLine();
        
        System.out.println("What was your first test out of?");
        double a = input.nextInt();
        System.out.println("What mark did you get?");
        double b = input.nextInt();
        double bo = (b/a) *100;
        
        System.out.println("What was your second test out of?");
        double c = input.nextInt();
        System.out.println("What mark did you get?");
        double d = input.nextInt();
        double ba = (d/c) *100;
        
        System.out.println("What was your third test out of?");
        double e = input.nextInt();
        System.out.println("What mark did you get?");
        double f = input.nextInt();
        double bf = (f/e) *100;
        
        System.out.println("What was your fourth test out of?");
        double g = input.nextInt();
        System.out.println("What mark did you get?");
        double h = input.nextInt();
        double bh = (h/g) *100;
        
        System.out.println("What was your fifth test out of?");
        double i = input.nextInt();
        System.out.println("What mark did you get?");
        double j = input.nextInt();
        double bk = (j/i) *100;
        
        System.out.println("Your test scores are");
        System.out.println("Test 1 " + bo);
        System.out.println("Test 2 " + ba);
        System.out.println("Test 3 " + bf);
        System.out.println("Test 4 " + bh);
        System.out.println("Test 5 " + bk);
        
        System.out.println("Your average is " + (bo + ba + bf + bh + bk)/5);
    }
}
