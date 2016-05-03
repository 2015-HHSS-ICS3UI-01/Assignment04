
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author coulh9904
 */
public class A4Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String Name;
        Scanner input = new Scanner(System.in);
        Scanner Input = new Scanner(System.in);
        System.out.println("Please enter your name.");
        Name = Input.nextLine();
        System.out.println("What is the first test out of?");
        double Test1O = input.nextDouble();
        System.out.println("What did you get?");
        double Test1 = input.nextDouble();
        System.out.println("What is the second test out of?");
        double Test2O = input.nextDouble();
        System.out.println("What did you get?");
        double Test2 = input.nextDouble();
        System.out.println("What is the third test out of?");
        double Test3O = input.nextDouble();
        System.out.println("What did you get?");
        double Test3 = input.nextDouble();
        System.out.println("What is the fourth test out of?");
        double Test4O = input.nextDouble();
        System.out.println("What did you get?");
        double Test4 = input.nextDouble();
        System.out.println("What is the fourth test out of?");
        double Test5O = input.nextDouble();
        System.out.println("What did you get?");
        double Test5 = input.nextDouble();
        System.out.println("Test results for " + Name);
        System.out.println("Test 1: " + (Test1 / Test1O)*100 + "%");
        System.out.println("Test 2: " + (Test2 / Test2O)*100 + "%");
        System.out.println("Test 3: " + (Test3 / Test3O)*100 + "%");
        System.out.println("Test 4: " + (Test4 / Test4O)*100 + "%");
        System.out.println("Test 5: " + (Test5 / Test5O)*100 + "%");

        System.out.println("Average: " + ((Test1 / Test1O)*100 + (Test2 / Test2O)*100 + (Test3 / Test3O)*100 + (Test4 / Test4O)*100 + (Test5 / Test5O)*100) / 500 * 100 + "%");

    }
}
