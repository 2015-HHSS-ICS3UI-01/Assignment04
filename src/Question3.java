
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RARES
 */
public class Question3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
    String name;
    Scanner input = new Scanner (System.in);
        
    System.out.println("Please enter 4 numbers on seperate lines ");
    String numberA = input.nextLine();
    String numberB = input.nextLine();
    String numberC = input.nextLine();
    String numberD = input.nextLine();
    
    System.out.println("The numbers you inputed were... " + numberA + ", " + numberB + ", " + numberC + " and " + numberD);
    
    }
    
}
