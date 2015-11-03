/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author prevw5940
 */
public class Question2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(true) {
        //asks you to put in a number of inches
        System.out.println("Please enter a number of inches.");
        int inches = input.nextInt();
        double centimeters = 2.54;
        //multiplies centimeters by the number of inches imputed
        centimeters = centimeters * inches;
        //tells you what inches is in centimerters
        System.out.println(centimeters + " is equal to " + inches + " inches!" );
        }
    }
}
