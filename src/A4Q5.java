
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author butlj9437
 */
public class A4Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double percSum = 0;
        double[] perc = new double[5];
        int[] outof = new int[5];
        int[] grades = new int[5];
        Scanner input = new Scanner(System.in);
        for(int i = 0; i < 5; i++){
            System.out.println("Test " + (i+1) + " is out of what?");
            outof[i] = input.nextInt();
            System.out.println("What did you get?");
            grades[i] = input.nextInt();
            perc[i] = grades[i] * 100;
            perc[i] = perc[i] / outof[i];
        }
        for(int i = 0; i < 5; i++){
            System.out.println("On test " + (i+1) + " you got: " + perc[i] + "%");
        }
        for(int i = 0; i < 5; i++){
            percSum = percSum+perc[i];
        }
        percSum = percSum/5;
        System.out.println("Your avrage is " + percSum + "%");
    }
}
