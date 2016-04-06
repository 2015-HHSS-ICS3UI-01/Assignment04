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
public class A4Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("number of daytime minutes?");
        Double A = input.nextDouble();
        System.out.println("number of evening minutes?");
        Double B = input.nextDouble();
        System.out.println("number of weekend minutes");
        Double C = input.nextDouble();
        System.out.println("Plan A: " + (((A-100)*0.25) + (B*0.15) + (C*0.20)));
        System.out.println("Plan B: " + (((A-250)*0.45) + (B*0.35) + (C*0.25)));
        if ((((A-100)*0.25) + (B*0.15) + (C*0.20)) < ((A-250)*0.45) + (B*0.35) + (C*0.25)){
            System.out.println("Plan A is cheaper");}
       else if ((((A-100)*0.25) + (B*0.15) + (C*0.20)) > ((A-250)*0.45) + (B*0.35) + (C*0.25)){
            System.out.println("Plan B is cheaper");}
        else if ((((A-100)*0.25) + (B*0.15) + (C*0.20)) == ((A-250)*0.45) + (B*0.35) + (C*0.25)){
            System.out.println("both plans cost the same");}
    }
}
