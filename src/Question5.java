
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
        int test1;
        int testr1;
        int test2;
        int testr2;
        int test3;
        int testr3;
        int test4;
        int testr4;
        int test5;
        int testr5;
        int result;
        
        System.out.println("Please enter your name");
         name = in.next();
         
         System.out.println("What was the first test out of?");
        test1 = in.nextInt();
        
        System.out.println("What mark did you get?");
        testr1 = in.nextInt();
        
        System.out.println("What was the second test out of?");
        test2 = in.nextInt();
        
        System.out.println("What mark did you get?");
        testr2 = in.nextInt();
        
        System.out.println("What was the third test out of?");
        test3 = in.nextInt();
        
        System.out.println("What mark did you get?");
        testr3 = in.nextInt();
        
        System.out.println("What was the fourth test out of?");
        test4 = in.nextInt();
        
        System.out.println("What mark did you get?");
        testr4 = in.nextInt();
        
        System.out.println("What was the fifth test out of?");
        test5 = in.nextInt();
        
        System.out.println("What mark did you get?");
        testr5 = in.nextInt();
        
        System.out.println("Test Scores for" + name + "Test 1" + (test1/testr1*100) + "% Test 2" +(test2));
       
    }
}
