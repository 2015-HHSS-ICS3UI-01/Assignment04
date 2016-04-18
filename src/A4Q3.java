/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author dhalt0019
 */
public class A4Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter 4 numbers on separate lines:");

        String num = input.next();
        
        String num2 = input.next();
        
        String num3 = input.next();
        
        String num4 = input.next();
        
        System.out.println("Your numbers were" + num + "," + num2 + "," + num3 + "," + num4);
    }
}
