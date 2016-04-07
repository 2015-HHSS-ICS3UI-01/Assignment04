
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuk4142
 */
public class A4Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        
        System.out.print("Number of daytime minutes? ");
        double daytime = in.nextDouble();
        
        
        System.out.print("Number of evening minutes? ");  
        double eveningtime = in.nextDouble();
        
        
        System.out.print("Number of weekend minutes? ");
        double weekendtime = in.nextDouble();
      
        double adaycost = 0;
        if (daytime > 100) {
            adaycost = (daytime - 100) * 25;
        } else if (daytime < 100 || daytime == 100) {
            adaycost = 0;
        }
        double bdaycost = 0;
        if (daytime > 250) {
            bdaycost = (daytime - 250) * 45;
        } else if (daytime < 250 || daytime == 250) {
            bdaycost = 0;
        }

       double aeveningcost = eveningtime * 15;
       double beveningcost = eveningtime * 35;
       
       double aweekendcost = weekendtime * 20;
       double bweekendcost = weekendtime * 25;     
        
       double acost = (adaycost + aeveningcost + aweekendcost);
       double bcost = (bdaycost + beveningcost + bweekendcost);
               
        System.out.println("Plan A costs " + acost/100);
        System.out.println("Plan B costs " + bcost/100);
        
         if(acost==bcost){
        System.out.println("Plan A and B are the same price.");
        }
         
        if(acost>bcost){
        System.out.println("Plan B is cheapest.");
        }
        if(acost<bcost){
        System.out.println("Plan A is cheapest.");
        }
       
        
    }
}
