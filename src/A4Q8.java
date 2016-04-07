
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuk4142
 */
public class A4Q8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        int square = 1; 
        while(square<100|| square >100){
         
        System.out.print("Enter sum of dice: ");    
        int add = in.nextInt();
        
        if (add<2 || add >12){
         System.out.println("You Quit! ");     
         break;
        }
            
        if(add + square>100){
            add=0;
        }
            
        square = square + add;
        //snakes + ladders
        if (square ==54){
            square = 19;
        }
        if (square ==90){
            square = 48;
        } 
        if (square ==99){
            square = 77;
        } 
        if (square ==9){
            square = 34;
        } 
        if (square ==40){
            square = 64;
        } 
        if (square ==67){
            square = 86;
        } 
        //snakes + ladders end
        
        
        System.out.println("You are now on "+ square); 
        
        
        
        
        if(square == 100){
        System.out.println("You win! ");     
        break;
        }
        }
        
    }
}
