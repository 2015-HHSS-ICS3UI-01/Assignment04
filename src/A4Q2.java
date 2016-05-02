/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author godie2014
 */
public class A4Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      String name;
        //create the scanner to get input
        Scanner input = new Scanner (System.in);
        
        //Get measurement to convert
        System.out.println("Please enter the measurement in inches you wish to convert:");
         double number = input.nextDouble();
         
        //convert from inch to cm
         double cm = number * 2.54 ;
         
         
         //telling user the conversion
           System.out.println(number + " inches is the same as " + cm );
 
    }
}
