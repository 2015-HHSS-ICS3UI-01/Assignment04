
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author kangh4484
 */
public class A4Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How much does the food for prom cost?");
        int food = input.nextInt();
        System.out.println("How much does the DJ cost?");
        int dj = input.nextInt();
        System.out.println("How much does it cost to rent the hall?");
        int rent = input.nextInt();
        System.out.println("How much does decorations cost?");
        int deco = input.nextInt();
        System.out.println("How much does it cost for staff?");
        int staff = input.nextInt();
        System.out.println("How much for miscellaneous costs?");
        int miscellaneous = input.nextInt();
        int total = food + dj + rent + deco + staff + miscellaneous;
        int ticket = 35;
        while (total > ticket) {
            if (total > ticket) {
                ticket = ticket + 35;
            }else if(total <=ticket){
                break;
            }
        }
        int number = ticket / 35;
        System.out.println("");
        System.out.println("The total cost is $" + total + ". You will need to sell "+number+" tickets to break even.");
    }
}
