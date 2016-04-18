/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author singk4158
 */
public class A4Q8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
        //create new scanner
 
   	Scanner input = new Scanner(System.in);
 
   	//set start location to space 1
 
   	int location = 1;
 
   	//loop program
 
   	while (true) {
            
        //ask user the sum of dice
 
       	System.out.println("enter the sum of dice");
 
       	int sum = input.nextInt();
 
        if (location < 100) {
 
        //if the users roll is too high let them know they
 
        if (sum + location > 100) {
 
       System.out.println("Sorry you exceeded 100 places, you are now at  " + location);
 
       } else {
 
       // create a varible to represent where the player is on the board
 
       location = sum + location;
 
       System.out.println("you are on space " + location);
 
           }
 
       	}
        //if the user is on space 9 they have climes a laddder and are on space 34
 
       	if (location == 9) {
            
            location = 34;
 
        System.out.println("You climed a ladder!! you are on space 34 ");
 
        //if the user is on space 40 they have climes a laddder and are on space 64
 
       	} else if 
        
       (location == 40) {
 
        location = 64;
 
        System.out.println("you climed a ladder!! you are now on space 24!! ");
 
        //if the user is on space 67 they have climed a laddder and are on space 86
 
       	} else if (location == 67) {
 
        location = 86;
 
        System.out.println("You climed a ladder!! you are now on space 86");

	//if the user moves to space 54 tell them that a snake has ate them and they are on space 19
 
       	} else if (location == 54) {
 
         location = 19;
 
         System.out.println("A snake ate you :( You are now on space 19");
 
       	//if the user moves to space 90 tell them that a snake has ate them and they are on space 48
 
     	} else if (location == 90) {
 
         location = 48;
 
         System.out.println("A snake ate you :( You are now on space 48");
 
	//if the user moves to space 99 tell them that a snake has ate them and they are on space 77
 
      	} else if (location == 99) {
 
          location = 77;
 
          System.out.println("A snake ate you :(  You are now on space 77");
 
          //if the user is on space 100 ,let them know they have won the game
}
          if (location == 100) {
 
          System.out.println("Congradulation You Win !!!");
 
          break;
 	}
 



 
   	}
 
   }
}
 
 


