
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hadida
 */
public class Question8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
       int sum;
       
        System.out.println("Enter sum of dice ");
        sum = in.nextInt();
        
        System.out.println("You are now on square "+ ( sum + 1));
        int summ = in.nextInt();
       
        
        while(summ <= 100){
            System.out.println("Enter sum of dice ");
             sum = in.nextInt();
            
            System.out.println("You are now on square " +( sum + summ));
            summ = in.nextInt();
            
            
            
        }
    }
    
}
