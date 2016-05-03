
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author halll7908
 */
public class A4Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        
        String name;
        
        System.out.println("Hello, what is your name?");
        
        name = input.nextLine();
        
        System.out.println(name + ", what was your first test out of?");
        double foo = input.nextInt();
        System.out.println("What was your mark out of " + foo + "?");
        double fm = input.nextDouble();
        double mark1 = (fm / foo) * 100;
        System.out.println("Your mark was " + mark1 + "%.");
        
        System.out.println(name + ", what was your second test out of?");
        double soo = input.nextInt();
        System.out.println("What was your mark out of " + soo + "?");
        double sm = input.nextDouble();
        double mark2 = (sm / soo) * 100;
        System.out.println("Your mark was " + mark2 + "%.");
        
        System.out.println(name + ", what was your third test out of?");
        double too = input.nextInt();
        System.out.println("What was your mark out of " + too + "?");
        double tm = input.nextDouble();
        double mark3 = (tm / too) * 100;
        System.out.println("Your mark was " + mark3 + "%.");
        
        System.out.println(name + ", what was your fourth test out of?");
        double fooo = input.nextInt();
        System.out.println("What was your mark out of " + fooo + "?");
        double fom = input.nextDouble();
        double mark4 = (fom / fooo) * 100;
        System.out.println("Your mark was " + mark4 + "%.");
        
        System.out.println(name + ", what was your fifth test out of?");
        double fioo = input.nextInt();
        System.out.println("What was your mark out of " + fioo + "?");
        double fim = input.nextDouble();
        double mark5 = (fim / fioo) * 100;
        System.out.println("Your mark was " + mark5 + "%.");
        
        double total = (mark1 + mark2 + mark3 + mark4 + mark5) / 5;
        
        System.out.println("Your overall average is " + total + ".");
    }
}
