/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author maxia2242
 */
public class Question3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num;
        int num1;
        int num2;
        int num3;
        Scanner Andrew = new Scanner(System.in);
        System.out.println("Please enter in 4 numbers on separate lines:");
        num = Andrew.nextInt();
        num1 = Andrew.nextInt();
        num2 = Andrew.nextInt();
        num3 = Andrew.nextInt();
        System.out.println("Your numbers were " + num + "," + num1 + "," + num2 + "," + num3);
    }
}
