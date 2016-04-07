
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuk4142
 */
public class A3Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        String name;
        
        System.out.print("Please enter your name: ");
        name = in.nextLine();
        
        System.out.print("What was the first test out of?: ");
        double test1total = in.nextDouble(); 
        System.out.print("What mark did you get?: ");
        double test1mark = in.nextDouble();
        
         double test1percent = test1mark/test1total;
                 
        System.out.print("What was the second test out of?: ");
        double test2total = in.nextDouble();
        System.out.print("What mark did you get?: ");
        double test2mark = in.nextDouble();
        
        double test2percent = test2mark/test2total;
        
        System.out.print("What was the third test out of?: ");
        double test3total = in.nextDouble();
        System.out.print("What mark did you get?: ");
        double test3mark = in.nextDouble();
        
        double test3percent = test3mark/test3total;
        
        System.out.print("What was the fourth test out of?: ");
        double test4total = in.nextDouble();
        System.out.print("What mark did you get?: ");
        double test4mark = in.nextDouble();
        
        double test4percent = test4mark/test4total;
        
        System.out.print("What was the fifth test out of?: ");
        double test5total = in.nextDouble();
        System.out.print("What mark did you get?: ");
        double test5mark = in.nextDouble();
        
        double test5percent = test5mark/test5total;
        
        System.out.println("Test Scores for " + name );
        System.out.println("Test 1: " + test1percent*100+ "%");
        System.out.println("Test 2: " + test2percent*100+ "%");
        System.out.println("Test 3: " + test3percent*100+ "%");
        System.out.println("Test 4: " + test4percent*100+ "%");
        System.out.println("Test 5: " + test5percent*100+ "%");
        
        double testavg = (test1percent*100 + test2percent*100 + test3percent*100 + test4percent*100 + test5percent*100)/5;
        
        System.out.println("Average: " + testavg +"%" );
    }
}
