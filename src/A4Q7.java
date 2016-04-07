
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author guanv6321
 */
public class A4Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the speed limit:");
        int vlimit = input.nextInt();
        System.out.println("Enter the recorded speed of the car:");
        int vcar = input.nextInt();
        int diff = vcar - vlimit;
        if (vlimit > vcar) {
            System.out.println("Congratulations, you are within the speed limit!");
        }
        if(diff >= 1 && diff <= 20){
            System.out.println("You are speeding and your fine is $100.");
        }
        if(diff >= 21 && diff <= 30){
            System.out.println("You are speeding and your fine is $270.");
        }   
        if(diff >= 31){
            System.out.println("You are speeding and your fine is $500.");
        }               
    }
}
