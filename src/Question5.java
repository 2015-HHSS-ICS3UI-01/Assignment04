
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hadik9595
 */
public class Question5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        
        String name;
       
        // Asks for name
        System.out.println("Please enter your name");
         name = in.next();
         //Asks for bunch of test results and it's overall mark.
         System.out.println("What was the first test out of?");
        int test1 = in.nextInt();
        
        System.out.println("What mark did you get?");
        double testr1 = in.nextInt();
        
        System.out.println("What was the second test out of?");
        int test2 = in.nextInt();
        
        System.out.println("What mark did you get?");
        double testr2 = in.nextDouble();
        
        System.out.println("What was the third test out of?");
        int test3 = in.nextInt();
        
        System.out.println("What mark did you get?");
        double testr3 = in.nextDouble();
        
        System.out.println("What was the fourth test out of?");
        int test4 = in.nextInt();
        
        System.out.println("What mark did you get?");
        double testr4 = in.nextDouble();
        
        System.out.println("What was the fifth test out of?");
        int test5 = in.nextInt();
        
        System.out.println("What mark did you get?");
        double testr5 = in.nextDouble();
        // Tells the human their percentage of each test they've done
        System.out.println("Test Scores for " + name + "\nTest 1: " + Math.ceil(testr1/test1*100) + "% \nTest 2: " +Math.ceil(testr2/test2*100)+ "%\nTest 3: " + Math.ceil(testr3/test3*100) + "%\nTest 4: " + Math.ceil(testr4/test4*100)+ "%\nTest 5: " +Math.ceil(testr5/test5*100) + "%" );
        // Average of all of tests
        System.out.println("Average: " + (Math.ceil((testr1/test1*100) + (testr2/test2*100)+ (testr3/test3*100)+ (testr4/test4*100) + (testr5/test5*100)))/5 + "%" );
       
        in.close();
        
    }
}
