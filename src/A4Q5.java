
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sevcm7279
 */
public class A4Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //make scanner 
        Scanner input = new Scanner (System.in);
        
        //ask user's name and read it
        System.out.println("Please enter your name");
        String name = input.nextLine();
        
        //test 1 %
            //ask user the test total marks
            System.out.println("What was the first test out of?");
            //make variable for the test total marks
            int t1 = input.nextInt();
            //ask user the actual mark
            System.out.println("What did you get?");
            //make variable for the actual mark
            int a1 = input.nextInt();
            //determine the percentage
            double p1 = a1*100/t1;
        
        //test 2 %
            //ask user the test total marks
            System.out.println("What was the second test out of?");  
            //make variable for the test total marks
            int t2 = input.nextInt();
            //ask user for the actual mark
            System.out.println("What did you get?");
            //make variable for the actual mark
            int a2 = input.nextInt();
            //determine the percentage
            double p2 = a2*100/t2;
            
            
        //test 3 %
            //ask user the test total marks
            System.out.println("What was the third test out of?");
            //make variable for the test total marks
            int t3 = input.nextInt ();
            //ask user for actual mark
            System.out.println("What did you get?");
            //make variable for the actual mark
            int a3 = input.nextInt();
            //determine the percentage
            double p3 = a3*100/t3;
            
        //test 4 %
            //ask user the test total marks
            System.out.println("What was the third test out of?");
            //make variable for the test total marks
            int t4 = input.nextInt ();
            //ask user for actual mark
            System.out.println("What did you get?");
            //make variable for the actual mark
            int a4 = input.nextInt();
            //determine the percentage
            double p4 = a3*100/t4;
            
        //tell user test scores in percent
        System.out.println("Test scores for " + name);
        System.out.println("Test 1: " + p1);
        System.out.println("Test 2: " + p2);
        System.out.println("Test 3: " + p3);
        System.out.println("Test 4: " + p4);
        
        //determine average       
        double av = (t1+t2+t3+t4)/4;
        
        //tell user average
        System.out.println("Your average is" + av);
        
        //close scanner
        input.close();
    }
}
