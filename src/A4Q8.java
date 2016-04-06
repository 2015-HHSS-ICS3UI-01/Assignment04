
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pawar5658
 */
public class A4Q8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         Scanner input = new Scanner(System.in);
         
         int A = 1;
         int B = 0;
         while(true){
             System.out.println("please enter dice");
             int dice = input.nextInt();
             if (1 < dice && dice < 13){
             B = (dice + A);
                 System.out.println("you are at square " + B);
                 A = B;
                 if (A == 9){
                     A = 34;
                     System.out.println("You got a ladder!");
                     System.out.println("You are now at square " + A);
                 }
                 if (A == 40){
                     A = 64;
                     System.out.println("You got a ladder!");
                     System.out.println("You are now at square " + A);
                 }
                 if (A == 67){
                     A = 86;
                     System.out.println("You got a ladder!");
                     System.out.println("You are now at square " + A);
                 }
                 if (A == 54){
                     A = 19;
                     System.out.println("You got a snake...shame");
                     System.out.println("You are now at square " + A);
                 }
                 if (A == 90){
                     A = 48;
                     System.out.println("You got a snake...shame");
                     System.out.println("You are now at square " + A);
                 }
                 if (A == 99){
                     A = 77;
                     System.out.println("You got a snake...shame");
                     System.out.println("You are now at square " + A);
                 }
                 if (A == 100){
                     System.out.println("Congratulations you won the game!");
                     break;
                 }
         } else {
                 break;
             }
    }
}
}           
                 
                 
