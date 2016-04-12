
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author howen2217
 */
public class Question2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        // creates scanner to input number
        System.out.println("Hello, please input your measurement in inches and I will convert it to centimetres:");
        // asks user to input measurement in inches
        int inch = input.nextInt();
        // saves measurement inputted
        double cm = inch * 2.54;
        // converts the amount of cm's to inches and stores it
        System.out.println(inch + " in centimetres is " + cm + " centimetres");
        // outputs the number of centimetres

    }
}
