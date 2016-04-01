/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment04;

import java.util.Scanner;

/**
 *
 * @author fostp4040
 */
public class A4Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int daytimemins;
        double planAdaytimecost=0.25;
        double planAdaytimetotal;
        double planBdaytimecost=0.45;
        double planBdaytimetotal;
        int eveningmins;
        double planAeveningcost=0.15;
        double planAeveningtotal;
        double planBeveningcost=0.35;
        double planBeveningtotal;
        int weekendmins;
        double planAweekendcost=0.20;
        double planAweekendtotal;
        double planBweekendcost=0.25;
        double planBweekendtotal;
        double planAtotal;
        double planBtotal;
        System.out.print("Number of daytime minutes? ");
        daytimemins=input.nextInt();
        if(daytimemins>100){
            planAdaytimetotal=daytimemins-100*planAdaytimecost;
        }else{
            planAdaytimetotal=0;
        }
        if(daytimemins>250){
            planBdaytimetotal=daytimemins-250*planBdaytimecost;
        }else{
            planBdaytimetotal=0;
        }   
        System.out.print("Number of evening minutes? ");
        eveningmins=input.nextInt();
        planAeveningtotal=eveningmins*planAeveningcost;
        planBeveningtotal=eveningmins*planBeveningcost;
        System.out.print("Number of weekend minutes? ");
        weekendmins=input.nextInt();
        planAweekendtotal=weekendmins*planAweekendcost;
        planBweekendtotal=weekendmins*planBweekendcost;
        planAtotal=planAdaytimetotal+planAeveningtotal+planAweekendtotal;
        planBtotal=planBdaytimetotal+planBeveningtotal+planBweekendtotal;
        System.out.println("Plan A costs $"+ planAtotal);
        System.out.println("Plan B costs $"+ planBtotal);
        if(planAtotal>planBtotal){
                System.out.println("Plan B is cheapest");
            }
            else if(planAtotal<planBtotal){
                System.out.println("Plan A is cheapest");
            }
            else{
                System.out.println("Plan A and B are the same price");
            }
    }
}
