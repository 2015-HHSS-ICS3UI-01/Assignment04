/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author maxia2242
 */
public class Question2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        double inch;
        double inch2;
        double cm;
        double cm2;
        String Ar;
        System.out.println("What would you like to convert Inches or Centimetres?(I or C)");
        Ar =in.next();
        if(Ar.equals("I") ){
            System.out.println("Please enter the measurement in inches you wish to convert:");
            inch = in.nextDouble();
            inch2 = inch/2.54;
            System.out.println(inch + "inches is the same as " + inch2 + "Centimetres" );
        }
        if(Ar.equals("C")){
            System.out.println("Please enter the measurement in centimetres you wish to convert:");
            cm = in.nextDouble();
            cm2 = cm*2.54;
            System.out.println(cm + " Centrimetres is the same as " + cm2 + " inches" );
        }
            
    }
}
