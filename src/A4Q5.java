
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bettk6516
 */
public class A4Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //imports Scanner for user input
        Scanner input = new Scanner(System.in);
        //takes user input and saves it as their name
        System.out.println("Please enter your name ");
    String name =input.nextLine();
    //takes test scores and marks from those test and stores each under it's own variable
        System.out.println("what was your first test out of?");
        double first =input.nextDouble();
        
        System.out.println("what mark did you get?");
        double firstM = input.nextDouble();
        
        
        System.out.println("what was your second test out of?");
        double second = input.nextDouble();
        
        System.out.println("what did you get?");
        double secondM = input.nextDouble();
        
        
        System.out.println("what was the third test out of?");
        double third = input.nextDouble();
        
        System.out.println("what did you get?");
        double thirdM = input.nextDouble();
        
        
        System.out.println("What was your fourth test out of?");
        double fourth = input.nextDouble();
        
        System.out.println("what did you get");
        double fourthM =input.nextDouble();
        
        
        System.out.println("what was the fifth test out of?");
        double fifth = input.nextDouble();
        
        System.out.println("what mark did you get?");
        double fifthM = input.nextDouble();
        
       
        //calculates average of each test
        double test1 = firstM / first *100;
        double test2 = secondM / second *100;
        double test3 = thirdM / third *100;
        double test4 = fourthM / fourth *100;
        double test5 = fifthM / fifth *100;
        //calculates overall average
        double average = test1 + test2 + test3 + test4 + test5 / 5;
        //sends computed averages to scren
         System.out.println("test scores for "+ name);
         System.out.println("test 1: " + test1 + "%");
         System.out.println("test 2: "+ test2 + "%");
         System.out.println("test 3: "+ test3 + "%");
         System.out.println("test 4: " + test4 + "%");
         System.out.println("test 5: "+ test5 + "%");
        System.out.println("");
        System.out.println("");
        System.out.println("Average: " + average);
        
    
    
    
    }
}
