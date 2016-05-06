import java.util.Scanner;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pearr2740
 */
public class A4Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner input = new Scanner(System.in);
    
    System.out.println("How much does the food for pro cost?");
    double food = input.nextDouble();
    
    System.out.println("How much does the dj cost?");
    double dj = input.nextDouble();
    
     System.out.println("How much does it cost to rent the hall?");
    double hall = input.nextDouble();
    
     System.out.println("How much does decorations cost?");
    double decoration = input.nextDouble();
    
     System.out.println("How much does it cost for staff?");
    double staff = input.nextDouble();
    
     System.out.println("How much does miscellaneous cost?");
    double other = input.nextDouble();
    
    double cost = (double) ((food + dj + hall + decoration + staff + other));
    double ticket = (double) ((food + dj + hall + staff + other)/35);
    System.out.println("Your total cost will be $" + Math.ceil(cost) ".You will need to sell" Math.ceil(ticket) + "tickets to break even.");
            
    }
}
