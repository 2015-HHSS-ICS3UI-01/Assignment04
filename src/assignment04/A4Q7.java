/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment04;

import java.util.Scanner;

/**
 *
 * @author dhila4674
 */
public class A4Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Enter speed limit");
        int A = input.nextInt();
        System.out.println("Enter speed of the car");
        int B = input.nextInt();
        
         if (A > B){
             System.out.println("Congratulations, you are within the speed limit!");   
         }
       if (B > A){
           if ((B-A) <= 20){
               System.out.println("You are speeding, your fine is $100");}       
           else if ((B-A) <= 30){
               System.out.println("You are speeding, your fine is $270");}
           else if ((B-A) >= 31){
               System.out.println("You are speeding, your fine is $500");}
       } 
    }
}
