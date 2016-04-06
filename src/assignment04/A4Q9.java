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
public class A4Q9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Scanner input = new Scanner(System.in);
        int start = 1;
        int position = 0;
        int A = 1;
        int B = 0;
        while (true) {
            System.out.println("Please enter dice number player 1");
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
              System.out.println("You Win player 1!");
              break;
                
            }
            System.out.println("Please enter dice number player 2");
            int C = input.nextInt();
            if (1 < C && C < 13) {
                B = (C + A);
                System.out.println("You are at " + B);
                A = B;
                 if (A == 9){
             A = 34;
                System.out.println("You got a ladder");
                System.out.println("You are at " + A);
            }
            if (A == 40){
            A = 64;
            System.out.println("You got a ladder");
            System.out.println("You are at " + A);
            }
            if (A == 67){
            A = 86;
            System.out.println("You got a ladder");
            System.out.println("You are at " + A);
            }
            if (A == 54){
            A = 19;
            System.out.println("You got a snake");
            System.out.println("You are at " + A);
            }
            if (A == 90){
            A = 48;
            System.out.println("You got a snake");
            System.out.println("You are at " + A);
            }
            if (A == 99){
            A = 77;
            System.out.println("You got a snake");
            System.out.println("You are at " + A);
            }
            if (A == 100){
              System.out.println("You Win player 2!");
              break;
                
            }
            
            } else { 
                break;
            }
    }
}
    }
}