
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author RARES
 */
public class Question6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner input = new Scanner(System.in);

        System.out.println("Number of daylight minutes : ");
        double daylight = input.nextInt();

        System.out.println("Number of evening minutes : ");
        double evening = input.nextInt();

        System.out.println("Number of weekend minutes : ");
        double weekend = input.nextInt();

        double PlanAday = (daylight - 100) * 0.25;

        if (daylight < 100) {
            PlanAday = 0;
        }
        double PlanAeve = evening * 0.15;
        double PlanAwnd = weekend * 0.20;

        double PlanBday = (daylight - 250) * 0.45;

        if (daylight < 250) {
            PlanBday = 0;
        }
        double PlanBeve = evening * 0.35;
        double PlanBwnd = weekend * 0.25;

        double PlanAprice = Math.ceil(PlanAday + PlanAeve + PlanAwnd);
        double PlanBprice = Math.ceil(PlanBday + PlanBeve + PlanBwnd);
        System.out.println("Plan A costs " + PlanAprice);
        System.out.println("Plan B costs " + PlanBprice);

        if (PlanAprice < PlanBprice) {
            System.out.println("Plan A is the cheaper option.");

        } else if (PlanAprice > PlanBprice) {
            System.out.println("Plan B is the cheaper option.");

        } else if (PlanAprice == PlanBprice) {
            System.out.println("Plan A and B are the same");

        }
    }
}
