
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lalim9800
 */
public class Question5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         
        System.out.println("What is your name");
        String name =input.next();
         
       
        
        
        System.out.println("What was the first test out of ");
        double test1=input.nextInt();
         
         System.out.println("what was your score");
         double score1=input.nextInt();
         
         
         
         System.out.println("what was the second test out of");
         double test2=input.nextInt();
         
        System.out.println("whats was your score ");
        double score2=input.nextInt();
        
        
        
        System.out.println("what was the third test out of ");
       double test3=input.nextInt();
        
        System.out.println("what was your score ");
        double score3=input.nextInt();
        
        
        
            System.out.println("what was the forth test out of ");
            double test4=input.nextInt();
            
            System.out.println("What was your score ");
             double score4=input.nextInt();
             
             
             
             System.out.println("What was the fifth test out of");
             double test5=input.nextInt();
             
             System.out.println("What was your score");
             double score5=input.nextInt();
             
             
             
             double mark1=score1/test1*100;
             
             double mark2=score2/test2*100;
             
             double mark3=score3/test3*100;
             
             double mark4=score4/score4*100;
             
             double mark5=score5/test5*100;
             
             double Average=(mark1+mark2+mark3+mark4+mark5)/5;
             
             
            System.out.println("marks for "+name);
             
            System.out.println(" test1 " +mark1+ " %");
             
            System.out.println(" test2 " +mark2+ " % ");
              
            System.out.println(" test3 " +mark3+ " % ");
               
            System.out.println(" test4 " +mark4+ " % ");
                
            System.out.println(" test5 " +mark5+ " % ");
            
            System.out.println(name+" your Average is " +Average+ " % ");
            
            
           
             
                     
                     
                     
                     
            
           
        
        
        
                
                
         
         
        
         
        
    }
}
