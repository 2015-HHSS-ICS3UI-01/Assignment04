
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bettk6516
 */
public class A4Q8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   Scanner input =new Scanner(System.in);
   
   //declars player starts on 1
   int player = 1;
   int player2 =2;
   
   System.out.println("Hello. type the number 0 to quit");
   
   //will loop forever
   while(true){
        
       System.out.println("enter sum of dice");
       //user inputs the sum of dice
       int di = input.nextInt();
       //if the number is less then 0 then it will ask you to roll again
       while(di <0){
           System.out.println("please use a number between 1-12. Roll again");
           di = input.nextInt();
           
       } 
       while(di ==1){
           
           System.out.println("please use a number between 2-12");
           di = input.nextInt();
       } 
       //if the imputted number is more then 12 it will ask them to roll again
      
       while(di >12){
           
           System.out.println("please use a number between 2-12");
           di = input.nextInt();
       } 
       
       //if the number enterd is 0 the game will quit
        if(di == 0 ){
           System.out.println("you Quitter!");
           break;
       }
        
        //adds dice roll to players current location
        player = player + di;
        
        //ladder
        if(player == 9){
            player = 34;
            System.out.println("you went up a ladder");
        }
    //ladder
        if(player == 40){
            player = 64;
            System.out.println("you went up a ladder");
        }
        //snake
        if(player == 54){
            player = 19;
            System.out.println("Awe! you fell down a snake");
        }
        //snake
        if(player == 67){
            player = 86;
            System.out.println("you wnet up a ladder");
        }
        //snake
        if(player == 90){
            player = 48;
            System.out.println("awe! you fell down a snake");
        }
        //snake
        if(player ==99){
        player = 77;
            System.out.println("awe! soo close to the end too bad");
        }
        //if player lands on 100 they win and the game ends
        if(player == 100){
            System.out.println("you Win!");
            break;
        }
        //if player goes over 100 it will subtract their last dice roll from their location
        if(player >100){
            player = player - di;
        }
        
        System.out.println("you are now on squre " + player);
   
        
   
       
        
        
        
        
   } 
    }
    
}
