
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pircn0556
 */
public class Question6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //Ask for minutes from each time period
        System.out.println("Number of daytime minutes?");
        int daytime = input.nextInt();
        
        System.out.println("Number of evening minutes?");
        int evening = input.nextInt();
        
        System.out.println("Number of weekend minutes?");
        int weekend = input.nextInt();
        
        //Calculate plan A costs
          //Daytime
        double Aday1 = daytime-100;
        double Aday2 = Aday1*0.25;
          //Evening
        double Aeven = evening*0.15;
          //Weekend
        double Aweek = weekend*0.20;
        
        double planA = Aday2+Aeven+Aweek;
        System.out.println("Plan A costs "+planA+"");
        //Calculate plan B costs
          //Daytime
        double Bday = daytime-250;
        if(Bday<0){
            Bday=0;
        }
        Bday = Bday*0.45;
        
          //Evening
        double Beven = evening*0.35;
          //Weekend
        double Bweek = weekend*0.25;
        
        double planB = Bday+Beven+Bweek;
        planB = Math.round(planB*100)/100.0;
        
        System.out.println("Plan B costs "+planB+"");
        
        //determine which plan is cheapest
        if(planA==planB){
            System.out.println("Plan A and B are the same price.");
        }else if(planA >=planB){
            System.out.println("Plan B is cheapest.");
        }else{
            System.out.println("Plan A is cheapest.");
        }
    }
}
