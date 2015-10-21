
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author moore3607
 */
public class Question5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //created a new scanner called "input"
        Scanner input = new Scanner(System.in);
        //makes the computer display "Please enter your name" on the screen
        System.out.println("Please enter your name");
        //puts the input from the user into a variable "name"
        String name = input.nextLine();
        //makes the computer display "What was the first test out of?" on the screen
        System.out.println("What was the first test out of?");
        //puts the input from the user into a variable "outoffirst"
        double outoffirst = input.nextDouble();
        //makes the computer display "What mark did you get?" on the screen
        System.out.println("What mark did you get?");
        //puts the input from the user into a variable "markoffirst"
        double markoffirst = input.nextDouble();
        //makes the computer display "What was the second test out of?" on the screen
        System.out.println("What was the second test out of?");
        //puts the input from the user into a variable "outofsecond"
        double outofsecond = input.nextDouble();
        //makes the computer display "What mark did you get?" on the screen
        System.out.println("What mark did you get?");
        //puts the input from the user into a variable "markofsecond"
        double markofsecond = input.nextDouble();
        //makes the computer display "What was the third test out of?" on the screen
        System.out.println("What was the third test out of?");
        //puts the input from the user into a variable "outofthird"
        double outofthird = input.nextDouble();
        //makes the computer display "What mark did you get?" on the screen
        System.out.println("What mark did you get?");
        //puts the input from the user into a variable "markofthird"
        double markofthird = input.nextDouble();
        //makes the computer display "What was the fourth test out of?" on the screen
        System.out.println("What was the fourth test out of?");
        //puts the input from the user into a variable "outoffourth"
        double outoffourth = input.nextDouble();
        //makes the computer display "What mark did you get" on the screen
        System.out.println("What mark did you get");
        //puts the input from the user into a variable "markoffourth"
        double markoffourth = input.nextDouble();
        //makes the computer display "What was the fifth test out of?" on the screen
        System.out.println("What was the fifth test out of?");
        //puts the input from the user into a variable "outoffifth"
        double outoffifth = input.nextDouble();
        //makes the computer display "What mark did you get?" on the screen
        System.out.println("What mark did you get?");
        //puts the input from the user into a variable "markoffifth"
        double markoffifth = input.nextDouble();
        //makes the computer display the following on the screen
        System.out.println("Test Scores for " + name);
        //makes the computer display "Test 1: " and the result of markoffirst 
        //divided by outoffirst multiplied by 100 "%" on the screen
        System.out.println("Test 1: " + markoffirst / outoffirst * 100 + "%");
        //makes the computer display "Test 2: " and the result of markofsecond 
        //divided by outofsecond multiplied by 100 "%" on the screen
        System.out.println("Test 2: " + markofsecond / outofsecond * 100 + "%");
        //makes the computer display "Test 3: " and the result of markofthird 
        //divided by outofthird multiplied by 100 "%" on the screen
        System.out.println("Test 3: " + markofthird / outofthird * 100 + "%");
        //makes the computer display "Test 4: " and the result of markoffourth 
        //divided by outoffourth multiplied by 100 "%" on the screen
        System.out.println("Test 4: " + markoffourth / outoffourth * 100 + "%");
        //makes the computer display "Test 5: " and the result of markoffifth 
        //divided by outoffifth multiplied by 100 "%" on the screen
        System.out.println("Test 5: " + markoffifth / outoffifth * 100 + "%");

    }
}
