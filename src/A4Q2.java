/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author dhalt0019
 */
public class A4Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the amount of Inches you wish to convert into Centimeters");
        
        double num = input.nextDouble();
        
        double centimeters = num * 2.54;
        
        System.out.println("centimeters = " + centimeters);
    }
}
