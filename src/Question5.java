
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author godie2014
 */
public class Question5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //first test
      String name;
        Double first;
        Double firstm;

        //second test
      Double second;
        Double secondm;
        
        //third test
        Double third;
        Double thirdm;
        
        //fourth test
        Double fourth;
     Double fourthm;
        
        //fifth test
        Double fifth;
        Double fifthm;

        Scanner input = new Scanner(System.in);

        //first test
        System.out.println("Please enter your name");
        name = input.nextLine();
        System.out.println("What was the first test out of?");
        first = input.nextDouble();
        System.out.println("What mark did you get?");
        firstm = input.nextDouble();

        //second test  
        System.out.println("What was the second test out of?");
        second = input.nextDouble();
        System.out.println("What mark did you get?");
        secondm = input.nextDouble();
        
        //third test
         System.out.println("What was the third test out of?");
         third = input.nextDouble();
         System.out.println("What mark did you get?");
        thirdm = input.nextDouble();
         
         //fourth test
          System.out.println("What was the fourth test out of?");
          fourth = input.nextDouble();
          System.out.println("What mark did you get?");
        fourthm = input.nextDouble();
        
        
          //fifth test
           System.out.println("What was the fifth test out of?");
           fifth = input.nextDouble();
           System.out.println("What mark did you get?");
        fifthm = input.nextDouble();
       
        System.out.println("Test 1:  " + firstm/first );
         System.out.println("Test 2: " + secondm/second );
          System.out.println("Test 3: " + thirdm/third );
           System.out.println("Test 4: " + fourthm/fourth );
            System.out.println("Test 5: " + fifthm/fifth );
            
            
        
    } 
    
}
