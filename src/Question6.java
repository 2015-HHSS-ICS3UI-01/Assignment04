/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author maxia2242
 */
public class Question6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double daytime;
        double evening;
        double weekend;
        double a;
        double a1;
        double a2 = 0;
        double a3;
        double a4;
        double totalA ;
        double totalB ;
        
        double b;
        double b1;
        double b2;
        double b3;
        double b4;
        
        
        
        
          Scanner Andrew = new Scanner(System.in);
          System.out.println("Number of daytime minutes?");
          daytime = Andrew.nextDouble();
          System.out.println("Number of evening minutes?");
          evening = Andrew.nextDouble();
          System.out.println("Number of weekend minutes?");
          weekend = Andrew.nextDouble();
          
         a = daytime;
         if(a > 100){
             a1 = a-100;
             a2 = a1 * 0.25;
             
         }else{
             a2 = 0;
         }
             
                 
         a4 = evening* 0.15;
         a3 = weekend * 0.20;
         totalA = a2 +a3 + a4;
         
         
         if(a > 250){
           b = a-250;
           b1 = b * 0.45;
           
         }else{
             b1 = 0;
         }
         b2 = evening * 0.35;
         b3 = weekend * 0.25;
         totalB = b1 + b2 +b3;
         
         System.out.println("Plan A costs " + totalA);
         System.out.println("Plan B costs " + totalB);
         
         if(totalB > totalA){
             System.out.println("Plan A is cheapest");
         }else if(totalB == totalA){
             System.out.println("Plan A and B are the same price. ");
             
         }else{
             System.out.println("Plan B is cheapest. ");
         }
        
    
         
         
                 
          
    
}
}
