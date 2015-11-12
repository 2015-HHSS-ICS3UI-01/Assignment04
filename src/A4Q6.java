
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author eadil1765
 */
public class A4Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // User typing
        Scanner input = new Scanner(System.in);
        System.out.println("Number of daytime minuites?");
        double FirstNumber = input.nextInt();
        System.out.println("Number of evening minuites?");
        double SecondNumber = input.nextInt();
        System.out.println("Number of Weekend minuites?");
        double ThirdNumber = input.nextInt();
        
        //Plan A
        double daytimeA = (FirstNumber-100)*.25;
        double eavningA = SecondNumber*.15;
        double weekendA = ThirdNumber*.20;
        
        //plan B
        double daytimeB = (FirstNumber-250)*.45;
        double eavningB = SecondNumber*.35;
        double weekendB = ThirdNumber*.25;
        
        //telling the totals
        System.out.println("Plan A costs " + (daytimeA + eavningA + weekendA));
        System.out.println("Plan B costs " + (daytimeB + eavningB + weekendB));
        
        //do this cap for no reason
        double totalA = (daytimeA + eavningA + weekendA);
        double totalB = (daytimeB + eavningB + weekendB);
        
        //which is better
        if (totalA > totalB){
            
        }
                
                
}
}
