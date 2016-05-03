/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author maxia2242
 */
public class Question8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int player1 = 0;
        int player1M = 0;
        int player2 = 0;
        int player2M = 0;
        int dice = 0;
        int dice2 = 0;
        int DR;
        int DR1;

        String blank;
        String blank2;

        Random Andrew1 = new Random();
        Scanner Andrew = new Scanner(System.in);
        

        while (true) {
            DR = Andrew1.nextInt(6) + 1;
            DR1 = Andrew1.nextInt(6) + 1;
            
            if (player1M < 100 && player2M < 100) {

                System.out.println("Player 1 rolled a " + DR);
                System.out.println("Player 2 rolled a " + DR1 );
                System.out.println("Press Enter  to continue");
                
                System.out.println("-----------------------------------------------------");
                blank = Andrew.nextLine();
            
                    player1M = player1M + DR;
                    player2M = player2M + DR1;
                    System.out.println("-----------------------------------------------------");
                    System.out.println("Player 1 moved to sqaure " + player1M);
                    System.out.println("Player 2 moved to sqaure " + player2M);
                    System.out.println("-----------------------------------------------------");
              
                
                    
                    
                    
                }
                if(player2M == 54 ){
                    player2M = 19;
                    System.out.println("Player 2 has moved to 19");
                    System.out.println("-----------------------------------------------------");
                }
                if(player1M == 54){
                    player1M = 19;
                     System.out.println("Player 1 has moved to 19");
                     System.out.println("-----------------------------------------------------");
                }
                if(player1M == 90){
                    player1M = 48;
                    System.out.println("Player 1 has moved down to 48");
                    System.out.println("-----------------------------------------------------");
                }
                if(player2M ==90){
                    player2M =48;
                    System.out.println("Player 2 has moved down to 48");
                    System.out.println("-----------------------------------------------------");
                }
                if(player1M == 99){
                    player1M = 77;
                    System.out.println("Player 1 has moved down to 77");
                    System.out.println("-----------------------------------------------------");
                }
                if(player2M == 99){
                    player2M = 77;
                    System.out.println("Player 2 has moved down to 77");
                    System.out.println("-----------------------------------------------------");
                }
                if(player2M == 9 ){
                    player2M = 34;
                    System.out.println("Player 2 has moved up to 34");
                    System.out.println("-----------------------------------------------------");
                }
                if(player1M == 9){
                    player1M = 34;
                    System.out.println("Player 1 has moved up to 34");
                    System.out.println("-----------------------------------------------------");
                }
                if(player2M == 40 ){
                   player2M = 67;
                    System.out.println("Player 2 has moved up to 67");
                    System.out.println("-----------------------------------------------------");
                }
                if(player1M == 40){
                    player1M = 67;
                    System.out.println("Player 1 has moved up to 67");
                    System.out.println("-----------------------------------------------------");
                }
                if(player1M == 67){
                    player1M = 86;
                    System.out.println("Player 1 has moved up to 86");
                    System.out.println("-----------------------------------------------------");
                }
                if(player2M == 67){
                    player2M = 86;
                    System.out.println("Player 2 has moved up to 86");
                    System.out.println("-----------------------------------------------------");
                }
                if(player2M >= 100){
                    System.out.println("Player 2 has Won the Game!");
                    System.out.println("-----------------------------------------------------");
                    break;
                }
                if(player1M >= 100){
                    System.out.println("Player 1 has Won the Game!");
                    System.out.println("-----------------------------------------------------");
                    break;
                }
                    
                    
                    
                    
                
                    
                    
                
                    
                    
                }
        
            }
        }
















