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
public class A4Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int userspeed;
        int speedlimit;
        int speedfine1 = 100;
        int speedmargin1;
        int speedfine2 = 270;
        int speedmargin2;
        int speedfine3 = 500;
        int speedmargin3;
        System.out.print("Enter the speed limit: ");
        speedlimit = input.nextInt();
        speedmargin1 = speedlimit + 1;
        speedmargin2 = speedlimit + 20;
        speedmargin3 = speedlimit + 30;
        System.out.print("Enter the recorded speed of the car: ");
        userspeed = input.nextInt();
        if (userspeed < speedlimit) {
            System.out.println("Congratulations, you are within the speed limit!");
        }
        if (userspeed > speedmargin1 && userspeed <= speedmargin2) {
            System.out.println("You are speeding and your fine is $" + speedfine1);
        } else if (userspeed > speedmargin2 && userspeed <= speedmargin3) {
            System.out.println("You are speeding and your fine is $" + speedfine2);
        } else if (userspeed > speedmargin3) {
            System.out.println("You are speeding and your fine is $" + speedfine3);
        }
    }
}
