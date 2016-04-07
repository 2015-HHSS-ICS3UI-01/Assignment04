
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuk4142
 */
public class A4Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the speed limit: ");
        int speedlimit = in.nextInt();
        
        System.out.print("Enter the recorded speed of the car: ");
        int carspeed = in.nextInt();
        
        int speedover = 0;
        if (carspeed - speedlimit >0 ){
            speedover = carspeed - speedlimit;
        }else if (carspeed - speedlimit <0 ||carspeed - speedlimit ==0){
        System.out.println("Congradulations, you are within the speed limit!");    
        }
        if(speedover >0 && speedover <21){
        System.out.println("You are speeding and your fine is $100.");    
        }
        if(speedover >20 && speedover <31){
        System.out.println("You are speeding and your fine is $270.");    
        }
        if(speedover >30){
        System.out.println("You are speeding and your fine is $500.");    
        }
    }
}
