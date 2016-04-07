
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RARES
 */
public class Question5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    Scanner input = new Scanner(System.in);
    
    String name;
    System.out.println("Please enter your name ");
    name = input.nextLine();
    
    System.out.println("How much is the test out of? : ");
    double TEST1 = input.nextInt();
    System.out.println("What mark did you get? :");
    double TEST1mark = input.nextInt();
    
    System.out.println("How much is the test out of? : ");
    double TEST2 = input.nextInt();
    System.out.println("What mark did you get? :");
    double TEST2mark = input.nextInt();
    
    System.out.println("How much is the test out of? : ");
    double TEST3 = input.nextInt();
    System.out.println("What mark did you get? :");
    double TEST3mark = input.nextInt();
    
    System.out.println("How much is the test out of? : ");
    double TEST4 = input.nextInt();
    System.out.println("What mark did you get? :");
    double TEST4mark = input.nextInt();
    
    System.out.println("How much is the test out of? : ");
    double TEST5 = input.nextInt();
    System.out.println("What mark did you get? :");
    double TEST5mark = input.nextInt();
    
    System.out.println("Test Scores for " + name);
    
    double Percent1 = (TEST1mark/TEST1)*(100);
    System.out.println("Your average for your first test is... " + Percent1 + "%");
    
    double Percent2 = (TEST2mark/TEST2)*(100);
    System.out.println("Your average for your second test is... " + Percent2 + "%");
    
    double Percent3 = (TEST3mark/TEST3)*(100);
    System.out.println("Your average for your third test is... " + Percent3 + "%");
    
    double Percent4 = (TEST4mark/TEST4)*(100);
    System.out.println("Your average for your fourth test is... " + Percent4 + "%");
    
    double Percent5 = (TEST5mark/TEST5)*(100);
    System.out.println("Your average for your fifth test is... " + Percent5 + "%");
    
    double Average = (Percent1 + Percent2 + Percent3 + Percent4 + Percent5)/(5);
    System.out.println("Your average for the five tests is " + Average + "%");
    
   
    
    }
    
}
