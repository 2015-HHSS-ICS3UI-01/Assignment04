
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author kangh4484
 */
public class A4Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the speed limit ");
        int speedlimit = input.nextInt();
        System.out.println("Enter the recorded speed of the car ");
        int recordedspeed = input.nextInt();

        int cal = recordedspeed - speedlimit;

        if (cal <= 0) {
            System.out.println("Congratulations, you are within the speed limit!");
        }else if(1<=cal&&cal<=20){
            System.out.println("You are speeding and your fine is $100");
        }else if(21<=cal&&cal<=30){
            System.out.println("You are speeding and your fine is $270");
        }else if(cal>=31){
            System.out.println("You are speeding and your fine is $500");
        }

    }
}
