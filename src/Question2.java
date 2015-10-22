
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author pircn0556
 */
public class Question2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);



        //Ask user to enter inch to convert
        System.out.println("Please enter the measurement in inches you wish to convert.");
        int inch = input.nextInt();

        //How to calculate inch to cm
        double cm = inch * 2.54;
        
        //Tell user the conversion
        System.out.println(+inch + " inches is the same as " + cm + " cm.");


    }
}
