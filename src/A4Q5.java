
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pawar5658
 */
public class A4Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         String name;
        
         Scanner input = new Scanner(System.in);
         
         System.out.println("Please enter your name");
         name = input.nextLine();
         
         System.out.println("What was the first test out of?");
         double A1 = input.nextDouble();
         System.out.println("What mark did you get?");
         double A2 = input.nextDouble();
         System.out.println("What was the second test out of?");
         double B1 = input.nextDouble();
         System.out.println("What mark did you get?");
         double B2 = input.nextDouble();
         System.out.println("What was the third test out of?");
         double C1 = input.nextDouble();
         System.out.println("What mark did you get?");
         double C2 = input.nextDouble();
         System.out.println("What was the fourth test out of?");
         double D1 = input.nextDouble();
         System.out.println("What mark did you get?");
         double D2 = input.nextDouble();
         System.out.println("What was the fifth test out of?");
         double E1 = input.nextDouble();
         System.out.println("What mark did you get?");
         double E2 = input.nextDouble();
         
         System.out.println("Test Scores for Doug");
         System.out.println("Test 1: " + ((A2/A1)*100) + "%");
         System.out.println("Test 2: " + ((B2/B1)*100) + "%");
         System.out.println("Test 3: " + ((C2/C1)*100) + "%");
         System.out.println("Test 4: " + ((D2/D1)*100) + "%");
         System.out.println("Test 5: " + ((E2/E1)*100) + "%");
         
         System.out.println("Average: " + (((A2/A1)+(B2/B1)+(C2/C1)+(D2/D1)+(E2/E1))/5*100) + "%");
    }
}
