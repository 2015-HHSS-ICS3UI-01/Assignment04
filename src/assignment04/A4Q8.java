/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment04;

import java.util.Scanner;

/**
 *
 * @author fostp4040
 */
public class A4Q8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        boolean done = false;
        int diceroll = 0;
        int userposition = 1;
        int square9 = 9;
        int square34 = 34;
        int square40 = 40;
        int square64 = 64;
        int square54 = 54;
        int square19 = 19;
        int square67 = 67;
        int square86 = 86;
        int square90 = 90;
        int square48 = 48;
        int square99 = 99;
        int square77 = 77;
        int square100 = 100;
        while (!done) {
            System.out.print("Enter the sum of the dice: ");
            diceroll = input.nextInt();
            userposition = userposition + diceroll;
            System.out.println("You are now on square " + userposition);
            if (diceroll < 2 || diceroll > 12) {
                System.out.println("You quit!");
                done = true;
            }
            if (userposition== 9) {
            userposition = userposition + 25;
            System.out.println("You are now on square " + userposition);
        } else if (userposition == 40) {
            userposition = userposition + 24;
            System.out.println("You are now on square " + userposition);
        } else if (userposition == 54) {
            userposition = userposition - 35;
            System.out.println("You are now on square " + userposition);
        } else if (userposition == 67) {
            userposition = userposition + 19;
            System.out.println("You are now on square " + userposition);
        } else if (userposition == 90) {
            userposition = userposition - 42;
            System.out.println("You are now on square " + userposition);
        } else if (userposition == 99) {
            userposition = userposition - 22;
            System.out.println("You are now on square " + userposition);
        } else if (userposition == 100) {
            System.out.println("You win!");
            done = true;
        }
        }
        
    }
}
