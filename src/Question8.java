 
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author snowc4636
 */
public class Question8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 
        Scanner input = new Scanner(System.in);
        int player1 =1;
        int sum;
        
        while(player1 <= 100){
            System.out.println(" Player 1's turn ");
            System.out.println(" Enter sum of dice ");
            sum = input.nextInt();
        //player 1 formula    
            player1 = sum + player1;
        //what square is player 1 on 
            System.out.println(" You are now on square " +( player1));
        //player movements
            if (player1 == 9){
                System.out.println(" Hey look, a ladder! you've climbed to square " +34);
                player1 =34;
                
            }if (player1 == 40){
                System.out.println(" Hey look, a ladder! you've climbed to square " +64);
                player1 =64;
                
            }if (player1 == 67){
                System.out.println(" Hey look, a ladder! you've climbed to square " +86);
                player1 =86;
                
            }if (player1 == 54){
                System.out.println(" Oh no, a  wild snake has pulled you down to square " +19);
                player1 =19;
                
            }if (player1 == 90){
                System.out.println(" Oh no, a  wild snake has pulled you down to square " +48);
                player1 =48;
                
            } if (player1 == 99){
                System.out.println(" Oh no, a  wild snake has pulled you down to square " +77);
                player1 =77;
                
            }if (player1 >=100){
                System.out.println(" Player 1 Wins!");
                break;
                
   
            }
        }
        
        

        
        
    }
}
