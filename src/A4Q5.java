
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author tatad6701
 */
public class A4Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        String name;

        System.out.println("Please enter your name.");
        name = input.nextLine();

        // First test average
        System.out.println("What was the first test out of?");
        double test = input.nextDouble();
        System.out.println("What mark did you get?");
        double one = input.nextDouble();
        double first = (double) (one / test * 100);

        // Second test average 
        System.out.println("What was the second test out of?");
        double lock = input.nextDouble();
        System.out.println("What is your mark?");
        double two = input.nextDouble();
        double second = (double) (two / lock * 100);

        // Third test average
        System.out.println("What was the third test out of?");
        double home = input.nextDouble();
        System.out.println("What was your mark?");
        double three = input.nextDouble();
        double third = (double) (three / home * 100);

        //Fourth test average 
        System.out.println("What was the fourth test out of?");
        double end = input.nextDouble();
        System.out.println("What was your mark?");
        double four = input.nextDouble();
        double fourth = (double) (four / end * 100);

        //Fifth test average
        System.out.println("What was the fifth test out of?");
        double del = input.nextDouble();
        System.out.println("What was your mark?");
        double five = input.nextDouble();
        double fifth = (double) (five / del * 100);

        //Printing all test averages in chronilogical order
        System.out.println("Test scores for " + name + " are the following:");
        System.out.println("" + first + "%");
        System.out.println("" + second + "%");
        System.out.println("" + third + "%");
        System.out.println("" + fourth + "%");
        System.out.println("" + fifth + "%");

        //Average of all averages calculated BEDMASS
        double average = (double) ((first + second + third + fourth + fifth) / 5);

        //Final statement stating the users final average of all tests
        System.out.println("Your average is " + average + "%.");
    }
}
