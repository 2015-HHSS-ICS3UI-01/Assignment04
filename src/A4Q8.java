
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
        int num = 1, roll = 0;
        boolean pass = false, quit = false;
        Scanner input = new Scanner(System.in);
        while(num!=100
                && !quit){
            while(!pass){
                System.out.println("What did you roll?");
                roll = input.nextInt();
                if(roll>1
                        && roll<13){
                    pass = true;
                }else if(roll==0){
                    System.out.println("You quit");
                    pass = true;
                    quit = true;
                }
            }
            if(!quit
                    && num + roll<101){
                num = num + roll;
            }
            if(!quit){
                if(num==54){
                    System.out.println("You were snaked from 54 to 19.");
                    num = 19;
                }else if(num==90){
                    System.out.println("You were snaked from 90 to 48.");
                    num = 48;
                }else if(num == 99){
                    System.out.println("You were snaked from 99 to 77.");
                    num = 77;
                }else if(num == 9){
                    System.out.println("You climb a ladder from 9 to 34.");
                    num = 34;
                }else if(num == 40){
                    System.out.println("You climb a ladder from 40 to 64.");
                    num = 64;
                }else if(num == 67){
                    System.out.println("You climb a ladder from 67 to 86.");
                    num = 86;
                }else if(num == 100){
                    System.out.println("YOU WIN!");
                }else{
                    System.out.println("You landed on " + num);
                }
            }
            pass = false;
        }
    }
}
