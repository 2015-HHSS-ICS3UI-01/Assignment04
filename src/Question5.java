
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Matt
 */
public class Question5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.println("Please enter your name, student.");
        
        String name = input.nextLine();
        System.out.println("Hello " + name + ", let's find your average mark.");
        System.out.println("What was your first test out of?");
        
        double test1total = input.nextDouble();
 
        System.out.println("What was your second test out of?");
        
        double test2total = input.nextDouble();
        
        System.out.println("What was your third test out of?");
        
        double test3total = input.nextDouble();
        
        System.out.println("What was your fourth test out of?");
        
        double test4total = input.nextDouble();
        
        System.out.println("And finally, what was your fifth test out of?");
        
        double test5total = input.nextDouble();
        
        System.out.println("Thank you " + name + ".");
        System.out.println("What was your mark on your first test?");
        
        double test1mark = input.nextDouble();
        
        System.out.println("What was your mark on your second test?");
        
        double test2mark = input.nextDouble();
        
        System.out.println("What was your mark on your third test?");
        
        double test3mark = input.nextDouble();
        
        System.out.println("What was your mark on your fourth test?");
        
        double test4mark = input.nextDouble();
        
        System.out.println("And, what was your mark on your fifth test?");
        
        double test5mark = input.nextDouble();
        
        System.out.println("Thank you " + name + ".");
        
        double allTests = test1total+test2total+test3total+test4total+test5total;
        
        double allMarks = test1mark+test2mark+test3mark+test4mark+test5mark;
        
        double averageDecimal = allMarks/allTests;
        
        double averagePercent = averageDecimal*100;
        
        System.out.println("Your approximate average mark is " + averagePercent + "%");
        
        
    }
    
}
