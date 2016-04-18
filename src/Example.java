/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author dhalt0019
 */
public class Example {
    private static String name;
    private static int age;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner (System.in);
        
        System.out.println("Please Enter Your Name");
        name = input.nextLine();
        
        System.out.println("Hello"+ name);
        
        //Determine their "age"
        System.out.println("What year were you born in?");
        int birthYear = input.nextInt();
        age = 2016 - birthYear;
        
        System.out.println("You will be age" + age + "this year?");
    }
}
