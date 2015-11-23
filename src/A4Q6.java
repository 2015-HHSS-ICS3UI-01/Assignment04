
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author butlj9437
 */
public class A4Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Daytime minutes?");
        Scanner input = new Scanner(System.in);
        int dMin = input.nextInt();
        System.out.println("Evening minutes?");
        int eMin = input.nextInt();
        System.out.println("Weekend minutes?");
        int wMin = input.nextInt();
        double planA = (dMin-100)*0.25 + eMin * 0.15 + wMin * 0.2 , planB = (dMin-250) * 0.45 + eMin * 0.35 + wMin * 0.25;
        System.out.println("Plan A costs:$" + planA);
        System.out.println("Plan B costs:$" + planB);
        if(planA<planB){
            System.out.println("Plan A costs less.");
        }else if(planA>planB){
            System.out.println("Plan B costs less.");
        }else{
            System.out.println("Plan A and B cost the same.");
        }
    }
}
