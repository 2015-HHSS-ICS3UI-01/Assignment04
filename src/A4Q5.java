
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author kangh4484
 */
public class A4Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String name;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        name = input.nextLine();

        System.out.println("What was the first test out of?: ");
        double firt = input.nextDouble();
        System.out.println("What mark did you get?: ");
        double result1 = input.nextDouble();
        System.out.println("");

        System.out.println("What was the second test out of?: ");
        double sect = input.nextDouble();
        System.out.println("What mark did you get?: ");
        double result2 = input.nextDouble();
        System.out.println("");

        System.out.println("What was the third test out of?: ");
        double thit = input.nextDouble();
        System.out.println("What mark did you get?: ");
        double result3 = input.nextDouble();
        System.out.println("");

        System.out.println("What was the forth test out of?: ");
        double fort = input.nextDouble();
        System.out.println("What mark did you get?: ");
        double result4 = input.nextDouble();
        System.out.println("");

        System.out.println("What was the fifth test out of?: ");
        double fift = input.nextDouble();
        System.out.println("What mark did you get?: ");
        double result5 = input.nextDouble();
        System.out.println("");

        double ave1 = 100*result1 / firt ;
        double ave2 = 100*result2 / sect ;
        double ave3 = 100*result3 / thit ;
        double ave4 = 100*result4 / fort ;
        double ave5 = 100*result5 / fift ;
        double overall = (ave1+ave2+ave3+ave4+ave5)/5;
        
        System.out.println("Test Scores for "+name);
        System.out.println("Test 1: "+ave1+"%");
        System.out.println("Test 2: "+ave2+"%");
        System.out.println("Test 3: "+ave3+"%");
        System.out.println("Test 4: "+ave4+"%");
        System.out.println("Test 5: "+ave5+"%");
        System.out.println("");
        System.out.println("Average: "+overall+"%");
    }
}
