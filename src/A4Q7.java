
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author halll7908
 */
public class A4Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.println("What is the speed limit?");
        int sL = input.nextInt();
        
        System.out.println("What was the recorded speed?");
        int sR = input.nextInt();
        
        if(sR <= sL){
            System.out.println("The driver is doing the limit. What a good samaritan.");
        } else if(sR > sL){
            System.out.println("The driver is currently speeding.");
        if(sR <= (sL + 20)) {
            System.out.println("Fine is $100.");
        } else if(sR <= (sL + 30)) {
            System.out.println("Fine is $270.");
        } else {
            System.out.println("Fine is $500.");
        }
   }
  }
}
