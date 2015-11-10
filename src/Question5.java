
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fitws6356
 */
public class Question5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name below.");
        String name = input.nextLine();
        System.out.println("What was your first test out of?");
        double FirstTest = input.nextDouble();
        System.out.println("What mark did you get?");
        double FirstMark = input.nextDouble();
        System.out.println("What was your second test out of?");
        double SecondTest = input.nextDouble();
        System.out.println("What mark did you get?");
        double SecondMark = input.nextDouble();
        System.out.println("What was your third test out of?");
        double ThirdTest = input.nextDouble();
        System.out.println("What mark did you get?");
        double ThirdMark = input.nextDouble();
        System.out.println("What was your fourth test out of?");
        double FourthTest = input.nextDouble();
        System.out.println("What mark did you get?");
        double FourthMark = input.nextDouble();
        System.out.println("What was your fifth test out of?");
        double FifthTest = input.nextDouble();
        System.out.println("What mark did you get?");
        double FifthMark = input.nextDouble();
        //find percentage
        double FA = ((FirstMark/FirstTest)*100);
        double SA = ((SecondMark/SecondTest)*100);
        double TA = ((ThirdMark/ThirdTest)*100);
        double FoA = ((FourthMark/FourthTest)*100);
        double FiA = ((FifthMark/FifthTest)*100);
        System.out.println("Test scores for " + name + ":");
        System.out.println("Test 1: "+FA+"%");
        System.out.println("Test 2: "+SA+"%");
        System.out.println("Test 3: "+TA+"%");
        System.out.println("Test 4: "+FoA+"%");
        System.out.println("Test 5: "+FiA+"%");
        //calculate total average
        double totalaverage = ((FA + SA + TA + FoA + FiA)/5);
        System.out.println("Your average is " + totalaverage + "%");
                
        
    }
}
