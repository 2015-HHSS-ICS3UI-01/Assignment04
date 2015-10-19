
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
        //scanner for input
        Scanner input = new Scanner (System.in);
        //get student name
        System.out.println("Please enter your name, student.");
        
        String name = input.nextLine();
        System.out.println("Hello " + name + ", let's find your average mark.");
        //get test "out of"s 1-5
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
        //get marks 1-5
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
        //add all test "out of"s up
        double allTests = test1total+test2total+test3total+test4total+test5total;
        //add all marks up
        double allMarks = test1mark+test2mark+test3mark+test4mark+test5mark;
        //determine total
        double averageDecimal = allMarks/allTests;
        //determine mark percentage
        double averagePercent = averageDecimal*100;
        //determine individual marks
        double test1percent = (test1mark/test1total)*100;
        double test2percent = (test2mark/test2total)*100;
        double test3percent = (test3mark/test3total)*100;
        double test4percent = (test4mark/test4total)*100;
        double test5percent = (test5mark/test5total)*100;
        //output individual marks
        System.out.println("Here are your individual test marks...");
        System.out.println(test1percent);
        System.out.println(test2percent);
        System.out.println(test3percent);
        System.out.println(test4percent);
        System.out.println(test5percent);
        //output total mark percentage
        System.out.println("Your approximate average mark is " + averagePercent + "%");
        
        
    }
    
}
