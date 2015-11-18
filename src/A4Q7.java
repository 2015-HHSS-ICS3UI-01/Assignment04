
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author butlj9437
 */
public class A4Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Whats the speed limit?");
        int limit = input.nextInt();
        System.out.println("What was your speed?");
        int speed = input.nextInt();
        if(speed-limit<=0){
            System.out.println("Congratulations, you are within the speed limit!");
        }else if(speed-limit<21){
            System.out.println("Your fine is $100.");
        }else if(speed-limit<31){
            System.out.println("Your fine is $270.");
        }else{
            System.out.println("Your fine is $500.");
        }
    }
}
