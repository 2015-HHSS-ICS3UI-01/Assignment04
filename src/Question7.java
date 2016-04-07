
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
public class Question7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the speed limit : ");
        double Limit = input.nextInt();

        System.out.println("Enter recorded speed of the car  : ");
        double Speed = input.nextInt();

        double speedoverlimit = Speed - Limit;

        if (speedoverlimit > 0 && speedoverlimit < 21) {
            System.out.println("You are speeding, your fine is $100.00");
        }
        if (speedoverlimit > 20 && speedoverlimit < 31) {
            System.out.println("You are speeding, your fine is $270.00");
        }
        if (speedoverlimit > 30) {
            System.out.println("You are speeding, your fine is $500.00");
        }
        if (Speed < Limit) {
        System.out.println("Congratulations! You are within the speed limit. ");
        }
    
    }
    }



