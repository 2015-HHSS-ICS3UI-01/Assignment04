
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author kangh4484
 */
public class A4Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Number of daytime minutes? ");
        int dt = input.nextInt();
        System.out.println("Number of evening minutes? ");
        int ev = input.nextInt();
        System.out.println("Number of weekend minutes? ");
        int we = input.nextInt();

        double dtA = (dt - 100) * 0.25;
        if (dtA < 0) {
            dtA = 0;
        }
        double A = dtA + (ev*0.15)+(we*0.20);
        
        double dtB = (dt - 250) * 0.45;
        if (dtB < 0) {
            dtB = 0;
        }
        double B = dtB + (ev*0.35)+(we*0.25);
        
        A = Math.round(A*100)/100.0;
        B = Math.round(B*100)/100.0;
        System.out.println("Plan A costs "+A);
        System.out.printf("Plan b costs "+B);
        System.out.println("");
        if(A==B){
            System.out.println("Plan A and B are the same price.");
        }else if(A>B){
            System.out.println("Plan B is cheapest.");
        }else if(A<B){
            System.out.println("Plan A is cheapest.");
        }
            
    }
}
