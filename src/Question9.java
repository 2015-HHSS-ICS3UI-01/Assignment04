
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hadik9595
 */
public class Question9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Scanner in = new Scanner(System.in);
       int spot = 1;
       int player2=1;
       
        while(spot <= 100){
            System.out.println("Enter sum of dice ");
             int sum = in.nextInt();
            
            
            spot = sum + spot;
            if(spot < 100){
            System.out.println("You are now on square " +(spot));
            
            }
            if (sum == 0){
                System.out.println("Aw leaving so soon? You Quit! ");
                break;
            }if (spot == 9){
                System.out.println("Hey look, a ladder! You've climbed to square " + 34 );
                spot = 34;
            }if (spot == 54){
                System.out.println("Oh no! A wild snake has pulled you down to square "+ 19 );
                spot = 19;
            }if (spot == 40){
                System.out.println("Hey look, a ladder! You've climbed to square " + 64);
                spot = 64;
            }if (spot == 67){
                System.out.println("Hey look, a ladder! You've climbed to square " + 86);
                spot = 86;
            }if (spot == 90){
                System.out.println("Oh no! A wild snake has pulled you down to square " +48);
                spot = 48;
            }if (spot == 99){
                System.out.println("Oh no! A wild snake has pulled you down to square " + 77);
                spot = 77;
            }if (spot == 100){
                System.out.println("You are now on square " + 100);
                System.out.println("You Win!");
                break;
            }if (spot > 100){
                System.out.println("Nope, Reroll");
                spot = spot - sum;
            }
            player2 = sum + spot;
             if(player2 < 100){
            System.out.println("You are now on square " +(spot));
            
            }
            if (sum == 0){
                System.out.println("Aw leaving so soon? You Quit! ");
                break;
            }if (spot == 9){
                System.out.println("Hey look, a ladder! You've climbed to square " + 34 );
                spot = 34;
            }if (spot == 54){
                System.out.println("Oh no! A wild snake has pulled you down to square "+ 19 );
                spot = 19;
            }if (spot == 40){
                System.out.println("Hey look, a ladder! You've climbed to square " + 64);
                spot = 64;
            }if (spot == 67){
                System.out.println("Hey look, a ladder! You've climbed to square " + 86);
                spot = 86;
            }if (spot == 90){
                System.out.println("Oh no! A wild snake has pulled you down to square " +48);
                spot = 48;
            }if (spot == 99){
                System.out.println("Oh no! A wild snake has pulled you down to square " + 77);
                spot = 77;
            }if (spot == 100){
                System.out.println("You are now on square " + 100);
                System.out.println("You Win!");
                break;
            }if (spot > 100){
                System.out.println("Nope, Reroll");
                spot = spot - sum;
            }
            
        }
    }
    
    }

