
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pearr2740
 */
public class A4Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   Scanner input = new Scanner(System.in);
   String name;
   
   System.out.println("Please enter your name");
   name = input.nextLine();
   
   //The first test average
   System.out.println("What was the first out of");
   double test = input.nextDouble();
   System.out.println("What mark did you get");
   double one = input.nextDouble();
   double first =  (double) (one / test * 100);
   
   //The second test average
   System.out.println("What was the second out of");
   double jock = input.nextDouble();
   System.out.println("What mark did you get");
   double two = input.nextDouble();
   double second = (double) (two / jock * 100);
   
   //The third test average
   System.out.println("What was the third out of");
   double deck = input.nextDouble();
   System.out.println("What mark did you get");
   double three = input.nextDouble();
   double third = (double) (three / deck * 100);
   
   //The fourth test average
   System.out.println("What was the fourth out of");
   double score = input.nextDouble();
   System.out.println("What mark did you get");
   double four = input.nextDouble();
   double fourth = (double) (four / score * 100);
   
   //The fifth test average
   System.out.println("What was the fifth out of");
   double smog = input.nextDouble();
   System.out.println("What mark did you get");
   double five = input.nextDouble();
   double fifth = (double) (five / smog * 100);
   
   System.out.println("Tes scores for" + name + "are the following:");
   System.out.println("" + first + "%");
   System.out.println("" + second + "%");
   System.out.println("" + third + "%");
   System.out.println("" + fourth + "%");
   System.out.println("" + fifth + "%");
   
   double average = (double) ((first + second + third + fourth + fifth) / 5);
   
   System.out.println("your average is" + average + "%");
   
   
   
   
   
   
   
           
    
    }
}
