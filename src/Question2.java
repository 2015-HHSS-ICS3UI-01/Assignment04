/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author whitb0039
 */
public class Question2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner in = new Scanner(System.in);
        //make new scanner
        
        System.out.println("Enter number of inches");
        //ask user how many inches wanted to be converted
        
        double inches = in.nextDouble();
        //enter number of inches to convert
        
        in.close();
        //stop using scanner
        
        double Centimeter = inches*2.54;
        //multiply inches by 2.54
        
        System.out.println(Centimeter +" centimeters");
        //output the final conversion
        
    }
}
