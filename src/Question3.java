/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author whitb0039
 */
public class Question3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner in = new Scanner(System.in);
        //make new scanner

        System.out.println("Please input 4 numbers on seperate lines");
        //ask user for 4 numbers

        String numberOne = in.next();
        //enter first number

        String numberTwo = in.next();
        //enter second number

        String numberThree = in.next();
        //enter third number

        String numberFour = in.next();
        //enter fourth number

        System.out.println(numberOne + ", " + numberTwo + ", " + numberThree + ", " + numberFour);
        //output four numbers in order

    }
}
