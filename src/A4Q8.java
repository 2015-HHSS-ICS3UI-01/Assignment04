
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
   
   int player = 1;
   
   while(true){
        System.out.println("enter sum of dice");
        int di = input.nextInt();
        
        int cSpace = player + di;
        
        
        
        System.out.println("you are now on squre " + cSpace);
   
   }
    
    
    
    
    
    }
    
}
