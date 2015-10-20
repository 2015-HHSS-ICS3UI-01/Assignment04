
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
        //makes the computer display the following on the screen
        System.out.println("Please enter your name");
        //puts the input from the user into a variable "name"
        String name = input.nextLine();
        //makes the computer display the following on the screen
        System.out.println("What was the first test out of?");
        //puts the input from the user into a variable "outoffirst"
        double outoffirst = input.nextDouble();
        //makes the computer display the following on the screen
        System.out.println("What mark did you get?");
        //puts the input from the user into a variable "markoffirst"
        double markoffirst = input.nextDouble();
        //makes the computer display the following on the screen
        System.out.println("What was the second test out of?");
        //puts the input from the user into a variable "outofsecond"
        double outofsecond = input.nextDouble();
        //makes the computer display the following on the screen
        System.out.println("What mark did you get?");
        //puts the input from the user into a variable "markofsecond"
        double markofsecond = input.nextDouble();
        //makes the computer display the following on the screen
        System.out.println("What was the third test out of?");
        //puts the input from the user into a variable "outofthird"
        double outofthird = input.nextDouble();
        //makes the computer display the following on the screen
        System.out.println("What mark did you get?");
        //puts the input from the user into a variable "markofthird"
        double markofthird = input.nextDouble();
        //makes the computer display the following on the screen
        System.out.println("What was the fourth test out of?");
        //puts the input from the user into a variable "outoffourth"
        double outoffourth = input.nextDouble();
        //makes the computer display the following on the screen
        System.out.println("What mark did you get");
        //puts the input from the user into a variable "markoffourth"
        double markoffourth = input.nextDouble();
        //makes the computer display the following on the screen
        System.out.println("What was the fifth test out of?");
        //puts the input from the user into a variable "outoffifth"
        double outoffifth = input.nextDouble();
        //makes the computer display the following on the screen
        System.out.println("What mark did you get?");
        //puts the input from the user into a variable "markoffifth"
        double markoffifth = input.nextDouble();
        //makes the computer display the following on the screen
        System.out.println("Test Scores for " + name);
        System.out.println("Test 1: " + markoffirst / outoffirst * 100 + "%");
        System.out.println("Test 2: " + markofsecond / outofsecond * 100 + "%");
        System.out.println("Test 3: " + markofthird / outofthird * 100 + "%");
        System.out.println("Test 4: " + markoffourth / outoffourth * 100 + "%");
        System.out.println("Test 5: " + markoffifth / outoffifth * 100 + "%");

    }
}
