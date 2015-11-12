
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author eadil1765
 */
public class A4Q8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  Scanner input = new Scanner(System.in);
  int person = 1;
  int sum;
  while(person <= 100){
           System.out.println("Enter sum of dice");
           sum = input.nextInt();
           person = sum + person;
       
           //tell player what square they are on
           System.out.println("You are on square " +(person));
           
           //tell player if they landed on a snake or ladder
           if(person == 9){
               System.out.println("You landed on a ladder! You are now on square " + 34);
               person = 34;
           }
           if(person == 40){
               System.out.println("You landed on a ladder! You are now on square " + 64);
               person = 64;
           }
           if(person == 67){
               System.out.println("You landed on a ladder! You are now on square " + 86);
               person = 86;
           }
           if(person == 54){
               System.out.println("Oh no! You landed on a snake! You are now on square " + 19);
               person = 19;
           }
           if(person == 90){
               System.out.println("Oh no! You landed on a snake! You are now on square " + 48);
               person = 48;
           }
           if(person == 99){
               System.out.println("Oh no! You landed on a snake! You are now on square " + 77);
               person = 77;
           }
           if(person == 100){
               System.out.println("You win!");
               break;
           }
       }

    }
}
