/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment04;

import java.util.Scanner;

/**
 *
 * @author dhila4674
 */
public class A4Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String name;
        Scanner input = new Scanner(System.in);
        System.out.println("please enter your name");
        name = input.nextLine();
        System.out.println("What was the first test out of?");
        Double A = input.nextDouble();
        System.out.println("What mark did you get?:");
        Double B = input.nextDouble();
        System.out.println("What was the second test out of?");
        Double C = input.nextDouble();
        System.out.println("What mark did you get?");
        Double D = input.nextDouble();
        System.out.println("What was the third test out of?");
        Double E = input.nextDouble();
        System.out.println("What mark did you get?");
        Double F = input.nextDouble();
        System.out.println("What was the fourth test out of?");
        Double G = input.nextDouble();
        System.out.println("What mark did you get?");
        Double H = input.nextDouble();
        System.out.println("What was the fifth test out of?");
        Double I = input.nextDouble();
        System.out.println("What mark did you get?");
        Double J = input.nextDouble();
        System.out.println("Test Scores for " + name);
        System.out.println("Test 1: " + (B / A)*100 + "%");
        System.out.println("Test 2: " + (D / C)*100 + "%");
        System.out.println("Test 3: " + (F / E)*100 + "%");
        System.out.println("Test 4: " + (H / G)*100 + "%");
        System.out.println("Test 5: " + (J / I)*100 + "%");
        
        System.out.println("Average: " + ((((B/A)+(D/C)+(F/E)+(H/G)+(J/I))*100)/5) + "%");
    
}
}