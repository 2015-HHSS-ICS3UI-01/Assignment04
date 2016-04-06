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
public class A4Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Please pick numbers");
        Double number = input.nextDouble();
        Double guess = input.nextDouble();
        Double Number = input.nextDouble();
        Double NUMBER = input.nextDouble();
        System.out.println("your numbers are " + number + "," + guess + "," + Number + "," + NUMBER);
        
    }
}
