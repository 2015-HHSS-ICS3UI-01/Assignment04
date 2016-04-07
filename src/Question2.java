
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RARES
 */
public class Question2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
 
    String name;
    Scanner input = new Scanner (System.in);
    
    System.out.println("Please input the measurement (Inches) you wish to convert ");
    
    int inch = input.nextInt();
    double cm = inch * 2.54;
    
    System.out.println(inch + " inches is the same as " + cm + " centimeters");
    
    
    
    
    }
    
}
