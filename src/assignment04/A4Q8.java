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
public class A4Q8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int start = 1;
        int position = 0;
        while (true) {
            System.out.println("Please enter dice number");
            int dice = input.nextInt();
            if (1 < dice && dice < 13) {
                position = (dice + start);
                System.out.println("You are at " + position);
                start = position;
            if (start == 9){
            start = 34;
                System.out.println("You got a ladder");
                System.out.println("You are at " + start);
            }
            if (start == 40){
            start = 64;
            System.out.println("You got a ladder");
            System.out.println("You are at " + start);
            }
            if (start == 67){
            start = 86;
            System.out.println("You got a ladder");
            System.out.println("You are at " + start);
            }
            if (start == 54){
            start = 19;
            System.out.println("You got a snake");
            System.out.println("You are at " + start);
            }
            if (start == 90){
            start = 48;
            System.out.println("You got a snake");
            System.out.println("You are at " + start);
            }
            if (start == 99){
            start = 77;
            System.out.println("You got a snake");
            System.out.println("You are at " + start);
            }
            if (start == 100){
              System.out.println("You Win!");
              break;
                
            }
            
            } else { 
                break;
            }

        }
    }
}