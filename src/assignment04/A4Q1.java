/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment04;

import java.util.Scanner;

/**
 *
 * @author Dhila4674
 */
public class A4Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String name;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please enter your name");
        name = input.nextLine();
        
        System.out.println("hello" + name);
        System.out.println("How are you?");
    }
}
