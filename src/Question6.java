
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hadik9595
 */
public class Question6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        
        System.out.println("Number of daytime minutes?");
        int daytime = in.nextInt();
        
        System.out.println("Number of evening minutes?");
        int evening = in.nextInt();
        
        System.out.println("Number of weekend minutes?");
        int weekend = in.nextInt();
    }
}
