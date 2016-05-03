
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author coulh9904
 */
public class A4Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the speed limit.");
        double A = input.nextDouble();
        System.out.println("Enter recorded speed of the car.");
        double B = input.nextDouble();
        double C = (B - A);
        if (C > 30) {
            System.out.println("You are speeding and your fine is $500.");
        }
        if (C < 31) {
            if (C > 20) {
                System.out.println("You are speeding and your fine is $270.");
            }
            if (C < 20) {
                if (C >0) {
                    System.out.println("You are speeding and your fine is $100.");
                }
            }
            if (C < 1) {
                    System.out.println("Congratulations, you are within the speed limit!");
                }
        }
    }
}
