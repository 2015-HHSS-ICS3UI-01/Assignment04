
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alled7036
 */
public class Question09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
           Scanner input = new Scanner (System.in);
           
           String userName;
           String userName2;
        
        System.out.println("Player one enter your name");
        userName = input.next();
        System.out.println("Player two enter your name");
        userName2 = input.next();
        System.out.println("Roll the dice! "); 
        System.out.println("Hope you Enjoy");
        System.out.println("Enter 0 at anytime to quit ");
        
         
        int position = 0;
        int positionTwo = 0;
         while(true) {
             //Fist roll
             System.out.println( userName + " Enter the sum of the dice ");
             int firstNumber = input.nextInt();
             //if they enter a 0 they quit
             if (firstNumber == 0){
                 System.out.println("You Quit :(! ");
                 break;
             }//If user doesnt enter a number between 2 to 12
             else if (firstNumber > 12 || firstNumber == 1 ){
                 System.out.println("Please enter the number between 2 and 12");
             }//Find current position
             else {
                 position = position + firstNumber;
             }
            //add Ladders
             int firstLadder = 9 + 25;
             int secondLadder = 40 + 24;
             int thirdLadder = 67 + 19;
             
             //add snakes 
             int firstSnake = 54 - 35;
             int secondSnake = 90 - 42;
             int thirdSnake = 99 - 22;
             
             //Player goes up ladder
             if (position == 9) {
                 System.out.println("You have reached a ladder you are now on square  " + firstLadder);
                 position = firstLadder;
             }
             if (position == 40){
                 System.out.println("You have reached a ladder you are now on square " + secondLadder);
                 position = secondLadder;
             }
             if (position == 67){
                 System.out.println("You have reached a ladder you are now on square " + secondLadder);
                 position = thirdLadder;
             }
             if (position == 54){
                 System.out.println("You have landed on a snake, you are now on square " + firstSnake);
                 position = firstSnake;
             }
             if (position == 90){
                 System.out.println("You have landed on a snake, you are now on square " + secondSnake);
                 position = secondSnake;
             }
             if (position == 99){
                 System.out.println("You have landed on a snake, you are now on square " + thirdSnake);
                 position = thirdSnake;
             }
             while (position >= 101){
                 position = position - firstNumber;
                 System.out.println("Try again!");
             }
             if (position == 100 ){
                 System.out.println("You Have Won!!");
                 break;
             } else{
                 System.out.println("you are now on square " + position);
             }
        
             //Fist roll
             System.out.println( userName2 + " Enter the sum of the dice ");
             int secondNumber = input.nextInt();
             //if they enter a 0 they quit
             if (secondNumber == 0){
                 System.out.println("You Quit :(! ");
                 break;
             }//If user doesnt enter a number between 2 to 12
             else if (secondNumber > 12 || secondNumber == 1 ){
                 System.out.println("Please enter the number between 2 and 12");
             }//Find current position
             else {
                 positionTwo = positionTwo + secondNumber;
             }
              //Player goes up ladder
             if (positionTwo == 9) {
                 System.out.println("You have reached a ladder you are now on square  " + firstLadder);
                 positionTwo = firstLadder;
             }
             if (positionTwo == 40){
                 System.out.println("You have reached a ladder you are now on square " + secondLadder);
                 positionTwo = secondLadder;
             }
             if (positionTwo == 67){
                 System.out.println("You have reached a ladder you are now on square " + secondLadder);
                 positionTwo = thirdLadder;
             }
             if (positionTwo == 54){
                 System.out.println("You have landed on a snake, you are now on square " + firstSnake);
                 positionTwo = firstSnake;
             }
             if (positionTwo == 90){
                 System.out.println("You have landed on a snake, you are now on square " + secondSnake);
                 positionTwo = secondSnake;
             }
             if (positionTwo == 99){
                 System.out.println("You have landed on a snake, you are now on square " + thirdSnake);
                 positionTwo = thirdSnake;
             }
             while (positionTwo >= 101){
                 positionTwo = positionTwo - secondNumber;
                 System.out.println("Try again!");
             }
             if (positionTwo == 100 ){
                 System.out.println("You Have Won!!");
                 break;
             } else{
                 System.out.println("You are now on square " + positionTwo);
             }
        }
    }
}
