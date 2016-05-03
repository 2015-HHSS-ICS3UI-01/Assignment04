/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author maxia2242
 */
public class Question5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String name;
        double test;
        double testm;
        double test1;
        double testm1;
        double test2;
        double testm2;
        double test3;
        double testm3;
        double test4;
        double testm4;
        double tr;
        double tr1;
        double tr2;
        double tr3;
        double tr4;
        double average;
        
        
         Scanner Andrew = new Scanner(System.in);
         System.out.println("Please enter your name: ");
         name = Andrew.next();
         System.out.println("What was the first test out of?:");
         test = Andrew.nextDouble();
         System.out.println("What mark did you get?:");
         testm = Andrew.nextDouble();
         System.out.println("What was the second test out of?");
         test1 = Andrew.nextDouble();
         System.out.println("What mark did you get?: ");
         testm1 = Andrew.nextDouble();
         System.out.println("What was the third test out of?: ");
         test2 = Andrew.nextDouble();
         System.out.println("What mark did you get?:");
         testm2 = Andrew.nextDouble();
         System.out.println("What was the fourth test out of?: ");
         test3 = Andrew.nextDouble();
         System.out.println("What mark did you get?:");
         testm3 = Andrew.nextDouble();
         System.out.println("What was the fifth test out of?: ");
         test4 = Andrew.nextDouble();
         System.out.println("What mark did you get?: ");
         testm4 = Andrew.nextDouble();
         
  tr = (testm/test) * 100;
  tr1 = (testm1/test1) * 100;
  tr2 = (testm2/test2)* 100;
  tr3 = (testm3/test3) * 100;
  tr4 = (testm4/test4) * 100;
 
  average = (tr + tr1 + tr2 + tr3 + tr4)/5;
        System.out.println("Test Scores for " + name );
        System.out.println("Test 1: " + tr + "%");
        System.out.println("Test 2: " + tr1 + "%"); 
        System.out.println("Test 3: " + tr2 + "%" );
        System.out.println("Test 4: " + tr3 + "%" );
        System.out.println("Test 5: " + tr4 + "%" );
        
        System.out.println("Average:" + average + "%");
    }
}
