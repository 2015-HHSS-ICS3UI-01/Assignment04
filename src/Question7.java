/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author maxia2242
 */
public class Question7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double speedL;
        double speedP;
        double A = 0;
        double B;
        double C;
                
        Scanner Andrew = new Scanner(System.in);
        System.out.println("Enter the speed limit:");
        speedL = Andrew.nextDouble();
        System.out.println("Enter the recorded speed of the car:");
        speedP = Andrew.nextDouble();
        
        if(speedP < speedL){
            System.out.println("Congratulations, you are within the speed limit! ");
        }else if(speedP == speedL){
            System.out.println("Congratulations, you are within the speed limit! ");
        }
        
        if(speedP > speedL){
            A = speedP-speedL;
            
        }
        
        if(A>1 && A < 20){
            A = A*100;
            System.out.println("You are speeding and your fine is $"+A);
            
        }else if(A == 20){
            A = A*100;
            System.out.println("You are speeding and your fine is $"+A);
        }else if( A >= 21 && A < 30 ){
            A = A * 270;
            System.out.println("You are speeding and your fine is $"+A);
        }else if(A == 30){
          A = A * 270;  
          System.out.println("You are speeding and your fine is $"+A);
        }else if(A > 31){
            A = A *500; 
            System.out.println("You are speeding and your fine is $"+A);
        }
    }
}
