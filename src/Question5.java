
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pircn0556
 */
public class Question5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        //Ask for users name
        System.out.println("Please enter your name.");
        String name = input.nextLine();
        System.out.println();
        
        //Ask for test scores
        System.out.println("What was the first test out of?");
        int test1 = input.nextInt();
        System.out.println("What mark did you get?");
        int mark1 = input.nextInt();
        System.out.println();
        System.out.println("What was the second test out of?");
        int test2= input.nextInt();
        System.out.println("What mark did you get?");
        int mark2 = input.nextInt();
        System.out.println();
        System.out.println("What was the third test out of?");
        int test3 = input.nextInt();
        System.out.println("What mark did you get?");
        int mark3 = input.nextInt();
        System.out.println();
        System.out.println("What was the fourth test out of?");
        int test4 = input.nextInt();
        System.out.println("What mark did you get?");
        int mark4 = input.nextInt();
        System.out.println();
        System.out.println("What was the fifth test out of?");
        int test5 = input.nextInt();
        System.out.println("What mark did you get?");
        int mark5 = input.nextInt();
        System.out.println();
       
        
        //Calculate percentage of each test score
        System.out.println("Test Scores for " +name+ ":");
        int score1 = mark1*100/test1;
        System.out.println("Test 1: "+score1+"%");
        int score2 = mark2*100/test2;
        System.out.println("Test 2: "+score2+"%");
        int score3 = mark3*100/test3;
        System.out.println("Test 3: "+score3+"%");
        int score4 = mark4*100/test4;
        System.out.println("Test 4: "+score4+"%");
        int score5 = mark5*100/test5;
        System.out.println("Test 5: "+score5+"%");
        System.out.println();
        
        //Overall percentage of all test scores
        double all1 = score1+score2+score3+score4+score5;
        double all2 = all1/5;
        System.out.println("Average:" +all2+ "%");
    }
}
