
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author RARES
 */
public class Question1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        String name;

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your name ");
        name = input.nextLine();

        System.out.println("Hello " + name);
        System.out.println("How are you today? ");

    }

}
