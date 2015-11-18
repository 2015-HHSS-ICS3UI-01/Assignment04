
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author butlj9437
 */
public class A4Q8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num = 1;
        boolean pass = false, quit = false;
        Scanner input = new Scanner(System.in);
        while(num<100
                && !quit){
            while(!pass){
                System.out.println("What did you roll?");
                int roll = input.nextInt();
                if(roll>1
                        && roll<13){
                    pass = true;
                }else if(roll==0){
                    System.out.println("You quit");
                    pass = true;
                    quit = true;
                }
            }
        }
    }
}
