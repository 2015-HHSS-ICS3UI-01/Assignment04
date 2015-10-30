
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alled7036
 */
public class Question05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Make scanner
        Scanner input = new Scanner (System.in);
        
        // Make Questions
        System.out.print("Please enter your name: ");
        String name = input.nextLine();
        
        System.out.print("What was the first test out of: ");
        double first = input.nextDouble();
        
        System.out.print("What mark did you get?: ");
        double one = input.nextDouble();
        
        System.out.print("What was the second test out of?: ");
        double second = input.nextDouble();
        
        System.out.print("What mark did you get?: ");
        double two = input.nextDouble();
        
        System.out.print("What was the third test out of?: ");
        double third = input.nextDouble();
        
        System.out.print("What mark did you get?: ");
        double three = input.nextDouble();
        
        System.out.print("What was the fourth test out of?: ");
        double forth = input.nextDouble();
        
        System.out.print("What mark did you get?: ");
        double four = input.nextDouble();
        
        System.out.print("What was the fifth test out of?: ");
        double fifth = input.nextDouble();
        
        System.out.print("What mark did you get?: ");
        double five = input.nextDouble();
        
        //Solving for the %'s
        double firstPercent = one / first * 100;
        double secondPercent = two / second * 100;
        double thirdPercent = three / third * 100;
        double forthPercent = four / forth * 100;
        double fifthPercent = five / fifth * 100;
        
        //Show the Percents 
        
        System.out.println("Your score for test 1 " + firstPercent);
        System.out.println("Your score for test 2 " + secondPercent);
        System.out.println("Your score for test 3 " + thirdPercent);
        System.out.println("Your score for test 4 " + forthPercent);
        System.out.println("Your score for test 5 " + fifthPercent);
        
        //Total Average
        
        double total = firstPercent + secondPercent + thirdPercent + forthPercent + fifthPercent;
        double average = total / 5;
        
        // Showing the average
        System.out.println("Your Total average is " + average);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
