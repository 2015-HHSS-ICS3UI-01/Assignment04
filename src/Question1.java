
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Matt
 */
public class Question1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create scanner for input
        Scanner input = new Scanner (System.in);
        
        //ask user name
        System.out.println("Please enter your name");
        String name = input.nextLine();
        System.out.println("Hello " + name + ". How are you doing today? Good? Good. I am a program, so I am not ");
        System.out.println("sentient. Did you respond to my greeting? Ha.");
    }
    
}
