
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
public class Question4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

    Scanner input = new Scanner(System.in);
    
    System.out.println("How much does the food for prom cost? : ");
    int food = input.nextInt();

    System.out.println("How much does the DJ for prom cost? : " );
    int DJ = input.nextInt();
    
    System.out.println("How much does it cost to rent the hall? : ");
    int Hall = input.nextInt();
    
    System.out.println("How much do the decorations cost? : ");
    int Decorations = input.nextInt();
    
    System.out.println("How much does the staff cost? : ");
    int Staff = input.nextInt();
    
    System.out.println("How much money is set aside for misallaneous costs? : ");
    int misallaneous = input.nextInt();
    
    double Total = food + DJ + Hall + Decorations + Staff + misallaneous;
    System.out.println("The total amount spent for prom is... " + Total);
    System.out.println("You will need to sell " + Math.ceil(Total/(35.0)) + " tickets to break even.");
    
    
    
    }

}
