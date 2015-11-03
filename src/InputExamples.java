
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author preej0747
 */
public class InputExamples {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hello World");
        
        System.out.print("Hello");
        System.out.print(" World");
        System.out.println();
        
        //Create a scanner for input
        Scanner input = new Scanner(System.in);
        
        //Get the users name
        System.out.println("Please enter your name");
        String name = input.nextLine();
          
        //Say hello
        System.out.println("Hello " + name + ". What year were you born?");
        
        int birthYear = input.nextInt();
        int age = 2015 - birthYear;
        
        //Tell them their age
        System.out.println("You are " + age + " years old!");
        
        //Comment about their age
        if(age >= 20){
            System.out.println("You are old!");
        }else if(age > 12 && age < 20)
        {
            System.out.println("You are a teen!");
        }
        
    }
}
