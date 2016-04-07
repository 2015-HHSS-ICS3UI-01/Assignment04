
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuk4142
 */
public class A4Q9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        int square1 = 1; 
        int square2 = 1; 
        while(square1<100|| square1 >100||square2<100|| square2 >100){
         
        System.out.print("Enter sum of dice player 1: ");    
        int add1 = in.nextInt();
        
        if (add1<2 || add1 >12){
         System.out.println("You Quit! ");     
         break;
        }
            
        if(add1 + square1>100){
            add1=0;
        }
            
        square1 = square1 + add1;
        //snakes + ladders
        if (square1 ==54){
            square1 = 19;
        }
        if (square1 ==90){
            square1 = 48;
        } 
        if (square1 ==99){
            square1 = 77;
        } 
        if (square1 ==9){
            square1 = 34;
        } 
        if (square1 ==40){
            square1 = 64;
        } 
        if (square1 ==67){
            square1 = 86;
        } 
        //snakes + ladders end
        
        
        System.out.println("You are now on "+ square1+" player 1"); 
        
        
        
        
        if(square1 == 100){
        System.out.println("You win! ");     
        break;
        }
        //end of p1
        
        System.out.print("Enter sum of dice player 2: ");    
        int add2 = in.nextInt();
        
        if (add2<2 || add2 >12){
         System.out.println("You Quit! ");     
         break;
        }
            
        if(add2 + square2>100){
            add2=0;
        }
            
        square2 = square2 + add2;
        //snakes + ladders
        if (square2 ==54){
            square2 = 19;
        }
        if (square2 ==90){
            square2 = 48;
        } 
        if (square2 ==99){
            square2 = 77;
        } 
        if (square2 ==9){
            square2 = 34;
        } 
        if (square2 ==40){
            square2 = 64;
        } 
        if (square2 ==67){
            square2 = 86;
        } 
        //snakes + ladders end
        
        
        System.out.println("You are now on "+ square2+" player 2"); 
        
        
        
        
        if(square2 == 100){
        System.out.println("You win! ");     
        break;
        }
        
    }
}
}
