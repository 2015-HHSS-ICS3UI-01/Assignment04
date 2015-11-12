
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author eadil1765
 */
public class A4Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     Scanner input = new Scanner(System.in);
     System.out.println("Please enter your name");
     String name = input.nextLine();
     
     System.out.println("What was the first test out of?");
     double FirstNumber = input.nextInt();
     System.out.println("What did you get on the test?");
     double SecondNumber = input.nextInt();
     
     System.out.println("What was the second test out of?");
     double ThirdNumber = input.nextInt();
     System.out.println("What did you get on the test?");
     double FourthNumber = input.nextInt();
     
     System.out.println("What was the third test out of?");
     double FifthNumber = input.nextInt();
     System.out.println("What did you get on the test?");
     double SixthNumber = input.nextInt();
     
     System.out.println("What was the fourth test out of?");
     double SeventhNumber = input.nextInt();
     System.out.println("What did you get on the test?");
     double EigthNumber = input.nextInt();
     
     System.out.println("What was the fifth test out of?");
     double NinthNumber = input.nextInt();
     System.out.println("What did you get on the test?");
     double TenthNumber = input.nextInt();
     
     System.out.println("Test results for " + name);

     double test1 = SecondNumber/FirstNumber*100;
     double test2 = FourthNumber/ThirdNumber*100;
     double test3 = SixthNumber/FifthNumber*100;
     double test4 = EigthNumber/SeventhNumber*100;
     double test5 = TenthNumber/NinthNumber*100;
     
    System.out.println("On the first test you got " + test1 );
    System.out.println("On the second test you got " + test2); 
    System.out.println("On the third test you got " + test3);
    System.out.println("On that fourth test you got " + test4);
    System.out.println("On that fourth test you got " + test5);
    
    System.out.println("Your average mark was " + (test1 + test2 + test3 + test4 + test5)/5);
     
    }
}
