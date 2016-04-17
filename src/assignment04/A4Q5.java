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
public class A4Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String name;
        double test1total;
        double test1results;
        double test2total;
        double test2results;
        double test3total;
        double test3results;
        double test4total;
        double test4results;
        double test5total;
        double test5results;
        double test1average;
        double test2average;
        double test3average;
        double test4average;
        double test5average;
        double testsaverage;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        name = input.nextLine();
        System.out.print("What was the first test out of? ");
        test1total=input.nextInt();
        System.out.print("What what mark did you get? ");
        test1results=input.nextInt();
        System.out.print("What was the second test out of? ");
        test2total=input.nextInt();
        System.out.print("What what mark did you get? ");
        test2results=input.nextInt();
        System.out.print("What was the third test out of? ");
        test3total=input.nextInt();
        System.out.print("What what mark did you get? ");
        test3results=input.nextInt();
        System.out.print("What was the forth test out of? ");
        test4total=input.nextInt();
        System.out.print("What what mark did you get? ");
        test4results=input.nextInt();
        System.out.print("What was the fifth test out of? ");
        test5total=input.nextInt();
        System.out.print("What what mark did you get? ");
        test5results=input.nextInt();
        System.out.println("Test scores for "+name);
        test1average=test1results/test1total*100;
        test2average=test2results/test2total*100;
        test3average=test3results/test3total*100;
        test4average=test4results/test4total*100;
        test5average=test5results/test5total*100;
        System.out.println("Test1: "+test1average+"%");
        System.out.println("Test2: "+test2average+"%");
        System.out.println("Test3: "+test3average+"%");
        System.out.println("Test4: "+test4average+"%");
        System.out.println("Test5: "+test5average+"%");
        testsaverage=test1average+test2average+test3average+test4average+test5average/5*100;
        System.out.println("Average: "+test1average+"%");
    }
}
