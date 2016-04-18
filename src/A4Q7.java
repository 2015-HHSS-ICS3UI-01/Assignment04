/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author dhalt0019
 */
public class A4Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the speed limit:");
        double limit = input.nextDouble();

        System.out.println("Enter the recorded speed limit of your car:");
        double speed = input.nextDouble();

        double speeding = speed - limit;


        if (speeding > 0 && speeding < 21) {
            System.out.println("Your fine is $100");

        }
        if (speeding > 20 && speeding < 31) {
            System.out.println("Your fine is $270");

        }
        if (speeding > 30) {
            System.out.println("Your fine is $500");

        }
            else if (speed < limit){
                System.out.println("COngratulations, your under the speed limit");
                
            }
        }
    }

