
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
public class Question2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //new scanner for input
        Scanner input = new Scanner (System.in);
        //get measurement
        System.out.println("Please enter a measurement in inches");
        
        double measurement = input.nextDouble();
        //multiply measurement by 2.54 to get cm
        System.out.println("The measurement is " + measurement*2.54 + "cm");
    }
    
}
