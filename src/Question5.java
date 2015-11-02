
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author snowc4636
 */
public class Question5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //
        Scanner input = new Scanner(System.in);
        
        
        System.out.println(" Please enter your name ");
        String name = input.nextLine();
        
        //First Test out of
        System.out.println(" What was the first test out of? ");
        double first = input.nextDouble();
        //mark of the first test
        System.out.println(" What mark did you get? ");
        double mark = input.nextDouble();
        
        //second test out of
        System.out.println(" What was the second test out of? ");
        double second = input.nextDouble();
        //second test mark
        System.out.println(" What mark did you get? ");
        double mark2 = input.nextDouble();

        //Third test out of
        System.out.println(" What was the third test out of? ");
        double third = input.nextDouble();
        //Third test mark
        System.out.println(" What mark did you get? ");
        double mark3 = input.nextDouble();
        
        //Fourth test out of
        System.out.println(" What was the fourth test out of? ");
        double fourth = input.nextDouble();
        //Fourth test mark
        System.out.println(" What mark did you get? ");
        double mark4 = input.nextDouble();
        
        //Fifth test out of
        System.out.println(" What was the fifth test out of? ");
        double fifth = input.nextDouble();
        //Fifth test mark
        System.out.println(" What mark did you get? ");
        double mark5 = input.nextDouble();
        
        //Liam's test scores
        System.out.println(" Test scores for "+ name);

        //Test averages
        double avg1 = mark/first*100;
        System.out.println(" Test 1 " + avg1 +"%");
        double avg2 = mark2/second*100;
        System.out.println(" Test 2 " + avg2 +"%");
        double avg3 = mark3/third*100;
        System.out.println(" Test 3 " + avg3 +"%");
        double avg4 = mark4/fourth*100;
        System.out.println(" Test 4 " + avg4 +"%");
        double avg5 = mark5/fifth*100;
        System.out.println(" Test 5 " + avg5 +"%");
        
        
        double Total = (avg1+avg2+avg3+avg4+avg5)/5;
        //average for all test
        System.out.println(" Average "+ Total+"%");
        
                
        
        
        
        
    }
}
